package xyz.gnarbot.gnar.api.data

import xyz.gnarbot.gnar.Bot
import xyz.gnarbot.gnar.servers.Shard
import java.util.*

class BotInfo(bot: Bot) {
    val requests = bot.shards.flatMap { it.servlets.values }.sumBy { it.commandHandler.requests }
    val totalShards = bot.shards.size
    val guilds = bot.shards.sumBy { it.guilds.size }
    val users = bot.shards.sumBy { it.users.size }
    val textChannels = bot.shards.sumBy { it.textChannels.size }
    val voiceChannels = bot.shards.sumBy { it.voiceChannels.size }

    val shards = Bot.shards.map(Shard::info)

    val date = Date()
}
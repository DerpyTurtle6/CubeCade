package full.hunger;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class HungerListener
  implements Listener
{
  Player player;
  FullHunger plugin;
  
  public HungerListener(FullHunger plugin)
  {
    this.plugin = plugin;
  }
  
  @EventHandler
  public void HunterListener(FoodLevelChangeEvent event)
  {
    Player[] online = Bukkit.getServer().getOnlinePlayers();
    for (Player i : online) {
      if (i.hasPermission("hunger.full"))
      {
        event.setFoodLevel(this.plugin.getConfig().getInt("Hunger"));
        i.setSaturation(20.0F);
        i.setExhaustion(20.0F);
      }
      else
      {
        event.isCancelled();
      }
    }
  }
}

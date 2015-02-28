package full.hunger;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FullHunger
  extends JavaPlugin
{
  public void onEnable()
  {
    getConfig().addDefault("Hunger", Integer.valueOf(20));
    getConfig().options().copyDefaults(true);
    saveConfig();
    getServer().getPluginManager().registerEvents(new HungerListener(this), this);
  }
  
  public void onDisable() {}
}

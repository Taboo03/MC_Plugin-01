package org.taboo03.mc_plugin01;

import org.bukkit.plugin.java.JavaPlugin;

public final class MC_Plugin_01 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("플러그인이 활성화되었습니다!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인이 비활성화되었습니다.");
    }
}

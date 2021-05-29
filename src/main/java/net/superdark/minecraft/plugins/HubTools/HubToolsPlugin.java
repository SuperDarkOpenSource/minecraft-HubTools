package net.superdark.minecraft.plugins.HubTools;

import net.superdark.minecraft.plugins.HubTools.events.PlayerEvents;
import net.superdark.minecraft.plugins.SuperDarkCore.registration.BaseSuperDarkPlugin;

public class HubToolsPlugin extends BaseSuperDarkPlugin
{
    public HubToolsPlugin()
    {
        super();
    }

    @Override
    public void onDisable()
    {

    }

    @Override
    public void onEnable()
    {
        new PlayerEvents(this);
    }
}

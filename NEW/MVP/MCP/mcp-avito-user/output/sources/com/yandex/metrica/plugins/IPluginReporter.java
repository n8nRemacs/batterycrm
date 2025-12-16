package com.yandex.metrica.plugins;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface IPluginReporter {
    void reportError(@N PluginErrorDetails pluginErrorDetails, @P String str);

    void reportError(@N String str, @P String str2, @P PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@N PluginErrorDetails pluginErrorDetails);
}

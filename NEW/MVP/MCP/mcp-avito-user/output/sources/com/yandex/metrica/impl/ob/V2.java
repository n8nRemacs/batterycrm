package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* loaded from: classes7.dex */
public final class V2 implements YandexMetricaPlugins {

    /* renamed from: a, reason: collision with root package name */
    private final Tf f379756a;

    public V2(@Y61.k Tf tf2) {
        this.f379756a = tf2;
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(@Y61.k PluginErrorDetails pluginErrorDetails, @Y61.l String str) {
        this.f379756a.a(pluginErrorDetails, str);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportUnhandledException(@Y61.k PluginErrorDetails pluginErrorDetails) {
        this.f379756a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(@Y61.k String str, @Y61.l String str2, @Y61.l PluginErrorDetails pluginErrorDetails) {
        this.f379756a.a(str, str2, pluginErrorDetails);
    }
}

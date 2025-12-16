package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* loaded from: classes7.dex */
public class Yf implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    private final Kn<PluginErrorDetails> f379966a = new Hn(new Gn("Error details"));

    /* renamed from: b, reason: collision with root package name */
    private final Kn<String> f379967b = new Hn(new Fn("Error identifier"));

    /* renamed from: c, reason: collision with root package name */
    private final Kn<Collection<StackTraceItem>> f379968c = new En("Stacktrace");

    public boolean a(@j.P PluginErrorDetails pluginErrorDetails, @j.P String str) {
        this.f379966a.a(pluginErrorDetails);
        return this.f379968c.a(pluginErrorDetails.getStacktrace()).b();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.P PluginErrorDetails pluginErrorDetails, @j.P String str) {
        this.f379966a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@j.P PluginErrorDetails pluginErrorDetails) {
        this.f379966a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.P String str, @j.P String str2, @j.P PluginErrorDetails pluginErrorDetails) {
        this.f379967b.a(str);
    }
}

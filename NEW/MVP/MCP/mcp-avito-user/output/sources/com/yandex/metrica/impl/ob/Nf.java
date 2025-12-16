package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* loaded from: classes7.dex */
public class Nf implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Yf f379001a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.g f379002b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379003c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39085qm<M0> f379004d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379005a;

        public a(PluginErrorDetails pluginErrorDetails) {
            this.f379005a = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nf.a(Nf.this).reportUnhandledException(this.f379005a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379007a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379008b;

        public b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f379007a = pluginErrorDetails;
            this.f379008b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nf.a(Nf.this).reportError(this.f379007a, this.f379008b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379012c;

        public c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f379010a = str;
            this.f379011b = str2;
            this.f379012c = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nf.a(Nf.this).reportError(this.f379010a, this.f379011b, this.f379012c);
        }
    }

    public Nf(@j.N Yf yf2, @j.N com.yandex.metrica.g gVar, @j.N ICommonExecutor iCommonExecutor, @j.N InterfaceC39085qm<M0> interfaceC39085qm) {
        this.f379001a = yf2;
        this.f379002b = gVar;
        this.f379003c = iCommonExecutor;
        this.f379004d = interfaceC39085qm;
    }

    public static IPluginReporter a(Nf nf2) {
        return nf2.f379004d.a().getPluginExtension();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N PluginErrorDetails pluginErrorDetails, @j.P String str) {
        if (this.f379001a.a(pluginErrorDetails, str)) {
            this.f379002b.getClass();
            this.f379003c.execute(new b(pluginErrorDetails, str));
        }
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@j.N PluginErrorDetails pluginErrorDetails) {
        this.f379001a.reportUnhandledException(pluginErrorDetails);
        this.f379002b.getClass();
        this.f379003c.execute(new a(pluginErrorDetails));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P PluginErrorDetails pluginErrorDetails) {
        this.f379001a.reportError(str, str2, pluginErrorDetails);
        this.f379002b.getClass();
        this.f379003c.execute(new c(str, str2, pluginErrorDetails));
    }
}

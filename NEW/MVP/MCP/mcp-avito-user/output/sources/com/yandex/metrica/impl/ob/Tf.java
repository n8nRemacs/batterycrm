package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* loaded from: classes7.dex */
public final class Tf {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f379514a;

    /* renamed from: b, reason: collision with root package name */
    private final Sf f379515b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf f379516c;

    /* renamed from: d, reason: collision with root package name */
    private final Xf f379517d;

    /* renamed from: e, reason: collision with root package name */
    private final com.yandex.metrica.g f379518e;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379520b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f379521c;

        public a(PluginErrorDetails pluginErrorDetails, String str) {
            this.f379520b = pluginErrorDetails;
            this.f379521c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Tf.a(Tf.this).getPluginExtension().reportError(this.f379520b, this.f379521c);
        }
    }

    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379523b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f379524c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379525d;

        public b(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f379523b = str;
            this.f379524c = str2;
            this.f379525d = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Tf.a(Tf.this).getPluginExtension().reportError(this.f379523b, this.f379524c, this.f379525d);
        }
    }

    public static final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f379527b;

        public c(PluginErrorDetails pluginErrorDetails) {
            this.f379527b = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Tf.a(Tf.this).getPluginExtension().reportUnhandledException(this.f379527b);
        }
    }

    @j.k0
    public Tf(@Y61.k ICommonExecutor iCommonExecutor, @Y61.k Sf sf2, @Y61.k Kf kf2, @Y61.k Xf xf2, @Y61.k com.yandex.metrica.g gVar) {
        this.f379514a = iCommonExecutor;
        this.f379515b = sf2;
        this.f379516c = kf2;
        this.f379517d = xf2;
        this.f379518e = gVar;
    }

    public final void a(@Y61.l PluginErrorDetails pluginErrorDetails) {
        this.f379516c.a(null);
        this.f379517d.a().reportUnhandledException(pluginErrorDetails);
        this.f379518e.getClass();
        this.f379514a.execute(new c(pluginErrorDetails));
    }

    public Tf(@Y61.k ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new Sf());
    }

    private Tf(ICommonExecutor iCommonExecutor, Sf sf2) {
        this(iCommonExecutor, sf2, new Kf(sf2), new Xf(), new com.yandex.metrica.g(sf2, new D2()));
    }

    public final void a(@Y61.l PluginErrorDetails pluginErrorDetails, @Y61.l String str) {
        this.f379516c.a(null);
        if (this.f379517d.a().a(pluginErrorDetails, str)) {
            this.f379518e.getClass();
            this.f379514a.execute(new a(pluginErrorDetails, str));
        }
    }

    public final void a(@Y61.l String str, @Y61.l String str2, @Y61.l PluginErrorDetails pluginErrorDetails) {
        this.f379516c.a(null);
        this.f379517d.a().reportError(str, str2, pluginErrorDetails);
        this.f379518e.getClass();
        this.f379514a.execute(new b(str, str2, pluginErrorDetails));
    }

    public static final K0 a(Tf tf2) {
        tf2.f379515b.getClass();
        return R2.k().d().b();
    }
}

package com.avito.android.fps;

import Bc.InterfaceC13133a;
import Y61.k;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FramesListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fps/e;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f158625a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<a> f158626b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC13133a f158627c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Handler f158628d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WeakHashMap<Activity, androidx.metrics.performance.f> f158629e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final WeakHashMap<com.avito.android.lib.design.bottom_sheet.d, androidx.metrics.performance.f> f158630f;

    /* renamed from: g, reason: collision with root package name */
    public long f158631g;

    @Inject
    public e(@k Application application, @RE.a @k l41.g<a> gVar, @k InterfaceC13133a interfaceC13133a, @k Handler handler) {
        this.f158625a = application;
        this.f158626b = gVar;
        this.f158627c = interfaceC13133a;
        this.f158628d = handler;
        this.f158629e = new WeakHashMap<>();
        this.f158630f = new WeakHashMap<>();
        this.f158631g = kotlin.math.b.c(interfaceC13133a.a());
    }

    public final void a() {
        this.f158625a.registerActivityLifecycleCallbacks(new b(this, new c(this)));
        com.avito.android.lib.design.bottom_sheet.d.f178509B.getClass();
        com.avito.android.lib.design.bottom_sheet.d.f178511D.t0(new d(this));
    }

    public /* synthetic */ e(Application application, l41.g gVar, InterfaceC13133a interfaceC13133a, Handler handler, int i12, C42822w c42822w) {
        this(application, gVar, interfaceC13133a, (i12 & 8) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}

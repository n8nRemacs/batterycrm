package com.avito.android.push.rustore;

import com.avito.android.analytics.statsd.y;
import kotlinx.coroutines.channels.I0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i implements ru.rustore.sdk.core.tasks.e, ru.rustore.sdk.core.tasks.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f246098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0 f246099c;

    public /* synthetic */ i(g gVar, I0 i02) {
        this.f246098b = gVar;
        this.f246099c = i02;
    }

    @Override // ru.rustore.sdk.core.tasks.d
    public void a(Throwable th2) {
        g.b(this.f246098b, th2);
        this.f246099c.h(th2);
    }

    @Override // ru.rustore.sdk.core.tasks.e
    public void onSuccess(Object obj) {
        this.f246098b.f246092a.c(new y.a("rustore.get_token.success", 0L, 2, null));
        I0 i02 = this.f246099c;
        i02.w((String) obj);
        i02.h(null);
    }
}

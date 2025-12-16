package ar;

import com.avito.android.competitor_analytics.k;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsDeepLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: ar.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C23659b implements h<C23658a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f56259a;

    /* renamed from: b, reason: collision with root package name */
    public final k f56260b;

    public C23659b(dv.b bVar, k kVar) {
        this.f56259a = bVar;
        this.f56260b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C23658a((a.InterfaceC4053a) this.f56259a.get(), (com.avito.android.competitor_analytics.h) this.f56260b.get());
    }
}

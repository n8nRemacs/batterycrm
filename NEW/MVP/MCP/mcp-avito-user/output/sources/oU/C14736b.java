package Ou;

import Nu.C14611a;
import Nu.InterfaceC14612b;
import com.avito.android.deeplink_analytics.logger.c;
import com.avito.android.deeplink_analytics.parsing.d;
import com.avito.android.deeplink_analytics.parsing.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42756l;

/* compiled from: DeeplinkAnalyticsModule_ProvideTracker$_avito_deeplinks_analytics_implFactory.java */
@e
@y
@x
/* renamed from: Ou.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14736b implements h<InterfaceC14612b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f12657a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.deeplink_analytics.handling.e f12658b;

    /* renamed from: c, reason: collision with root package name */
    public final c f12659c;

    public C14736b(f fVar, com.avito.android.deeplink_analytics.handling.e eVar, c cVar) {
        this.f12657a = fVar;
        this.f12658b = eVar;
        this.f12659c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f12657a.get();
        com.avito.android.deeplink_analytics.handling.d dVar2 = (com.avito.android.deeplink_analytics.handling.d) this.f12658b.get();
        this.f12659c.getClass();
        com.avito.android.deeplink_analytics.logger.a aVar = new com.avito.android.deeplink_analytics.logger.a();
        C14735a.f12656a.getClass();
        return new C14611a(C42756l.l0(new InterfaceC14612b[]{dVar, dVar2, aVar}));
    }
}

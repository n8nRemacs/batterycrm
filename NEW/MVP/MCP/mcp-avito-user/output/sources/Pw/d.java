package PW;

import com.avito.android.loyalty.links.BadgeBarShowV3Link;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideBadgeBarShowV3SyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final TW.c f13096a;

    public d(TW.c cVar) {
        this.f13096a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TW.c cVar = this.f13096a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BadgeBarShowV3Link.class, new TW.a(), new C43834a.b.C11809b(cVar));
    }
}

package PW;

import com.avito.android.loyalty.links.badges.BadgeBarShowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideBadgeBarShowAsyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.loyalty.links.badges.f f13094a;

    public b(com.avito.android.loyalty.links.badges.f fVar) {
        this.f13094a = fVar;
    }

    public static C43834a a(com.avito.android.loyalty.links.badges.f fVar) {
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BadgeBarShowLink.class, new com.avito.android.loyalty.links.badges.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BadgeBarShowLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f13094a);
    }
}

package PW;

import com.avito.android.loyalty.links.BadgeBarShowListLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideBadgeBarShowListLinkAsyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final SW.b f13095a;

    public c(SW.b bVar) {
        this.f13095a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SW.b bVar = this.f13095a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BadgeBarShowListLink.class, new SW.c(), new C43834a.b.C11809b(bVar));
    }
}

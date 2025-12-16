package pg0;

import com.avito.android.deep_linking.PublicRatingDetailsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingHandlerModule_ProvidePublicRatingDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: pg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47081c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.details.deep_linking.public_rating.c f428736a;

    public C47081c(com.avito.android.rating.details.deep_linking.public_rating.c cVar) {
        this.f428736a = cVar;
    }

    public static C43834a a(com.avito.android.rating.details.deep_linking.public_rating.c cVar) {
        C47079a.f428734a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PublicRatingDetailsLink.class, new com.avito.android.rating.details.deep_linking.public_rating.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PublicRatingDetailsLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f428736a);
    }
}

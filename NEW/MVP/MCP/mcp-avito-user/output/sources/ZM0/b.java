package Zm0;

import com.avito.android.review.deeplink.ComfortableDealReviewsLink;
import com.avito.android.review.deeplink.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SComfortableDealReviewsDeepLinkModule_ProvideComfortableDealReviewsLinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.review.deeplink.b f20489a;

    public b(com.avito.android.review.deeplink.b bVar) {
        this.f20489a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.review.deeplink.b bVar = this.f20489a;
        C19577a.f20488a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealReviewsLink.class, new c(), new C43834a.b.C11809b(bVar));
    }
}

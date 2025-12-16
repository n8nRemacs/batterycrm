package pg0;

import com.avito.android.deep_linking.ItemRatingsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingHandlerModule_ProvideItemRatingsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: pg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47080b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.details.deep_linking.item_rating.d f428735a;

    public C47080b(com.avito.android.rating.details.deep_linking.item_rating.d dVar) {
        this.f428735a = dVar;
    }

    public static C43834a a(com.avito.android.rating.details.deep_linking.item_rating.d dVar) {
        C47079a.f428734a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ItemRatingsLink.class, new com.avito.android.rating.details.deep_linking.item_rating.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ItemRatingsLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f428735a);
    }
}

package pg0;

import com.avito.android.deep_linking.RevertRatingsDeletionLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingHandlerModule_ProvideRevertRatingsDeletionLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: pg0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47082d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.details.deep_linking.revert_ratings_deletion.d f428737a;

    public C47082d(com.avito.android.rating.details.deep_linking.revert_ratings_deletion.d dVar) {
        this.f428737a = dVar;
    }

    public static C43834a a(com.avito.android.rating.details.deep_linking.revert_ratings_deletion.d dVar) {
        C47079a.f428734a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RevertRatingsDeletionLink.class, new com.avito.android.rating.details.deep_linking.revert_ratings_deletion.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RevertRatingsDeletionLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f428737a);
    }
}

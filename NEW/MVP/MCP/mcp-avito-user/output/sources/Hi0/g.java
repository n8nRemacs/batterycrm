package Hi0;

import com.avito.android.recommendation_items_loader_impl.deep_linking.RecommendationItemsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RecommendationItemsLoaderDeeplinkModule_ProvideRecommendationItemsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final d f7642b;

    public g(e eVar, d dVar) {
        this.f7641a = eVar;
        this.f7642b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f7642b;
        this.f7641a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RecommendationItemsLink.class, new c(), new C43834a.b.C11809b(dVar));
    }
}

package Hi0;

import com.avito.android.C30566f2;
import com.avito.android.C30743h2;
import com.avito.android.recommendation_items_loader_impl.deep_linking.RecommendationBlocksLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.reflect.n;
import lv.C43834a;

/* compiled from: RecommendationItemsLoaderDeeplinkModule_ProvideRecommendationBlocksLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f7638a;

    /* renamed from: b, reason: collision with root package name */
    public final C30743h2 f7639b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7640c;

    public f(e eVar, C30743h2 c30743h2, b bVar) {
        this.f7638a = eVar;
        this.f7639b = c30743h2;
        this.f7640c = bVar;
    }

    public static C43834a a(e eVar, C30566f2 c30566f2, b bVar) {
        eVar.getClass();
        n<Object> nVar = C30566f2.f155067o[4];
        return new C43834a(RecommendationBlocksLink.class, ((Boolean) c30566f2.f155072f.a().invoke()).booleanValue() ? new C13995a() : null, new C43834a.b.C11809b(bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f7638a, (C30566f2) this.f7639b.get(), this.f7640c);
    }
}

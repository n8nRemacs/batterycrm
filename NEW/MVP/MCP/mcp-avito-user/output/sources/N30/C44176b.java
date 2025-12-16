package n30;

import com.avito.android.newcars_mark_model_filter.link.NewCarsBrandModelFilterDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: NewCarsBrandModelFilterDeepLinkModule_ProvideNewCarsBrandModelFilterDeepLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ln30/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n30.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44176b implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f414868b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.newcars_mark_model_filter.link.b f414869a;

    /* compiled from: NewCarsBrandModelFilterDeepLinkModule_ProvideNewCarsBrandModelFilterDeepLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/b$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n30.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static C43834a a(@Y61.k com.avito.android.newcars_mark_model_filter.link.b bVar) {
            C44175a.f414867a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(NewCarsBrandModelFilterDeepLink.class, new com.avito.android.newcars_mark_model_filter.link.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(NewCarsBrandModelFilterDeepLink.class), bVar));
        }

        public a() {
        }
    }

    public C44176b(@Y61.k com.avito.android.newcars_mark_model_filter.link.b bVar) {
        this.f414869a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.newcars_mark_model_filter.link.b bVar = this.f414869a;
        f414868b.getClass();
        return a.a(bVar);
    }
}

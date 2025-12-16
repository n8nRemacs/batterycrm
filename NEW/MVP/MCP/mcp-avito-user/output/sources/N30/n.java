package n30;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelMviModule_ProvideListRecyclerAdapter$_avito_new_cars_mark_model_filter_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ln30/n;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/d;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f414884c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f414885a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.a> f414886b;

    /* compiled from: NewCarsBrandModelMviModule_ProvideListRecyclerAdapter$_avito_new_cars_mark_model_filter_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/newcars_mark_model_filter/di/NewCarsBrandModelMviModule_ProvideListRecyclerAdapter$_avito_new_cars_mark_model_filter_implFactory.Companion", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f414885a = uVar;
        this.f414886b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f414885a.get();
        com.avito.konveyor.a aVar2 = this.f414886b.get();
        f414884c.getClass();
        C44178d.f414870a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}

package n30;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelMviModule_ProvideItemBinder$_avito_new_cars_mark_model_filter_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ln30/j;", "Ldagger/internal/h;", "Lcom/avito/konveyor/a;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f414877d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.c> f414878a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.c> f414879b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f414880c;

    /* compiled from: NewCarsBrandModelMviModule_ProvideItemBinder$_avito_new_cars_mark_model_filter_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/newcars_mark_model_filter/di/NewCarsBrandModelMviModule_ProvideItemBinder$_avito_new_cars_mark_model_filter_implFactory.Companion", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f414878a = provider;
        this.f414879b = provider2;
        this.f414880c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.c cVar = this.f414878a.get();
        com.avito.android.newcars_mark_model_filter.presentation.recycler.model.c cVar2 = this.f414879b.get();
        com.avito.android.newcars_mark_model_filter.presentation.recycler.label.b bVar = (com.avito.android.newcars_mark_model_filter.presentation.recycler.label.b) this.f414880c.get();
        f414877d.getClass();
        C44178d.f414870a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        c10493a.b(cVar2);
        c10493a.b(bVar);
        return c10493a.a();
    }
}

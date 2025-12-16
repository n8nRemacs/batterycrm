package n30;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelMviModule_ProvideLabelItemBlueprintFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ln30/k;", "Ldagger/internal/h;", "Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/label/b;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<com.avito.android.newcars_mark_model_filter.presentation.recycler.label.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f414881b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f414882a;

    /* compiled from: NewCarsBrandModelMviModule_ProvideLabelItemBlueprintFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/k$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k u uVar) {
        this.f414882a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.newcars_mark_model_filter.presentation.recycler.label.d dVar = (com.avito.android.newcars_mark_model_filter.presentation.recycler.label.d) this.f414882a.get();
        f414881b.getClass();
        C44178d.f414870a.getClass();
        return new com.avito.android.newcars_mark_model_filter.presentation.recycler.label.b(dVar);
    }
}

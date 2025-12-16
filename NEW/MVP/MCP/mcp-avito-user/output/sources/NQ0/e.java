package nq0;

import Y61.k;
import androidx.recyclerview.widget.C;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectableDistrictsFragmentItemsModule_ProvideDataAwareAdapterPresenterImplFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnq0/e;", "Ldagger/internal/h;", "Lcom/avito/android/recycler/data_aware/c;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f419185d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f419186a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.konveyor.adapter.a> f419187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f419188c;

    /* compiled from: SelectableDistrictsFragmentItemsModule_ProvideDataAwareAdapterPresenterImplFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq0/e$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k u uVar, @k Provider provider, @k Provider provider2) {
        this.f419186a = provider;
        this.f419187b = provider2;
        this.f419188c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f419186a);
        com.avito.konveyor.adapter.a aVar = this.f419187b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f419188c.get();
        f419185d.getClass();
        d.f419184a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}

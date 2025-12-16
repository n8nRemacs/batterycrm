package nq0;

import Y61.k;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectableDistrictsFragmentItemsModule_ProvideSimpleRecyclerAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnq0/h;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/j;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f419194c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f419195a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.konveyor.a> f419196b;

    /* compiled from: SelectableDistrictsFragmentItemsModule_ProvideSimpleRecyclerAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq0/h$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k u uVar, @k Provider provider) {
        this.f419195a = uVar;
        this.f419196b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f419195a.get();
        com.avito.konveyor.a aVar2 = this.f419196b.get();
        f419194c.getClass();
        d.f419184a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}

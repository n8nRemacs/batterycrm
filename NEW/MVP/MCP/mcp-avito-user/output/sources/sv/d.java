package Sv;

import Rv.C15084a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CustomTariffsItemModule_ProvideCustomTariffsRecyclerAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSv/d;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/d;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f15187c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C15243b f15188a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f15189b;

    /* compiled from: CustomTariffsItemModule_ProvideCustomTariffsRecyclerAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSv/d$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k C15243b c15243b, @Y61.k e eVar) {
        this.f15188a = c15243b;
        this.f15189b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f15188a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f15189b.get();
        f15187c.getClass();
        int i12 = C15242a.f15182a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, C15084a.f14728a);
    }
}

package Sv;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CustomTariffsItemModule_ProvideAdapterPresenterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSv/b;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15243b implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f15183b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f15184a;

    /* compiled from: CustomTariffsItemModule_ProvideAdapterPresenterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSv/b$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sv.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15243b(@Y61.k e eVar) {
        this.f15184a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f15184a.get();
        f15183b.getClass();
        int i12 = C15242a.f15182a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}

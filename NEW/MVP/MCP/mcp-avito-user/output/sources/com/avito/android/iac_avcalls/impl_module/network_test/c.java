package com.avito.android.iac_avcalls.impl_module.network_test;

import dagger.internal.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsNetworkTestImplSplitter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/c;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/network_test/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<com.avito.android.iac_avcalls.impl_module.network_test.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164327d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.e f164328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f164329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f164330c;

    /* compiled from: AvCallsNetworkTestImplSplitter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/c$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k FJ.e eVar, @Y61.k g gVar, @Y61.k k kVar) {
        this.f164328a = eVar;
        this.f164329b = gVar;
        this.f164330c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FJ.a aVar = (FJ.a) this.f164328a.get();
        h31.e eVarB = dagger.internal.g.b(this.f164329b);
        h31.e eVarA = dagger.internal.g.a(w.a(this.f164330c));
        f164327d.getClass();
        return new com.avito.android.iac_avcalls.impl_module.network_test.a(aVar, eVarB, eVarA);
    }
}

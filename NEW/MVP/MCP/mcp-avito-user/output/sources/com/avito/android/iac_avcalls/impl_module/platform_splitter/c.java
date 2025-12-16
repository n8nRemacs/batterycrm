package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.C30832a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsFunnelEventsObserverSplitter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/c;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<com.avito.android.iac_avcalls.impl_module.platform_splitter.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164498d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.e f164499a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<C30832a> f164500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.iac_avcalls.impl_module.platform.avcalls.a> f164501c;

    /* compiled from: AvCallsFunnelEventsObserverSplitter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/c$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k FJ.e eVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f164499a = eVar;
        this.f164500b = provider;
        this.f164501c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FJ.a aVar = (FJ.a) this.f164499a.get();
        h31.e eVarB = dagger.internal.g.b(this.f164500b);
        h31.e eVarB2 = dagger.internal.g.b(this.f164501c);
        f164498d.getClass();
        return new com.avito.android.iac_avcalls.impl_module.platform_splitter.a(aVar, eVarB, eVarB2);
    }
}

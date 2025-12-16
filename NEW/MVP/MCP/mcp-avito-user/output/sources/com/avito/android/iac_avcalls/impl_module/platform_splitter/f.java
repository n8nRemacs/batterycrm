package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import dagger.internal.u;
import dagger.internal.w;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsPlatformSplitter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/f;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/d;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164507d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.e f164508a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.iac_avcalls.impl_module.platform_v1.d> f164509b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f164510c;

    /* compiled from: AvCallsPlatformSplitter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/f$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k FJ.e eVar, @Y61.k Provider provider, @Y61.k u uVar) {
        this.f164508a = eVar;
        this.f164509b = provider;
        this.f164510c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FJ.a aVar = (FJ.a) this.f164508a.get();
        h31.e eVarB = dagger.internal.g.b(this.f164509b);
        h31.e eVarA = dagger.internal.g.a(w.a(this.f164510c));
        f164507d.getClass();
        return new d(aVar, eVarB, eVarA);
    }
}

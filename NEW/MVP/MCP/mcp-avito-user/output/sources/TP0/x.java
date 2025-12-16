package Tp0;

import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: SectionItemWidthProviderModule_ProvideComplementarySectionItemWidthProvider$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<com.avito.android.section.item.s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f15949a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f15950b;

    public x(dagger.internal.u uVar, Provider provider) {
        this.f15949a = provider;
        this.f15950b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        L0 l02 = this.f15949a.get();
        com.avito.android.section.w wVar = (com.avito.android.section.w) this.f15950b.get();
        int i12 = w.f15948a;
        return new com.avito.android.section.item.t(l02, wVar);
    }
}

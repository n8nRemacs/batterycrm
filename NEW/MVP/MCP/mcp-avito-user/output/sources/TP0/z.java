package Tp0;

import com.avito.android.util.L0;

/* compiled from: SectionItemWidthProviderModule_ProvideSectionItemWidthProvider$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class z implements dagger.internal.h<com.avito.android.section.item.s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f15951a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f15952b;

    public z(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f15951a = uVar;
        this.f15952b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        L0 l02 = (L0) this.f15951a.get();
        com.avito.android.section.w wVar = (com.avito.android.section.w) this.f15952b.get();
        int i12 = w.f15948a;
        return new com.avito.android.section.item.t(l02, wVar);
    }
}

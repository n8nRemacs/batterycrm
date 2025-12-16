package Tp0;

import com.avito.android.serp.adapter.InterfaceC34863v;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemsModule_ProvideSectionAdvertItemPresenter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<com.avito.android.section.item.m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34863v> f15946a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f15947b;

    public v(dagger.internal.u uVar, Provider provider) {
        this.f15946a = provider;
        this.f15947b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f15946a);
        com.avito.android.section.item.s sVar = (com.avito.android.section.item.s) this.f15947b.get();
        int i12 = n.f15922a;
        return new com.avito.android.section.item.p(eVarB, sVar);
    }
}

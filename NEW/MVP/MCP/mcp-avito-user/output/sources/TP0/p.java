package Tp0;

import com.avito.android.serp.adapter.constructor.B;
import com.avito.android.serp.adapter.constructor.C;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemsModule_ProvideComplementarySectionItemBinder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.a> f15923a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.redesign.o> f15924b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.d> f15925c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f15926d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.s f15927e;

    /* renamed from: f, reason: collision with root package name */
    public final C f15928f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.u f15929g;

    public p(Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, com.avito.android.serp.adapter.constructor.s sVar, C c12, com.avito.android.serp.adapter.constructor.u uVar2) {
        this.f15923a = provider;
        this.f15924b = provider2;
        this.f15925c = provider3;
        this.f15926d = uVar;
        this.f15927e = sVar;
        this.f15928f = c12;
        this.f15929g = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.section.item.a aVar = this.f15923a.get();
        com.avito.android.section.item.redesign.o oVar = this.f15924b.get();
        com.avito.android.section.item.d dVar = this.f15925c.get();
        com.avito.android.serp.adapter.constructor.v vVar = (com.avito.android.serp.adapter.constructor.v) this.f15926d.get();
        com.avito.android.serp.adapter.constructor.r rVar = (com.avito.android.serp.adapter.constructor.r) this.f15927e.get();
        B b12 = (B) this.f15928f.get();
        com.avito.android.serp.adapter.constructor.t tVar = (com.avito.android.serp.adapter.constructor.t) this.f15929g.get();
        int i12 = n.f15922a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(oVar);
        c10493a.b(dVar);
        c10493a.b(vVar);
        c10493a.b(rVar);
        c10493a.b(b12);
        c10493a.b(tVar);
        return c10493a.a();
    }
}

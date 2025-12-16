package Tp0;

import com.avito.android.serp.adapter.constructor.B;
import com.avito.android.serp.adapter.constructor.C;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemsModule_ProvideComplementarySectionRedesignItemBinder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.redesign.d> f15936a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.d> f15937b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.v> f15938c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.s f15939d;

    /* renamed from: e, reason: collision with root package name */
    public final C f15940e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.u f15941f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.section.horizontal.button.b f15942g;

    public r(Provider provider, Provider provider2, Provider provider3, com.avito.android.serp.adapter.constructor.s sVar, C c12, com.avito.android.serp.adapter.constructor.u uVar, com.avito.android.section.horizontal.button.b bVar) {
        this.f15936a = provider;
        this.f15937b = provider2;
        this.f15938c = provider3;
        this.f15939d = sVar;
        this.f15940e = c12;
        this.f15941f = uVar;
        this.f15942g = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.section.item.redesign.d dVar = this.f15936a.get();
        com.avito.android.section.item.d dVar2 = this.f15937b.get();
        com.avito.android.serp.adapter.constructor.v vVar = this.f15938c.get();
        com.avito.android.serp.adapter.constructor.r rVar = (com.avito.android.serp.adapter.constructor.r) this.f15939d.get();
        B b12 = (B) this.f15940e.get();
        com.avito.android.serp.adapter.constructor.t tVar = (com.avito.android.serp.adapter.constructor.t) this.f15941f.get();
        com.avito.android.section.horizontal.button.a aVar = (com.avito.android.section.horizontal.button.a) this.f15942g.get();
        int i12 = n.f15922a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        c10493a.b(dVar2);
        c10493a.b(vVar);
        c10493a.b(rVar);
        c10493a.b(b12);
        c10493a.b(tVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}

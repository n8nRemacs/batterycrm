package Tp0;

import com.avito.android.serp.adapter.constructor.B;
import com.avito.android.serp.adapter.constructor.C;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemsModule_ProvideComplementarySectionRedesignBottomSheetItemBinder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f15930a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.section.item.d> f15931b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.v> f15932c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.s f15933d;

    /* renamed from: e, reason: collision with root package name */
    public final C f15934e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.u f15935f;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2, com.avito.android.serp.adapter.constructor.s sVar, C c12, com.avito.android.serp.adapter.constructor.u uVar2) {
        this.f15930a = uVar;
        this.f15931b = provider;
        this.f15932c = provider2;
        this.f15933d = sVar;
        this.f15934e = c12;
        this.f15935f = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.section.item.redesign.a aVar = (com.avito.android.section.item.redesign.a) this.f15930a.get();
        com.avito.android.section.item.d dVar = this.f15931b.get();
        com.avito.android.serp.adapter.constructor.v vVar = this.f15932c.get();
        com.avito.android.serp.adapter.constructor.r rVar = (com.avito.android.serp.adapter.constructor.r) this.f15933d.get();
        B b12 = (B) this.f15934e.get();
        com.avito.android.serp.adapter.constructor.t tVar = (com.avito.android.serp.adapter.constructor.t) this.f15935f.get();
        int i12 = n.f15922a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(dVar);
        c10493a.b(vVar);
        c10493a.b(rVar);
        c10493a.b(b12);
        c10493a.b(tVar);
        return c10493a.a();
    }
}

package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.diff_util.b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupCheckBoxItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/l;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l f299515b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<d.a> f299516c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<d.a> f299517d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f299518e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f299519f;

    @Inject
    public l(@Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar) {
        this.f299515b = lVar;
        com.jakewharton.rxrelay3.c<d.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299516c = cVar;
        com.jakewharton.rxrelay3.c<d.a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f299517d = cVar2;
        this.f299518e = cVar;
        this.f299519f = cVar2;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((n) eVar, (d.a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        n nVar = (n) eVar;
        d.a aVar2 = (d.a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof b.a) {
                obj = obj2;
            }
        }
        b.a aVar3 = (b.a) (obj instanceof b.a ? obj : null);
        if (aVar3 instanceof b.a.C9156a) {
            nVar.Da(((b.a.C9156a) aVar3).f299495a);
            nVar.lb(new f(this, aVar2));
            nVar.Y7(new g(this, aVar2));
        } else {
            if (aVar3 instanceof b.a.c) {
                b.a.c cVar = (b.a.c) aVar3;
                nVar.d9(cVar.f299499a, cVar.f299500b);
                nVar.lb(new h(this, aVar2));
                nVar.Y7(new i(this, aVar2));
                return;
            }
            if (!(aVar3 instanceof b.a.C9157b)) {
                k(nVar, aVar2);
                return;
            }
            b.a.C9157b c9157b = (b.a.C9157b) aVar3;
            nVar.d9(c9157b.f299496a, c9157b.f299497b);
            nVar.Da(c9157b.f299498c);
            nVar.lb(new j(this, aVar2));
            nVar.Y7(new k(this, aVar2));
        }
    }

    public final void k(@Y61.k n nVar, @Y61.k d.a aVar) {
        nVar.setTitle(aVar.f299466h);
        nVar.lb(new d(this, aVar));
        nVar.Y7(new e(this, aVar));
        nVar.d9(aVar.f299474p, aVar.f299475q);
        nVar.Da(aVar.f299467i);
        nVar.I(aVar.f299470l);
        nVar.f(aVar.f299472n);
        nVar.G7(this.f299515b.a(aVar.f299469k));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c
    @Y61.k
    /* renamed from: m3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF299518e() {
        return this.f299518e;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c
    @Y61.k
    /* renamed from: o3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF299519f() {
        return this.f299519f;
    }
}

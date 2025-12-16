package com.avito.android.select_districts.items.selected;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import oq0.C44843a;
import oq0.C44844b;
import oq0.C44845c;

/* compiled from: SelectedDistrictsTagsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/items/selected/j;", "Lcom/avito/android/select_districts/items/selected/g;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f266988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f266989c;

    @Inject
    public j(@Y61.k b bVar, @Y61.k a aVar) {
        this.f266988b = bVar;
        this.f266989c = aVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (e) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        e eVar2 = (e) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof oq0.i) {
                obj = obj2;
            }
        }
        oq0.i iVar = (oq0.i) (obj instanceof oq0.i ? obj : null);
        if (iVar == null) {
            k(lVar, eVar2);
            return;
        }
        if (iVar instanceof C44843a) {
            lVar.V70(((C44843a) iVar).f420225a);
        } else if (iVar instanceof C44844b) {
            lVar.np(((C44844b) iVar).f420226a);
        } else if (iVar.equals(C44845c.f420227a)) {
            lVar.fL();
        }
    }

    public final void k(@Y61.k l lVar, @Y61.k e eVar) {
        lVar.N3(C42745f0.M0(eVar.f266984e));
        lVar.n3(eVar.f266983d);
        lVar.w5(eVar.f266982c);
        lVar.D4(new h(eVar, this));
        lVar.Es(new i(this));
    }
}

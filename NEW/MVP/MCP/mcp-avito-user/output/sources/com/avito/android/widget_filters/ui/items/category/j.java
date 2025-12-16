package com.avito.android.widget_filters.ui.items.category;

import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersCategoryWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/j;", "LTV0/f;", "Lcom/avito/android/widget_filters/ui/items/category/l;", "Lcom/avito/android/widget_filters/ui/items/category/g;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements TV0.f<l, g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<OP0.a, G0> f330345b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super OP0.a, G0> lVar) {
        this.f330345b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (g) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        g gVar = (g) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof b) {
                obj = obj2;
            }
        }
        b bVar = (b) (obj instanceof b ? obj : null);
        if (bVar == null) {
            k(lVar, gVar);
            return;
        }
        com.avito.android.widget_filters.ui.items.d dVar = bVar.f330324a;
        if (dVar != null) {
            lVar.v2(dVar);
        }
        a aVar2 = bVar.f330325b;
        if (aVar2 != null) {
            lVar.AA(aVar2);
        }
        Boolean bool = bVar.f330326c;
        if (bool != null) {
            lVar.W3(bool.booleanValue());
        }
        Boolean bool2 = bVar.f330329f;
        if (bool2 != null) {
            lVar.oL(bool2.booleanValue());
        }
        List<NP0.c> list2 = bVar.f330327d;
        if (list2 != null) {
            lVar.xF(list2);
        }
        String str = bVar.f330330g;
        if (str != null) {
            lVar.jJ(str);
        }
        lVar.E00(new h(gVar, this));
        lVar.ZD(new i(this));
    }

    public final void k(@Y61.k l lVar, @Y61.k g gVar) {
        lVar.v2(gVar.f330338c);
        lVar.AA(gVar.f330339d);
        lVar.W3(gVar.f330340e);
        NP0.d dVar = gVar.f330341f;
        if (dVar != null) {
            lVar.oL(dVar.f11439h);
            lVar.xF(dVar.f11437f);
            lVar.jJ(dVar.f11440i);
        }
        lVar.E00(new h(gVar, this));
        lVar.ZD(new i(this));
    }
}

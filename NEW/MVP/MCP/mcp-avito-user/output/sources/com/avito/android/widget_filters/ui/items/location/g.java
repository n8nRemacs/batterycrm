package com.avito.android.widget_filters.ui.items.location;

import NP0.n;
import NP0.o;
import NP0.p;
import OP0.a;
import Y41.p;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.widget_filters.analytics.LocationSelectMethod;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/location/g;", "LTV0/f;", "Lcom/avito/android/widget_filters/ui/items/location/i;", "Lcom/avito/android/widget_filters/ui/items/location/e;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements TV0.f<com.avito.android.widget_filters.ui.items.location.i, com.avito.android.widget_filters.ui.items.location.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<OP0.a, G0> f330488b;

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f330488b.invoke(a.t.f12265a);
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.widget_filters.ui.items.location.i f330491m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.widget_filters.ui.items.location.i iVar) {
            super(1);
            this.f330491m = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = g.this;
            gVar.getClass();
            gVar.f330488b.invoke(new a.o(zBooleanValue));
            com.avito.android.widget_filters.ui.items.location.i iVar = this.f330491m;
            if (zBooleanValue) {
                iVar.u0(new com.avito.android.widget_filters.ui.items.location.f(gVar));
            } else {
                iVar.u0(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNP0/l;", "location", "Lcom/avito/android/widget_filters/analytics/LocationSelectMethod;", "selectMethod", "Lkotlin/G0;", "invoke", "(LNP0/l;Lcom/avito/android/widget_filters/analytics/LocationSelectMethod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<NP0.l, LocationSelectMethod, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f330493m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12) {
            super(2);
            this.f330493m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(NP0.l lVar, LocationSelectMethod locationSelectMethod) {
            g.this.f330488b.invoke(new a.n(lVar, this.f330493m, locationSelectMethod));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f330495m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12) {
            super(0);
            this.f330495m = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f330488b.invoke(new a.m(this.f330495m));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/widget_filters/analytics/a;", SearchParamsConverterKt.SOURCE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/widget_filters/analytics/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<com.avito.android.widget_filters.analytics.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.widget_filters.analytics.a aVar) {
            g.this.f330488b.invoke(new a.y(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNP0/l;", "location", "Lcom/avito/android/widget_filters/analytics/LocationSelectMethod;", "selectMethod", "Lkotlin/G0;", "invoke", "(LNP0/l;Lcom/avito/android/widget_filters/analytics/LocationSelectMethod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements p<NP0.l, LocationSelectMethod, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f330498m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z12) {
            super(2);
            this.f330498m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(NP0.l lVar, LocationSelectMethod locationSelectMethod) {
            g.this.f330488b.invoke(new a.n(lVar, this.f330498m, locationSelectMethod));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNP0/n;", "recentSearch", "Lcom/avito/android/widget_filters/analytics/a;", SearchParamsConverterKt.SOURCE, "Lkotlin/G0;", "invoke", "(LNP0/n;Lcom/avito/android/widget_filters/analytics/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.widget_filters.ui.items.location.g$g, reason: collision with other inner class name */
    public static final class C10258g extends N implements p<n, com.avito.android.widget_filters.analytics.a, G0> {
        public C10258g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(n nVar, com.avito.android.widget_filters.analytics.a aVar) {
            g.this.f330488b.invoke(new a.r(nVar, aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Integer, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            g.this.f330488b.invoke(new a.C(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isInputSuggestsExpanded", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<Boolean, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            g.this.f330488b.invoke(new a.s(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f330488b.invoke(a.u.f12266a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super OP0.a, G0> lVar) {
        this.f330488b = lVar;
    }

    public static void V(com.avito.android.widget_filters.ui.items.location.i iVar, NP0.p pVar) {
        if (pVar instanceof p.a) {
            p.a aVar = (p.a) pVar;
            iVar.BL(aVar.f11508a);
            iVar.tZ(aVar.f11509b);
            iVar.bm(false);
            iVar.hO(false);
            iVar.js(false);
            return;
        }
        if (pVar instanceof p.b) {
            iVar.BL(false);
            iVar.tZ(false);
            iVar.bm(((p.b) pVar).f11510a);
            iVar.hO(!r3.f11510a);
            iVar.js(true);
        }
    }

    public final void O(com.avito.android.widget_filters.ui.items.location.i iVar, com.avito.android.widget_filters.ui.items.location.e eVar) {
        NP0.m mVar = eVar.f330486f;
        boolean z12 = false;
        if (mVar != null && mVar.f11494c) {
            z12 = true;
        }
        iVar.o0(new b(iVar));
        iVar.oy(new c(z12));
        iVar.Kh(new d(z12));
        iVar.VX(new e());
        iVar.I20(new f(z12));
        iVar.bf(new C10258g());
        iVar.ZD(new h());
        iVar.HT(new i());
        iVar.ic(new j());
        iVar.p6(new a());
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((com.avito.android.widget_filters.ui.items.location.i) eVar, (com.avito.android.widget_filters.ui.items.location.e) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        boolean zBooleanValue;
        com.avito.android.widget_filters.ui.items.location.i iVar = (com.avito.android.widget_filters.ui.items.location.i) eVar;
        com.avito.android.widget_filters.ui.items.location.e eVar2 = (com.avito.android.widget_filters.ui.items.location.e) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.widget_filters.ui.items.location.b) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.widget_filters.ui.items.location.b)) {
            obj = null;
        }
        com.avito.android.widget_filters.ui.items.location.b bVar = (com.avito.android.widget_filters.ui.items.location.b) obj;
        if (bVar == null) {
            k(iVar, eVar2);
            return;
        }
        com.avito.android.widget_filters.ui.items.d dVar = bVar.f330470a;
        if (dVar != null) {
            iVar.v2(dVar);
        }
        com.avito.android.widget_filters.ui.items.location.a aVar2 = bVar.f330472c;
        if (aVar2 != null) {
            iVar.Tx(aVar2);
        }
        String str = bVar.f330473d;
        if (str != null) {
            iVar.y0(str);
        }
        Boolean bool = bVar.f330471b;
        if (bool != null) {
            iVar.W3(bool.booleanValue());
        }
        NP0.p pVar = bVar.f330477h;
        if (pVar != null) {
            V(iVar, pVar);
        }
        List<o> list2 = bVar.f330475f;
        if (list2 != null) {
            Boolean bool2 = bVar.f330476g;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                NP0.m mVar = eVar2.f330486f;
                Boolean boolValueOf = mVar != null ? Boolean.valueOf(mVar.f11503l) : null;
                zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
            }
            iVar.ph(list2, zBooleanValue);
        }
        List<n> list3 = bVar.f330474e;
        if (list3 != null) {
            iVar.gB(list3);
        }
        O(iVar, eVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final void k(@Y61.k com.avito.android.widget_filters.ui.items.location.i iVar, @Y61.k com.avito.android.widget_filters.ui.items.location.e eVar) {
        iVar.v2(eVar.f330483c);
        iVar.Tx(eVar.f330484d);
        O(iVar, eVar);
        iVar.W3(eVar.f330485e);
        NP0.m mVar = eVar.f330486f;
        if (mVar != null) {
            iVar.Ej(mVar.f11498g);
            iVar.y0(mVar.f11497f);
            V(iVar, mVar.f11504m);
            iVar.y70(mVar.f11500i);
            iVar.ph(mVar.f11502k, mVar.f11503l);
            iVar.gB(mVar.f11501j);
        }
    }
}

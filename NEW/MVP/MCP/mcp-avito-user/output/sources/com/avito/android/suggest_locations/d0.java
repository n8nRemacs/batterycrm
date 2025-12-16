package com.avito.android.suggest_locations;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.toast.c;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import com.avito.android.util.D6;
import java.util.Collections;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/d0;", "Lcom/avito/android/suggest_locations/c0;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f292260a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final X f292261b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final X f292262c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f292263d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<com.avito.android.component.snackbar.d> f292264e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f292265f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.suggest_locations.adapter.e f292266g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final UnpredictiveLinearLayoutManager f292267h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final X f292268i;

    /* compiled from: SuggestLocationsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/snackbar/d;", "invoke", "()Lcom/avito/android/component/snackbar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.component.snackbar.d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.component.snackbar.d invoke() {
            d.a aVar = com.avito.android.component.snackbar.d.f125235c;
            View viewFindViewById = d0.this.f292260a.findViewById(R.id.location_suggests_root);
            if (viewFindViewById != null) {
                return d.a.b(aVar, viewFindViewById, "", -2, null, null, 0, null, null, 0, 0, 2040);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: SuggestLocationsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f292270l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public d0(@Y61.k View view, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f292260a = view;
        View viewFindViewById = view.findViewById(R.id.location_suggests_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        X x12 = (X) view.findViewById(R.id.suggests_search);
        this.f292261b = x12;
        X x13 = (X) view.findViewById(R.id.suggests_search);
        this.f292262c = x13;
        this.f292263d = new com.jakewharton.rxrelay3.c<>();
        this.f292264e = C42727D.c(new a());
        com.avito.android.suggest_locations.adapter.e eVar = new com.avito.android.suggest_locations.adapter.e(z12, z15);
        this.f292266g = eVar;
        view.getContext();
        UnpredictiveLinearLayoutManager unpredictiveLinearLayoutManager = new UnpredictiveLinearLayoutManager();
        this.f292267h = unpredictiveLinearLayoutManager;
        x12 = x12 == null ? x13 : x12;
        this.f292268i = x12;
        recyclerView.setLayoutManager(unpredictiveLinearLayoutManager);
        recyclerView.setAdapter(eVar);
        if (z15) {
            if (x12 != null) {
                x12.setHint(view.getContext().getString(R.string.sl_search_bar_hint_real_locations));
            }
        } else if (z12) {
            if (x12 != null) {
                x12.setHint(view.getContext().getString(R.string.sl_address_hint));
            }
        } else if (x12 != null) {
            x12.setHint(view.getContext().getString(R.string.sl_search_bar_hint));
        }
        if ((z13 || z12) && x12 != null) {
            x12.i0();
        }
        if (!z14 || x12 == null) {
            return;
        }
        x12.G3();
    }

    public static void d(d0 d0Var, int i12, Y41.a aVar, int i13) throws Resources.NotFoundException {
        Integer numValueOf = Integer.valueOf(R.string.sl_error_action);
        if ((i13 & 2) != 0) {
            numValueOf = null;
        }
        Y41.a e0Var = (i13 & 4) != 0 ? new e0(d0Var) : aVar;
        View view = d0Var.f292260a;
        String string = view.getResources().getString(i12);
        String string2 = numValueOf != null ? view.getResources().getString(numValueOf.intValue()) : null;
        com.avito.android.lib.design.toast_bar.k kVarB = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, d0Var.f292260a, com.avito.android.printable_text.b.f(string), null, string2 != null ? Collections.singletonList(new c.a.C3719a(string2, false, null, e0Var, 4, null)) : null, null, null, -1, null, null, false, false, null, null, 4058);
        d0Var.f292265f = kVarB;
        D6.H(kVarB);
    }

    public final void a() throws Resources.NotFoundException {
        d(this, R.string.sl_error_no_suggests, b.f292270l, 2);
    }

    public final void b() throws Resources.NotFoundException {
        d(this, R.string.sl_error_text, null, 4);
    }

    public final void c() throws Resources.NotFoundException {
        d(this, R.string.sl_network_error_text, null, 4);
    }

    public final void e(@Y61.k List<AddressSuggestion> list) {
        com.avito.android.lib.design.toast_bar.k kVar;
        InterfaceC42726C<com.avito.android.component.snackbar.d> interfaceC42726C = this.f292264e;
        if (interfaceC42726C.isInitialized() && interfaceC42726C.getValue().f125236a.i()) {
            interfaceC42726C.getValue().a();
        }
        com.avito.android.lib.design.toast_bar.k kVar2 = this.f292265f;
        if (kVar2 != null && kVar2.isShown() && (kVar = this.f292265f) != null) {
            kVar.f();
        }
        com.avito.android.suggest_locations.adapter.e eVar = this.f292266g;
        C23424o.e eVarA = C23424o.a(new com.avito.android.suggest_locations.adapter.a(eVar.f292239f, list), true);
        eVar.f292239f = list;
        eVarA.b(eVar);
        this.f292267h.l1(0);
    }

    public final void f(@Y61.k List<SuggestLocationItem> list) {
        com.avito.android.lib.design.toast_bar.k kVar;
        InterfaceC42726C<com.avito.android.component.snackbar.d> interfaceC42726C = this.f292264e;
        if (interfaceC42726C.isInitialized() && interfaceC42726C.getValue().f125236a.i()) {
            interfaceC42726C.getValue().a();
        }
        com.avito.android.lib.design.toast_bar.k kVar2 = this.f292265f;
        if (kVar2 != null && kVar2.isShown() && (kVar = this.f292265f) != null) {
            kVar.f();
        }
        com.avito.android.suggest_locations.adapter.e eVar = this.f292266g;
        C23424o.e eVarA = C23424o.a(new com.avito.android.suggest_locations.adapter.f(eVar.f292238e, list), true);
        eVar.f292238e = list;
        eVarA.b(eVar);
        this.f292267h.l1(0);
    }
}

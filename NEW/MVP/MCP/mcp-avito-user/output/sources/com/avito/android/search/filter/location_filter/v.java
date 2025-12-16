package com.avito.android.search.filter.location_filter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.ColoredProgressBar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.error.ApiError;
import com.avito.android.search.filter.A1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationFiltersView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/v;", "Lcom/avito/android/search/filter/location_filter/u;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f263694a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f263695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f263696c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f263697d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A1 f263698e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f263699f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Button f263700g;

    public v(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l Button button) {
        this.f263694a = viewGroup;
        this.f263695b = jVar;
        View viewFindViewById = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f263696c = recyclerView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.bottom_sheet_action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f263697d = textView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.location_filters_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f263698e = new A1((ViewGroup) viewFindViewById3, interfaceC28373a);
        View viewFindViewById4 = viewGroup.findViewById(R.id.progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f263699f = viewFindViewById4;
        this.f263700g = button;
        ((ColoredProgressBar) viewGroup.findViewById(R.id.progress_view)).setIndeterminateTintList(C35835l0.e(R.attr.black, viewGroup.getContext()));
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.l(new e(viewGroup.getResources()), -1);
        D6.k(textView);
        D6.H(textView);
        textView.setText(R.string.search_filter_clear_action);
        textView.setTextColor(C35835l0.d(R.attr.blue, viewGroup.getContext()));
        if (button != null) {
            button.setText(viewGroup.getContext().getResources().getString(R.string.apply_hint));
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    /* renamed from: H6, reason: from getter */
    public final ViewGroup getF263694a() {
        return this.f263694a;
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void a() {
        this.f263698e.a();
        D6.H(this.f263699f);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> b() {
        return C37722i.a(this.f263697d);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void c() {
        Button button = this.f263700g;
        D6.H(button);
        if (button != null) {
            button.setLoading(true);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> d() {
        return C37722i.a(this.f263698e.f261744g);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void e(boolean z12) {
        Button button = this.f263700g;
        if (button == null) {
            return;
        }
        button.setEnabled(z12);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> f() {
        Button button = this.f263700g;
        return button != null ? C37722i.a(button) : U.f403867b;
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void g(@Y61.k ApiError apiError) {
        this.f263698e.b(apiError);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void h() {
        Button button = this.f263700g;
        if (button != null) {
            button.setLoading(false);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void i() {
        D6.w(this.f263699f);
        this.f263698e.a();
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void onDataChanged() {
        RecyclerView recyclerView = this.f263696c;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(this.f263695b);
        }
    }
}

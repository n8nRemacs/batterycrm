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

/* compiled from: GlobalLocationFiltersView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/a;", "Lcom/avito/android/search/filter/location_filter/u;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f263460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f263461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f263462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f263463d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A1 f263464e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f263465f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Button f263466g;

    public a(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l Button button) {
        this.f263460a = viewGroup;
        this.f263461b = jVar;
        View viewFindViewById = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f263462c = recyclerView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.bottom_sheet_action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f263463d = textView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.location_filters_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f263464e = new A1((ViewGroup) viewFindViewById3, interfaceC28373a);
        View viewFindViewById4 = viewGroup.findViewById(R.id.progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f263465f = viewFindViewById4;
        this.f263466g = button;
        ((ColoredProgressBar) viewGroup.findViewById(R.id.progress_view)).setIndeterminateTintList(C35835l0.e(R.attr.black, viewGroup.getContext()));
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.l(new e(viewGroup.getResources()), -1);
        D6.k(textView);
        D6.H(textView);
        textView.setText(R.string.search_filter_clear_action);
        textView.setTextColor(C35835l0.d(R.attr.components_link_button_secondary, viewGroup.getContext()));
        if (button != null) {
            button.setText(viewGroup.getContext().getResources().getString(R.string.apply_hint));
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    /* renamed from: H6, reason: from getter */
    public final ViewGroup getF263694a() {
        return this.f263460a;
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void a() {
        this.f263464e.a();
        D6.H(this.f263465f);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> b() {
        return C37722i.a(this.f263463d);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void c() {
        Button button = this.f263466g;
        D6.H(button);
        if (button != null) {
            button.setLoading(true);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> d() {
        return C37722i.a(this.f263464e.f261744g);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void e(boolean z12) {
        Button button = this.f263466g;
        if (button == null) {
            return;
        }
        button.setEnabled(z12);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    @Y61.k
    public final z<G0> f() {
        Button button = this.f263466g;
        return button != null ? C37722i.a(button) : U.f403867b;
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void g(@Y61.k ApiError apiError) {
        this.f263464e.b(apiError);
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void h() {
        Button button = this.f263466g;
        if (button != null) {
            button.setLoading(false);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void i() {
        D6.w(this.f263465f);
        this.f263464e.a();
    }

    @Override // com.avito.android.search.filter.location_filter.u
    public final void onDataChanged() {
        RecyclerView recyclerView = this.f263462c;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(this.f263461b);
        }
    }
}

package com.avito.android.widget_filters.ui.items.dates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WidgetFiltersDatesWidgetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/dates/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/widget_filters/ui/items/dates/k;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f330382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f330383c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f330384d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f330385e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f330386f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f330387g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f330388h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f330389i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final FragmentContainerView f330390j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewGroup.LayoutParams f330391k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f330392l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330393m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330394n;

    public l(@Y61.k View view, @Y61.k FragmentManager fragmentManager) {
        super(view);
        this.f330382b = view;
        this.f330383c = fragmentManager;
        this.f330384d = view.getContext();
        this.f330385e = view.findViewById(R.id.dates_widget_collapsed_layout);
        this.f330386f = (TextView) view.findViewById(R.id.widget_collapsed_title_tv);
        this.f330387g = (TextView) view.findViewById(R.id.widget_collapsed_placeholder_tv);
        this.f330388h = view.findViewById(R.id.dates_widget_expanded_content);
        this.f330389i = (TextView) view.findViewById(R.id.dates_widget_title_tv);
        this.f330390j = (FragmentContainerView) view.findViewById(R.id.calendar_fragment_container);
        this.f330391k = view.getLayoutParams();
        view.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 21));
    }

    @Override // com.avito.android.widget_filters.ui.items.dates.k
    public final void KQ(@Y61.l a aVar) {
        if (aVar != null) {
            boolean z12 = aVar.f330362c;
            int iD2 = C35835l0.d(z12 ? R.attr.gray54 : R.attr.black, this.f330384d);
            TextView textView = this.f330387g;
            textView.setTextColor(iD2);
            I5.a(textView, z12 ? aVar.f330361b : aVar.f330360a, false);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.e
    public final void ZD(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f330392l = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.dates.k
    public final void ic(@Y61.k Y41.a<G0> aVar) {
        this.f330394n = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        int id2 = this.f330390j.getId();
        FragmentManager fragmentManager = this.f330383c;
        Fragment fragmentG = fragmentManager.G(id2);
        if (fragmentG != null) {
            H hE2 = fragmentManager.e();
            hE2.m(fragmentG);
            hE2.f();
        }
        this.f330392l = null;
        this.f330394n = null;
        this.f330393m = null;
    }

    @Override // com.avito.android.widget_filters.ui.items.dates.k
    public final void p6(@Y61.k Y41.a<G0> aVar) {
        this.f330393m = aVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.dates.k
    public final void v2(@Y61.l com.avito.android.widget_filters.ui.items.d dVar) {
        Context context = this.f330384d;
        com.avito.android.widget_filters.utils.e.a(this.f330389i, dVar, context);
        com.avito.android.widget_filters.utils.e.a(this.f330386f, dVar, context);
    }

    @Override // com.avito.android.widget_filters.ui.items.dates.k
    public final void vY(boolean z12, @Y61.k StrBookingCalendarFragment strBookingCalendarFragment) {
        ViewGroup.LayoutParams layoutParams = this.f330391k;
        FragmentContainerView fragmentContainerView = this.f330390j;
        if (z12) {
            layoutParams.height = -1;
            fragmentContainerView.postDelayed(new RunnableC34589p(21, this, strBookingCalendarFragment), 300L);
            Y41.a<G0> aVar = this.f330394n;
            if (aVar != null) {
                ((g) aVar).invoke();
            }
        } else {
            layoutParams.height = -2;
            int id2 = fragmentContainerView.getId();
            FragmentManager fragmentManager = this.f330383c;
            Fragment fragmentG = fragmentManager.G(id2);
            if (fragmentG != null) {
                H hE2 = fragmentManager.e();
                hE2.m(fragmentG);
                hE2.f();
            }
            Y41.a<G0> aVar2 = this.f330393m;
            if (aVar2 != null) {
                ((h) aVar2).invoke();
            }
        }
        D6.G(this.f330385e, !z12);
        D6.G(this.f330388h, z12);
        this.f330382b.setLayoutParams(layoutParams);
    }
}

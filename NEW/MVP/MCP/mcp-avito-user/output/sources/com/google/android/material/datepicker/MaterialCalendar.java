package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j.N;
import j.P;
import j.f0;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: g0, reason: collision with root package name */
    @f0
    public int f356432g0;

    /* renamed from: h0, reason: collision with root package name */
    @P
    public DateSelector<S> f356433h0;

    /* renamed from: i0, reason: collision with root package name */
    @P
    public CalendarConstraints f356434i0;

    /* renamed from: j0, reason: collision with root package name */
    @P
    public DayViewDecorator f356435j0;

    /* renamed from: k0, reason: collision with root package name */
    @P
    public Month f356436k0;

    /* renamed from: l0, reason: collision with root package name */
    public d f356437l0;

    /* renamed from: m0, reason: collision with root package name */
    public C37054b f356438m0;

    /* renamed from: n0, reason: collision with root package name */
    public RecyclerView f356439n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f356440o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f356441p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f356442q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f356443r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f356444s0;

    public class a extends C22808a {
        @Override // androidx.core.view.C22808a
        public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            fVar.m(null);
        }
    }

    public class b extends C {

        /* renamed from: G, reason: collision with root package name */
        public final /* synthetic */ int f356445G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, int i13) {
            super(i12, false);
            this.f356445G = i13;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void z1(@N RecyclerView.z zVar, @N int[] iArr) {
            int i12 = this.f356445G;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i12 == 0) {
                iArr[0] = materialCalendar.f356440o0.getWidth();
                iArr[1] = materialCalendar.f356440o0.getWidth();
            } else {
                iArr[0] = materialCalendar.f356440o0.getHeight();
                iArr[1] = materialCalendar.f356440o0.getHeight();
            }
        }
    }

    public class c implements e {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f356448b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f356449c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ d[] f356450d;

        static {
            d dVar = new d("DAY", 0);
            f356448b = dVar;
            d dVar2 = new d("YEAR", 1);
            f356449c = dVar2;
            f356450d = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f356450d.clone();
        }
    }

    public interface e {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void b5(@N x xVar) {
        this.f356498f0.add(xVar);
    }

    public final void c5(Month month) {
        w wVar = (w) this.f356440o0.getAdapter();
        int iE2 = wVar.f356562c.f356407b.e(month);
        int iE3 = iE2 - wVar.f356562c.f356407b.e(this.f356436k0);
        boolean z12 = Math.abs(iE3) > 3;
        boolean z13 = iE3 > 0;
        this.f356436k0 = month;
        if (z12 && z13) {
            this.f356440o0.A0(iE2 - 3);
            this.f356440o0.post(new i(this, iE2));
        } else if (!z12) {
            this.f356440o0.post(new i(this, iE2));
        } else {
            this.f356440o0.A0(iE2 + 3);
            this.f356440o0.post(new i(this, iE2));
        }
    }

    public final void d5(d dVar) {
        this.f356437l0 = dVar;
        if (dVar == d.f356449c) {
            this.f356439n0.getLayoutManager().l1(this.f356436k0.f356493d - ((G) this.f356439n0.getAdapter()).f356430c.f356434i0.f356407b.f356493d);
            this.f356443r0.setVisibility(0);
            this.f356444s0.setVisibility(8);
            this.f356441p0.setVisibility(8);
            this.f356442q0.setVisibility(8);
            return;
        }
        if (dVar == d.f356448b) {
            this.f356443r0.setVisibility(8);
            this.f356444s0.setVisibility(0);
            this.f356441p0.setVisibility(0);
            this.f356442q0.setVisibility(0);
            c5(this.f356436k0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f356432g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f356433h0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f356434i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f356435j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f356436k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) throws Resources.NotFoundException {
        int i12;
        int i13;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f356432g0);
        this.f356438m0 = new C37054b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f356434i0.f356407b;
        if (MaterialDatePicker.d5(R.attr.windowFullscreen, contextThemeWrapper)) {
            i12 = com.google.android.material.R.layout.mtrl_calendar_vertical;
            i13 = 1;
        } else {
            i12 = com.google.android.material.R.layout.mtrl_calendar_horizontal;
            i13 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i12, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height);
        int i14 = u.f356552h;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding) * (i14 - 1)) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_height) * i14) + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_days_of_week);
        C22823h0.C(gridView, new a());
        int i15 = this.f356434i0.f356411f;
        gridView.setAdapter((ListAdapter) (i15 > 0 ? new C37059g(i15) : new C37059g()));
        gridView.setNumColumns(month.f356494e);
        gridView.setEnabled(false);
        this.f356440o0 = (RecyclerView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_months);
        getContext();
        this.f356440o0.setLayoutManager(new b(i13, i13));
        this.f356440o0.setTag("MONTHS_VIEW_GROUP_TAG");
        w wVar = new w(contextThemeWrapper, this.f356433h0, this.f356434i0, this.f356435j0, new c());
        this.f356440o0.setAdapter(wVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.google.android.material.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_year_selector_frame);
        this.f356439n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f356439n0.setLayoutManager(new GridLayoutManager(integer, 1));
            this.f356439n0.setAdapter(new G(this));
            this.f356439n0.l(new k(this), -1);
        }
        if (viewInflate.findViewById(com.google.android.material.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.google.android.material.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C22823h0.C(materialButton, new l(this));
            View viewFindViewById = viewInflate.findViewById(com.google.android.material.R.id.month_navigation_previous);
            this.f356441p0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.google.android.material.R.id.month_navigation_next);
            this.f356442q0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f356443r0 = viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_year_selector_frame);
            this.f356444s0 = viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_day_selector_frame);
            d5(d.f356448b);
            materialButton.setText(this.f356436k0.d());
            this.f356440o0.o(new m(this, wVar, materialButton));
            materialButton.setOnClickListener(new n(this));
            this.f356442q0.setOnClickListener(new o(this, wVar));
            this.f356441p0.setOnClickListener(new h(this, wVar));
        }
        if (!MaterialDatePicker.d5(R.attr.windowFullscreen, contextThemeWrapper)) {
            new J().b(this.f356440o0);
        }
        this.f356440o0.A0(wVar.f356562c.f356407b.e(this.f356436k0));
        C22823h0.C(this.f356440o0, new j());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f356432g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f356433h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f356434i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f356435j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f356436k0);
    }
}

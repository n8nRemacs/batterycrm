package com.avito.android.short_term_rent.bookingform;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import com.avito.android.short_term_rent.bookingform.page.PagerNoTouchEventRecyclerView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/j;", "Lcom/avito/android/short_term_rent/bookingform/i;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f281740a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f281741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<FooterButtonItem.ActionType, G0> f281742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f281743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f281744e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f281745f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f281746g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f281747h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PagerNoTouchEventRecyclerView f281748i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f281749j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f281750k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f281751l;

    /* compiled from: BookingFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f281752l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f281752l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f281752l.invoke();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super FooterButtonItem.ActionType, G0> lVar, @Y61.k Y41.a<G0> aVar2) {
        this.f281740a = view;
        this.f281741b = dVar;
        this.f281742c = lVar;
        View viewFindViewById = view.findViewById(R.id.progress);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f281743d = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bookingFormShimmer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f281744e = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.bookingFormContent);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f281745f = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.bookingFormError);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f281746g = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.navBar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.navBarTitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281747h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.recyclerView);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.short_term_rent.bookingform.page.PagerNoTouchEventRecyclerView");
        }
        PagerNoTouchEventRecyclerView pagerNoTouchEventRecyclerView = (PagerNoTouchEventRecyclerView) viewFindViewById7;
        this.f281748i = pagerNoTouchEventRecyclerView;
        View viewFindViewById8 = view.findViewById(R.id.footer);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f281749j = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.footerButton);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f281750k = (Button) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.errorButton);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById10;
        this.f281751l = button;
        a aVar3 = new a(aVar);
        int i12 = NavBar.f179818g;
        navBar.c(R.attr.ic_arrowBack24, aVar3);
        button.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(16, aVar2));
        view.getContext();
        pagerNoTouchEventRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        pagerNoTouchEventRecyclerView.setAdapter(dVar);
    }

    public static void a(View... viewArr) {
        for (View view : viewArr) {
            D6.w(view);
        }
    }

    public static void b(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                D6.H(view);
            }
        }
    }
}

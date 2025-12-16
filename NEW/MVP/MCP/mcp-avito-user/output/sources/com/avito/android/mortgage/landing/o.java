package com.avito.android.mortgage.landing;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.mortgage.widgets.StackedImageView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: LandingView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/o;", "Lcom/avito/android/mortgage/landing/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements g {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public com.avito.android.mortgage.landing.dialog.f f200296A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f200297B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f200298C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<Boolean> f200299D;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f200300a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f200301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f200302c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f200303d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoordinatorLayout f200304e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f200305f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f200306g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f200307h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f200308i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f200309j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f200310k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImageView f200311l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.landing.utils.b f200312m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f200313n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f200314o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f200315p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Toolbar f200316q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f200317r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f200318s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f200319t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f200320u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f200321v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f200322w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f200323x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f200324y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final StackedImageView f200325z;

    public o(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Collection collection, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k C22977J c22977j, @Y61.k Y41.l lVar) {
        RecyclerView recyclerView;
        this.f200300a = view;
        this.f200301b = dVar;
        this.f200302c = bVar;
        this.f200303d = view.getContext();
        View viewFindViewById = view.findViewById(R.id.landing_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        }
        this.f200304e = (CoordinatorLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.loading_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f200305f = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f200306g = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.landing_recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f200307h = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.retry_btn);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f200308i = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.header_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f200309j = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.redesigned_header_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f200310k = (ViewGroup) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.header_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f200311l = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.title_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.util.layout.OffsetLayout");
        }
        this.f200312m = new com.avito.android.mortgage.landing.utils.b((OffsetLayout) viewFindViewById9, aVar);
        View viewFindViewById10 = view.findViewById(R.id.subtitle);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200313n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.primary_button);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f200314o = (Button) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.secondary_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f200315p = (Button) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.landing_collapsing_toolbar);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById13;
        this.f200316q = toolbar;
        View viewFindViewById14 = toolbar.findViewById(R.id.toolbar_text);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200317r = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.app_bar);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f200318s = (AppBarLayout) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.landing_bottom_container);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f200319t = (FrameLayout) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.landing_bottom_content);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f200320u = (ConstraintLayout) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.landing_bottom_placeholders);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f200321v = (ConstraintLayout) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.landing_bottom_nothing);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f200322w = (LinearLayout) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.rate_text);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200323x = (TextView) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.payment_text);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200324y = (TextView) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.banks_images);
        if (viewFindViewById22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.StackedImageView");
        }
        this.f200325z = (StackedImageView) viewFindViewById22;
        this.f200299D = C43175k.d(new m(this, null));
        Iterator it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            recyclerView = this.f200307h;
            if (!zHasNext) {
                break;
            } else {
                recyclerView.l((RecyclerView.l) it.next(), -1);
            }
        }
        this.f200300a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.o1();
        linearLayoutManager.f53688E = 30;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (!dVar.hasStableIds()) {
            dVar.setHasStableIds(true);
        }
        recyclerView.setAdapter(dVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.o(new n(this, lVar));
        this.f200302c.a(recyclerView, null);
        this.f200318s.a(new com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n(this, 4));
        Drawable navigationIcon = this.f200316q.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, this.f200303d));
        }
        C43175k.K(new C43197r1(new k(lVar, null), y.a(aVar2.d9().N(h.f199636b).N(i.f199637b).d0(j.f199638b))), c22977j);
        C43175k.K(new C43197r1(new l(2, this, o.class, "keyboardStateUpdate", "keyboardStateUpdate(Z)V", 4), this.f200299D), c22977j);
    }

    public final void a(boolean z12) {
        this.f200298C = z12;
        D6.G(this.f200319t, z12 && !this.f200297B);
    }
}

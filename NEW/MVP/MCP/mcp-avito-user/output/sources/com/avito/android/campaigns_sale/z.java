package com.avito.android.campaigns_sale;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CampaignsSaleView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/z;", "", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class z {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f114452s = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f114453a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f114454b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f114455c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f114456d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f114457e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f114458f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f114459g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f114460h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f114461i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f114462j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f114463k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f114464l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f114465m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f114466n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f114467o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f114468p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f114469q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.model.progress_overlay.a f114470r;

    /* compiled from: CampaignsSaleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/campaigns_sale/z$a;", "", "<init>", "()V", "", "searchMenuItemIndex", "I", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CampaignsSaleView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return z.this.f114462j;
        }
    }

    static {
        new a(null);
    }

    public z(@Y61.k ViewGroup viewGroup, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k com.avito.konveyor.adapter.d dVar) {
        this.f114453a = abstractC25658a;
        this.f114454b = dVar;
        Context context = viewGroup.getContext();
        this.f114455c = context;
        View viewFindViewById = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f114456d = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.main_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f114457e = recyclerView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.sales_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.add_block_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f114458f = button;
        View viewFindViewById5 = viewGroup.findViewById(R.id.enter_sale_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114459g = (Button) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.exit_sale_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114460h = (Button) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.save_sale_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114461i = (Button) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.content_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f114462j = viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.overlay_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = viewGroup.findViewById(R.id.nested_scroll_view);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f114463k = (NestedScrollView) viewFindViewById10;
        View viewFindViewById11 = viewGroup.findViewById(R.id.sale_buttons_container);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f114464l = (ViewGroup) viewFindViewById11;
        View viewFindViewById12 = viewGroup.findViewById(R.id.items_amount_exceeded_container);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f114465m = viewFindViewById12;
        View viewFindViewById13 = viewFindViewById12.findViewById(R.id.image);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f114466n = (SimpleDraweeView) viewFindViewById13;
        View viewFindViewById14 = viewFindViewById12.findViewById(R.id.title);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114467o = (TextView) viewFindViewById14;
        View viewFindViewById15 = viewFindViewById12.findViewById(R.id.description);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114468p = (TextView) viewFindViewById15;
        View viewFindViewById16 = viewFindViewById12.findViewById(R.id.back_button);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114469q = (Button) viewFindViewById16;
        this.f114470r = new com.avito.android.beduin_shared.model.progress_overlay.a(viewGroup2, new b());
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(abstractC25658a);
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setAdapter(dVar);
        recyclerView2.setItemAnimator(null);
        int i12 = 0;
        recyclerView2.l(new com.avito.android.ui.h(i12, 0, 0, y6.b(16), 7, null), -1);
        screenPerformanceTracker.b(recyclerView2);
        Button.g(button, C35835l0.h(R.attr.ic_addThin20, context), null, false, null, 14);
    }
}

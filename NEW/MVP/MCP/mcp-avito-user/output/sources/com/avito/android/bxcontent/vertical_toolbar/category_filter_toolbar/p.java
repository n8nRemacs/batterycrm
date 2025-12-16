package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalCategoryFilterToolbarView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/p;", "Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/l;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f113094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f113095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CollapsingToolbarLayout f113096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f113097d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f113098e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f113099f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f113100g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f113101h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f113102i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f113103j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageView f113104k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImageView f113105l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f113106m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f113107n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f113108o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113109p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f113110q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113111r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f113112s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113113t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f113114u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public n f113115v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f113116w;

    /* renamed from: x, reason: collision with root package name */
    public int f113117x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public ValueAnimator f113118y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f113119z;

    public p(@Y61.k View view) {
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        this.f113094a = view;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.bx_appbar);
        this.f113095b = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.category_vertical_collapsing_toolbar);
        this.f113096c = collapsingToolbarLayout;
        TextView textView = (TextView) appBarLayout.findViewById(R.id.category_vertical_collapsing_title);
        this.f113097d = textView;
        this.f113098e = appBarLayout.findViewById(R.id.category_vertical_toolbar_title_container);
        this.f113099f = (TextView) appBarLayout.findViewById(R.id.category_vertical_toolbar_start_title_icon);
        this.f113100g = (TextView) appBarLayout.findViewById(R.id.category_vertical_toolbar_title_text);
        this.f113101h = (TextView) appBarLayout.findViewById(R.id.category_vertical_toolbar_end_title_icon);
        this.f113102i = appBarLayout.findViewById(R.id.category_vertical_thumb_layout);
        this.f113103j = appBarLayout.findViewById(R.id.category_vertical_header_thumb);
        this.f113104k = (ImageView) appBarLayout.findViewById(R.id.category_vertical_navigation_icon);
        this.f113105l = (ImageView) appBarLayout.findViewById(R.id.category_vertical_search_icon);
        View viewFindViewById = appBarLayout.findViewById(R.id.category_vertical_action_view);
        this.f113106m = viewFindViewById;
        this.f113107n = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f113108o = (FrameLayout) view.findViewById(R.id.collapsing_toolbar_overlay);
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f113109p = cVar;
        this.f113110q = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f113111r = cVar2;
        this.f113112s = new C41981q0(cVar2);
        com.jakewharton.rxrelay3.c<G0> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f113113t = cVar3;
        this.f113114u = new C41981q0(cVar3);
        this.f113116w = true;
        this.f113119z = true;
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = !com.avito.android.lib.util.i.f181377e;
        Iterator it = C42745f0.U(appBarLayout, collapsingToolbarLayout, textView, viewFindViewById).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setFitsSystemWindows(z12);
        }
        this.f113104k.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f113089c;

            {
                this.f113089c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f113089c.f113109p.accept(G0.f406611a);
                        break;
                    case 1:
                        this.f113089c.f113111r.accept(G0.f406611a);
                        break;
                    default:
                        this.f113089c.f113113t.accept(G0.f406611a);
                        break;
                }
            }
        });
        this.f113098e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f113089c;

            {
                this.f113089c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f113089c.f113109p.accept(G0.f406611a);
                        break;
                    case 1:
                        this.f113089c.f113111r.accept(G0.f406611a);
                        break;
                    default:
                        this.f113089c.f113113t.accept(G0.f406611a);
                        break;
                }
            }
        });
        this.f113105l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f113089c;

            {
                this.f113089c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f113089c.f113109p.accept(G0.f406611a);
                        break;
                    case 1:
                        this.f113089c.f113111r.accept(G0.f406611a);
                        break;
                    default:
                        this.f113089c.f113113t.accept(G0.f406611a);
                        break;
                }
            }
        });
    }

    @Override // tl.InterfaceC48686b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41981q0 getF113114u() {
        return this.f113114u;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    public final void c() {
        TextView textView = this.f113099f;
        textView.setText((CharSequence) null);
        TextView textView2 = this.f113101h;
        textView2.setText((CharSequence) null);
        FV.a aVar = FV.a.f4720a;
        aVar.getClass();
        FV.a.c(textView, R.attr.textIconPin);
        aVar.getClass();
        FV.a.c(textView2, R.attr.textIconExpandMore);
    }

    @Override // tl.InterfaceC48686b
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final C41981q0 getF113110q() {
        return this.f113110q;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    public final void f(@Y61.l String str) {
        I5.a(this.f113100g, str, false);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    @Y61.k
    /* renamed from: getActionView, reason: from getter */
    public final View getF113106m() {
        return this.f113106m;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    public final void i(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f113100g, attributedText, null);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C41981q0 getF113112s() {
        return this.f113112s;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.l
    public final void setTitle(@Y61.l String str) {
        this.f113097d.setText(str);
        this.f113117x = 0;
    }
}

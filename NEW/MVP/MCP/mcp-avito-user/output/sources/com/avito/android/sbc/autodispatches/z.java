package com.avito.android.sbc.autodispatches;

import Po0.InterfaceC14820d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.lib.design.accordion.a;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.util.C35835l0;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SbcAutoDispatchesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/z;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f258974a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f258975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f258976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f258977d;

    /* renamed from: e, reason: collision with root package name */
    public final TabGroup f258978e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f258979f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f258980g;

    /* renamed from: h, reason: collision with root package name */
    public final FloatingContainer f258981h;

    /* renamed from: i, reason: collision with root package name */
    public final SwipeRefreshLayout f258982i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f258983j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public InterfaceC14820d f258984k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final D f258985l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f258986m;

    public z(@Y61.k View view, @Y61.k SbcAutoDispatchesFragment sbcAutoDispatchesFragment, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3) {
        this.f258974a = view;
        this.f258975b = aVar;
        this.f258976c = aVar2;
        this.f258977d = aVar3;
        TabGroup tabGroup = (TabGroup) view.findViewById(R.id.sbc_auto_dispatches_tabs);
        this.f258978e = tabGroup;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.sbc_auto_dispatches_content_container);
        this.f258979f = (ViewGroup) view.findViewById(R.id.sbc_auto_dispatches_content_loaded);
        this.f258980g = (ViewGroup) view.findViewById(R.id.sbc_auto_dispatches_content_empty);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.sbc_auto_dispatches_view_pager);
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.sbc_auto_dispatches_toolbar);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.sbc_auto_dispatch_empty_accordion_container);
        FloatingContainer floatingContainer = (FloatingContainer) view.findViewById(R.id.sbc_auto_dispatch_button);
        this.f258981h = floatingContainer;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.sbc_auto_dispatches_swipe_refresh_layout);
        this.f258982i = swipeRefreshLayout;
        this.f258983j = new com.avito.android.progress_overlay.l(viewGroup, R.id.sbc_auto_dispatches_content, null, R.layout.sbc_auto_dispatches_error_overlay, 0, 20, null);
        D d12 = new D(sbcAutoDispatchesFragment);
        d12.f258821k = C42784z0.f406748b;
        this.f258985l = d12;
        com.avito.android.lib.design.tab_group.layout.i.b(tabGroup, viewPager2);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(d12);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 17));
        Accordion accordion = new Accordion(view.getContext(), null, 0, 0, 14, null);
        a.C5252a c5252a = com.avito.android.lib.design.accordion.a.f178201p;
        Context context = accordion.getContext();
        int iJ2 = C35835l0.j(R.attr.accordionH40, accordion.getContext());
        c5252a.getClass();
        accordion.setStyle(a.C5252a.b(iJ2, context));
        accordion.setState(new QU.d(accordion.getResources().getString(R.string.sbc_auto_dispatch_empty_content_extra_title), null, false, false, false, LayoutInflater.from(view.getContext()).inflate(R.layout.sbc_auto_dispatch_empty_content_block, (ViewGroup) null, false), null, null, false, null, 990, null));
        viewGroup2.removeAllViews();
        viewGroup2.addView(accordion);
        final int i12 = 0;
        floatingContainer.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sbc.autodispatches.y

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f258973c;

            {
                this.f258973c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f258973c.f258975b.invoke();
                        break;
                    default:
                        this.f258973c.f258976c.invoke();
                        break;
                }
            }
        });
        final int i13 = 1;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sbc.autodispatches.y

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f258973c;

            {
                this.f258973c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f258973c.f258975b.invoke();
                        break;
                    default:
                        this.f258973c.f258976c.invoke();
                        break;
                }
            }
        });
    }
}

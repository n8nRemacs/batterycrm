package com.avito.android.re_agent_landing.landing;

import Sh0.InterfaceC15186a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentProfileCreateLandingView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/d;", "Lcom/avito/android/re_agent_landing/landing/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC15186a, G0> f250574a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f250575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f250576c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f250577d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f250578e;

    /* compiled from: ReAgentProfileCreateLandingView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/re_agent_landing/landing/d$a", "Landroidx/recyclerview/widget/z;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k View view, @k j jVar, @k l<? super InterfaceC15186a, G0> lVar) {
        this.f250574a = lVar;
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.re_agent_profile_create_landing_nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.re_agent_profile_create_landing_recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f250575b = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.re_agent_profile_create_landing_loading);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f250576c = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.re_agent_profile_create_landing_error);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f250577d = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.re_agent_profile_create_landing_retry_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f250578e = new a(context);
        recyclerView.setAdapter(jVar);
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new c(this), false, context.getString(R.string.re_agent_profile_create_landing_nav_title), null, null, null, 117, null));
        ((Button) viewFindViewById5).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 24));
    }
}

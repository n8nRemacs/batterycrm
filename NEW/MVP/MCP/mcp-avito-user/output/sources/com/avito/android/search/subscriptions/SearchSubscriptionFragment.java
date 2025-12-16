package com.avito.android.search.subscriptions;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.E0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.search.subscriptions.d;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/search/subscriptions/SearchSubscriptionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/search/subscriptions/d$a;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSubscriptionFragment extends BaseFragment implements d.a, com.avito.android.bottom_navigation.ui.fragment.g, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f263840n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public d f263841o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f263842p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f263843q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f263844r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public EE0.d f263845s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f263846t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public w f263847u0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f263839w0 = {m0.f406844a.e(new Y(SearchSubscriptionFragment.class, "openParams", "getOpenParams()Lcom/avito/android/search/subscriptions/SearchSubscriptionFragmentParams;", 0))};

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f263838v0 = new a(null);

    /* compiled from: SearchSubscriptionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/subscriptions/SearchSubscriptionFragment$a;", "", "<init>", "()V", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SearchSubscriptionFragment() {
        super(0, 1, null);
        this.f263846t0 = new C35968w3(this);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        w wVar = this.f263847u0;
        if (wVar != null) {
            wVar.f264028h.A0(0);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (i12 != 2) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        d dVar = this.f263841o0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.j0();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        EE0.d dVar = this.f263845s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e();
        View viewInflate = layoutInflater.inflate(R.layout.saved_search, viewGroup, false);
        d dVar2 = this.f263841o0;
        d dVar3 = dVar2 != null ? dVar2 : null;
        com.avito.konveyor.adapter.a aVar = this.f263842p0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f263843q0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        InterfaceC28373a interfaceC28373a = this.f263844r0;
        w wVar = new w(viewInflate, dVar3, aVar2, aVar4, interfaceC28373a != null ? interfaceC28373a : null);
        this.f263847u0 = wVar;
        d dVar4 = this.f263841o0;
        if (dVar4 == null) {
            dVar4 = null;
        }
        dVar4.N(wVar);
        d dVar5 = this.f263841o0;
        if (dVar5 == null) {
            dVar5 = null;
        }
        dVar5.Q(this);
        EE0.d dVar6 = this.f263845s0;
        (dVar6 != null ? dVar6 : null).d();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        d dVar = this.f263841o0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        d dVar2 = this.f263841o0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.e0();
        this.f263847u0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        d dVar = this.f263841o0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.I0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f263841o0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onResume();
        InterfaceC28373a interfaceC28373a = this.f263844r0;
        (interfaceC28373a != null ? interfaceC28373a : null).c(new E0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.search.subscriptions.di.a.a().a((com.avito.android.search.subscriptions.di.d) C29972i.a(C29972i.b(this), com.avito.android.search.subscriptions.di.d.class), cv.c.b(this), com.avito.android.analytics.screens.s.c(this), requireContext(), getResources(), ((SearchSubscriptionFragmentParams) this.f263846t0.getValue(this, f263839w0[0])).f263848b).a(this);
        EE0.d dVar = this.f263845s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(fA2.b());
    }
}

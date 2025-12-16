package com.avito.android.messenger.blacklist.mvi;

import T20.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.messenger.blacklist.mvi.P;
import com.avito.android.messenger.blacklist.mvi.di.c;
import com.avito.android.messenger.blacklist.mvi.di.e;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/BlacklistFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BlacklistFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f186336w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f186337n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f186338o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    @e.a
    public com.avito.konveyor.adapter.a f186339p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    @e.a
    public com.avito.konveyor.a f186340q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public G f186341r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f186342s0;

    /* renamed from: t0, reason: collision with root package name */
    public P f186343t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public N f186344u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186345v0;

    /* compiled from: BlacklistFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/BlacklistFragment$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BlacklistFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActivityC22955m activityC22955mL1 = BlacklistFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    public BlacklistFragment() {
        super(0, 1, null);
        this.f186345v0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        boolean z12 = context instanceof N;
        Object obj = context;
        if (!z12) {
            obj = null;
        }
        this.f186344u0 = (N) obj;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.messenger_blacklist, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        NavBar.e(navBar, getString(R.string.messenger_blacklist), 0, 6);
        navBar.c(R.attr.ic_arrowBack24, new b());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f186344u0 = null;
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f186342s0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("BlacklistFragment");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f186342s0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("BlacklistFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        G g12 = this.f186341r0;
        if (g12 == null) {
            g12 = null;
        }
        io.reactivex.rxjava3.core.z<G.a> zVarM0 = g12.M0();
        P p12 = this.f186343t0;
        if (p12 == null) {
            p12 = null;
        }
        P.b bVar = P.b.f186393a;
        com.jakewharton.rxrelay3.b bVarN0 = com.jakewharton.rxrelay3.b.N0(G0.f406611a);
        io.reactivex.rxjava3.disposables.d dVarT0 = io.reactivex.rxjava3.core.z.K0(zVarM0.j0(io.reactivex.rxjava3.android.schedulers.b.b()), bVarN0, new e.g(new C31675e(p12))).j0(io.reactivex.rxjava3.schedulers.b.f404942b).d0(new e.i(new C31676f(bVar))).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new e.h(new C31677g(p12, bVarN0)));
        io.reactivex.rxjava3.disposables.c cVar = this.f186345v0;
        cVar.b(dVarT0);
        G g13 = this.f186341r0;
        if (g13 == null) {
            g13 = null;
        }
        g13.getF186365Y().observe(getViewLifecycleOwner(), new C31673c(this));
        G g14 = this.f186341r0;
        if (g14 == null) {
            g14 = null;
        }
        g14.getF186366Z().observe(getViewLifecycleOwner(), new C31674d(this));
        P p13 = this.f186343t0;
        if (p13 == null) {
            p13 = null;
        }
        com.jakewharton.rxrelay3.c cVar2 = p13.f186389k;
        InterfaceC35745a5 interfaceC35745a5 = this.f186337n0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        cVar.b(cVar2.j0(interfaceC35745a5.e()).t0(new C31678h(this)));
        P p14 = this.f186343t0;
        if (p14 == null) {
            p14 = null;
        }
        io.reactivex.rxjava3.core.z<G0> zVar = p14.f186390l;
        InterfaceC35745a5 interfaceC35745a52 = this.f186337n0;
        if (interfaceC35745a52 == null) {
            interfaceC35745a52 = null;
        }
        cVar.b(zVar.j0(interfaceC35745a52.e()).t0(new C31679i(this)));
        P p15 = this.f186343t0;
        if (p15 == null) {
            p15 = null;
        }
        com.jakewharton.rxrelay3.c cVar3 = p15.f186391m;
        InterfaceC35745a5 interfaceC35745a53 = this.f186337n0;
        cVar.b(cVar3.j0((interfaceC35745a53 != null ? interfaceC35745a53 : null).e()).t0(new C31680j(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        G g12 = this.f186341r0;
        if (g12 == null) {
            g12 = null;
        }
        g12.getF186365Y().removeObservers(getViewLifecycleOwner());
        G g13 = this.f186341r0;
        (g13 != null ? g13 : null).getF186366Z().removeObservers(getViewLifecycleOwner());
        this.f186345v0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f186338o0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f186339p0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f186340q0;
        this.f186343t0 = new P(view, interfaceC28373a, aVar2 != null ? aVar2 : null, aVar);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        c.a aVarA = com.avito.android.messenger.blacklist.mvi.di.o.a();
        aVarA.a((com.avito.android.messenger.blacklist.mvi.di.d) C29972i.a(C29972i.b(this), com.avito.android.messenger.blacklist.mvi.di.d.class));
        aVarA.c(this);
        aVarA.b(getResources());
        aVarA.build().a(this);
    }
}

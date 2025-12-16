package com.avito.android.auction.offer;

import Cd.C13243a;
import Nd.InterfaceC14561a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auction.offer.mvi.j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35968w3;
import com.avito.android.util.P5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import lD.C43617a;
import z1.AbstractC50339a;

/* compiled from: AuctionOfferFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/auction/offer/AuctionOfferFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/auction/offer/a;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuctionOfferFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.auction.offer.a, com.avito.android.ui.fragments.c {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C35968w3 f92427n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f92428o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f92429p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f92430q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.auction.offer.mvi.k f92431r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f92432s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C43617a f92433t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f92434u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public h f92435v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public y f92436w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f92426y0 = {m0.f406844a.e(new Y(AuctionOfferFragment.class, "openParams", "getOpenParams()Lcom/avito/android/auction/offer/AuctionOfferParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f92425x0 = new a(null);

    /* compiled from: AuctionOfferFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auction/offer/AuctionOfferFragment$a;", "", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f92437l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f92437l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f92437l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AuctionOfferFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f92439l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f92439l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f92439l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f92440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f92440l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f92440l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f92441l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f92441l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f92441l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AuctionOfferFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auction/offer/mvi/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auction/offer/mvi/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<j> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            com.avito.android.auction.offer.mvi.k kVar = AuctionOfferFragment.this.f92431r0;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    public AuctionOfferFragment() {
        super(0, 1, null);
        this.f92427n0 = new C35968w3(this);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f92434u0 = new O0(m0.f406844a.b(j.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC14561a.b.f11618a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@k Context context, @l Bundle bundle) {
        C43617a c43617a = this.f92433t0;
        if (c43617a == null) {
            c43617a = null;
        }
        if (c43617a.w().invoke().booleanValue()) {
            return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.auction_offer, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.a aVar = this.f92429p0;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.h hVar = this.f92428o0;
        com.avito.konveyor.adapter.h hVar2 = hVar != null ? hVar : null;
        com.avito.android.util.text.a aVar3 = this.f92430q0;
        com.avito.android.util.text.a aVar4 = aVar3 != null ? aVar3 : null;
        C43617a c43617a = this.f92433t0;
        this.f92435v0 = new h(aVar2, view, hVar2, aVar4, this, c43617a != null ? c43617a : null);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.auction.offer.c(this, null), 3);
        y yVar = this.f92436w0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar5 = this.f92432s0;
        this.f92436w0 = (y) (aVar5 != null ? aVar5 : null).V9().t0(new com.avito.android.auction.offer.b(this));
        View view2 = getView();
        if (view2 != null) {
            View viewFindViewById = view2.findViewById(R.id.toolbar);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
            }
            Toolbar toolbar = (Toolbar) viewFindViewById;
            o5(toolbar);
            C35966w1.c(this).t();
            P5.b(toolbar);
            toolbar.setNavigationOnClickListener(new B(this, 19));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.auction.offer.di.h.a().a((kj.c) C29972i.a(C29972i.b(this), kj.c.class), cv.c.b(this), (com.avito.android.auction.offer.di.b) C29972i.a(C29972i.b(this), com.avito.android.auction.offer.di.b.class), (AuctionOfferParams) this.f92427n0.getValue(this, f92426y0[0]), this, bundle == null).a(this);
    }

    public final j q5() {
        return (j) this.f92434u0.getValue();
    }

    @Override // com.avito.android.auction.offer.a
    public final void z4(@k InterfaceC14561a interfaceC14561a) {
        q5().accept(interfaceC14561a);
    }
}

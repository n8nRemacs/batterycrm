package com.avito.android.vas_planning_checkout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.U;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;

/* compiled from: VasPlanCheckoutFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_planning_checkout/VasPlanCheckoutFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/vas_planning_checkout/d;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasPlanCheckoutFragment extends BaseFragment implements InterfaceC36083d, InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f322802w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public A f322803n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f322804o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f322805p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f322806q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C36084e f322807r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f322808s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public InterfaceC49447a f322809t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322810u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final c f322811v0;

    /* compiled from: VasPlanCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_planning_checkout/VasPlanCheckoutFragment$a;", "", "<init>", "()V", "", "ARGUMENT_ID", "Ljava/lang/String;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasPlanCheckoutFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning_checkout/VasPlanCheckoutFragmentArgument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<VasPlanCheckoutFragmentArgument> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final VasPlanCheckoutFragmentArgument invoke() {
            Bundle arguments = VasPlanCheckoutFragment.this.getArguments();
            Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("argument_id_key", VasPlanCheckoutFragmentArgument.class) : arguments.getParcelable("argument_id_key");
            if (parcelable != null) {
                return (VasPlanCheckoutFragmentArgument) parcelable;
            }
            throw new IllegalArgumentException("Argument parameter is not provided");
        }
    }

    /* compiled from: VasPlanCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_planning_checkout/VasPlanCheckoutFragment$c", "Landroidx/activity/x;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.view.x {
        public c() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            A a12 = VasPlanCheckoutFragment.this.f322803n0;
            if (a12 == null) {
                a12 = null;
            }
            a12.S6();
        }
    }

    public VasPlanCheckoutFragment() {
        super(0, 1, null);
        this.f322810u0 = C42727D.c(new b());
        this.f322811v0 = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f322809t0 = interfaceC49447a;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_vas_planning_checkout, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f322809t0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f322811v0);
        InterfaceC28373a interfaceC28373a = this.f322806q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        InterfaceC42726C interfaceC42726C = this.f322810u0;
        interfaceC28373a.c(new U(((VasPlanCheckoutFragmentArgument) interfaceC42726C.getValue()).f322814b, ((VasPlanCheckoutFragmentArgument) interfaceC42726C.getValue()).f322816d));
        com.avito.konveyor.adapter.a aVar = this.f322804o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.adapter.j jVar = this.f322805p0;
        if (jVar == null) {
            jVar = null;
        }
        Resources resources = getResources();
        VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument = (VasPlanCheckoutFragmentArgument) interfaceC42726C.getValue();
        A a12 = this.f322803n0;
        A a13 = a12 != null ? a12 : null;
        C36084e c36084e = this.f322807r0;
        new z(view, aVar, jVar, this, this, resources, vasPlanCheckoutFragmentArgument, a13, c36084e != null ? c36084e : null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.vas_planning_checkout.di.a.a().a((VasPlanCheckoutFragmentArgument) this.f322810u0.getValue(), this, getResources(), (com.avito.android.vas_planning_checkout.di.c) C29972i.a(C29972i.b(this), com.avito.android.vas_planning_checkout.di.c.class), cv.c.b(this)).a(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322808s0;
        if (aVar == null) {
            aVar = null;
        }
        C49166b.c(aVar, C49166b.a(this));
    }

    public final void q5() {
        InterfaceC49447a interfaceC49447a = this.f322809t0;
        if (interfaceC49447a != null) {
            interfaceC49447a.r1();
        }
    }
}

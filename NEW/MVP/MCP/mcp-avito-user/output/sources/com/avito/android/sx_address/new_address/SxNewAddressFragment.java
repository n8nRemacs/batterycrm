package com.avito.android.sx_address.new_address;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.SxAddAddressSource;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.sx_address.SxAddressControl;
import com.avito.android.sx_address.SxAddressEditParams;
import com.avito.android.sx_address.SxNewAddressOpenParams;
import com.avito.android.sx_address.new_address.g;
import com.avito.android.sx_address.new_address.view.r;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SxNewAddressFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/new_address/SxNewAddressFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SxNewAddressFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f293548w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.deeplink.k f293549n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f293550o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public SxAddressControl f293551p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.new_address.d f293552q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.new_address.analytics.c f293553r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.new_address.analytics.e f293554s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public g.a f293555t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f293556u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public r f293557v0;

    /* compiled from: SxNewAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/new_address/SxNewAddressFragment$a;", "", "<init>", "()V", "", "SX_ADD_ADDRESS_PARAMS_KEY", "Ljava/lang/String;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f293559m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar) {
            super(0);
            this.f293559m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(SxNewAddressFragment.this, this.f293559m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SxNewAddressFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f293561l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f293561l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f293561l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f293562l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f293562l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f293562l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f293563l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f293563l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f293563l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SxNewAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/sx_address/new_address/g;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/sx_address/new_address/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<C23060r0, com.avito.android.sx_address.new_address.g> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.sx_address.new_address.g invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            g.a aVar = SxNewAddressFragment.this.f293555t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public SxNewAddressFragment() {
        super(R.layout.fragment_sx_new_address);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f293556u0 = new O0(m0.f406844a.b(com.avito.android.sx_address.new_address.g.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f293557v0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        SxAddAddressSource sxAddAddressSource;
        super.onViewCreated(view, bundle);
        SxAddressControl sxAddressControl = this.f293551p0;
        SxAddressControl sxAddressControl2 = sxAddressControl != null ? sxAddressControl : null;
        if (sxAddressControl2 instanceof SxAddressEditParams) {
            com.avito.android.sx_address.new_address.analytics.c cVar = this.f293553r0;
            if (cVar == null) {
                cVar = null;
            }
            if (sxAddressControl == null) {
                sxAddressControl = null;
            }
            String str = ((SxAddressEditParams) sxAddressControl).f292532b;
            cVar.f293574a = str != null ? str : "";
            SxAddressControl sxAddressControl3 = this.f293551p0;
            if (sxAddressControl3 == null) {
                sxAddressControl3 = null;
            }
            sxAddAddressSource = ((SxAddressEditParams) sxAddressControl3).f292536f;
        } else {
            if (!(sxAddressControl2 instanceof SxNewAddressOpenParams)) {
                throw new NoWhenBranchMatchedException();
            }
            com.avito.android.sx_address.new_address.analytics.c cVar2 = this.f293553r0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            if (sxAddressControl == null) {
                sxAddressControl = null;
            }
            String str2 = ((SxNewAddressOpenParams) sxAddressControl).f292548b;
            cVar2.f293574a = str2 != null ? str2 : "";
            SxAddressControl sxAddressControl4 = this.f293551p0;
            if (sxAddressControl4 == null) {
                sxAddressControl4 = null;
            }
            sxAddAddressSource = ((SxNewAddressOpenParams) sxAddressControl4).f292553g;
        }
        SxAddAddressSource sxAddAddressSource2 = sxAddAddressSource;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.sx_address.new_address.d dVar = this.f293552q0;
        com.avito.android.sx_address.new_address.d dVar2 = dVar != null ? dVar : null;
        SxAddressControl sxAddressControl5 = this.f293551p0;
        if (sxAddressControl5 == null) {
            sxAddressControl5 = null;
        }
        boolean z12 = sxAddressControl5 instanceof SxNewAddressOpenParams;
        com.avito.android.sx_address.new_address.analytics.e eVar = this.f293554s0;
        com.avito.android.sx_address.new_address.analytics.e eVar2 = eVar != null ? eVar : null;
        com.avito.android.sx_address.new_address.analytics.c cVar3 = this.f293553r0;
        r rVar = new r(view, viewLifecycleOwner, dVar2, sxAddAddressSource2, z12, eVar2, cVar3 != null ? cVar3 : null);
        this.f293557v0 = rVar;
        rVar.b((com.avito.android.sx_address.new_address.g) this.f293556u0.getValue());
        com.avito.android.arch.mvi.android.f.a((com.avito.android.sx_address.new_address.g) this.f293556u0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new com.avito.android.sx_address.new_address.a(1, this, SxNewAddressFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviOneTimeEvent;)V", 0), new com.avito.android.sx_address.new_address.b(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            SxAddressControl sxAddressControl = (SxAddressControl) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("sx_add_address_params_key", SxAddressControl.class) : arguments.getParcelable("sx_add_address_params_key"));
            if (sxAddressControl != null) {
                com.avito.android.sx_address.new_address.di.a.a().a(sxAddressControl, getResources(), (com.avito.android.sx_address.new_address.di.e) C29972i.a(C29972i.b(this), com.avito.android.sx_address.new_address.di.e.class), cv.c.b(this)).a(this);
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }
}

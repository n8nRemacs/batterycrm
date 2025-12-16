package com.avito.android.sbc.autodispatches;

import Cd.C13243a;
import Po0.InterfaceC14817a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import md.InterfaceC44055a;
import z1.AbstractC50339a;

/* compiled from: SbcAutoDispatchesFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/sbc/autodispatches/SbcAutoDispatchesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lmd/a;", "Lcom/avito/android/sbc/autodispatches/di/b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcAutoDispatchesFragment extends BaseFragment implements InterfaceC28477j.b, InterfaceC44055a<com.avito.android.sbc.autodispatches.di.b> {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f258822t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.sbc.autodispatches.mvi.n f258823n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f258824o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f258825p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public z f258826q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public x f258827r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.avito.android.sbc.autodispatches.di.b f258828s0;

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sbc/autodispatches/SbcAutoDispatchesFragment$a;", "", "<init>", "()V", "", "DISPATCH_FINISHED_TOAST_OFFSET_DP", "I", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<String, Bundle, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (str.equals("dispatch_edit_request_key")) {
                Integer numValueOf = bundle2.containsKey("dispatch_edit_result") ? Integer.valueOf(bundle2.getInt("dispatch_edit_result")) : null;
                if (numValueOf != null) {
                    SbcDispatchEditResult sbcDispatchEditResult = (SbcDispatchEditResult) C42745f0.K(numValueOf.intValue(), SbcDispatchEditResult.f258843f);
                    if (sbcDispatchEditResult != null) {
                        SbcAutoDispatchesFragment sbcAutoDispatchesFragment = SbcAutoDispatchesFragment.this;
                        z zVar = sbcAutoDispatchesFragment.f258826q0;
                        if (zVar != null) {
                            zVar.f258986m = sbcDispatchEditResult == SbcDispatchEditResult.f258841d;
                        }
                        ((com.avito.android.sbc.autodispatches.mvi.m) sbcAutoDispatchesFragment.f258824o0.getValue()).accept(new InterfaceC14817a.b(sbcDispatchEditResult));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SbcAutoDispatchesFragment.f258822t0;
            ((com.avito.android.sbc.autodispatches.mvi.m) SbcAutoDispatchesFragment.this.f258824o0.getValue()).accept(InterfaceC14817a.C0864a.f13281a);
            return G0.f406611a;
        }
    }

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            x xVar = SbcAutoDispatchesFragment.this.f258827r0;
            if (xVar != null) {
                xVar.p();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SbcAutoDispatchesFragment.f258822t0;
            ((com.avito.android.sbc.autodispatches.mvi.m) SbcAutoDispatchesFragment.this.f258824o0.getValue()).accept(InterfaceC14817a.c.f13283a);
            return G0.f406611a;
        }
    }

    /* compiled from: SbcAutoDispatchesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatches/mvi/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sbc/autodispatches/mvi/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.sbc.autodispatches.mvi.m> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.sbc.autodispatches.mvi.m invoke() {
            com.avito.android.sbc.autodispatches.mvi.n nVar = SbcAutoDispatchesFragment.this.f258823n0;
            if (nVar == null) {
                nVar = null;
            }
            return (com.avito.android.sbc.autodispatches.mvi.m) nVar.get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f258834l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f258834l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f258834l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SbcAutoDispatchesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f258836l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f258836l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f258836l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258837l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f258837l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258838l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f258838l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public SbcAutoDispatchesFragment() {
        super(R.layout.sbc_auto_dispatches_fragment_layout);
        g gVar = new g(new f());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f258824o0 = new O0(m0.f406844a.b(com.avito.android.sbc.autodispatches.mvi.m.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        com.avito.android.sbc.autodispatches.di.b bVarA = com.avito.android.sbc.autodispatches.di.a.a().a((com.avito.android.sbc.autodispatches.di.c) C29972i.a(C29972i.b(this), com.avito.android.sbc.autodispatches.di.c.class), cv.c.b(this));
        this.f258828s0 = bVarA;
        bVarA.b(this);
        boolean z12 = context instanceof x;
        Object obj = context;
        if (!z12) {
            obj = null;
        }
        this.f258827r0 = (x) obj;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "dispatch_edit_request_key", new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f258826q0 = new z(view, this, new c(), new d(), new e());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.sbc.autodispatches.k(this, (com.avito.android.sbc.autodispatches.mvi.m) this.f258824o0.getValue(), null), 3);
    }

    @Override // md.InterfaceC44055a
    public final com.avito.android.sbc.autodispatches.di.b r0() {
        com.avito.android.sbc.autodispatches.di.b bVar = this.f258828s0;
        if (bVar == null) {
            return null;
        }
        return bVar;
    }
}

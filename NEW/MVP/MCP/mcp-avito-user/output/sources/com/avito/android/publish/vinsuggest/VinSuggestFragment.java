package com.avito.android.publish.vinsuggest;

import Cd.C13243a;
import Id0.InterfaceC14062b;
import If0.InterfaceC14101c;
import Y61.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.progress_overlay.l;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: VinSuggestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/vinsuggest/VinSuggestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VinSuggestFragment extends BaseFragment implements InterfaceC14062b, InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C35968w3 f245685n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.vinsuggest.j f245686o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final O0 f245687p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f245688q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C0 f245689r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f245684t0 = {m0.f406844a.e(new Y(VinSuggestFragment.class, "vinSuggestOpenParams", "getVinSuggestOpenParams()Lcom/avito/android/publish/vinsuggest/VinSuggestOpenParams;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final b f245683s0 = new b(null);

    /* compiled from: VinSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/vinsuggest/VinSuggestFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l f245690a;

        public a(@k l lVar) {
            this.f245690a = lVar;
        }
    }

    /* compiled from: VinSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/vinsuggest/VinSuggestFragment$b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: VinSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC14101c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC14101c interfaceC14101c) {
            InterfaceC14101c interfaceC14101c2 = interfaceC14101c;
            VinSuggestFragment vinSuggestFragment = (VinSuggestFragment) this.receiver;
            b bVar = VinSuggestFragment.f245683s0;
            vinSuggestFragment.getClass();
            if (interfaceC14101c2 instanceof InterfaceC14101c.b) {
                C0 c02 = vinSuggestFragment.f245689r0;
                (c02 != null ? c02 : null).ye();
            } else if (interfaceC14101c2 instanceof InterfaceC14101c.a) {
                C0 c03 = vinSuggestFragment.f245689r0;
                if (c03 == null) {
                    c03 = null;
                }
                c03.xe(null);
            } else if (interfaceC14101c2 instanceof InterfaceC14101c.C0482c) {
                ActivityC22955m activityC22955mL1 = vinSuggestFragment.l1();
                com.avito.android.publish.vinsuggest.h hVar = activityC22955mL1 instanceof com.avito.android.publish.vinsuggest.h ? (com.avito.android.publish.vinsuggest.h) activityC22955mL1 : null;
                if (hVar != null) {
                    hVar.C();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VinSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIf0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LIf0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<If0.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f245691l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VinSuggestFragment vinSuggestFragment, a aVar) {
            super(1);
            this.f245691l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(If0.d dVar) {
            b bVar = VinSuggestFragment.f245683s0;
            dVar.getClass();
            this.f245691l.f245690a.k(null);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f245692l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f245692l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f245692l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VinSuggestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f245694l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f245694l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f245694l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f245695l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f245695l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f245695l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f245696l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f245696l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f245696l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VinSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/vinsuggest/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/vinsuggest/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.publish.vinsuggest.i> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.vinsuggest.i invoke() {
            com.avito.android.publish.vinsuggest.j jVar = VinSuggestFragment.this.f245686o0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.publish.vinsuggest.i) jVar.get();
        }
    }

    public VinSuggestFragment() {
        super(R.layout.loading_progress_overlay_fragment);
        this.f245685n0 = new C35968w3(this);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f245687p0 = new O0(m0.f406844a.b(com.avito.android.publish.vinsuggest.i.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f245688q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        a aVar = new a(new l(viewGroup, 0, interfaceC28373a, R.layout.publish_progress_overlay_black, C35835l0.d(R.attr.transparentBlack, requireContext()), 2, null));
        com.avito.android.arch.mvi.android.f.a((com.avito.android.publish.vinsuggest.i) this.f245687p0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, VinSuggestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/vinsuggest/mvi/entity/VinSuggestOneTimeEvent;)V", 0), new d(this, aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.publish.vinsuggest.di.a.a().a((com.avito.android.publish.vinsuggest.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.vinsuggest.di.c.class), (VinSuggestOpenParams) this.f245685n0.getValue(this, f245684t0[0])).a(this);
    }
}

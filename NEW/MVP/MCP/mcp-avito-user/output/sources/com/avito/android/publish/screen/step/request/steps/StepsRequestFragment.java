package com.avito.android.publish.screen.step.request.steps;

import Cd.C13243a;
import Id0.InterfaceC14062b;
import Me0.C14479d;
import Me0.InterfaceC14476a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.InterfaceC33875j0;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: StepsRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/StepsRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StepsRequestFragment extends BaseFragment implements com.avito.android.ui.fragments.c, InterfaceC14062b, InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final b f241945s0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.step.request.steps.c f241946n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f241947o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f241948p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C0 f241949q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public InterfaceC33875j0 f241950r0;

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/StepsRequestFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f241951a;

        public a(@Y61.k C33862g0 c33862g0, @Y61.k com.avito.android.progress_overlay.l lVar) {
            this.f241951a = lVar;
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/StepsRequestFragment$b;", "", "<init>", "()V", "", "ARG_IS_INITIAL_REQUEST", "Ljava/lang/String;", "ARG_LOCAL_DRAFT_ID", "ARG_TRACK_DRAFT_RESUMED", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: StepsRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f241952l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ boolean f241953m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ boolean f241954n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z12, boolean z13) {
                super(1);
                this.f241952l = str;
                this.f241953m = z12;
                this.f241954n = z13;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("arg.local_draft_id", this.f241952l);
                bundle2.putBoolean("arg.is_initial_request", this.f241953m);
                bundle2.putBoolean("arg.track_draft_resumed", this.f241954n);
                return G0.f406611a;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static StepsRequestFragment a(@Y61.k String str, boolean z12, boolean z13) {
            StepsRequestFragment stepsRequestFragment = new StepsRequestFragment();
            C35966w1.a(stepsRequestFragment, -1, new a(str, z12, z13));
            return stepsRequestFragment;
        }

        public b() {
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = StepsRequestFragment.f241945s0;
            ((com.avito.android.publish.screen.step.request.steps.b) StepsRequestFragment.this.f241947o0.getValue()).accept(InterfaceC14476a.b.f10971a);
            return G0.f406611a;
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC33875j0 interfaceC33875j0 = StepsRequestFragment.this.f241950r0;
            if (interfaceC33875j0 != null) {
                interfaceC33875j0.h();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            StepsRequestFragment.this.i0();
            return G0.f406611a;
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMe0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LMe0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<C14479d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f241958l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StepsRequestFragment stepsRequestFragment, a aVar) {
            super(1);
            this.f241958l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(C14479d c14479d) {
            C14479d c14479d2 = c14479d;
            b bVar = StepsRequestFragment.f241945s0;
            boolean z12 = c14479d2.f10976a;
            com.avito.android.progress_overlay.l lVar = this.f241958l.f241951a;
            if (z12) {
                lVar.k(null);
            } else {
                String str = c14479d2.f10977b;
                if (str != null) {
                    lVar.a(str);
                } else {
                    lVar.j();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f241959l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f241959l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f241959l);
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
            return StepsRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f241961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f241961l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f241961l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241962l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241962l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f241962l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241963l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241963l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f241963l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StepsRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/screen/step/request/steps/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.publish.screen.step.request.steps.b> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.screen.step.request.steps.b invoke() {
            com.avito.android.publish.screen.step.request.steps.c cVar = StepsRequestFragment.this.f241946n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.publish.screen.step.request.steps.b) cVar.get();
        }
    }

    public StepsRequestFragment() {
        super(R.layout.loading_progress_overlay_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f241947o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.request.steps.b.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        ((com.avito.android.publish.screen.step.request.steps.b) this.f241947o0.getValue()).accept(InterfaceC14476a.C0693a.f10970a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f241950r0 = context instanceof InterfaceC33875j0 ? (InterfaceC33875j0) context : null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View rootView = requireView().getRootView();
        C0 c02 = this.f241949q0;
        if (c02 == null) {
            c02 = null;
        }
        C33862g0 c33862g0 = new C33862g0(rootView, c02.qe());
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f241948p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 18, null);
        a aVar = new a(c33862g0, lVar);
        lVar.f231600j = new c();
        c33862g0.c(R.drawable.ic_back_24_black);
        c33862g0.b(new d(), new e());
        com.avito.android.arch.mvi.android.f.c(this, (com.avito.android.publish.screen.step.request.steps.b) this.f241947o0.getValue(), new f(this, aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg.local_draft_id") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        Boolean boolValueOf = arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("arg.is_initial_request", true)) : null;
        if (boolValueOf == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        Bundle arguments3 = getArguments();
        Boolean boolValueOf2 = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("arg.track_draft_resumed")) : null;
        if (boolValueOf2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.screen.step.request.steps.di.a.a().a((com.avito.android.publish.screen.step.request.steps.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.request.steps.di.c.class), new C33930m(string), zBooleanValue, boolValueOf2.booleanValue()).a(this);
    }
}

package com.avito.android.recall_me_v2.presentation.recallme;

import Cd.C13243a;
import Di0.InterfaceC13403a;
import Di0.InterfaceC13404b;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.recall_me_v2.presentation.recallme.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: RecallMeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/RecallMeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LDi0/c;", VoiceInfo.STATE, "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public dagger.internal.u f252078n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f252079o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f252080p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f252081q0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f252077s0 = {m0.f406844a.e(new Y(RecallMeFragment.class, "recallMeParams", "getRecallMeParams()Lcom/avito/android/recall_me/presentation/RecallMeParams;", 0))};

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f252076r0 = new a(null);

    /* compiled from: RecallMeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/RecallMeFragment$a;", "", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecallMeFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                r9 = this;
                androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                r11 = r11 & 11
                r0 = 2
                if (r11 != r0) goto L18
                boolean r11 = r10.c()
                if (r11 != 0) goto L14
                goto L18
            L14:
                r10.f()
                goto L71
            L18:
                com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment$a r11 = com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment.f252076r0
                com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment r11 = com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment.this
                com.avito.android.recall_me_v2.presentation.recallme.y r0 = r11.q5()
                kotlinx.coroutines.flow.n2 r0 = r0.getState()
                androidx.compose.runtime.y1 r0 = androidx.compose.runtime.C22126m3.b(r0, r10)
                java.lang.Object r0 = r0.getF42167b()
                Di0.c r0 = (Di0.AbstractC13405c) r0
                com.avito.android.recall_me_v2.presentation.recallme.y r1 = r11.q5()
                kotlinx.coroutines.flow.i r1 = r1.getEvents()
                com.avito.android.recall_me_v2.presentation.recallme.y r4 = r11.q5()
                r11 = -320943938(0xffffffffecdec8be, float:-2.1546361E27)
                r10.C(r11)
                boolean r11 = r10.B(r4)
                java.lang.Object r2 = r10.t()
                if (r11 != 0) goto L53
                androidx.compose.runtime.A$a r11 = androidx.compose.runtime.A.f37866a
                r11.getClass()
                androidx.compose.runtime.A$a$a r11 = androidx.compose.runtime.A.a.f37868b
                if (r2 != r11) goto L65
            L53:
                com.avito.android.recall_me_v2.presentation.recallme.b r11 = new com.avito.android.recall_me_v2.presentation.recallme.b
                java.lang.String r7 = "accept(Ljava/lang/Object;)V"
                r8 = 0
                r3 = 1
                java.lang.Class<com.avito.android.recall_me_v2.presentation.recallme.y> r5 = com.avito.android.recall_me_v2.presentation.recallme.y.class
                java.lang.String r6 = "accept"
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r10.H(r11)
                r2 = r11
            L65:
                kotlin.reflect.i r2 = (kotlin.reflect.i) r2
                r10.h()
                Y41.l r2 = (Y41.l) r2
                r11 = 64
                com.avito.android.recall_me_v2.presentation.recallme.k.c(r0, r1, r2, r10, r11)
            L71:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.RecallMeFragment.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RecallMeFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.p<InterfaceC13404b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC13404b interfaceC13404b, Continuation<? super G0> continuation) {
            InterfaceC13404b interfaceC13404b2 = interfaceC13404b;
            RecallMeFragment recallMeFragment = (RecallMeFragment) this.receiver;
            a aVar = RecallMeFragment.f252076r0;
            recallMeFragment.getClass();
            if (interfaceC13404b2 instanceof InterfaceC13404b.a) {
                ActivityC22955m activityC22955mL1 = recallMeFragment.l1();
                if (activityC22955mL1 != null) {
                    Intent intent = new Intent();
                    InterfaceC13404b.a aVar2 = (InterfaceC13404b.a) interfaceC13404b2;
                    intent.putExtra("recall_me_message", aVar2.f3397a);
                    intent.putExtra("recall_me_request_id", aVar2.f3398b);
                    G0 g02 = G0.f406611a;
                    activityC22955mL1.setResult(-1, intent);
                }
                ActivityC22955m activityC22955mL12 = recallMeFragment.l1();
                if (activityC22955mL12 != null) {
                    K2.c(activityC22955mL12);
                }
                ActivityC22955m activityC22955mL13 = recallMeFragment.l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.finish();
                }
            } else {
                boolean z12 = interfaceC13404b2 instanceof InterfaceC13404b.C0187b;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252083l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f252083l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252083l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return RecallMeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f252085l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f252085l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f252085l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252086l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f252086l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252087l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f252087l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RecallMeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/y;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/recall_me_v2/presentation/recallme/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<y> {
        public i() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final y invoke() {
            dagger.internal.u uVar = RecallMeFragment.this.f252078n0;
            if (uVar == null) {
                uVar = null;
            }
            return (y) uVar.get();
        }
    }

    public RecallMeFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f252079o0 = new O0(m0.f406844a.b(y.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f252081q0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f252080p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return new ComposeView(requireContext(), null, 0, 6, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252080p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ((ComposeView) view).setContent(new C22096n(-888421048, new b(), true));
        C43175k.K(new C43197r1(new c(2, this, RecallMeFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeEvent;)V", 4), C23069w.a(q5().getEvents(), getLifecycle(), Lifecycle.State.f46682e)), C22984Q.a(getViewLifecycleOwner()));
        q5().accept(InterfaceC13403a.c.f3391a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c(cv.c.b(this), (com.avito.android.recall_me_v2.presentation.recallme.d) C29972i.a(C29972i.b(this), com.avito.android.recall_me_v2.presentation.recallme.d.class), (RecallMeParams) this.f252081q0.getValue(this, f252077s0[0]), com.avito.android.analytics.screens.s.c(this), null);
        this.f252078n0 = cVar.f252098i;
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f252096g.get();
        this.f252080p0 = screenPerformanceTracker;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final y q5() {
        return (y) this.f252079o0.getValue();
    }
}

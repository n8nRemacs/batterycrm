package com.avito.android.mandatory_verification;

import Cd.C13243a;
import PX.a;
import UX.a;
import UX.b;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.mandatory_verification.presentation.mvi.m;
import com.avito.android.mandatory_verification.screen.MandatoryVerificationScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35974x2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: MandatoryVerificationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mandatory_verification/MandatoryVerificationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MandatoryVerificationFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f184394w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f184395n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f184396o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f184397p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public l<? super UX.a, G0> f184398q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f184399r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f184400s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f184401t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f184402u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.mandatory_verification.presentation.a f184403v0;

    /* compiled from: MandatoryVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/mandatory_verification/MandatoryVerificationFragment$a;", "", "<init>", "()V", "", "FILE_ACTION_TYPE", "Ljava/lang/String;", "KEY_ITEM_ID", "", "REQUEST_CODE_FILE_PICKER", "I", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MandatoryVerificationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<UX.b, G0> {
        @Override // Y41.l
        public final G0 invoke(UX.b bVar) {
            UX.b bVar2 = bVar;
            MandatoryVerificationFragment mandatoryVerificationFragment = (MandatoryVerificationFragment) this.receiver;
            a aVar = MandatoryVerificationFragment.f184394w0;
            mandatoryVerificationFragment.getClass();
            if (bVar2 instanceof b.c) {
                Intent intent = new Intent();
                intent.setType("*/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) ((b.c) bVar2).f16428a.toArray(new String[0]));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                C35966w1.d(mandatoryVerificationFragment, Intent.createChooser(intent, ""), 9);
            } else if (bVar2 instanceof b.C1128b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = mandatoryVerificationFragment.f184400s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.C1128b) bVar2).f16427a, null, null, 6);
            } else if (bVar2 instanceof b.e) {
                a.i iVarF5 = mandatoryVerificationFragment.f5();
                f.c.f125255c.getClass();
                a.i.C4057a.d(iVarF5, ((b.e) bVar2).f16430a, null, null, f.c.a.b(), 0, null, null, null, 2030);
            } else if (bVar2 instanceof b.d) {
                mandatoryVerificationFragment.q5(-1);
            } else if (bVar2 instanceof b.a) {
                mandatoryVerificationFragment.q5(0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MandatoryVerificationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<UX.c, G0> {
        @Override // Y41.l
        public final G0 invoke(UX.c cVar) {
            ((com.avito.android.mandatory_verification.presentation.e) this.receiver).a(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: MandatoryVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUX/a;", "it", "Lkotlin/G0;", "invoke", "(LUX/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<UX.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UX.a aVar) {
            a aVar2 = MandatoryVerificationFragment.f184394w0;
            ((com.avito.android.mandatory_verification.presentation.mvi.l) MandatoryVerificationFragment.this.f184396o0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f184405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f184405l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f184405l);
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
            return MandatoryVerificationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f184407l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f184407l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f184407l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f184408l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f184408l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f184408l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f184409l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f184409l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f184409l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MandatoryVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mandatory_verification/presentation/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.mandatory_verification.presentation.mvi.l> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mandatory_verification.presentation.mvi.l invoke() {
            m mVar = MandatoryVerificationFragment.this.f184395n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.mandatory_verification.presentation.mvi.l) mVar.get();
        }
    }

    public MandatoryVerificationFragment() {
        super(R.layout.mandatory_verification_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f184396o0 = new O0(m0.f406844a.b(com.avito.android.mandatory_verification.presentation.mvi.l.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Uri data;
        List<Uri> listA;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 9) {
            ArrayList arrayList = new ArrayList();
            if (intent != null && (listA = C35974x2.a(intent)) != null) {
                arrayList.addAll(listA);
            }
            if (arrayList.isEmpty() && intent != null && (data = intent.getData()) != null) {
                arrayList.add(data);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            l<? super UX.a, G0> lVar = this.f184398q0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.invoke(new a.g(arrayList));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.avito.android.mandatory_verification.presentation.a aVar = this.f184403v0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f184399r0;
        if (dVar == null) {
            dVar = null;
        }
        l<? super UX.a, G0> lVar = this.f184398q0;
        if (lVar == null) {
            lVar = null;
        }
        com.avito.android.mandatory_verification.presentation.e eVar = new com.avito.android.mandatory_verification.presentation.e(lVar, view, dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f184397p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (com.avito.android.mandatory_verification.presentation.mvi.l) this.f184396o0.getValue(), new b(1, this, MandatoryVerificationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationOneTimeEvent;)V", 0), new c(1, eVar, com.avito.android.mandatory_verification.presentation.e.class, "renderState", "renderState(Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationState;)V", 0));
        com.avito.android.mandatory_verification.presentation.a aVar = this.f184403v0;
        if (aVar == null) {
            aVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f184402u0;
        aVar.a(set != null ? set : null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MandatoryVerificationScreen.f184809d, s.c(this), null, 4, null);
        Bundle arguments = getArguments();
        Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong("key.mandatory_verification_item_id")) : null;
        if (lValueOf == null) {
            InterfaceC28373a interfaceC28373a = this.f184401t0;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new NonFatalErrorEvent("ItemId was not provided", null, null, null, 14, null));
            q5(0);
        } else {
            ((a.b) C29972i.a(C29972i.b(this), a.b.class)).dj().a(cv.c.d(this), lValueOf.longValue(), new d(), c28478k, getResources(), c28478k.f90637b).a(this);
            ScreenPerformanceTracker screenPerformanceTracker = this.f184397p0;
            (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
        }
    }

    public final void q5(int i12) {
        ActivityC22955m activityC22955mL1 = l1();
        MandatoryVerificationActivity mandatoryVerificationActivity = activityC22955mL1 instanceof MandatoryVerificationActivity ? (MandatoryVerificationActivity) activityC22955mL1 : null;
        if (mandatoryVerificationActivity != null) {
            mandatoryVerificationActivity.setResult(i12);
            mandatoryVerificationActivity.finish();
            G0 g02 = G0.f406611a;
        }
    }
}

package com.avito.android.tariff.cpx.info.sf.terms;

import Cd.C13243a;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.info.sf.terms.domain.TariffCpxInfoSfTermsContent;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import z1.AbstractC50339a;

/* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/TariffCpxInfoSfTermsDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LBB0/c;", VoiceInfo.STATE, "Lkotlin/Function1;", "LBB0/a;", "Lkotlin/G0;", "action", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxInfoSfTermsDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f296816h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f296817i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f296818j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public u f296819k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final O0 f296820l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f296821m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f296815o0 = {m0.f406844a.e(new Y(TariffCpxInfoSfTermsDialogFragment.class, "content", "getContent()Lcom/avito/android/tariff/cpx/info/sf/terms/domain/TariffCpxInfoSfTermsContent;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f296814n0 = new a(null);

    /* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/TariffCpxInfoSfTermsDialogFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = TariffCpxInfoSfTermsDialogFragment.this.f296817i0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-308055141, new p(TariffCpxInfoSfTermsDialogFragment.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f296824l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f296824l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f296824l);
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
            return TariffCpxInfoSfTermsDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f296826l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f296826l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f296826l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296827l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296827l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f296827l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296828l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f296828l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/info/sf/terms/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<t> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = TariffCpxInfoSfTermsDialogFragment.this.f296819k0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public TariffCpxInfoSfTermsDialogFragment() {
        super(0, 1, null);
        this.f296818j0 = C42727D.c(new b());
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f296820l0 = new O0(m0.f406844a.b(t.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f296821m0 = new C35968w3(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f5(com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment r27, java.lang.String r28, java.lang.String r29, Y41.a r30, Y41.a r31, boolean r32, androidx.compose.ui.v r33, androidx.compose.runtime.A r34, int r35) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment.f5(com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment, java.lang.String, java.lang.String, Y41.a, Y41.a, boolean, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    public static final void g5(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, AttributedText attributedText, A a12, int i12) {
        B bE2 = a12.E(429049255);
        v.a aVar = v.f42878y1;
        if (attributedText == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new com.avito.android.tariff.cpx.info.sf.terms.d(tariffCpxInfoSfTermsDialogFragment, attributedText, aVar, i12);
                return;
            }
            return;
        }
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C22501m2.a(R1.k(16, 0.0f, 2, R1.k(0.0f, 20, 1, aVar)), "SF_TERMS_DIALOG_DESCRIPTION_TEST_TAG"), R.attr.textM10, null, null, 0, bE2, 8, 56);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new com.avito.android.tariff.cpx.info.sf.terms.e(tariffCpxInfoSfTermsDialogFragment, attributedText, aVar, i12);
        }
    }

    public static final void h5(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, wZ.l lVar, v vVar, A a12, int i12) {
        int i13;
        v vVar2;
        B bE2 = a12.E(-1756815012);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B("SF_TERMS_DIALOG_IMAGE_WITH_GRADIENT_TEST_TAG") ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = v.f42878y1;
            if (lVar == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new com.avito.android.tariff.cpx.info.sf.terms.f(tariffCpxInfoSfTermsDialogFragment, lVar, vVar2, i12);
                    return;
                }
                return;
            }
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarF = C20588k2.f(C20588k2.d(vVar2, 1.0f), 234);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarF);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v vVarF2 = C20588k2.f(C20588k2.d(vVar2, 1.0f), 194);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            C20632w.a(com.akita.compose.component.gradient.linear.b.a(vVarF2, com.akita.compose.theme.re23.b.i(bE2).getF66222g0(), bE2, 6), bE2, 0);
            float f12 = 212;
            androidx.compose.ui.graphics.painter.e eVarC = com.avito.android.mnz_common.compose.i.c(bE2);
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39077c;
            InterfaceC22374n.f40491a.getClass();
            com.avito.android.mnz_common.compose.i.b(lVar, f12, f12, "SF_TERMS_DIALOG_IMAGE_WITH_GRADIENT_TEST_TAG", R1.m(c20644z.d(vVar2, InterfaceC22215f.a.f39080f), 0.0f, 24, 0.0f, 0.0f, 13), eVarC, iVar, InterfaceC22374n.a.f40496e, bE2, 113508792 | (i14 & 14) | ((i14 << 6) & 7168), 64);
            bE2.X(true);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new com.avito.android.tariff.cpx.info.sf.terms.g(tariffCpxInfoSfTermsDialogFragment, lVar, vVar2, i12);
        }
    }

    public static final void i5(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, BB0.c cVar, InterfaceC43160i interfaceC43160i, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(-1922363017);
        v.a aVar = v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        bE2.C(487935004);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        C22187u0.d(new com.avito.android.tariff.cpx.info.sf.terms.h(interfaceC43160i, tariffCpxInfoSfTermsDialogFragment, interfaceC22204y1, null), bE2, G0.f406611a);
        com.akita.compose.component.scaffold.g.a(C20588k2.d(aVar, 1.0f), null, androidx.compose.runtime.internal.r.c(-804087300, new k(cVar, interfaceC22204y1, tariffCpxInfoSfTermsDialogFragment, interfaceC22204y1M), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(175338692, new l(tariffCpxInfoSfTermsDialogFragment, cVar), bE2), bE2, 12583296, 122);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(tariffCpxInfoSfTermsDialogFragment, cVar, interfaceC43160i, lVar, aVar, i12);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpx.info.sf.terms.di.a.a().a((WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), com.avito.android.analytics.screens.s.b(this), (TariffCpxInfoSfTermsContent) this.f296821m0.getValue(this, f296815o0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f296817i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f296817i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(245664000, new c(), true));
        dVar.G(composeView, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, true, 4);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296817i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}

package com.avito.android.motivation_screen.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.motivation_screen.models.UiProgressStep;
import com.avito.android.motivation_screen.ui.confetti.c;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.C48752a;
import v20.C49152c;

/* compiled from: MotivationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_motivation-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class F {

    /* compiled from: MotivationScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f206380l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C49152c f206381m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f206382n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar, C49152c c49152c, Y41.l<? super DeepLink, G0> lVar) {
            super(2);
            this.f206380l = (N) aVar;
            this.f206381m = c49152c;
            this.f206382n = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a), "MotivationScreenContent");
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                C22096n c22096nC = androidx.compose.runtime.internal.r.c(1580645157, new z(this.f206380l), a13);
                ?? r22 = this.f206382n;
                C49152c c49152c = this.f206381m;
                com.akita.compose.component.scaffold.g.a(fillElement, c22096nC, androidx.compose.runtime.internal.r.c(579589286, new C(c49152c, r22), a13), null, null, null, null, androidx.compose.runtime.internal.r.c(-192592530, new E(c49152c, r22), a13), a13, 12583350, 120);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Context, FrameLayout> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C49152c f206383l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C49152c c49152c) {
            super(1);
            this.f206383l = c49152c;
        }

        @Override // Y41.l
        public final FrameLayout invoke(Context context) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            com.avito.android.motivation_screen.ui.confetti.c cVar = new com.avito.android.motivation_screen.ui.confetti.c(frameLayout);
            c.a aVar = new c.a();
            if (this.f206383l.f440417n) {
                frameLayout.addOnLayoutChangeListener(new G(cVar, aVar));
            }
            return frameLayout;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/FrameLayout;", "it", "Lkotlin/G0;", "invoke", "(Landroid/widget/FrameLayout;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<FrameLayout, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f206384l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(FrameLayout frameLayout) {
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C49152c f206385l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f206386m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f206387n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f206388o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C49152c c49152c, Y41.l<? super DeepLink, G0> lVar, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f206385l = c49152c;
            this.f206386m = (N) lVar;
            this.f206387n = (N) aVar;
            this.f206388o = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f206388o | 1);
            ?? r02 = this.f206386m;
            ?? r12 = this.f206387n;
            F.a(this.f206385l, r02, r12, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UiProgressStep f206389l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f206390m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UiProgressStep uiProgressStep, boolean z12, int i12) {
            super(2);
            this.f206389l = uiProgressStep;
            this.f206390m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            F.b(this.f206389l, this.f206390m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<UiProgressStep> f206391l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<UiProgressStep> list, int i12) {
            super(2);
            this.f206391l = list;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            F.c(this.f206391l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206392a;

        static {
            int[] iArr = new int[UiProgressStep.UiProgressStepState.values().length];
            try {
                UiProgressStep.UiProgressStepState uiProgressStepState = UiProgressStep.UiProgressStepState.f206339b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UiProgressStep.UiProgressStepState uiProgressStepState2 = UiProgressStep.UiProgressStepState.f206339b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UiProgressStep.UiProgressStepState uiProgressStepState3 = UiProgressStep.UiProgressStepState.f206339b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UiProgressStep.UiProgressStepState uiProgressStepState4 = UiProgressStep.UiProgressStepState.f206339b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f206392a = iArr;
        }
    }

    @InterfaceC22132o
    @SuppressLint({"ComposeAndroidView"})
    @InterfaceC22181t
    public static final void a(@Y61.k C49152c c49152c, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(111496592);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1622229227, new a(aVar, c49152c, lVar), bE2), bE2, 48, 1);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        androidx.compose.ui.viewinterop.d.b(new b(c49152c), fillElement, c.f206384l, bE2, 432, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(c49152c, lVar, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k UiProgressStep uiProgressStep, boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        com.akita.compose.foundation.p pVar;
        long jC2;
        Integer numValueOf;
        boolean z13;
        UiProgressStep.UiProgressStepState uiProgressStepState;
        long jA2;
        boolean z14;
        UiProgressStep uiProgressStep2;
        androidx.compose.runtime.B bE2 = a12.E(-1289482859);
        if ((((bE2.B(uiProgressStep) ? 4 : 2) | i12 | (bE2.j(z12) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
            uiProgressStep2 = uiProgressStep;
            z14 = z12;
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            float f12 = z12 ? 1 : 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 0.0f, 0.0f, f12, 7);
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
            R3.b(pVar2, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
            R3.b(pVar3, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar4);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar5 = InterfaceC22413h.a.f40793d;
            R3.b(pVar5, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            UiProgressStep.UiProgressStepState uiProgressStepState2 = uiProgressStep.f206338b;
            int iOrdinal = uiProgressStepState2.ordinal();
            if (iOrdinal == 0) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63938l;
            } else if (iOrdinal == 1) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63973w1;
            } else if (iOrdinal == 2) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63945n0;
            }
            boolean z15 = uiProgressStepState2 == UiProgressStep.UiProgressStepState.f206342e;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(M1.b(C20588k2.o(aVar, z15 ? 30 : 26), z15 ? -2 : 0, z12 ? 0 : -1), pVar.c(bE2), androidx.compose.foundation.shape.o.f30153a);
            float f13 = 1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            if (pVar.equals(aVar4.f63851H1)) {
                bE2.C(-341284002);
                jC2 = aVar4.f63934j1.c(bE2);
                bE2.X(false);
            } else {
                bE2.C(1513014146);
                jC2 = pVar.c(bE2);
                bE2.X(false);
            }
            androidx.compose.ui.v vVarA = C20529i0.a(vVarB, f13, jC2, androidx.compose.foundation.shape.o.a(16));
            I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28664f, InterfaceC22215f.a.f39089o, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar2, bE2, iA2);
            R3.b(pVar3, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar4);
            }
            R3.b(pVar5, bE2, vVarC2);
            K k12 = K.f28344a;
            int iOrdinal2 = uiProgressStepState2.ordinal();
            if (iOrdinal2 == 0) {
                com.akita.compose.theme.re23.b.f63985c.getClass();
                numValueOf = Integer.valueOf(com.akita.compose.theme.re23.e.f64736r3);
            } else if (iOrdinal2 != 1) {
                numValueOf = iOrdinal2 != 3 ? null : Integer.valueOf(R.drawable.gig_motivation_screen_winner_cup);
            } else {
                com.akita.compose.theme.re23.b.f63985c.getClass();
                numValueOf = Integer.valueOf(com.akita.compose.theme.re23.e.f64501d9);
            }
            bE2.C(-762267210);
            if (numValueOf == null) {
                uiProgressStepState = uiProgressStepState2;
                z13 = false;
            } else {
                int iIntValue = numValueOf.intValue();
                int iOrdinal3 = uiProgressStepState2.ordinal();
                com.akita.compose.foundation.p pVar6 = (iOrdinal3 == 0 || iOrdinal3 != 1) ? aVar4.f63851H1 : aVar4.f63894W;
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(iIntValue, 0, bE2);
                z13 = false;
                uiProgressStepState = uiProgressStepState2;
                com.akita.compose.foundation.ui.e.a(eVarA, null, R1.m(aVar, 0.0f, z15 ? 2 : 0, 0.0f, 0.0f, 13), pVar6, bE2, 56, 0);
                G0 g02 = G0.f406611a;
            }
            bE2.X(z13);
            bE2.X(true);
            C20608p2.a(bE2, C20588k2.t(aVar, 8));
            if (g.f206392a[uiProgressStepState.ordinal()] == 1) {
                bE2.C(1513057985);
                jA2 = C48752a.a(bE2, R.color.common_gray_54);
                bE2.X(z13);
            } else {
                bE2.C(1513060063);
                jA2 = C48752a.a(bE2, R.color.common_black);
                bE2.X(z13);
            }
            long j12 = jA2;
            z14 = z12;
            uiProgressStep2 = uiProgressStep;
            com.akita.compose.foundation.ui.p.b(uiProgressStep2.f206337a, com.akita.compose.theme.re23.b.f63988f.f65241l, M1.c(0.0f, z14 ? -2 : -4, 1, aVar), false, j12, null, 0, 0, false, null, bE2, 0, 1000);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(uiProgressStep2, z14, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k List<UiProgressStep> list, @Y61.l androidx.compose.runtime.A a12, int i12) {
        long jC2;
        androidx.compose.runtime.B bE2 = a12.E(-334562037);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarI = R1.i(androidx.compose.ui.v.f42878y1, 16);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(-74389772);
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z12 = true;
            if (!it.hasNext()) {
                C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
                if (c22039c2N != null) {
                    c22039c2N.f38184d = new f(list, i12);
                    return;
                }
                return;
            }
            UiProgressStep uiProgressStep = (UiProgressStep) it.next();
            bE2.C(-74388398);
            if (!L.f(uiProgressStep, C42745f0.E(list))) {
                int iOrdinal = uiProgressStep.f206338b.ordinal();
                if (iOrdinal == 0) {
                    bE2.C(-892557658);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
                    bE2.X(false);
                    C20632w.a(androidx.compose.foundation.A.b(M1.b(C20588k2.f(C20588k2.t(androidx.compose.ui.v.f42878y1, 6), 26), 10, -1), jC2, Y0.f39346a), bE2, 0);
                    z12 = false;
                } else {
                    if (iOrdinal == 1) {
                        bE2.C(-892562902);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        jC2 = com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2);
                        bE2.X(false);
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw com.avito.android.bxcontent.mvi.entity.f.q(-892911361, bE2, false);
                        }
                        bE2.C(-892557658);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
                        bE2.X(false);
                    } else {
                        bE2.C(-892554614);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        jC2 = com.akita.compose.theme.re23.b.f63984b.f63919e1.c(bE2);
                        bE2.X(false);
                    }
                    C20632w.a(androidx.compose.foundation.A.b(M1.b(C20588k2.f(C20588k2.t(androidx.compose.ui.v.f42878y1, 6), 26), 10, -1), jC2, Y0.f39346a), bE2, 0);
                    z12 = false;
                }
            }
            bE2.X(false);
            b(uiProgressStep, z12, bE2, 0);
        }
    }
}

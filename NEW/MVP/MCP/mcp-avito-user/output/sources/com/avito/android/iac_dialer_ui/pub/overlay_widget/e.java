package com.avito.android.iac_dialer_ui.pub.overlay_widget;

import Y41.l;
import Y41.p;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.k;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.component.button.t;
import com.avito.android.R;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIOverlayWidget.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f167745l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacUIOverlayWidgetState f167746m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f167747n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f167748o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f167749p;

    /* compiled from: IacUIOverlayWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167750a;

        static {
            int[] iArr = new int[IacUIControlButtonsAudioDeviceState.values().length];
            try {
                iArr[IacUIControlButtonsAudioDeviceState.EarpieceOrWireHeadset.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacUIControlButtonsAudioDeviceState.Speaker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IacUIControlButtonsAudioDeviceState.Bluetooth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f167750a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, IacUIOverlayWidgetState iacUIOverlayWidgetState, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<Long> aVar3) {
        super(2);
        this.f167745l = vVar;
        this.f167746m = iacUIOverlayWidgetState;
        this.f167747n = aVar;
        this.f167748o = aVar2;
        this.f167749p = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [Y41.a, java.lang.Object] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        v.a aVar;
        p<InterfaceC22413h, v, G0> pVar;
        p<InterfaceC22413h, Integer, G0> pVar2;
        p<InterfaceC22413h, U, G0> pVar3;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        Y41.a<InterfaceC22413h> aVar2;
        InterfaceC22204y1 interfaceC22204y1;
        C20576h2 c20576h2;
        i.b bVar;
        A a13;
        C20585k.C1589k c1589k;
        float f12;
        IacUIOverlayWidgetState iacUIOverlayWidgetState;
        v.a aVar3;
        int i12;
        Y41.a<InterfaceC22413h> aVar4;
        p<InterfaceC22413h, Integer, G0> pVar5;
        p<InterfaceC22413h, v, G0> pVar6;
        p<InterfaceC22413h, U, G0> pVar7;
        float f13;
        p<InterfaceC22413h, v, G0> pVar8;
        Y41.a<InterfaceC22413h> aVar5;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar9;
        C20576h2 c20576h22;
        p<InterfaceC22413h, Integer, G0> pVar10;
        float f14;
        v.a aVar6;
        e eVar;
        v.a aVar7;
        v vVar;
        int i13;
        t tVarQ0;
        A a14 = a12;
        if ((num.intValue() & 11) == 2 && a14.c()) {
            a14.f();
        } else {
            v vVarD = C20588k2.d(this.f167745l, 1.0f);
            float f15 = 12;
            h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(f15, 0.0f, 2, vVarD);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            v vVarB = androidx.compose.foundation.A.b(vVarK, X2.b.f18125d.c(a14), o.a(36));
            InterfaceC22215f.f39074a.getClass();
            i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int f37888q = a14.getF37888Q();
            O1 o1Y = a14.y();
            v vVarC = n.c(a14, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar9 = InterfaceC22413h.a.f40791b;
            if (a14.F() == null) {
                C22190v.b();
                throw null;
            }
            a14.A();
            if (a14.getF37887P()) {
                a14.b(aVar9);
            } else {
                a14.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar11 = InterfaceC22413h.a.f40796g;
            R3.b(pVar11, a14, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar12 = InterfaceC22413h.a.f40795f;
            R3.b(pVar12, a14, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar13 = InterfaceC22413h.a.f40799j;
            if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a14, f37888q, pVar13);
            }
            p<InterfaceC22413h, v, G0> pVar14 = InterfaceC22413h.a.f40793d;
            R3.b(pVar14, a14, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar10 = v.f42878y1;
            v vVarJ = R1.j(C20588k2.d(aVar10, 1.0f), f15, 10);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k2 = C20585k.f28660b;
            i.b bVar2 = InterfaceC22215f.a.f39085k;
            C20568f2 c20568f2A = C20563e2.a(c1589k2, bVar2, a14, 0);
            int f37888q2 = a14.getF37888Q();
            O1 o1Y2 = a14.y();
            v vVarC2 = n.c(a14, vVarJ);
            if (a14.F() == null) {
                C22190v.b();
                throw null;
            }
            a14.A();
            if (a14.getF37887P()) {
                a14.b(aVar9);
            } else {
                a14.d();
            }
            R3.b(pVar11, a14, c20568f2A);
            R3.b(pVar12, a14, o1Y2);
            if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q2))) {
                r.B(f37888q2, a14, f37888q2, pVar13);
            }
            R3.b(pVar14, a14, vVarC2);
            C20576h2 c20576h23 = C20576h2.f28641a;
            a14.C(-402516499);
            Object objT = a14.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.FALSE);
                a14.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT;
            a14.h();
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int f37888q3 = a14.getF37888Q();
            O1 o1Y3 = a14.y();
            v vVarC3 = n.c(a14, aVar10);
            if (a14.F() == null) {
                C22190v.b();
                throw null;
            }
            a14.A();
            if (a14.getF37887P()) {
                a14.b(aVar9);
            } else {
                a14.d();
            }
            R3.b(pVar11, a14, interfaceC22365i0D2);
            R3.b(pVar12, a14, o1Y3);
            if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q3))) {
                r.B(f37888q3, a14, f37888q3, pVar13);
            }
            R3.b(pVar14, a14, vVarC3);
            a14.C(409249219);
            IacUIOverlayWidgetState iacUIOverlayWidgetState2 = this.f167746m;
            if (iacUIOverlayWidgetState2.getPeerAvatar() != null) {
                float f16 = 48;
                int iB2 = kotlin.math.b.b(((androidx.compose.ui.unit.d) a14.o(Q0.f41199h)).M0(f16));
                v vVarA = C22501m2.a(k.a(C20588k2.o(aVar10, f16), o.a(24)), "IacUITestTags.VideoModePeerInfo.PEER_AVATAR");
                String strFind = iacUIOverlayWidgetState2.getPeerAvatar().getValue().find(iB2, iB2);
                InterfaceC22374n.f40491a.getClass();
                InterfaceC22374n.a.C1667a c1667a = InterfaceC22374n.a.f40493b;
                a14.C(409270778);
                Object objT2 = a14.t();
                if (objT2 == c1651a) {
                    objT2 = new d(interfaceC22204y12);
                    a14.H(objT2);
                }
                a14.h();
                c1589k = c1589k2;
                aVar = aVar10;
                pVar = pVar14;
                pVar2 = pVar13;
                pVar3 = pVar12;
                pVar4 = pVar11;
                aVar2 = aVar9;
                interfaceC22204y1 = interfaceC22204y12;
                iacUIOverlayWidgetState = iacUIOverlayWidgetState2;
                f12 = f15;
                c20576h2 = c20576h23;
                bVar = bVar2;
                a13 = a14;
                coil.compose.v.a(strFind, null, vVarA, null, null, null, null, (l) objT2, null, null, c1667a, null, a14, 12586032, 6, 64368);
            } else {
                aVar = aVar10;
                pVar = pVar14;
                pVar2 = pVar13;
                pVar3 = pVar12;
                pVar4 = pVar11;
                aVar2 = aVar9;
                interfaceC22204y1 = interfaceC22204y12;
                c20576h2 = c20576h23;
                bVar = bVar2;
                a13 = a14;
                c1589k = c1589k2;
                f12 = f15;
                iacUIOverlayWidgetState = iacUIOverlayWidgetState2;
            }
            a13.h();
            A a15 = a13;
            a15.C(409274223);
            if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
                aVar3 = aVar;
                i12 = 0;
            } else {
                aVar3 = aVar;
                i12 = 0;
                C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(C20588k2.o(aVar3, 48), o.a(24), com.akita.compose.theme.re23.b.p(a15).getF66675a(), false, a15, 6, 4), "IacUITestTags.VideoModePeerInfo.PEER_AVATAR_SKELETON"), a15, 0);
            }
            a15.h();
            a15.z();
            float f17 = f12;
            com.akita.compose.foundation.ui.g.b(f17, null, a15, 6, 2);
            C20576h2 c20576h24 = c20576h2;
            v vVarA2 = c20576h24.a(aVar3, 1.0f, true);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a15, i12);
            int f37888q4 = a15.getF37888Q();
            O1 o1Y4 = a15.y();
            v vVarC4 = n.c(a15, vVarA2);
            if (a15.F() == null) {
                C22190v.b();
                throw null;
            }
            a15.A();
            if (a15.getF37887P()) {
                aVar4 = aVar2;
                a15.b(aVar4);
            } else {
                aVar4 = aVar2;
                a15.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar15 = pVar4;
            R3.b(pVar15, a15, iA2);
            p<InterfaceC22413h, U, G0> pVar16 = pVar3;
            R3.b(pVar16, a15, o1Y4);
            if (a15.getF37887P() || !L.f(a15.t(), Integer.valueOf(f37888q4))) {
                pVar5 = pVar2;
                r.B(f37888q4, a15, f37888q4, pVar5);
                pVar6 = pVar;
            } else {
                pVar6 = pVar;
                pVar5 = pVar2;
            }
            R3.b(pVar6, a15, vVarC4);
            K k12 = K.f28344a;
            float f18 = 2;
            com.akita.compose.foundation.ui.g.a(f18, null, a15, 6);
            if (iacUIOverlayWidgetState.getPeerName() != null) {
                a15.C(-196684222);
                v vVarA3 = C22501m2.a(aVar3, "IacUITestTags.VideoModePeerInfo.PEER_NAME");
                String strUnwrap = iacUIOverlayWidgetState.getPeerName().unwrap();
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i14 = androidx.compose.ui.text.style.i.f42678e;
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65236g;
                s.f42720b.getClass();
                pVar7 = pVar16;
                pVar8 = pVar6;
                aVar5 = aVar4;
                pVar9 = pVar15;
                c20576h22 = c20576h24;
                pVar10 = pVar5;
                f13 = f18;
                f14 = f17;
                aVar6 = aVar3;
                com.akita.compose.foundation.ui.p.b(strUnwrap, rVar, vVarA3, false, 0L, androidx.compose.ui.text.style.i.a(i14), 1, s.f42722d, false, null, a15, 14156160, 792);
                a15.h();
            } else {
                pVar7 = pVar16;
                f13 = f18;
                pVar8 = pVar6;
                aVar5 = aVar4;
                pVar9 = pVar15;
                c20576h22 = c20576h24;
                pVar10 = pVar5;
                f14 = f17;
                aVar6 = aVar3;
                a15.C(-196208186);
                com.akita.compose.component.skeleton.b.a("123456789 123456789", com.akita.compose.theme.re23.b.f63988f.f65236g, C22501m2.a(aVar6, "IacUITestTags.VideoModePeerInfo.PEER_NAME_SKELETON"), com.akita.compose.theme.re23.b.p(a15).getF66675a(), a15, 390, 0);
                a15.h();
            }
            com.akita.compose.foundation.ui.g.a(f13, null, a15, 6);
            a15.C(409328684);
            if (iacUIOverlayWidgetState.getStatusText() != null) {
                C20568f2 c20568f2A2 = C20563e2.a(c1589k, bVar, a15, 0);
                int f37888q5 = a15.getF37888Q();
                O1 o1Y5 = a15.y();
                v vVarC5 = n.c(a15, aVar6);
                if (a15.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a15.A();
                if (a15.getF37887P()) {
                    a15.b(aVar5);
                } else {
                    a15.d();
                }
                R3.b(pVar9, a15, c20568f2A2);
                R3.b(pVar7, a15, o1Y5);
                if (a15.getF37887P() || !L.f(a15.t(), Integer.valueOf(f37888q5))) {
                    r.B(f37888q5, a15, f37888q5, pVar10);
                }
                R3.b(pVar8, a15, vVarC5);
                v vVarA4 = C22501m2.a(aVar6, "IacUITestTags.VideoModePeerInfo.STATUS");
                String statusText = iacUIOverlayWidgetState.getStatusText();
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i15 = androidx.compose.ui.text.style.i.f42680g;
                com.akita.compose.foundation.r rVar2 = com.akita.compose.theme.re23.b.f63988f.f65241l;
                s.f42720b.getClass();
                v.a aVar11 = aVar6;
                vVar = null;
                com.akita.compose.foundation.ui.p.b(statusText, rVar2, vVarA4, false, 0L, androidx.compose.ui.text.style.i.a(i15), 1, s.f42722d, false, null, a15, 14156160, 792);
                Long callTimeActivatedAt = iacUIOverlayWidgetState.getCallTimeActivatedAt();
                Long callTimeFinishedAt = iacUIOverlayWidgetState.getCallTimeFinishedAt();
                com.avito.android.iac_dialer_ui.pub.overlay_widget.a.f167737a.getClass();
                eVar = this;
                aVar7 = aVar11;
                com.avito.android.iac_dialer_ui.pub.util.f.a(callTimeActivatedAt, callTimeFinishedAt, eVar.f167749p, null, com.avito.android.iac_dialer_ui.pub.overlay_widget.a.f167738b, a15, 24576);
                a15.z();
            } else {
                eVar = this;
                aVar7 = aVar6;
                vVar = null;
            }
            a15.h();
            a15.z();
            com.akita.compose.foundation.ui.g.b(f14, vVar, a15, 6, 2);
            i.b bVar3 = InterfaceC22215f.a.f39086l;
            C20576h2 c20576h25 = c20576h22;
            v vVarC6 = c20576h25.c(aVar7, bVar3);
            IacUIControlButtonsAudioDeviceState audioDevice = iacUIOverlayWidgetState.getAudioDevice();
            int[] iArr = a.f167750a;
            int i16 = iArr[audioDevice.ordinal()];
            if (i16 == 1 || i16 == 2) {
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i13 = com.akita.compose.theme.re23.e.f64524ef;
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = R.drawable.iac_dialer_ui_public_icon_bluetooth_24;
            }
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(i13, 0, a15);
            int i17 = iArr[iacUIOverlayWidgetState.getAudioDevice().ordinal()];
            if (i17 == 1) {
                a15.C(-402363879);
                tVarQ0 = com.akita.compose.theme.re23.b.c(a15).q0();
                a15.h();
            } else if (i17 == 2) {
                a15.C(-402360105);
                tVarQ0 = com.akita.compose.theme.re23.b.c(a15).p1();
                a15.h();
            } else {
                if (i17 != 3) {
                    a15.C(-402631387);
                    a15.h();
                    throw new NoWhenBranchMatchedException();
                }
                a15.C(-402356329);
                tVarQ0 = com.akita.compose.theme.re23.b.c(a15).p1();
                a15.h();
            }
            m.f(eVarA, eVar.f167747n, tVarQ0, vVarC6, 0.0f, false, false, null, a15, 520, 240);
            com.akita.compose.foundation.ui.g.b(8, vVar, a15, 6, 2);
            v vVarC7 = c20576h25.c(aVar7, bVar3);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            m.f(u0.e.a(com.akita.compose.theme.re23.e.f64472bg, 0, a15), this.f167748o, com.akita.compose.theme.re23.b.c(a15).q0(), vVarC7, 0.0f, false, false, null, a15, 520, 240);
            a15.z();
            a15.z();
        }
        return G0.f406611a;
    }
}

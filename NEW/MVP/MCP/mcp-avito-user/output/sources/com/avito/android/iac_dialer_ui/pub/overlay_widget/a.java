package com.avito.android.iac_dialer_ui.pub.overlay_widget;

import Y41.r;
import Y61.k;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIOverlayWidget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f167737a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f167738b = new C22096n(416283585, C4966a.f167740l, false);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C22096n f167739c = new C22096n(1917377551, b.f167741l, false);

    /* compiled from: IacUIOverlayWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "timeStr", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_ui.pub.overlay_widget.a$a, reason: collision with other inner class name */
    public static final class C4966a extends N implements r<String, v, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4966a f167740l = new C4966a();

        public C4966a() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(String str, v vVar, A a12, Integer num) {
            int i12;
            String str2 = str;
            v vVar2 = vVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(str2) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i12 |= a13.B(vVar2) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && a13.c()) {
                a13.f();
            } else {
                v vVarA = C22501m2.a(vVar2, "IacUITestTags.VideoModePeerInfo.TIMER");
                String strConcat = " · ".concat(str2);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                s.f42720b.getClass();
                p.b(strConcat, rVar, vVarA, false, 0L, null, 1, s.f42722d, false, null, a13, 14155776, 824);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIOverlayWidget.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f167741l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63987e.getClass();
                com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
                v vVarB = androidx.compose.foundation.A.b(fillElement, X2.b.f18125d.c(a13), Y0.f39346a);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarB);
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
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(100, null, a13, 6);
                h.a(h.f167758a, com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, com.avito.android.iac_dialer_ui.pub.overlay_widget.b.f167742l, c.f167743l, null, a13, 3510);
                a13.z();
            }
            return G0.f406611a;
        }
    }
}

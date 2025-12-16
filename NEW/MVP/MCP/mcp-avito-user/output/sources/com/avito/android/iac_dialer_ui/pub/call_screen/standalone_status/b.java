package com.avito.android.iac_dialer_ui.pub.call_screen.standalone_status;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.e;
import com.akita.compose.foundation.ui.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIStandaloneStatus.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    @SuppressLint({"HardcodeStringDetector"})
    public static final IacUIStandaloneStatusState f167333a = new IacUIStandaloneStatusState("Собеседник на связи", true);

    /* compiled from: IacUIStandaloneStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUIStandaloneStatusState f167334l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f167335m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f167336n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f167337o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacUIStandaloneStatusState iacUIStandaloneStatusState, v vVar, int i12, int i13) {
            super(2);
            this.f167334l = iacUIStandaloneStatusState;
            this.f167335m = vVar;
            this.f167336n = i12;
            this.f167337o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167336n | 1);
            v vVar = this.f167335m;
            int i12 = this.f167337o;
            b.a(this.f167334l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l IacUIStandaloneStatusState iacUIStandaloneStatusState, @l v vVar, @l A a12, int i12, int i13) {
        int i14;
        v vVar2;
        int i15;
        v vVar3;
        boolean z12;
        B bE2 = a12.E(262199099);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(iacUIStandaloneStatusState) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i16 = i13 & 2;
        if (i16 != 0) {
            i15 = i14 | 48;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i15 = i14 | (bE2.B(vVar2) ? 32 : 16);
        }
        if ((i15 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v vVar4 = i16 != 0 ? v.f42878y1 : vVar2;
            h.a aVar = h.f42849c;
            v vVarA = C22501m2.a(C20588k2.d(C20588k2.f(vVar4, 22), 1.0f), "IacUITestTags.StandaloneStatus.ROOT");
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(641272564);
            if (iacUIStandaloneStatusState == null) {
                bE2.X(false);
                vVar3 = vVar4;
            } else {
                v.a aVar3 = v.f42878y1;
                v vVarA2 = C22501m2.a(aVar3, "IacUITestTags.StandaloneStatus.TEXT");
                String text = iacUIStandaloneStatusState.getText();
                s.f42720b.getClass();
                int i18 = s.f42722d;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i19 = androidx.compose.ui.text.style.i.f42680g;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                vVar3 = vVar4;
                com.akita.compose.foundation.ui.p.b(text, com.akita.compose.theme.re23.b.f63988f.f65240k, vVarA2, false, 0L, androidx.compose.ui.text.style.i.a(i19), 1, i18, false, null, bE2, 14156160, 792);
                bE2.C(-672039785);
                if (iacUIStandaloneStatusState.getShowIcon()) {
                    g.b(8, null, bE2, 6, 2);
                    v vVarA3 = C22501m2.a(aVar3, "IacUITestTags.StandaloneStatus.ICON");
                    com.akita.compose.theme.re23.b.f63985c.getClass();
                    z12 = false;
                    e.a(u0.e.a(com.akita.compose.theme.re23.e.f64871z3, 0, bE2), null, vVarA3, com.akita.compose.theme.re23.b.f63984b.f63966u0, bE2, 440, 0);
                } else {
                    z12 = false;
                }
                bE2.X(z12);
                bE2.X(z12);
            }
            bE2.X(true);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(iacUIStandaloneStatusState, vVar2, i12, i13);
        }
    }
}

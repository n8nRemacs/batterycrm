package com.avito.android.iac_dialer_ui.pub.common_ui;

import android.annotation.SuppressLint;
import androidx.compose.foundation.C20806p1;
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
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUICallHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public static final IacUICallHeaderState f167509a = new IacUICallHeaderState("Звонок через приложение");

    /* compiled from: IacUICallHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUICallHeaderState f167510l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f167511m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f167512n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f167513o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacUICallHeaderState iacUICallHeaderState, v vVar, int i12, int i13) {
            super(2);
            this.f167510l = iacUICallHeaderState;
            this.f167511m = vVar;
            this.f167512n = i12;
            this.f167513o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167512n | 1);
            v vVar = this.f167511m;
            int i12 = this.f167513o;
            n.a(this.f167510l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUICallHeaderState iacUICallHeaderState, @Y61.l v vVar, @Y61.l A a12, int i12, int i13) {
        int i14;
        v vVar2;
        int i15;
        B bE2 = a12.E(-365258212);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(iacUICallHeaderState) ? 4 : 2) | i12;
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
            v vVar3 = i16 != 0 ? v.f42878y1 : vVar2;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarA = C22501m2.a(C20588k2.d(C20588k2.f(vVar3, 52), 1.0f), "IacUICallHeaderTestTags.ROOT");
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28664f, bVar, bE2, 54);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar3 = v.f42878y1;
            float f12 = 24;
            v vVarF = C20588k2.f(C20588k2.t(aVar3, f12), f12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64572h9, 0, bE2), null, vVarF, null, null, 0.0f, null, bE2, 440, 120);
            com.akita.compose.foundation.ui.g.b(4, null, bE2, 6, 2);
            v vVarA2 = C22501m2.a(aVar3, "IacUICallHeaderTestTags.TEXT");
            String text = iacUICallHeaderState.getText();
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(text, com.akita.compose.theme.re23.b.f63988f.f65240k, vVarA2, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            bE2.X(true);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(iacUICallHeaderState, vVar2, i12, i13);
        }
    }
}

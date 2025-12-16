package com.avito.android.motivation_screen.ui;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MotivationErrorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f206437l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f206438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2) {
        super(3);
        this.f206437l = str;
        this.f206438m = str2;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28664f, aVar2, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
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
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            C20806p1.a(u0.e.a(R.drawable.placeholders_img_general_error, 0, a13), null, C20588k2.f(C20588k2.t(aVar, 211), 140), null, null, 0.0f, null, a13, 440, 120);
            float f12 = 24;
            androidx.compose.ui.v vVarM = R1.m(aVar, f12, 20, f12, 0.0f, 8);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65232c;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i12 = androidx.compose.ui.text.style.i.f42678e;
            com.akita.compose.foundation.ui.p.b(this.f206437l, rVar, vVarM, false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 984);
            com.akita.compose.foundation.ui.p.b(this.f206438m, iVar.f65241l, R1.m(aVar, f12, 12, f12, 0.0f, 8), false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 984);
            a13.z();
        }
        return G0.f406611a;
    }
}

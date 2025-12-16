package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import Y41.r;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class i extends N implements r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f261190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f261191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I3 f261192n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ArrayList arrayList, float f12, I3 i32) {
        super(4);
        this.f261190l = arrayList;
        this.f261191m = f12;
        this.f261192n = i32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        Q q12;
        float f12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            String str = (String) this.f261190l.get(iIntValue);
            a13.C(1956298907);
            int iIntValue3 = iIntValue - ((Number) this.f261192n.getF42167b()).intValue();
            int iAbs = Math.abs(iIntValue3);
            if (iAbs == 0) {
                a13.C(-213985420);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                q12 = new Q(com.akita.compose.theme.re23.b.f63988f.f65235f, T.a(com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13)));
                a13.h();
            } else if (iAbs == 1) {
                a13.C(-213983116);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                q12 = new Q(com.akita.compose.theme.re23.b.f63988f.f65240k, T.a(com.akita.compose.theme.re23.b.f63984b.f63924g0.c(a13)));
                a13.h();
            } else if (iAbs != 2) {
                a13.C(-213978411);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                q12 = new Q(com.akita.compose.theme.re23.b.f63988f.f65246q, T.a(com.akita.compose.theme.re23.b.f63984b.f63897X.c(a13)));
                a13.h();
            } else {
                a13.C(-213980812);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                q12 = new Q(com.akita.compose.theme.re23.b.f63988f.f65244o, T.a(com.akita.compose.theme.re23.b.f63984b.f63903Z.c(a13)));
                a13.h();
            }
            com.akita.compose.foundation.r rVar = (com.akita.compose.foundation.r) q12.f406619b;
            long j12 = ((T) q12.f406620c).f39331a;
            v vVarA = v.f42878y1;
            v vVarD = C20588k2.d(vVarA, 1.0f);
            if (iIntValue3 == 0) {
                f12 = this.f261191m;
            } else {
                androidx.compose.ui.unit.h.f42849c.getClass();
                f12 = androidx.compose.ui.unit.h.f42851e;
            }
            v vVarF = C20588k2.f(vVarD, f12);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarF);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            if (iIntValue3 == 0) {
                vVarA = C22501m2.a(vVarA, "WheelPickerCenterText");
            }
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarA, false, j12, null, 0, 0, false, null, a13, 0, 1000);
            a13.z();
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}

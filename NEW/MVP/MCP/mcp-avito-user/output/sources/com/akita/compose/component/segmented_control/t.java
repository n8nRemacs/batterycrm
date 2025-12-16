package com.akita.compose.component.segmented_control;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControlScope.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/akita/compose/component/segmented_control/z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "parentEnabled", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/segmented_control/z;ZZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class t extends N implements Y41.s<z, Boolean, Boolean, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f62592l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62593m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62594n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62595o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z12, Y41.a aVar, Y41.a aVar2, C22096n c22096n) {
        super(5);
        this.f62592l = z12;
        this.f62593m = aVar;
        this.f62594n = aVar2;
        this.f62595o = c22096n;
    }

    @Override // Y41.s
    public final G0 invoke(z zVar, Boolean bool, Boolean bool2, A a12, Integer num) {
        int i12;
        z zVar2 = zVar;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i12 = (a13.B(zVar2) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i12 |= a13.j(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 896) == 0) {
            i12 |= a13.j(zBooleanValue2) ? 256 : 128;
        }
        if ((i12 & 5851) == 1170 && a13.c()) {
            a13.f();
        } else {
            boolean z12 = this.f62592l && zBooleanValue;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarH = R1.h(aVar, zVar2.f62609b.f62620f);
            a13.C(-578376337);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            a13.h();
            Boolean boolValueOf = Boolean.valueOf(z12);
            v vVar = new v(this.f62593m, this.f62594n, z12);
            C22340s c22340s = Z.f40198a;
            androidx.compose.ui.v vVarD0 = vVarH.d0(new SuspendPointerInputElement(boolValueOf, mVar, null, vVar, 4, null)).d0(androidx.compose.ui.semantics.r.b(aVar, false, new u(z12, zBooleanValue2)));
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28664f, bVar, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD0);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            this.f62595o.invoke(C20576h2.f28641a, zVar2, Boolean.valueOf(z12), a13, Integer.valueOf(((i12 << 3) & 112) | 6));
            a13.z();
        }
        return G0.f406611a;
    }
}

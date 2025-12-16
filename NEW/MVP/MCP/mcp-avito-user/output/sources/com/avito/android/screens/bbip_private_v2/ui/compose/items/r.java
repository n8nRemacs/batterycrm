package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2PresetCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Landroidx/compose/foundation/layout/T1;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.r<InterfaceC20640y, T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<T1> f261282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.g f261283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f261284n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.h> f261285o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC22204y1<T1> interfaceC22204y1, BbipPrivateV2State.g gVar, int i12, InterfaceC22204y1<androidx.compose.ui.unit.h> interfaceC22204y12) {
        super(4);
        this.f261282l = interfaceC22204y1;
        this.f261283m = gVar;
        this.f261284n = i12;
        this.f261285o = interfaceC22204y12;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20640y interfaceC20640y, T1 t12, androidx.compose.runtime.A a12, Integer num) {
        T1 t13 = t12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 112) == 0) {
            iIntValue |= a13.B(t13) ? 32 : 16;
        }
        if ((iIntValue & 721) == 144 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22204y1<T1> interfaceC22204y1 = this.f261282l;
            interfaceC22204y1.setValue(t13);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
            C20576h2 c20576h2 = C20576h2.f28641a;
            androidx.compose.ui.v vVarA = c20576h2.a(R1.h(aVar, R1.e(interfaceC22204y1.getF42167b().c(LayoutDirection.f42838b), interfaceC22204y1.getF42167b().getF28512b(), 0.0f, interfaceC22204y1.getF42167b().getF28514d(), 4)), 1.0f, true);
            i.b bVar = InterfaceC22215f.a.f39086l;
            androidx.compose.ui.v vVarC2 = c20576h2.c(vVarA, bVar);
            BbipPrivateV2State.g gVar = this.f261283m;
            int i12 = this.f261284n;
            u.d(gVar, i12, vVarC2, a13, 0);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.b(8, null, a13, 6, 2);
            u.e(gVar, i12, this.f261285o.getF42167b().f42852b, interfaceC22204y1.getF42167b(), c20576h2.c(aVar, bVar), a13, 0);
            a13.z();
        }
        return G0.f406611a;
    }
}

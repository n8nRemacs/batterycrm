package com.akita.compose.component.date_picker;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import com.avito.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.component.date_picker.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27334a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f61188l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61189m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f61190n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f61191o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61192p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27334a(F f12, Y41.a<G0> aVar, K k12, boolean z12, Y41.a<G0> aVar2) {
        super(2);
        this.f61188l = f12;
        this.f61189m = aVar;
        this.f61190n = k12;
        this.f61191o = z12;
        this.f61192p = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        boolean z12;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            F f12 = this.f61188l;
            androidx.compose.ui.v vVarH = R1.h(vVarD, f12.f61141o.f61577a);
            C20585k c20585k = C20585k.f28659a;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(6);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, a13, 6);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarH);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strC = u0.i.c(a13, R.string.chooseDatesButtonTitle);
            androidx.compose.ui.v vVarA = c20576h2.a(aVar, 1.0f, true);
            K k12 = this.f61190n;
            if (k12.f61176g) {
                z12 = true;
            } else {
                DatePickerSelectionType.c cVar = DatePickerSelectionType.c.f61211a;
                DatePickerSelectionType datePickerSelectionType = k12.f61173d;
                boolean z13 = false;
                if (kotlin.jvm.internal.L.f(datePickerSelectionType, cVar) ? true : kotlin.jvm.internal.L.f(datePickerSelectionType, DatePickerSelectionType.d.f61213a) ? true : kotlin.jvm.internal.L.f(datePickerSelectionType, DatePickerSelectionType.b.f61209a)) {
                    if (!k12.c().isEmpty()) {
                        z13 = true;
                        break;
                    }
                    z12 = z13;
                } else {
                    if (!(datePickerSelectionType instanceof DatePickerSelectionType.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<kotlin.ranges.o> listC = k12.c();
                    if (!(listC instanceof Collection) || !listC.isEmpty()) {
                        Iterator<T> it = listC.iterator();
                        while (it.hasNext()) {
                            if (!com.akita.compose.component.date_picker.utils.i.a((kotlin.ranges.o) it.next())) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    z12 = z13;
                }
            }
            com.akita.compose.component.button.m.c(strC, this.f61189m, f12.f61142p, vVarA, null, null, null, false, z12, null, a13, 512, 752);
            if (this.f61191o) {
                com.akita.compose.component.button.m.c(u0.i.c(a13, R.string.closeButtonTitle), this.f61192p, f12.f61143q, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), null, null, null, false, false, null, a13, 512, 1008);
            }
            a13.z();
        }
        return G0.f406611a;
    }
}

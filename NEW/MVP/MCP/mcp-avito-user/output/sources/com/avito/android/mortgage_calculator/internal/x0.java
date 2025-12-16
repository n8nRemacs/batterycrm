package com.avito.android.mortgage_calculator.internal;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorScreen.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x0 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f204821l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(String str) {
        super(3);
        this.f204821l = str;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i12 = androidx.compose.ui.text.style.i.f42681h;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.p.b(this.f204821l, rVar, C22501m2.a(R1.m(interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39081g), 0.0f, 0.0f, 16, 0.0f, 11), "fieldEndText"), false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 984);
        }
        return kotlin.G0.f406611a;
    }
}

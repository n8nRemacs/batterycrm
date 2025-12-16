package com.avito.android.mortgage_calculator;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.Q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f204039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(MortgageCalculatorView mortgageCalculatorView, int i12) {
        super(2);
        this.f204038l = mortgageCalculatorView;
        this.f204039m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            MortgageCalculatorView mortgageCalculatorView = this.f204038l;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(mortgageCalculatorView.getViewModel().getState(), a13);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(Q0.f41199h);
            a13.C(-507052300);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.ui.unit.h.a(dVar.J(this.f204039m));
                a13.H(objT);
            }
            float f12 = ((androidx.compose.ui.unit.h) objT).f42852b;
            a13.h();
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1155098065, new C(f12, mortgageCalculatorView, interfaceC22204y1B), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}

package com.avito.android.mortgage.consultation;

import androidx.compose.foundation.layout.C20588k2;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.transformation.k;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageConsultationScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ XZ.d f198641l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f198642m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(XZ.d dVar, Y41.l<? super String, G0> lVar) {
        super(2);
        this.f198641l = dVar;
        this.f198642m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            XZ.d dVar = this.f198641l;
            String str = dVar.f18916e;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.input.u.a(str, com.akita.compose.theme.re23.b.l(a13).getF66388c(), this.f198642m, C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), u0.i.c(a13, R.string.mortgage_consultation_field_placeholder), false, dVar.f18917f ? InputState.f61669c : InputState.f61668b, null, null, k.h.f61825d, 0, false, 0, null, dVar.f18916e.length() > 0, false, false, null, null, null, null, a13, 3072, 0, 0, 8354720);
        }
        return G0.f406611a;
    }
}

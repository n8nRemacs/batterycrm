package com.avito.android.mortgage.confirm_close;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.mortgage.confirm_close.ConfirmCloseDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConfirmCloseDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfirmCloseDialog f198487l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConfirmCloseDialog confirmCloseDialog) {
        super(2);
        this.f198487l = confirmCloseDialog;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ConfirmCloseDialog.a aVar = ConfirmCloseDialog.f198479j0;
            ConfirmCloseDialog confirmCloseDialog = this.f198487l;
            String description = confirmCloseDialog.f5().getDescription();
            String declineActionTitle = confirmCloseDialog.f5().getDeclineActionTitle();
            a13.C(2099068220);
            Object objT = a13.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new a(confirmCloseDialog);
                a13.H(objT);
            }
            Y41.a aVar2 = (Y41.a) objT;
            a13.h();
            String confirmActionTitle = confirmCloseDialog.f5().getConfirmActionTitle();
            a13.C(2099074077);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                objT2 = new b(confirmCloseDialog);
                a13.H(objT2);
            }
            a13.h();
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            i.a(description, declineActionTitle, aVar2, confirmActionTitle, (Y41.a) objT2, R1.i(v.f42878y1, 16), a13, 221568);
        }
        return G0.f406611a;
    }
}

package com.avito.android.auto_loans_cabinet;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: AutoLoanCabinetViewLoanDetailsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-loans-cabinet_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.l lVar, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-885627437);
        if ((((bE2.u(lVar) ? 4 : 2) | i12 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            T t12 = (T) objT;
            com.akita.compose.component.bottom_sheet.I iA2 = com.akita.compose.component.bottom_sheet.N.a(false, 1.0f, bE2, 54, 4);
            A a13 = new A(t12, iA2, lVar);
            com.akita.compose.component.bottom_sheet.O o12 = (com.akita.compose.component.bottom_sheet.O) bE2.o(com.akita.compose.component.bottom_sheet.P.f60549a);
            com.akita.compose.component.bottom_sheet.H.a(a13, null, iA2, null, null, new com.akita.compose.component.bottom_sheet.O(o12.f60539a, Y0.f39346a, o12.f60541c, o12.f60542d, o12.f60543e, o12.f60544f, o12.f60545g, o12.f60546h, o12.f60547i, o12.f60548j, null), null, false, false, B.f95310l, null, null, androidx.compose.runtime.internal.r.c(-1178660685, new E(aVar3, lVar, t12, iA2), bE2), bE2, 0, 384, 3546);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new F(lVar, aVar2, i12);
        }
    }
}

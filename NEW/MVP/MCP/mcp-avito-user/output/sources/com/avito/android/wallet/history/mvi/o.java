package com.avito.android.wallet.history.mvi;

import GO0.b;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.R;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class o extends N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f327711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f327712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y41.l lVar, List list) {
        super(4);
        this.f327711l = list;
        this.f327712m = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
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
            GO0.b bVar = (GO0.b) this.f327711l.get(iIntValue);
            a13.C(668071710);
            if (bVar instanceof b.a) {
                a13.C(668120193);
                G.h(a13, 0);
                a13.h();
            } else if (bVar instanceof b.d) {
                a13.C(668287314);
                G.g((b.d) bVar, this.f327712m, InterfaceC20793y.b(interfaceC20793y2, androidx.compose.ui.v.f42878y1), a13, 0);
                a13.h();
            } else if (bVar instanceof b.C0349b) {
                a13.C(668650386);
                String strC = ((b.C0349b) bVar).f6481a;
                a13.C(852856365);
                if (strC == null) {
                    strC = u0.i.c(a13, R.string.wallet_history_end_text);
                }
                a13.h();
                G.d(strC, a13, 0);
                a13.h();
            } else {
                a13.C(668896247);
                a13.h();
            }
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}

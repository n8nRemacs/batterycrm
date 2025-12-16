package com.avito.android.str_calendar.seller.warning_dialog;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogCondition;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class p extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f288098l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f288099m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Y41.l lVar, List list) {
        super(4);
        this.f288098l = list;
        this.f288099m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
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
            WarningDialogCondition warningDialogCondition = (WarningDialogCondition) this.f288098l.get(iIntValue);
            a13.C(1121968569);
            com.avito.android.str_calendar.seller.warning_dialog.composable.a.a(warningDialogCondition, this.f288099m, a13, 8);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}

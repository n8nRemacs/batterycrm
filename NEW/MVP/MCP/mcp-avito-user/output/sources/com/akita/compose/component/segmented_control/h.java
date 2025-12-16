package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import com.akita.compose.component.segmented_control.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/segmented_control/d;", "indicatorData", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/segmented_control/d;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.q<d, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f62558l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar) {
        super(3);
        this.f62558l = zVar;
    }

    @Override // Y41.q
    public final G0 invoke(d dVar, A a12, Integer num) {
        d dVar2 = dVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(dVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            z.a aVar = this.f62558l.f62609b;
            g.a(dVar2, aVar.f62619e, aVar.f62615a, null, a13, iIntValue & 14);
        }
        return G0.f406611a;
    }
}

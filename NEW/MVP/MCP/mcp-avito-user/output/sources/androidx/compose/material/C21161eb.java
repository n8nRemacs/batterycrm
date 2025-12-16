package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: TabRow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21161eb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21161eb() {
        throw null;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        androidx.compose.foundation.d2 d2VarA = androidx.compose.foundation.a2.a(a13);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
            a13.H(objT);
        }
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
        boolean zB2 = a13.B(d2VarA) | a13.B(t12);
        Object objT2 = a13.t();
        if (zB2 || objT2 == c1651a) {
            objT2 = new V7(d2VarA, t12);
            a13.H(objT2);
        }
        androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.draw.k.b(androidx.compose.foundation.selection.a.a(androidx.compose.foundation.a2.b(C20588k2.x(vVarD, InterfaceC22215f.a.f39079e, 2), d2VarA, false, true)));
        a13.k(0.0f);
        throw null;
    }
}

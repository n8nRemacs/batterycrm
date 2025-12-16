package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: BackdropScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21373v0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21373v0() {
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
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
            a13.H(objT);
        }
        C20588k2.c(null);
        throw null;
    }
}

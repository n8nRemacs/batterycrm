package androidx.compose.runtime;

import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "P1", "P2", "Lkotlin/l0;", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/l0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22134o1 extends kotlin.jvm.internal.N implements Y41.q<C42829l0<Object, Object, Object>, A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(C42829l0<Object, Object, Object> c42829l0, A a12, Integer num) {
        C42829l0<Object, Object, Object> c42829l02 = c42829l0;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? a13.B(c42829l02) : a13.u(c42829l02) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object obj = c42829l02.f406871b;
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}

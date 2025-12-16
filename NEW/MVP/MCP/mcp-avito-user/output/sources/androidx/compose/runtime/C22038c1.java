package androidx.compose.runtime;

import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"P1", "P2", "P3", "p1", "p2", "p3", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22038c1 extends kotlin.jvm.internal.N implements Y41.s<Object, Object, Object, A, Integer, kotlin.G0> {
    @Override // Y41.s
    public final kotlin.G0 invoke(Object obj, Object obj2, Object obj3, A a12, Integer num) {
        int i12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i12 = ((iIntValue & 8) == 0 ? a13.B(obj) : a13.u(obj) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i12 |= (iIntValue & 64) == 0 ? a13.B(obj2) : a13.u(obj2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i12 |= (iIntValue & 512) == 0 ? a13.B(obj3) : a13.u(obj3) ? 256 : 128;
        }
        if (a13.p(i12 & 1, (i12 & 1171) != 1170)) {
            a13.x(new C42829l0(obj, obj2, obj3));
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P1", "P2", "Lkotlin/Q;", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22065f1 extends kotlin.jvm.internal.N implements Y41.q<kotlin.Q<Object, Object>, A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(kotlin.Q<Object, Object> q12, A a12, Integer num) {
        kotlin.Q<Object, Object> q13 = q12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? a13.B(q13) : a13.u(q13) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object obj = q13.f406619b;
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}

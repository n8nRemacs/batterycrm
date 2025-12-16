package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"P", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22028a1 extends kotlin.jvm.internal.N implements Y41.q<Object, A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(Object obj, A a12, Integer num) {
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? a13.B(obj) : a13.u(obj) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            a13.x(obj);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

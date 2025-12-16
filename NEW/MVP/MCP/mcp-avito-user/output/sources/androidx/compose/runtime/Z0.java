package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z0 extends kotlin.jvm.internal.N implements Y41.p<A, Integer, kotlin.G0> {
    @Override // Y41.p
    public final kotlin.G0 invoke(A a12, Integer num) {
        A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            a13.x(null);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

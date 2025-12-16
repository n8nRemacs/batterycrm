package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "innerTextField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class I6 extends kotlin.jvm.internal.N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public I6() {
        throw null;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar, androidx.compose.runtime.A a12, Integer num) {
        Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar2 = pVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.u(pVar2) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            C21317qb c21317qb = C21317qb.f34002a;
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}

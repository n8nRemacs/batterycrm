package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "innerTextField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21503cj extends kotlin.jvm.internal.N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21503cj() {
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
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        Li li2 = Li.f35084a;
        throw null;
    }
}

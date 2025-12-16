package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "layoutHeight", "Lkotlin/G0;", "invoke", "(ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21896u1 extends kotlin.jvm.internal.N implements Y41.q<Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21896u1() {
        throw null;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= a13.m(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) != 18 || !a13.c()) {
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}

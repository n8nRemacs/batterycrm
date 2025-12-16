package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21613he extends kotlin.jvm.internal.N implements Y41.q<Boolean, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(Boolean bool, androidx.compose.runtime.A a12, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.j(zBooleanValue) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        if (zBooleanValue) {
            a13.I(-412602680);
            throw null;
        }
        a13.I(-412602659);
        throw null;
    }
}

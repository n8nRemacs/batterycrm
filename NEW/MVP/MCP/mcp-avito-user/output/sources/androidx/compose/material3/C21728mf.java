package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/gd;", "rangeSliderState", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/gd;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21728mf extends kotlin.jvm.internal.N implements Y41.q<C21589gd, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(C21589gd c21589gd, androidx.compose.runtime.A a12, Integer num) {
        C21589gd c21589gd2 = c21589gd;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(c21589gd2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            C21522df.f36227a.b(c21589gd2, null, null, false, a13, (iIntValue & 14) | 24576);
        }
        return kotlin.G0.f406611a;
    }
}

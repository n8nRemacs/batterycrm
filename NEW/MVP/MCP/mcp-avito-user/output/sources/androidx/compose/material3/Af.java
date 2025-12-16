package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/Wf;", "sliderState", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/Wf;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Af extends kotlin.jvm.internal.N implements Y41.q<Wf, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(Wf wf2, androidx.compose.runtime.A a12, Integer num) {
        Wf wf3 = wf2;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(wf3) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            C21522df.f36227a.c(wf3, null, null, false, a13, (iIntValue & 14) | 24576);
        }
        return kotlin.G0.f406611a;
    }
}

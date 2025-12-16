package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21976xf extends kotlin.jvm.internal.N implements Y41.q<Wf, androidx.compose.runtime.A, Integer, kotlin.G0> {
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

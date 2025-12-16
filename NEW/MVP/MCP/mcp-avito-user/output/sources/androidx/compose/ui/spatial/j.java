package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RectManager.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    public static final int a(float[] fArr) {
        int i12 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i13 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i12 = 1;
        }
        return i12 | (i13 << 1);
    }

    public static final boolean b(long j12) {
        q.f42862b.getClass();
        return !q.c(j12, q.f42863c);
    }
}

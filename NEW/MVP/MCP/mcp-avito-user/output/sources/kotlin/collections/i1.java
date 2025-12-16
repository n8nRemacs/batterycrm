package kotlin.collections;

import kotlin.Metadata;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i1 {
    public static final void a(int i12, int i13) {
        if (i12 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException((i12 != i13 ? androidx.appcompat.app.r.l(i12, i13, "Both size ", " and step ", " must be greater than zero.") : androidx.camera.camera2.internal.G.e(i12, "size ", " must be greater than zero.")).toString());
        }
    }
}

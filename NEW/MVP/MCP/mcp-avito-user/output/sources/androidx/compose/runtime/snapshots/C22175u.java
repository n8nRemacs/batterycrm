package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: SnapshotId.jvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, d2 = {"", "SnapshotId", "", "SnapshotIdArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22175u {
    public static final int a(@Y61.k long[] jArr, long j12) {
        int length = jArr.length - 1;
        int i12 = 0;
        while (i12 <= length) {
            int i13 = (i12 + length) >>> 1;
            long j13 = jArr[i13];
            if (j12 > j13) {
                i12 = i13 + 1;
            } else {
                if (j12 >= j13) {
                    return i13;
                }
                length = i13 - 1;
            }
        }
        return -(i12 + 1);
    }
}

package androidx.compose.runtime.snapshots;

import androidx.collection.F0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotId.jvm.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/s;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22173s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F0 f38733a;

    public C22173s(@Y61.l long[] jArr) {
        F0 f02;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            f02 = new F0(jArrCopyOf.length, null);
            int i12 = f02.f25610b;
            if (i12 < 0) {
                K.f.b("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i12;
                long[] jArr2 = f02.f25609a;
                if (jArr2.length < length) {
                    f02.f25609a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = f02.f25609a;
                int i13 = f02.f25610b;
                if (i12 != i13) {
                    C42756l.n(jArr3, jArr3, jArrCopyOf.length + i12, i12, i13);
                }
                C42756l.r(jArrCopyOf, jArr3, i12);
                f02.f25610b += jArrCopyOf.length;
            }
        } else {
            f02 = new F0(0, 1, null);
        }
        this.f38733a = f02;
    }
}

package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: Base64.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        int[] iArr = new int[256];
        int i12 = 0;
        C42756l.z(iArr, -1, 0, 6);
        iArr[61] = -2;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 64) {
            iArr[bArr[i13]] = i14;
            i13++;
            i14++;
        }
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int[] iArr2 = new int[256];
        C42756l.z(iArr2, -1, 0, 6);
        iArr2[61] = -2;
        int i15 = 0;
        while (i12 < 64) {
            iArr2[bArr2[i12]] = i15;
            i12++;
            i15++;
        }
    }
}

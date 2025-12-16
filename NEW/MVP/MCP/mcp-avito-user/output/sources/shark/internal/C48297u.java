package shark.internal;

import kotlin.Metadata;

/* compiled from: ByteSubArray.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shark-graph"}, k = 2, mv = {1, 4, 1})
/* renamed from: shark.internal.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48297u {
    public static final int a(int i12, @Y61.k byte[] bArr) {
        int i13 = ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24);
        return (bArr[i12 + 3] & 255) | i13 | ((bArr[i12 + 2] & 255) << 8);
    }

    public static final long b(int i12, @Y61.k byte[] bArr) {
        return (bArr[i12 + 7] & 255) | ((bArr[i12] & 255) << 56) | ((bArr[i12 + 1] & 255) << 48) | ((bArr[i12 + 2] & 255) << 40) | ((bArr[i12 + 3] & 255) << 32) | ((bArr[i12 + 4] & 255) << 24) | ((bArr[i12 + 5] & 255) << 16) | ((bArr[i12 + 6] & 255) << 8);
    }
}

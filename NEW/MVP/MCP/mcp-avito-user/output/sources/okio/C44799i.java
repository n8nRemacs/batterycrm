package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okio.C44802l;

/* compiled from: Util.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: okio.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44799i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C44802l.a f420068a = new C44802l.a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f420069b = -1234567890;

    public static final boolean a(@Y61.k byte[] bArr, int i12, @Y61.k byte[] bArr2, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (bArr[i15 + i12] != bArr2[i15 + i13]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j12, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j12 || j12 - j13 < j14) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "size=", " offset=");
            sbQ.append(j13);
            sbQ.append(" byteCount=");
            sbQ.append(j14);
            throw new ArrayIndexOutOfBoundsException(sbQ.toString());
        }
    }

    public static final int c(int i12) {
        return ((i12 & 255) << 24) | (((-16777216) & i12) >>> 24) | ((16711680 & i12) >>> 8) | ((65280 & i12) << 8);
    }

    @Y61.k
    public static final String d(byte b12) {
        char[] cArr = okio.internal.c.f420071a;
        return new String(new char[]{cArr[(b12 >> 4) & 15], cArr[b12 & 15]});
    }
}

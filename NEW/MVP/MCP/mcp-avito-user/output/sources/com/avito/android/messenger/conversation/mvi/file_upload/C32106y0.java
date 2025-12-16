package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import arrow.core.C23703n1;
import com.avito.android.persistence.messenger.Q1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.Util;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.y0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32106y0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191337b;

    public C32106y0(C32104x0 c32104x0) {
        this.f191337b = c32104x0;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws IOException {
        char c12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 4;
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return io.reactivex.rxjava3.core.I.l(new IllegalStateException("No metainfo found for this video message"));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((Q1) ((C23703n1) y02).f56288b).f215285d;
        if (str == null) {
            return io.reactivex.rxjava3.core.I.l(new IllegalStateException("No URI found for this video message"));
        }
        C32104x0 c32104x0 = this.f191337b;
        InputStream inputStreamM = c32104x0.f191323b.m(Uri.parse(str));
        c32104x0.f191335n.getClass();
        com.avito.android.messenger.util.j jVar = new com.avito.android.messenger.util.j();
        BufferedInputStream bufferedInputStream = inputStreamM instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM : new BufferedInputStream(inputStreamM, 8192);
        byte[] bArr = new byte[1048576];
        while (true) {
            int i17 = bufferedInputStream.read(bArr);
            int i18 = 5;
            int i19 = 31;
            long j12 = -8663945395140668459L;
            int i22 = 8;
            if (i17 < 0) {
                break;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i17);
            jVar.f197441c += bArrCopyOf.length;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[jVar.f197442d.length + bArrCopyOf.length]);
            byteBufferWrap.put(jVar.f197442d);
            byteBufferWrap.put(bArrCopyOf);
            int length = byteBufferWrap.array().length >> i16;
            int i23 = 0;
            while (i23 < length) {
                int i24 = i23 << 4;
                long jA2 = com.avito.android.messenger.util.j.a(i24, byteBufferWrap.array());
                long jA3 = com.avito.android.messenger.util.j.a(i24 + i22, byteBufferWrap.array());
                long jRotateLeft = (Long.rotateLeft(jA2 * j12, i19) * 5545529020109919103L) ^ jVar.f197439a;
                jVar.f197439a = jRotateLeft;
                long j13 = i18;
                jVar.f197439a = ((Long.rotateLeft(jRotateLeft, 27) + jVar.f197440b) * j13) + 1390208809;
                long jRotateLeft2 = jVar.f197440b ^ (Long.rotateLeft(jA3 * 5545529020109919103L, 33) * (-8663945395140668459L));
                jVar.f197440b = jRotateLeft2;
                jVar.f197440b = ((Long.rotateLeft(jRotateLeft2, 31) + jVar.f197439a) * j13) + 944331445;
                i23++;
                i22 = 8;
                i18 = 5;
                i19 = 31;
                j12 = -8663945395140668459L;
            }
            jVar.f197442d = Arrays.copyOfRange(byteBufferWrap.array(), length * 16, byteBufferWrap.array().length);
            i16 = 4;
        }
        bufferedInputStream.close();
        int length2 = jVar.f197442d.length & 15;
        long j14 = length2 == 15 ? (r0[14] & 255) << 48 : 0L;
        if (length2 >= 14) {
            j14 ^= (r0[13] & 255) << 40;
        }
        if (length2 >= 13) {
            j14 ^= (r0[12] & 255) << 32;
        }
        if (length2 >= 12) {
            j14 ^= (r0[11] & 255) << 24;
        }
        if (length2 >= 11) {
            j14 ^= (r0[10] & 255) << 16;
        }
        if (length2 >= 10) {
            c12 = '\b';
            j14 ^= (r0[9] & 255) << 8;
        } else {
            c12 = '\b';
        }
        if (length2 >= 9) {
            jVar.f197440b = (Long.rotateLeft(((r0[c12] & 255) ^ j14) * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ jVar.f197440b;
        }
        long j15 = length2 >= 8 ? (jVar.f197442d[7] & 255) << 56 : 0L;
        if (length2 >= 7) {
            j15 ^= (jVar.f197442d[6] & 255) << 48;
        }
        if (length2 >= 6) {
            i12 = 5;
            j15 ^= (jVar.f197442d[5] & 255) << 40;
        } else {
            i12 = 5;
        }
        if (length2 >= i12) {
            i13 = 4;
            j15 ^= (jVar.f197442d[4] & 255) << 32;
        } else {
            i13 = 4;
        }
        if (length2 >= i13) {
            j15 ^= (jVar.f197442d[3] & 255) << 24;
        }
        if (length2 >= 3) {
            i14 = 2;
            j15 ^= (jVar.f197442d[2] & 255) << 16;
        } else {
            i14 = 2;
        }
        if (length2 >= i14) {
            i15 = 1;
            j15 ^= (jVar.f197442d[1] & 255) << 8;
        } else {
            i15 = 1;
        }
        if (length2 >= i15) {
            jVar.f197439a = (Long.rotateLeft(((jVar.f197442d[0] & 255) ^ j15) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ jVar.f197439a;
        }
        long j16 = jVar.f197439a;
        long j17 = jVar.f197441c;
        long j18 = j16 ^ j17;
        long j19 = j17 ^ jVar.f197440b;
        long j22 = j18 + j19;
        long j23 = j19 + j22;
        long j24 = (j22 ^ (j22 >>> 33)) * (-49064778989728563L);
        long j25 = (j24 ^ (j24 >>> 33)) * (-4265267296055464877L);
        long j26 = (j23 ^ (j23 >>> 33)) * (-49064778989728563L);
        long j27 = (j26 ^ (j26 >>> 33)) * (-4265267296055464877L);
        long j28 = j27 ^ (j27 >>> 33);
        long j29 = (j25 ^ (j25 >>> 33)) + j28;
        jVar.f197439a = j29;
        long j32 = j28 + j29;
        jVar.f197440b = j32;
        long[] jArr = {j29, j32};
        return io.reactivex.rxjava3.core.I.q(Util.toHexString(jArr[0]) + Util.toHexString(jArr[1]));
    }
}

package androidx.media3.extractor.flac;

import androidx.media3.common.util.z;
import androidx.media3.extractor.AbstractC23186e;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.u;
import androidx.media3.extractor.x;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class a extends AbstractC23186e {

    /* compiled from: FlacBinarySearchSeeker.java */
    public static final class b implements AbstractC23186e.f {

        /* renamed from: a, reason: collision with root package name */
        public final x f50520a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50521b;

        /* renamed from: c, reason: collision with root package name */
        public final u.a f50522c = new u.a();

        public b(x xVar, int i12, C1851a c1851a) {
            this.f50520a = xVar;
            this.f50521b = i12;
        }

        @Override // androidx.media3.extractor.AbstractC23186e.f
        public final AbstractC23186e.C1850e b(C23191j c23191j, long j12) throws EOFException, InterruptedIOException {
            long j13 = c23191j.f50583d;
            long jC2 = c(c23191j);
            long jG2 = c23191j.g();
            c23191j.k(Math.max(6, this.f50520a.f51893c), false);
            long jC3 = c(c23191j);
            return (jC2 > j12 || jC3 <= j12) ? jC3 <= j12 ? new AbstractC23186e.C1850e(-2, jC3, c23191j.g()) : new AbstractC23186e.C1850e(-1, jC2, j13) : new AbstractC23186e.C1850e(0, -9223372036854775807L, jG2);
        }

        public final long c(C23191j c23191j) throws EOFException, InterruptedIOException {
            long j12;
            u.a aVar;
            x xVar;
            boolean zA2;
            int iM2;
            while (true) {
                long jG2 = c23191j.g();
                j12 = c23191j.f50582c;
                long j13 = j12 - 6;
                aVar = this.f50522c;
                xVar = this.f50520a;
                if (jG2 >= j13) {
                    break;
                }
                long jG3 = c23191j.g();
                byte[] bArr = new byte[2];
                c23191j.a(bArr, 0, 2, false);
                int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i13 = this.f50521b;
                if (i12 != i13) {
                    c23191j.f50585f = 0;
                    c23191j.k((int) (jG3 - c23191j.f50583d), false);
                    zA2 = false;
                } else {
                    z zVar = new z(16);
                    System.arraycopy(bArr, 0, zVar.f47962a, 0, 2);
                    byte[] bArr2 = zVar.f47962a;
                    int i14 = 0;
                    for (int i15 = 2; i14 < 14 && (iM2 = c23191j.m(i15 + i14, 14 - i14, bArr2)) != -1; i15 = 2) {
                        i14 += iM2;
                    }
                    zVar.E(i14);
                    c23191j.f50585f = 0;
                    c23191j.k((int) (jG3 - c23191j.f50583d), false);
                    zA2 = u.a(zVar, xVar, i13, aVar);
                }
                if (zA2) {
                    break;
                }
                c23191j.k(1, false);
            }
            if (c23191j.g() < j12 - 6) {
                return aVar.f51846a;
            }
            c23191j.k((int) (j12 - c23191j.g()), false);
            return xVar.f51900j;
        }
    }
}

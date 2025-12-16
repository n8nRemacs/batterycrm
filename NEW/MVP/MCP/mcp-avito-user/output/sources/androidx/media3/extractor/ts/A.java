package androidx.media3.extractor.ts;

import androidx.media3.common.util.M;
import androidx.media3.extractor.AbstractC23186e;
import androidx.media3.extractor.C23191j;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class A extends AbstractC23186e {

    /* compiled from: TsBinarySearchSeeker.java */
    public static final class a implements AbstractC23186e.f {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.util.G f51495a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.util.z f51496b = new androidx.media3.common.util.z();

        /* renamed from: c, reason: collision with root package name */
        public final int f51497c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51498d;

        public a(int i12, androidx.media3.common.util.G g12, int i13) {
            this.f51497c = i12;
            this.f51495a = g12;
            this.f51498d = i13;
        }

        @Override // androidx.media3.extractor.AbstractC23186e.f
        public final void a() {
            byte[] bArr = M.f47891e;
            androidx.media3.common.util.z zVar = this.f51496b;
            zVar.getClass();
            zVar.D(bArr.length, bArr);
        }

        @Override // androidx.media3.extractor.AbstractC23186e.f
        public final AbstractC23186e.C1850e b(C23191j c23191j, long j12) {
            long j13 = c23191j.f50583d;
            int iMin = (int) Math.min(this.f51498d, c23191j.f50582c - j13);
            androidx.media3.common.util.z zVar = this.f51496b;
            zVar.C(iMin);
            c23191j.a(zVar.f47962a, 0, iMin, false);
            int i12 = zVar.f47964c;
            long j14 = -1;
            long j15 = -1;
            long j16 = -9223372036854775807L;
            while (zVar.a() >= 188) {
                byte[] bArr = zVar.f47962a;
                int i13 = zVar.f47963b;
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                int i14 = i13 + 188;
                if (i14 > i12) {
                    break;
                }
                long jA2 = E.a(zVar, i13, this.f51497c);
                if (jA2 != -9223372036854775807L) {
                    long jB2 = this.f51495a.b(jA2);
                    if (jB2 > j12) {
                        return j16 == -9223372036854775807L ? new AbstractC23186e.C1850e(-1, jB2, j13) : new AbstractC23186e.C1850e(0, -9223372036854775807L, j13 + j15);
                    }
                    if (100000 + jB2 > j12) {
                        return new AbstractC23186e.C1850e(0, -9223372036854775807L, j13 + i13);
                    }
                    j15 = i13;
                    j16 = jB2;
                }
                zVar.F(i14);
                j14 = i14;
            }
            return j16 != -9223372036854775807L ? new AbstractC23186e.C1850e(-2, j16, j13 + j14) : AbstractC23186e.C1850e.f50516d;
        }
    }
}

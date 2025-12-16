package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class jz6 implements x6f {
    public byte a;
    public final jbd b;
    public final Inflater c;
    public final zj7 d;
    public final CRC32 o;

    public jz6(x6f x6fVar) {
        jbd jbdVar = new jbd(x6fVar);
        this.b = jbdVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new zj7(jbdVar, inflater);
        this.o = new CRC32();
    }

    public static void c(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws DataFormatException, IOException {
        byte b;
        long j2;
        jz6 jz6Var = this;
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = jz6Var.a;
        CRC32 crc32 = jz6Var.o;
        jbd jbdVar = jz6Var.b;
        if (b2 == 0) {
            jbdVar.d0(10L);
            qu0 qu0Var2 = jbdVar.a;
            byte bQ = qu0Var2.Q(3L);
            boolean z = ((bQ >> 1) & 1) == 1;
            if (z) {
                jz6Var.d(qu0Var2, 0L, 10L);
            }
            c(8075, jbdVar.readShort(), "ID1ID2");
            jbdVar.skip(8L);
            if (((bQ >> 2) & 1) == 1) {
                jbdVar.d0(2L);
                if (z) {
                    d(qu0Var2, 0L, 2L);
                }
                short s = qu0Var2.readShort();
                long j3 = (short) (((s & 255) << 8) | ((s & 65280) >>> 8));
                jbdVar.d0(j3);
                if (z) {
                    d(qu0Var2, 0L, j3);
                }
                jbdVar.skip(j3);
            }
            if (((bQ >> 3) & 1) == 1) {
                long jW = jbdVar.w((byte) 0, 0L, BuildConfig.MAX_TIME_TO_UPLOAD);
                if (jW == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    b = 1;
                    d(qu0Var2, 0L, jW + 1);
                } else {
                    b = 1;
                    j2 = 2;
                }
                jbdVar.skip(jW + 1);
            } else {
                j2 = 2;
                b = 1;
            }
            if (((bQ >> 4) & b) == b) {
                byte b3 = b;
                long j4 = j2;
                long jW2 = jbdVar.w((byte) 0, 0L, BuildConfig.MAX_TIME_TO_UPLOAD);
                if (jW2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    b = b3;
                    jz6Var = this;
                    jz6Var.d(qu0Var2, 0L, jW2 + 1);
                } else {
                    b = b3;
                    j2 = j4;
                    jz6Var = this;
                }
                jbdVar.skip(jW2 + 1);
            } else {
                jz6Var = this;
            }
            if (z) {
                jbdVar.d0(j2);
                short s2 = qu0Var2.readShort();
                c((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            jz6Var.a = b;
        } else {
            b = 1;
        }
        if (jz6Var.a == b) {
            long j5 = qu0Var.b;
            long jB = jz6Var.d.b(qu0Var, j);
            if (jB != -1) {
                jz6Var.d(qu0Var, j5, jB);
                return jB;
            }
            jz6Var.a = (byte) 2;
        }
        if (jz6Var.a == 2) {
            c(jbdVar.y(), (int) crc32.getValue(), "CRC");
            c(jbdVar.y(), (int) jz6Var.c.getBytesWritten(), "ISIZE");
            jz6Var.a = (byte) 3;
            if (!jbdVar.l()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void d(qu0 qu0Var, long j, long j2) {
        w9e w9eVar = qu0Var.a;
        while (true) {
            int i = w9eVar.c;
            int i2 = w9eVar.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            w9eVar = w9eVar.f;
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(w9eVar.c - r6, j2);
            this.o.update(w9eVar.a, (int) (w9eVar.b + j), iMin);
            j2 -= iMin;
            w9eVar = w9eVar.f;
            j = 0;
        }
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.b.c.m();
    }
}

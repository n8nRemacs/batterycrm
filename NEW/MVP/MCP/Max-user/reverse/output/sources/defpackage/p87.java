package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p87 implements Closeable {
    public static final Logger d = Logger.getLogger(d87.class.getName());
    public final o87 a;
    public final u77 b;
    public final wv0 c;

    public p87(jbd jbdVar) {
        this.c = jbdVar;
        o87 o87Var = new o87(jbdVar);
        this.a = o87Var;
        this.b = new u77(o87Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0270, code lost:
    
        throw new java.io.IOException(defpackage.ho7.f(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(boolean r19, defpackage.vu2 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p87.c(boolean, vu2):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        if (r8 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0110, code lost:
    
        r3.j(defpackage.yxg.b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.vu2 r17, int r18, int r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p87.d(vu2, int, int, int):void");
    }

    public final List i(int i, int i2, int i3, int i4) throws IOException {
        o87 o87Var = this.a;
        o87Var.d = i;
        o87Var.a = i;
        o87Var.o = i2;
        o87Var.b = i3;
        o87Var.c = i4;
        u77 u77Var = this.b;
        jbd jbdVar = u77Var.b;
        ArrayList arrayList = u77Var.a;
        while (!jbdVar.l()) {
            byte b = jbdVar.readByte();
            byte[] bArr = yxg.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = u77Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    c17[] c17VarArr = w77.a;
                    if (i6 <= c17VarArr.length - 1) {
                        arrayList.add(c17VarArr[i6]);
                    }
                }
                int length = u77Var.d + 1 + (i6 - w77.a.length);
                if (length >= 0) {
                    c17[] c17VarArr2 = u77Var.c;
                    if (length < c17VarArr2.length) {
                        arrayList.add(c17VarArr2[length]);
                    }
                }
                throw new IOException(ho7.f(iE, "Header index too large "));
            }
            if (i5 == 64) {
                c17[] c17VarArr3 = w77.a;
                xx0 xx0VarD = u77Var.d();
                w77.a(xx0VarD);
                u77Var.c(new c17(xx0VarD, u77Var.d()));
            } else if ((b & 64) == 64) {
                u77Var.c(new c17(u77Var.b(u77Var.e(i5, 63) - 1), u77Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = u77Var.e(i5, 31);
                u77Var.g = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + u77Var.g);
                }
                int i7 = u77Var.f;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        ys.s(u77Var.c, null);
                        u77Var.d = u77Var.c.length - 1;
                        u77Var.e = 0;
                        u77Var.f = 0;
                    } else {
                        u77Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                c17[] c17VarArr4 = w77.a;
                xx0 xx0VarD2 = u77Var.d();
                w77.a(xx0VarD2);
                arrayList.add(new c17(xx0VarD2, u77Var.d()));
            } else {
                arrayList.add(new c17(u77Var.b(u77Var.e(i5, 15) - 1), u77Var.d()));
            }
        }
        List listD0 = ue3.d0(arrayList);
        arrayList.clear();
        return listD0;
    }

    public final void l(vu2 vu2Var, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i4 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = yxg.a;
            i4 = b & 255;
        }
        if ((i2 & 32) != 0) {
            wv0 wv0Var = this.c;
            wv0Var.readInt();
            wv0Var.readByte();
            byte[] bArr2 = yxg.a;
            i -= 5;
        }
        List listI = i(rei.e(i, i2, i4), i4, i2, i3);
        m87 m87Var = (m87) vu2Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            m87Var.s0.c(new j87(m87Var.c + '[' + i3 + "] onHeaders", m87Var, i3, listI, z), 0L);
            return;
        }
        synchronized (m87Var) {
            t87 t87VarD = ((m87) vu2Var.c).d(i3);
            if (t87VarD != null) {
                t87VarD.j(yxg.u(listI), z);
                return;
            }
            m87 m87Var2 = (m87) vu2Var.c;
            if (m87Var2.X) {
                return;
            }
            if (i3 <= m87Var2.d) {
                return;
            }
            if (i3 % 2 == m87Var2.o % 2) {
                return;
            }
            t87 t87Var = new t87(i3, (m87) vu2Var.c, false, z, yxg.u(listI));
            m87 m87Var3 = (m87) vu2Var.c;
            m87Var3.d = i3;
            m87Var3.b.put(Integer.valueOf(i3), t87Var);
            ((m87) vu2Var.c).Y.e().c(new g87(((m87) vu2Var.c).c + '[' + i3 + "] onStream", t87Var, vu2Var), 0L);
        }
    }

    public final void w(vu2 vu2Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = yxg.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.c.readInt() & Integer.MAX_VALUE;
        List listI = i(rei.e(i - 4, i2, i4), i4, i2, i3);
        m87 m87Var = (m87) vu2Var.c;
        synchronized (m87Var) {
            if (m87Var.I0.contains(Integer.valueOf(i5))) {
                m87Var.P(i5, 2);
                return;
            }
            m87Var.I0.add(Integer.valueOf(i5));
            m87Var.s0.c(new j87(m87Var.c + '[' + i5 + "] onRequest", m87Var, i5, listI), 0L);
        }
    }
}

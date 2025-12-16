package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ce5 implements Closeable {
    public final vc3 a;
    public ColorSpace s0;
    public String t0;
    public me7 b = me7.c;
    public int c = -1;
    public int d = 0;
    public int o = -1;
    public int X = -1;
    public int Y = 1;
    public int Z = -1;

    public ce5(vc3 vc3Var) {
        if (!vc3.i0(vc3Var)) {
            throw new IllegalArgumentException();
        }
        this.a = vc3Var.clone();
    }

    public static boolean Q(ce5 ce5Var) {
        return ce5Var.c >= 0 && ce5Var.o >= 0 && ce5Var.X >= 0;
    }

    public static ce5 c(ce5 ce5Var) throws IOException {
        ce5 ce5Var2 = null;
        if (ce5Var == null) {
            return null;
        }
        vc3 vc3VarY = vc3.y(ce5Var.a);
        if (vc3VarY != null) {
            try {
                ce5Var2 = new ce5(vc3VarY);
            } catch (Throwable th) {
                vc3VarY.close();
                throw th;
            }
        }
        vc3.P(vc3VarY);
        if (ce5Var2 != null) {
            ce5Var2.i(ce5Var);
        }
        return ce5Var2;
    }

    public static void d(ce5 ce5Var) {
        if (ce5Var != null) {
            ce5Var.close();
        }
    }

    public static boolean h0(ce5 ce5Var) {
        return ce5Var != null && ce5Var.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01af, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f6 A[EDGE_INSN: B:209:0x01f6->B:126:0x01f6 BREAK  A[LOOP:2: B:128:0x01fe->B:135:0x0211], EDGE_INSN: B:210:0x01f6->B:126:0x01f6 BREAK  A[LOOP:2: B:128:0x01fe->B:135:0x0211]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8 A[Catch: IOException -> 0x0231, TryCatch #7 {IOException -> 0x0231, blocks: (B:80:0x016a, B:84:0x0174, B:87:0x017d, B:89:0x0186, B:120:0x01e7, B:124:0x01ed, B:139:0x021f, B:142:0x0226, B:145:0x022d, B:127:0x01f8, B:128:0x01fe, B:132:0x0206, B:135:0x0211, B:107:0x01bc, B:111:0x01ca, B:115:0x01d5, B:117:0x01dd, B:119:0x01e1, B:100:0x01a5), top: B:192:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.P():void");
    }

    public final synchronized boolean Z() {
        return vc3.i0(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vc3.P(this.a);
    }

    public final void i(ce5 ce5Var) throws IOException {
        ce5Var.i0();
        this.b = ce5Var.b;
        ce5Var.i0();
        this.o = ce5Var.o;
        ce5Var.i0();
        this.X = ce5Var.X;
        ce5Var.i0();
        this.c = ce5Var.c;
        ce5Var.i0();
        this.d = ce5Var.d;
        this.Y = ce5Var.Y;
        this.Z = ce5Var.y();
        ce5Var.i0();
        this.s0 = ce5Var.s0;
    }

    public final void i0() throws IOException {
        if (this.o < 0 || this.X < 0) {
            P();
        }
    }

    public final String l() {
        vc3 vc3VarY = vc3.y(this.a);
        if (vc3VarY == null) {
            return "";
        }
        int iMin = Math.min(y(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((nf9) vc3VarY.Z()).P(0, 0, iMin, bArr);
            vc3VarY.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            vc3VarY.close();
            throw th;
        }
    }

    public final InputStream w() {
        vc3 vc3VarY = vc3.y(this.a);
        if (vc3VarY == null) {
            return null;
        }
        try {
            return new z5c((nf9) vc3VarY.Z());
        } finally {
            vc3VarY.close();
        }
    }

    public final int y() {
        vc3 vc3Var = this.a;
        if (vc3Var == null) {
            return this.Z;
        }
        vc3Var.Z();
        return ((nf9) vc3Var.Z()).Q();
    }
}

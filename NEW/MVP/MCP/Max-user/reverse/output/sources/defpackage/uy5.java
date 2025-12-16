package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLContext;

/* loaded from: classes2.dex */
public final class uy5 implements ou1 {
    public final Object X;
    public Object Y;
    public final Object Z;
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object o;
    public final Object s0;
    public final Object t0;

    public uy5(int i, SocketChannel socketChannel, Selector selector, fr3 fr3Var, SSLContext sSLContext) {
        this.a = i;
        this.b = socketChannel;
        this.c = selector;
        this.d = fr3Var;
        this.o = sSLContext;
        this.X = zvg.b;
        this.Z = new ayf(this);
        this.s0 = new byf(this);
        this.t0 = ByteBuffer.allocate(0);
    }

    public void a(String str) {
        Log.e("TLSSocketChannel", "[" + this.a + "] " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Type inference failed for: r13v10, types: [i84, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [i84, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [i84, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy5.b(q44):java.lang.Object");
    }

    @Override // defpackage.ou1
    public void i(mbd mbdVar, ood oodVar) {
        String strA;
        long j;
        long j2;
        qod qodVar = oodVar.Y;
        try {
            if (!oodVar.l() || qodVar == null) {
                tgg tggVar = ((zy5) this.t0).c;
                int i = oodVar.d;
                dd ddVar = (dd) tggVar.a.getValue();
                if (!ddVar.a().e()) {
                    ddVar.f("HTTP_ERROR", String.valueOf(i));
                }
                int i2 = oodVar.d;
                try {
                    strA = oodVar.X.a("X-Reason");
                } catch (Exception unused) {
                }
                if (strA == null) {
                    strA = null;
                }
                o97 o97VarE = uog.e(i2, strA);
                ua9 ua9Var = zy5.d;
                wqi.c("zy5", "error uploading, e: " + o97VarE, new Object[0]);
                if (uog.g.equals(o97VarE) || uog.e.equals(o97VarE)) {
                    zy5.d((ea7) this.c);
                } else if (uog.b.equals(o97VarE) && ((AtomicBoolean) this.o).compareAndSet(false, true)) {
                    j17 j17Var = oodVar.X;
                    String strA2 = j17Var.a("X-Last-Known-Byte");
                    if (strA2 == null) {
                        strA2 = null;
                    }
                    if (strA2 != null) {
                        String strA3 = j17Var.a("X-Last-Known-Byte");
                        try {
                            j2 = Long.parseLong(strA3 != null ? strA3 : null) + 1;
                        } catch (NumberFormatException unused2) {
                            j2 = -1;
                        }
                        j = j2;
                    } else {
                        j = 0;
                    }
                    if (j > 0) {
                        mbd mbdVarB = ((sua) ((zy5) this.t0).b.getValue()).b(((zy5) this.t0).a((File) this.d, (String) this.X, (ga7) this.Y, (ua9) this.Z, j, (ea7) this.c, this.a));
                        wy5 wy5Var = (wy5) this.s0;
                        synchronized (wy5Var) {
                            if (!wy5Var.b) {
                                wy5Var.a = mbdVarB;
                                mbdVarB.e(this);
                            }
                        }
                    } else {
                        ((ea7) this.c).b("upload failed", o97VarE);
                    }
                } else {
                    ((ea7) this.c).b("upload failed", o97VarE);
                }
            } else {
                ea7 ea7Var = (ea7) this.c;
                File file = (File) this.d;
                String strQ = qodVar.Q();
                long length = file.length();
                if (!ea7Var.Z.get()) {
                    ea7Var.X.b(new nh2(ea7Var, strQ, length, 1));
                }
            }
            if (qodVar != null) {
                qodVar.close();
            }
        } finally {
        }
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        ea7 ea7Var = (ea7) this.c;
        ua9 ua9Var = zy5.d;
        wqi.g("zy5", iOException, "onFailure %s", (zmd) this.b);
        dd ddVar = (dd) ((zy5) this.t0).c.a.getValue();
        if (!ddVar.a().e()) {
            ddVar.f("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        wqi.e("zy5", "onFailure", null);
        if (iOException instanceof FileNotFoundException) {
            ea7Var.b("file not found", uog.m);
        } else if ("FILE_ZERO_LENGTH".equals(iOException.getMessage())) {
            ea7Var.b("file is zero length", uog.n);
        } else {
            String string = iOException.toString();
            ea7Var.b("upload failed", string == null ? uog.l : new o97(-1, "UNKNOWN_ERROR", string));
        }
    }

    public uy5() {
        y4e y4eVar = y4e.a;
        fxa fxaVarB = y4eVar.b();
        sxg sxgVar = y4eVar.h().c;
        k18 k18Var = x4e.a;
        bwf bwfVarD = y4eVar.getAccessor().d(46);
        k18 k18Var2 = x4e.d;
        bwf bwfVarD2 = y4eVar.getAccessor().d(110);
        bwf bwfVarD3 = y4eVar.getAccessor().d(166);
        bwf bwfVar = new bwf(new i77(29));
        bwf bwfVar2 = new bwf(new c38(0));
        k18 k18Var3 = x4e.a;
        this.b = fxaVarB;
        this.c = sxgVar;
        this.d = bwfVarD;
        this.o = k18Var2;
        this.X = bwfVarD2;
        this.a = 6;
        this.Y = bwfVarD3;
        this.Z = bwfVar;
        this.s0 = bwfVar2;
        this.t0 = k18Var3;
    }

    public uy5(fa6 fa6Var) {
        int i;
        ml6.i();
        this.b = jk4.a();
        this.c = wha.n();
        w5c w5cVar = (w5c) fa6Var.b;
        if (w5cVar == null) {
            int i2 = rm4.a;
            int i3 = i2 * 4194304;
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
                sparseIntArray.put(i4, i2);
            }
            w5cVar = new w5c(4194304, i3, sparseIntArray, rm4.a);
        }
        this.d = w5cVar;
        Object obj = (rf9) fa6Var.c;
        this.o = obj == null ? vha.b() : obj;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i5 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin2 < 16777216) {
            i = iMin2 / 2;
        } else {
            i = (iMin2 / 4) * 3;
        }
        this.Y = new w5c(i5, i, sparseIntArray2, -1);
        this.Z = wha.n();
        w5c w5cVar2 = (w5c) fa6Var.d;
        if (w5cVar2 == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            w5cVar2 = new w5c(81920, 1048576, sparseIntArray3, -1);
        }
        this.s0 = w5cVar2;
        this.t0 = wha.n();
        String str = (String) fa6Var.a;
        this.X = str == null ? "legacy" : str;
        this.a = 4194304;
        ml6.i();
    }

    public uy5(zy5 zy5Var, zmd zmdVar, ea7 ea7Var, File file, AtomicBoolean atomicBoolean, String str, ga7 ga7Var, ua9 ua9Var, int i, wy5 wy5Var) {
        this.t0 = zy5Var;
        this.b = zmdVar;
        this.c = ea7Var;
        this.d = file;
        this.o = atomicBoolean;
        this.X = str;
        this.Y = ga7Var;
        this.Z = ua9Var;
        this.a = i;
        this.s0 = wy5Var;
    }
}

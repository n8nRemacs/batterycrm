package defpackage;

import java.io.StringReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class xw7 extends p7d {
    public static final int Z;
    public static final int s0;
    public static final int t0;
    public static final afe u0;
    public final afe X;
    public final char Y;
    public final transient kb2 a;
    public final transient sx0 b;
    public final int c;
    public final int d;
    public final int o;

    static {
        int iB = 0;
        for (int i : az1.y(4)) {
            if (i == 0) {
                throw null;
            }
            iB |= ho7.b(i);
        }
        Z = iB;
        int i2 = 0;
        for (nx7 nx7Var : nx7.values()) {
            if (nx7Var.a) {
                i2 |= nx7Var.b;
            }
        }
        s0 = i2;
        int i3 = 0;
        for (yw7 yw7Var : yw7.values()) {
            if (yw7Var.a) {
                i3 |= yw7Var.b;
            }
        }
        t0 = i3;
        u0 = vo4.a;
    }

    public xw7() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = new kb2((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.b = new sx0((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.c = Z;
        this.d = s0;
        this.o = t0;
        this.X = u0;
        this.Y = '\"';
    }

    public final b6 a(Object obj, boolean z) {
        ev0 ev0Var;
        SoftReference softReference;
        if (ho7.a(4, this.c)) {
            ThreadLocal threadLocal = fv0.b;
            SoftReference softReference2 = (SoftReference) threadLocal.get();
            ev0Var = softReference2 == null ? null : (ev0) softReference2.get();
            if (ev0Var == null) {
                ev0Var = new ev0();
                enb enbVar = fv0.a;
                if (enbVar != null) {
                    ReferenceQueue referenceQueue = (ReferenceQueue) enbVar.c;
                    softReference = new SoftReference(ev0Var, referenceQueue);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) enbVar.b;
                    concurrentHashMap.put(softReference, Boolean.TRUE);
                    while (true) {
                        SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                        if (softReference3 == null) {
                            break;
                        }
                        concurrentHashMap.remove(softReference3);
                    }
                } else {
                    softReference = new SoftReference(ev0Var);
                }
                threadLocal.set(softReference);
            }
        } else {
            ev0Var = new ev0();
        }
        return new b6(ev0Var, obj, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if ((r15 & 255) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if ((r1 & 255) == 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vmb b(java.io.BufferedInputStream r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw7.b(java.io.BufferedInputStream):vmb");
    }

    public final fbd c(String str) {
        int length = str.length();
        int i = this.c;
        kb2 kb2Var = this.a;
        if (length > 32768) {
            StringReader stringReader = new StringReader(str);
            return new fbd(a(stringReader, false), this.d, stringReader, new kb2(kb2Var, i, kb2Var.c, (jb2) kb2Var.b.get()));
        }
        b6 b6VarA = a(str, true);
        if (((char[]) b6VarA.f) != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        char[] cArrA = ((ev0) b6VarA.d).a(0, length);
        b6VarA.f = cArrA;
        str.getChars(0, length, cArrA, 0);
        return new fbd(b6VarA, this.d, new kb2(kb2Var, i, kb2Var.c, (jb2) kb2Var.b.get()), cArrA, length);
    }
}

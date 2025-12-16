package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class yk8 {
    public final int a;
    public final x6i b;
    public final v17 c;
    public int d;
    public int e;
    public int f;

    public yk8(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new x6i(21);
        this.c = new v17(23, (byte) 0);
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final Object c(Object obj) {
        Object objPut;
        synchronized (this.c) {
            Object obj2 = ((LinkedHashMap) this.b.b).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    objPut = ((LinkedHashMap) this.b.b).put(obj, objA);
                    if (objPut != null) {
                        ((LinkedHashMap) this.b.b).put(obj, objPut);
                    } else {
                        this.d += f(obj, objA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(false, obj, objA, objPut);
                return objPut;
            }
            i(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.c) {
            this.d += f(obj, obj2);
            objPut = ((LinkedHashMap) this.b.b).put(obj, obj2);
            if (objPut != null) {
                this.d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        i(this.a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        synchronized (this.c) {
            objRemove = ((LinkedHashMap) this.b.b).remove(obj);
            if (objRemove != null) {
                this.d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iH = h(obj2);
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final int g() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int h(Object obj) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6) {
        /*
            r5 = this;
        L0:
            v17 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L62
            x6i r1 = r5.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L62
            goto L1a
        L18:
            r6 = move-exception
            goto L6a
        L1a:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 <= r6) goto L60
            x6i r1 = r5.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L2b
            goto L60
        L2b:
            x6i r1 = r5.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = defpackage.ue3.H(r1)     // Catch: java.lang.Throwable -> L18
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L3f
            monitor-exit(r0)
            return
        L3f:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L18
            x6i r3 = r5.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r3.b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L18
            r3.remove(r2)     // Catch: java.lang.Throwable -> L18
            int r3 = r5.d     // Catch: java.lang.Throwable -> L18
            int r4 = r5.f(r2, r1)     // Catch: java.lang.Throwable -> L18
            int r3 = r3 - r4
            r5.d = r3     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            r0 = 0
            r3 = 1
            r5.b(r3, r2, r1, r0)
            goto L0
        L60:
            monitor-exit(r0)
            return
        L62:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L6a:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk8.i(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

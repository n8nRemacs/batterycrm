package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.util.IdentityHashMap;

@Nullsafe
/* loaded from: classes5.dex */
public class SharedReference<T> {

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    public static final IdentityHashMap f339834d = new IdentityHashMap();

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    @I41.h
    public T f339835a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public int f339836b;

    /* renamed from: c, reason: collision with root package name */
    public final h<T> f339837c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t12, h<T> hVar) {
        t12.getClass();
        this.f339835a = t12;
        hVar.getClass();
        this.f339837c = hVar;
        this.f339836b = 1;
        h<Closeable> hVar2 = a.f339838f;
        IdentityHashMap identityHashMap = f339834d;
        synchronized (identityHashMap) {
            try {
                Integer num = (Integer) identityHashMap.get(t12);
                if (num == null) {
                    identityHashMap.put(t12, 1);
                } else {
                    identityHashMap.put(t12, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L64
            int r0 = r5.f339836b     // Catch: java.lang.Throwable -> L72
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L6c
            if (r0 <= 0) goto L11
            r1 = r2
        L11:
            if (r1 == 0) goto L66
            int r0 = r5.f339836b     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r2
            r5.f339836b = r0     // Catch: java.lang.Throwable -> L64
            monitor-exit(r5)
            if (r0 != 0) goto L63
            monitor-enter(r5)
            T r0 = r5.f339835a     // Catch: java.lang.Throwable -> L60
            r1 = 0
            r5.f339835a = r1     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L63
            com.facebook.common.references.h<T> r1 = r5.f339837c
            r1.a(r0)
            java.util.IdentityHashMap r1 = com.facebook.common.references.SharedReference.f339834d
            monitor-enter(r1)
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L46
            java.lang.String r2 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L44
            uW0.C48986a.m(r2, r3, r0)     // Catch: java.lang.Throwable -> L44
            goto L5c
        L44:
            r0 = move-exception
            goto L5e
        L46:
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> L44
            if (r4 != r2) goto L50
            r1.remove(r0)     // Catch: java.lang.Throwable -> L44
            goto L5c
        L50:
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L44
            int r3 = r3 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L44
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L44
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            goto L63
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r0
        L60:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            throw r0
        L63:
            return
        L64:
            r0 = move-exception
            goto L75
        L66:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L6c:
            com.facebook.common.references.SharedReference$NullReferenceException r0 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch: java.lang.Throwable -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L72:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L64
        L75:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L64
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.references.SharedReference.a():void");
    }

    @I41.h
    public final synchronized T b() {
        return this.f339835a;
    }
}

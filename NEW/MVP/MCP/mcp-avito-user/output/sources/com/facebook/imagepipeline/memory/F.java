package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.InvocationTargetException;
import uW0.C48986a;

/* compiled from: PoolFactory.java */
@J41.c
@Nullsafe
/* loaded from: classes13.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public final E f340435a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public x f340436b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public InterfaceC36387e f340437c;

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public x f340438d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public x f340439e;

    /* renamed from: f, reason: collision with root package name */
    @I41.h
    public A f340440f;

    /* renamed from: g, reason: collision with root package name */
    @I41.h
    public wW0.j f340441g;

    /* renamed from: h, reason: collision with root package name */
    @I41.h
    public t f340442h;

    public F(E e12) {
        this.f340435a = e12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.imagepipeline.memory.InterfaceC36387e a() {
        /*
            r6 = this;
            com.facebook.imagepipeline.memory.e r0 = r6.f340437c
            if (r0 != 0) goto L85
            com.facebook.imagepipeline.memory.E r0 = r6.f340435a
            java.lang.String r1 = r0.f340433i
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L3b;
                case -1106578487: goto L31;
                case -404562712: goto L27;
                case -402149703: goto L1d;
                case 95945896: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = 0
            goto L46
        L1d:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = r5
            goto L46
        L27:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = r4
            goto L46
        L31:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = 4
            goto L46
        L3b:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = r3
            goto L46
        L45:
            r1 = -1
        L46:
            if (r1 == 0) goto L7e
            if (r1 == r5) goto L76
            if (r1 == r4) goto L68
            com.facebook.imagepipeline.memory.B r2 = r0.f340426b
            wW0.d r4 = r0.f340428d
            if (r1 == r3) goto L5c
            com.facebook.imagepipeline.memory.j r1 = new com.facebook.imagepipeline.memory.j
            com.facebook.imagepipeline.memory.G r0 = r0.f340425a
            r1.<init>(r4, r0, r2)
            r6.f340437c = r1
            goto L85
        L5c:
            com.facebook.imagepipeline.memory.j r0 = new com.facebook.imagepipeline.memory.j
            com.facebook.imagepipeline.memory.G r1 = com.facebook.imagepipeline.memory.l.a()
            r0.<init>(r4, r1, r2)
            r6.f340437c = r0
            goto L85
        L68:
            com.facebook.imagepipeline.memory.u r1 = new com.facebook.imagepipeline.memory.u
            com.facebook.imagepipeline.memory.B r2 = com.facebook.imagepipeline.memory.B.a()
            int r0 = r0.f340434j
            r1.<init>(r0, r2)
            r6.f340437c = r1
            goto L85
        L76:
            com.facebook.imagepipeline.memory.q r0 = new com.facebook.imagepipeline.memory.q
            r0.<init>()
            r6.f340437c = r0
            goto L85
        L7e:
            com.facebook.imagepipeline.memory.p r0 = new com.facebook.imagepipeline.memory.p
            r0.<init>()
            r6.f340437c = r0
        L85:
            com.facebook.imagepipeline.memory.e r0 = r6.f340437c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.F.a():com.facebook.imagepipeline.memory.e");
    }

    public final wW0.g b(int i12) {
        x xVar;
        if (this.f340440f == null) {
            E e12 = this.f340435a;
            B b12 = e12.f340430f;
            G g12 = e12.f340429e;
            wW0.d dVar = e12.f340428d;
            if (i12 == 0) {
                if (this.f340439e == null) {
                    try {
                        this.f340439e = (x) NativeMemoryChunkPool.class.getConstructor(wW0.c.class, G.class, H.class).newInstance(dVar, g12, b12);
                    } catch (ClassNotFoundException e13) {
                        C48986a.c("PoolFactory", "", e13);
                        this.f340439e = null;
                    } catch (IllegalAccessException e14) {
                        C48986a.c("PoolFactory", "", e14);
                        this.f340439e = null;
                    } catch (InstantiationException e15) {
                        C48986a.c("PoolFactory", "", e15);
                        this.f340439e = null;
                    } catch (NoSuchMethodException e16) {
                        C48986a.c("PoolFactory", "", e16);
                        this.f340439e = null;
                    } catch (InvocationTargetException e17) {
                        C48986a.c("PoolFactory", "", e17);
                        this.f340439e = null;
                    }
                }
                xVar = this.f340439e;
            } else if (i12 == 1) {
                if (this.f340438d == null) {
                    try {
                        this.f340438d = (x) BufferMemoryChunkPool.class.getConstructor(wW0.c.class, G.class, H.class).newInstance(dVar, g12, b12);
                    } catch (ClassNotFoundException unused) {
                        this.f340438d = null;
                    } catch (IllegalAccessException unused2) {
                        this.f340438d = null;
                    } catch (InstantiationException unused3) {
                        this.f340438d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.f340438d = null;
                    } catch (InvocationTargetException unused5) {
                        this.f340438d = null;
                    }
                }
                xVar = this.f340438d;
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.f340436b == null) {
                    try {
                        this.f340436b = (x) AshmemMemoryChunkPool.class.getConstructor(wW0.c.class, G.class, H.class).newInstance(dVar, g12, b12);
                    } catch (ClassNotFoundException unused6) {
                        this.f340436b = null;
                    } catch (IllegalAccessException unused7) {
                        this.f340436b = null;
                    } catch (InstantiationException unused8) {
                        this.f340436b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.f340436b = null;
                    } catch (InvocationTargetException unused10) {
                        this.f340436b = null;
                    }
                }
                xVar = this.f340436b;
            }
            com.facebook.common.internal.o.c(xVar, "failed to get pool for chunk type: " + i12);
            this.f340440f = new A(xVar, c());
        }
        return this.f340440f;
    }

    public final wW0.j c() {
        if (this.f340441g == null) {
            if (this.f340442h == null) {
                E e12 = this.f340435a;
                this.f340442h = new t(e12.f340428d, e12.f340431g, e12.f340432h);
            }
            this.f340441g = new wW0.j(this.f340442h);
        }
        return this.f340441g;
    }
}

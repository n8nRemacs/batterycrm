package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class v5c {
    public final uy5 a;
    public mf9 b;
    public np0 c;
    public mf9 d;
    public d26 e;
    public mf9 f;
    public py0 g;
    public bj h;
    public dr6 i;

    public v5c(uy5 uy5Var) {
        this.a = uy5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.np0 a() {
        /*
            r8 = this;
            uy5 r0 = r8.a
            java.lang.Object r1 = r0.c
            wha r1 = (defpackage.wha) r1
            java.lang.Object r2 = r0.o
            rf9 r2 = (defpackage.rf9) r2
            np0 r3 = r8.c
            if (r3 != 0) goto L8d
            java.lang.Object r3 = r0.X
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.hashCode()
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r4) {
                case -1868884870: goto L45;
                case -1106578487: goto L3b;
                case -404562712: goto L31;
                case -402149703: goto L27;
                case 95945896: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L4f
        L1d:
            java.lang.String r4 = "dummy"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            r3 = 0
            goto L50
        L27:
            java.lang.String r4 = "dummy_with_tracking"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            r3 = r7
            goto L50
        L31:
            java.lang.String r4 = "experimental"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            r3 = r6
            goto L50
        L3b:
            java.lang.String r4 = "legacy"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            r3 = 4
            goto L50
        L45:
            java.lang.String r4 = "legacy_default_params"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            r3 = r5
            goto L50
        L4f:
            r3 = -1
        L50:
            if (r3 == 0) goto L86
            if (r3 == r7) goto L7e
            if (r3 == r6) goto L70
            if (r3 == r5) goto L64
            hu0 r3 = new hu0
            java.lang.Object r0 = r0.b
            w5c r0 = (defpackage.w5c) r0
            r3.<init>(r2, r0, r1)
            r8.c = r3
            goto L8d
        L64:
            hu0 r0 = new hu0
            w5c r3 = defpackage.jk4.a()
            r0.<init>(r2, r3, r1)
            r8.c = r0
            goto L8d
        L70:
            xk8 r1 = new xk8
            int r0 = r0.a
            wha r2 = defpackage.wha.n()
            r1.<init>(r0, r2)
            r8.c = r1
            goto L8d
        L7e:
            r65 r0 = new r65
            r0.<init>()
            r8.c = r0
            goto L8d
        L86:
            l65 r0 = new l65
            r0.<init>()
            r8.c = r0
        L8d:
            np0 r0 = r8.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5c.a():np0");
    }

    public final py0 b(int i) {
        mf9 mf9Var;
        if (this.g == null) {
            uy5 uy5Var = this.a;
            wha whaVar = (wha) uy5Var.Z;
            w5c w5cVar = (w5c) uy5Var.Y;
            rf9 rf9Var = (rf9) uy5Var.o;
            if (i == 0) {
                if (this.f == null) {
                    try {
                        this.f = (mf9) NativeMemoryChunkPool.class.getConstructor(rf9.class, w5c.class, x5c.class).newInstance(rf9Var, w5cVar, whaVar);
                    } catch (ClassNotFoundException e) {
                        op5.c("PoolFactory", "", e);
                        this.f = null;
                    } catch (IllegalAccessException e2) {
                        op5.c("PoolFactory", "", e2);
                        this.f = null;
                    } catch (InstantiationException e3) {
                        op5.c("PoolFactory", "", e3);
                        this.f = null;
                    } catch (NoSuchMethodException e4) {
                        op5.c("PoolFactory", "", e4);
                        this.f = null;
                    } catch (InvocationTargetException e5) {
                        op5.c("PoolFactory", "", e5);
                        this.f = null;
                    }
                }
                mf9Var = this.f;
            } else if (i == 1) {
                if (this.d == null) {
                    try {
                        this.d = (mf9) BufferMemoryChunkPool.class.getConstructor(rf9.class, w5c.class, x5c.class).newInstance(rf9Var, w5cVar, whaVar);
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                mf9Var = this.d;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.b == null) {
                    try {
                        this.b = (mf9) AshmemMemoryChunkPool.class.getConstructor(rf9.class, w5c.class, x5c.class).newInstance(rf9Var, w5cVar, whaVar);
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                mf9Var = this.b;
            }
            l5j.e(mf9Var, "failed to get pool for chunk type: " + i);
            this.g = new py0(mf9Var, 22, c());
        }
        return this.g;
    }

    public final bj c() {
        if (this.h == null) {
            if (this.i == null) {
                uy5 uy5Var = this.a;
                this.i = new dr6((rf9) uy5Var.o, (w5c) uy5Var.s0, (wha) uy5Var.t0);
            }
            this.h = new bj(this.i);
        }
        return this.h;
    }
}

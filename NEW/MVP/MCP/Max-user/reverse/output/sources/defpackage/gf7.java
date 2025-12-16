package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class gf7 {
    public static gf7 p;
    public static df7 q;
    public final aqc a;
    public final ff7 b;
    public final x6i c;
    public final ux4 d;
    public zk8 e;
    public lo7 f;
    public zk8 g;
    public lo7 h;
    public kn4 i;
    public c6a j;
    public qac k;
    public uac l;
    public ct m;
    public sa9 n;
    public AnimatedFactoryV2Impl o;

    public gf7(ff7 ff7Var) {
        ml6.i();
        ff7Var.getClass();
        this.b = ff7Var;
        pea peaVar = ff7Var.w;
        peaVar.getClass();
        this.a = new aqc(ff7Var.i.d());
        this.c = new x6i(ff7Var.y);
        ml6.i();
        this.d = ff7Var.g;
        peaVar.getClass();
    }

    public static gf7 g() {
        gf7 gf7Var = p;
        l5j.e(gf7Var, "ImagePipelineFactory was not initialized!");
        return gf7Var;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [af] */
    /* JADX WARN: Type inference failed for: r9v0, types: [af] */
    public final fk4 a() {
        AnimatedFactoryV2Impl animatedFactoryV2ImplB = b();
        if (animatedFactoryV2ImplB == null) {
            return null;
        }
        if (animatedFactoryV2ImplB.h == null) {
            final int i = 0;
            ?? r9 = new brf() { // from class: af
                @Override // defpackage.brf
                public final Object get() {
                    int i2;
                    switch (i) {
                        case 0:
                            i2 = 2;
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                    return Integer.valueOf(i2);
                }
            };
            vee hp4Var = animatedFactoryV2ImplB.i;
            if (hp4Var == null) {
                hp4Var = new hp4(animatedFactoryV2ImplB.b.a());
            }
            vee veeVar = hp4Var;
            final int i2 = 1;
            ?? r10 = new brf() { // from class: af
                @Override // defpackage.brf
                public final Object get() {
                    int i22;
                    switch (i2) {
                        case 0:
                            i22 = 2;
                            break;
                        default:
                            i22 = 3;
                            break;
                    }
                    return Integer.valueOf(i22);
                }
            };
            if (animatedFactoryV2ImplB.f == null) {
                animatedFactoryV2ImplB.f = new kce(2, animatedFactoryV2ImplB);
            }
            kce kceVar = animatedFactoryV2ImplB.f;
            if (hqg.b == null) {
                hqg.b = new hqg(new Handler(Looper.getMainLooper()));
            }
            animatedFactoryV2ImplB.h = new fk4(kceVar, hqg.b, veeVar, RealtimeSinceBootClock.get(), animatedFactoryV2ImplB.a, animatedFactoryV2ImplB.c, r9, r10, new lx4(2, Boolean.valueOf(animatedFactoryV2ImplB.k)), new lx4(2, Boolean.valueOf(animatedFactoryV2ImplB.d)), new lx4(2, Integer.valueOf(animatedFactoryV2ImplB.j)), new lx4(2, Integer.valueOf(animatedFactoryV2ImplB.l)));
        }
        return animatedFactoryV2ImplB.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            r2c r2cVarH = h();
            ff7 ff7Var = this.b;
            bk5 bk5Var = ff7Var.i;
            w84 w84VarC = c();
            ff7Var.w.getClass();
            ff7Var.w.getClass();
            ff7Var.w.getClass();
            ff7Var.w.getClass();
            ff7Var.getClass();
            if (!bqi.a) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(r2c.class, bk5.class, w84.class, cls, cls, cls2, cls2, vee.class);
                    Boolean bool = Boolean.FALSE;
                    bqi.b = (AnimatedFactoryV2Impl) constructor.newInstance(r2cVarH, bk5Var, w84VarC, bool, bool, 30, 1000, null);
                } catch (Throwable unused) {
                }
                if (bqi.b != null) {
                    bqi.a = true;
                }
            }
            this.o = bqi.b;
        }
        return this.o;
    }

    public final w84 c() {
        if (this.e == null) {
            ff7 ff7Var = this.b;
            q85 q85Var = ff7Var.z;
            ik4 ik4Var = ff7Var.a;
            vha vhaVar = ff7Var.m;
            uha uhaVar = ff7Var.b;
            ff7Var.w.getClass();
            ff7Var.w.getClass();
            ff7Var.getClass();
            q85Var.getClass();
            zk8 zk8Var = new zk8(new kk4(17), uhaVar, ik4Var);
            vhaVar.getClass();
            this.e = zk8Var;
        }
        return this.e;
    }

    public final lo7 d() {
        if (this.f == null) {
            w84 w84VarC = c();
            be7 be7Var = this.b.j;
            be7Var.getClass();
            this.f = new lo7(w84VarC, new de5(be7Var, 1));
        }
        return this.f;
    }

    public final lo7 e() {
        if (this.h == null) {
            ff7 ff7Var = this.b;
            ff7Var.getClass();
            if (this.g == null) {
                fm4 fm4Var = ff7Var.h;
                vha vhaVar = ff7Var.m;
                zk8 zk8Var = new zk8(new mni(), ff7Var.c, fm4Var);
                vhaVar.getClass();
                this.g = zk8Var;
            }
            zk8 zk8Var2 = this.g;
            be7 be7Var = ff7Var.j;
            be7Var.getClass();
            this.h = new lo7(zk8Var2, new de5(be7Var, 0));
        }
        return this.h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 df7, still in use, count: 3, list:
          (r2v0 df7) from 0x00f9: MOVE (r24v0 df7) = (r2v0 df7)
          (r2v0 df7) from 0x00c9: MOVE (r24v2 df7) = (r2v0 df7)
          (r2v0 df7) from 0x00b5: MOVE (r24v4 df7) = (r2v0 df7)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [ze] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, k18] */
    public final defpackage.df7 f() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf7.f():df7");
    }

    public final r2c h() {
        if (this.m == null) {
            v5c v5cVar = this.b.o;
            i();
            this.m = new ct(v5cVar.a(), this.c);
        }
        return this.m;
    }

    public final s2c i() {
        if (this.n == null) {
            ff7 ff7Var = this.b;
            v5c v5cVar = ff7Var.o;
            ff7Var.w.getClass();
            ff7Var.w.getClass();
            r8j r8jVar = (r8j) ff7Var.w.b;
            np0 np0VarA = v5cVar.a();
            int i = ((w5c) v5cVar.a.d).d;
            e6c e6cVar = new e6c(i);
            for (int i2 = 0; i2 < i; i2++) {
                rw0 rw0Var = eh4.a;
                e6cVar.b(ByteBuffer.allocate(16384));
            }
            sa9 sa9Var = new sa9();
            sa9Var.b = new PreverificationHelper();
            sa9Var.a = np0VarA;
            if (np0VarA instanceof l65) {
                r8jVar.getClass();
            }
            sa9Var.c = e6cVar;
            this.n = sa9Var;
        }
        return this.n;
    }
}

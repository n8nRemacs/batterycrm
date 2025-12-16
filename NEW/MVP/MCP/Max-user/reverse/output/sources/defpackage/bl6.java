package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class bl6 extends t2f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bl6(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                pe8 pe8Var = ((z7c) w5Var.c(32)).a;
                atomicBoolean.set(((Boolean) pe8Var.H0.D(pe8Var, pe8.U0[21])).booleanValue());
                Context context = (Context) w5Var.c(12);
                ff7 ff7Var = (ff7) w5Var.c(558);
                g4b g4bVar = (g4b) w5Var.c(56);
                final AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                List<v35> listSingletonList = Collections.singletonList(new zc8());
                hl6 hl6Var = new hl6();
                op5.a = new el6();
                op5.a.i(atomicBoolean2.get() ? 2 : 6);
                ml6.a = new u1j(20);
                vl3 vl3Var = new vl3();
                ka5 ka5Var = new ka5();
                ka5Var.b = new brf() { // from class: fl6
                    @Override // defpackage.brf
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean2.get());
                    }
                };
                ka5Var.c = vl3Var;
                for (v35 v35Var : listSingletonList) {
                    if (((ArrayList) ka5Var.a) == null) {
                        ka5Var.a = new ArrayList();
                    }
                    ((ArrayList) ka5Var.a).add(v35Var);
                }
                te8 te8Var = new te8();
                ArrayList arrayList = (ArrayList) ka5Var.a;
                te8Var.a = arrayList != null ? new sz(arrayList) : null;
                brf lx4Var = (fl6) ka5Var.b;
                if (lx4Var == null) {
                    lx4Var = new lx4(2, Boolean.FALSE);
                }
                te8Var.c = lx4Var;
                te8Var.b = (vl3) ka5Var.c;
                ml6.i();
                boolean z = true;
                if (!zk6.b) {
                    zk6.b = true;
                } else if (op5.a.h(5)) {
                    op5.a.w(zk6.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
                }
                synchronized (nca.class) {
                    if (nca.a == null) {
                        z = false;
                    }
                }
                if (!z) {
                    ml6.i();
                    try {
                        try {
                            try {
                                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                            } catch (ClassNotFoundException unused) {
                                nca.a(new nwf());
                            } catch (NoSuchMethodException unused2) {
                                nca.a(new nwf());
                            }
                        } catch (IllegalAccessException unused3) {
                            nca.a(new nwf());
                        } catch (InvocationTargetException unused4) {
                            nca.a(new nwf());
                        }
                        ml6.i();
                    } catch (Throwable th) {
                        ml6.i();
                        throw th;
                    }
                }
                Context applicationContext = context.getApplicationContext();
                synchronized (gf7.class) {
                    try {
                        if (gf7.p != null && op5.a.h(5)) {
                            op5.a.w(gf7.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                        }
                        gf7.p = new gf7(ff7Var);
                    } finally {
                    }
                }
                ml6.i();
                cf7 cf7Var = new cf7(applicationContext, te8Var);
                zk6.a = cf7Var;
                SimpleDraweeView.v0 = cf7Var;
                ml6.i();
                ml6.i();
                gf7 gf7VarG = gf7.g();
                Resources resources = context.getResources();
                fs4 fs4VarE = fs4.e();
                fk4 fk4VarA = gf7VarG.a();
                gf7VarG.b.w.getClass();
                gl6 gl6Var = new gl6(g4bVar.a());
                lo7 lo7VarD = gf7VarG.d();
                sz szVar = (sz) te8Var.a;
                brf brfVar = new brf() { // from class: fl6
                    @Override // defpackage.brf
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean2.get());
                    }
                };
                vl3Var.a = resources;
                vl3Var.b = fs4VarE;
                vl3Var.c = fk4VarA;
                vl3Var.d = gl6Var;
                vl3Var.o = lo7VarD;
                vl3Var.X = szVar;
                vl3Var.Y = brfVar;
                return hl6Var;
            case 1:
                return new pp0((hfd) this.c, w5Var.d(582), w5Var.d(583));
            default:
                return new pe8((uv4) ((bwf) this.c).getValue(), (bx5) w5Var.c(71), (Context) w5Var.c(12));
        }
    }
}

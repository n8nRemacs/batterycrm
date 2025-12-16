package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class vm8 implements frf, tm6, uu1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ vm8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.o = obj5;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        em6 em6Var = (em6) this.a;
        dg0 dg0Var = (dg0) this.b;
        sm6 sm6Var = (sm6) this.c;
        j0e j0eVar = (j0e) this.d;
        em6 em6Var2 = (em6) this.o;
        kw6 kw6Var = new kw6();
        kw6Var.a = em6Var;
        kw6Var.b = dg0Var;
        kw6Var.c = sm6Var;
        kw6Var.d = j0eVar;
        kw6Var.o = em6Var2;
        return ((vqa) obj).h(kw6Var, Integer.MAX_VALUE);
    }

    @Override // defpackage.frf
    public Object get() {
        ve2 ve2Var = (ve2) this.a;
        qv3 qv3Var = (qv3) this.b;
        v04 v04Var = (v04) this.c;
        o7e o7eVar = (o7e) this.d;
        String[] strArr = (String[]) ((l5c) ((age) this.o)).m.getValue();
        i7e i7eVar = new i7e(ve2Var, qv3Var, v04Var, o7eVar);
        j7e j7eVar = null;
        if (strArr != null) {
            if (strArr.length == 0) {
                strArr = null;
            }
            if (strArr != null) {
                j7eVar = new j7e(strArr, ve2Var, o7eVar);
            }
        }
        return new h7e(ve2Var, qv3Var, o7eVar, i7eVar, j7eVar);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        Surface surface;
        tz4 tz4Var = (tz4) this.a;
        msf msfVar = (msf) this.b;
        f9g f9gVar = (f9g) this.c;
        gc0 gc0Var = (gc0) this.d;
        sa0 sa0Var = (sa0) this.o;
        u75 u75Var = msfVar.c;
        dc0 dc0VarB = e2h.b(sa0Var, u75Var, gc0Var);
        fc0 fc0Var = sa0Var.a;
        Size size = msfVar.b;
        Range range = msfVar.d;
        String str = dc0VarB.a;
        z90 z90Var = dc0VarB.c;
        bc0 bc0Var = (bc0) (z90Var != null ? new qs3(str, f9gVar, fc0Var, size, z90Var, u75Var, range) : new e3h(str, f9gVar, fc0Var, size, u75Var, range)).get();
        try {
            ycd ycdVar = (ycd) tz4Var.e;
            Executor executor = (Executor) tz4Var.c;
            ycdVar.getClass();
            bf5 bf5Var = new bf5(executor, bc0Var);
            tz4Var.f = bf5Var;
            ge5 ge5Var = bf5Var.f;
            if (ge5Var instanceof ze5) {
                ze5 ze5Var = (ze5) ge5Var;
                Executor executor2 = (Executor) tz4Var.d;
                r2h r2hVar = new r2h(tz4Var, tu1Var, msfVar, 1);
                synchronized (ze5Var.a) {
                    ze5Var.d = r2hVar;
                    executor2.getClass();
                    ze5Var.o = executor2;
                    surface = ze5Var.b;
                }
                if (surface != null) {
                    try {
                        executor2.execute(new kr4(r2hVar, 24, surface));
                    } catch (RejectedExecutionException e) {
                        gri.c(ze5Var.X.a, "Unable to post to the supplied executor.", e);
                    }
                }
            } else {
                tu1Var.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e2) {
            gri.c("VideoEncoderSession", "Unable to initialize video encoder.", e2);
            tu1Var.d(e2);
        }
        return "ConfigureVideoEncoderFuture " + tz4Var;
    }
}

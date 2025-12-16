package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sj8 extends xfh {
    public static final /* synthetic */ yy7[] u0;
    public final tcf X;
    public final LinkedBlockingQueue Y;
    public final tcf Z;
    public final l6b b;
    public final lzf c;
    public final bwf d = new bwf(new bj8(this, 0));
    public final LinkedBlockingQueue o = new LinkedBlockingQueue(1);
    public final t9f s0;
    public su7 t0;

    static {
        z8a z8aVar = new z8a(sj8.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        u0 = new yy7[]{z8aVar};
    }

    public sj8(l6b l6bVar, lzf lzfVar) {
        this.b = l6bVar;
        this.c = lzfVar;
        hd5 hd5Var = hd5.a;
        this.X = ucf.a(hd5Var);
        this.Y = new LinkedBlockingQueue(1);
        this.Z = ucf.a(hd5Var);
        this.s0 = c7j.c();
        rt7 rt7VarA = eoi.a();
        rt7VarA.D();
        this.t0 = rt7VarA;
        xfh.o(this, ((q2b) lzfVar).b(), new gj8(this, null), 2);
        u();
    }

    public final m11 t() {
        List listAsList;
        l6b l6bVar = this.b;
        int iV = az1.v(l6bVar.g);
        if (iV == 0) {
            Object[] objArrListFiles = l6bVar.i.f().toFile().listFiles();
            if (objArrListFiles == null) {
                objArrListFiles = new File[0];
            }
            vs6 vs6Var = new vs6(12);
            if (objArrListFiles.length != 0) {
                objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                if (objArrListFiles.length > 1) {
                    Arrays.sort(objArrListFiles, vs6Var);
                }
            }
            listAsList = Arrays.asList(objArrListFiles);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArrListFiles2 = ((Path) ((bwf) l6bVar.j.b).getValue()).toFile().listFiles();
            vs6 vs6Var2 = new vs6(13);
            if (objArrListFiles2.length != 0) {
                objArrListFiles2 = Arrays.copyOf(objArrListFiles2, objArrListFiles2.length);
                if (objArrListFiles2.length > 1) {
                    Arrays.sort(objArrListFiles2, vs6Var2);
                }
            }
            listAsList = Arrays.asList(objArrListFiles2);
        }
        return new m11(15, new m11(14, new m11(11, listAsList)));
    }

    public final void u() {
        if (this.t0.isCompleted()) {
            qt7 qt7Var = (qt7) this.s0.D(this, u0[0]);
            lzf lzfVar = this.c;
            ContextScope contextScope = this.a;
            this.t0 = (qt7Var == null || !qt7Var.isActive()) ? svi.e(contextScope, ((q2b) lzfVar).b(), null, new nj8(this, null), 2) : svi.e(contextScope, ((q2b) lzfVar).b(), null, new mj8(this, null), 2);
        }
    }
}

package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class hkf extends xfh {
    public static final /* synthetic */ yy7[] A0 = {new z8a(hkf.class, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, hkf.class, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;"), new z8a(hkf.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final ghf b;
    public final long c;
    public final Context d;
    public final lzf o;
    public final t9f s0 = c7j.c();
    public final t9f t0 = c7j.c();
    public final t9f u0 = c7j.c();
    public final tcf v0;
    public final hbd w0;
    public final hbd x0;
    public final ci5 y0;
    public final bwf z0;

    public hkf(ghf ghfVar, long j, Context context, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        x26 mwdVar;
        x26 x26VarA;
        this.b = ghfVar;
        this.c = j;
        this.d = context;
        this.o = lzfVar;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = k18Var4;
        tcf tcfVarA = ucf.a(hd5.a);
        this.v0 = tcfVarA;
        this.w0 = new hbd(tcfVarA);
        ghf ghfVar2 = ghf.d;
        if (ghfVar != ghfVar2 || j == -1) {
            mwdVar = new mwd(new bkf(new sjf(ghfVar == ghf.b ? new n5g(vdb.q) : new n5g(vdb.e), null, null, t(false)), null));
        } else {
            su1 su1VarA = s8j.a(((igf) k18Var5.getValue()).a(j));
            nm0 nm0Var = ((vr5) k18Var4.getValue()).Y;
            t00 t00Var = new t00(j, 5);
            nm0Var.getClass();
            int i = 3;
            mwdVar = new uxb(new z41(su1VarA, s8j.a(new ora(nm0Var, t00Var, i)), akf.Z, i), this, 20);
        }
        q2b q2bVar = (q2b) lzfVar;
        this.x0 = gw0.C(gw0.u(mwdVar, q2bVar.b()), this.a, yve.a, null);
        this.y0 = new ci5(0);
        this.z0 = new bwf(new prd(25, this));
        if (ghfVar == ghfVar2 && j == -1) {
            String name = hkf.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "Try load stickers from stickerSet by invalid id: -1", null);
                }
            }
            x26VarA = fd5.a;
        } else {
            int iOrdinal = ghfVar.ordinal();
            if (iOrdinal == 0) {
                x26VarA = s8j.a(((tef) k18Var.getValue()).a());
            } else if (iOrdinal == 1) {
                x26VarA = s8j.a(((ps5) k18Var3.getValue()).a());
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                x26VarA = new p23(s8j.a(((igf) k18Var5.getValue()).a(j)), 4);
            }
        }
        gw0.w(gw0.u(new g56(x26VarA, new bzb(2, this, hkf.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 24), 1), q2bVar.b()), this.a);
    }

    public final o98 t(boolean z) {
        o98 o98VarD = ve3.d();
        ghf ghfVar = ghf.d;
        ghf ghfVar2 = this.b;
        if (ghfVar2 != ghfVar) {
            o98VarD.add(new b44(udb.u, new n5g(vdb.z), Integer.valueOf(yud.G), Integer.valueOf(w9b.R), 4));
        } else {
            o98VarD.add(new b44(udb.i, new n5g(vdb.f), Integer.valueOf(yud.u), Integer.valueOf(w9b.R), 4));
            if (z) {
                o98VarD.add(new b44(udb.j, new n5g(vdb.m), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q)));
            }
        }
        int iOrdinal = ghfVar2.ordinal();
        Integer numValueOf = iOrdinal != 0 ? iOrdinal != 1 ? null : Integer.valueOf(udb.t) : Integer.valueOf(udb.w);
        if (numValueOf != null) {
            o98VarD.add(new b44(numValueOf.intValue(), new n5g(vdb.D), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q)));
        }
        return ve3.a(o98VarD);
    }

    public final o6a u() {
        return (o6a) this.z0.getValue();
    }

    public final String v(int i) {
        return this.d.getResources().getQuantityString(vab.a, i, Integer.valueOf(i));
    }
}

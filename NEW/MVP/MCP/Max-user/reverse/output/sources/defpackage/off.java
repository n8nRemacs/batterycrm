package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class off extends xfh {
    public static final /* synthetic */ yy7[] F0 = {new z8a(off.class, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, off.class, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;")};
    public final hbd A0;
    public final t9f B0;
    public final t9f C0;
    public x9f D0;
    public x9f E0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final lzf c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final ci5 t0 = new ci5(0);
    public final ci5 u0 = new ci5(0);
    public final tcf v0;
    public final hbd w0;
    public final tcf x0;
    public final hbd y0;
    public final tcf z0;

    public off(long j, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.b = j;
        this.c = lzfVar;
        this.d = k18Var;
        this.o = k18Var2;
        this.X = k18Var3;
        this.Y = k18Var4;
        this.Z = k18Var5;
        this.s0 = k18Var6;
        tcf tcfVarA = ucf.a(null);
        this.v0 = tcfVarA;
        this.w0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a("");
        this.x0 = tcfVarA2;
        this.y0 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(null);
        this.z0 = tcfVarA3;
        this.A0 = new hbd(tcfVarA3);
        this.B0 = c7j.c();
        this.C0 = c7j.c();
    }

    public static final sye t(off offVar, Throwable th) {
        n5g n5gVar;
        s5g r5gVar;
        if (th instanceof TamErrorException) {
            pzf pzfVar = ((TamErrorException) th).a;
            String str = pzfVar != null ? pzfVar.d : null;
            if (str != null && str.length() != 0) {
                String str2 = pzfVar != null ? pzfVar.d : null;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                r5gVar = new r5g(str2);
                return new sye(ivd.a1, r5gVar);
            }
            n5gVar = new n5g(mvd.E);
        } else {
            n5gVar = new n5g(mvd.E);
        }
        r5gVar = n5gVar;
        return new sye(ivd.a1, r5gVar);
    }

    public static fff v(jef jefVar, boolean z, Long l) {
        String str = jefVar.Z;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = jefVar.d;
        }
        String str2 = str;
        boolean z2 = l.longValue() == jefVar.a;
        long j = jefVar.a;
        long j2 = jefVar.u0;
        return new fff(j, j2, j2, str2, jefVar.v0, jefVar.y0, jefVar.b, jefVar.c, z, z2, 0L, 4672);
    }

    public final void u(Long l) {
        fff fffVar = (fff) this.v0.getValue();
        if (fffVar != null) {
            long j = fffVar.b;
            if (j != 0) {
                su1 su1VarA = s8j.a(((igf) this.o.getValue()).a(j));
                nm0 nm0Var = ((vr5) this.Y.getValue()).Y;
                t00 t00Var = new t00(j, 5);
                nm0Var.getClass();
                gw0.w(gw0.u(new g56(new z41(su1VarA, s8j.a(new ora(nm0Var, t00Var, 3)), jff.Z, 3), new kff(this, l, null), 1), ((q2b) this.c).b()), this.a);
                return;
            }
        }
        wqi.c(off.class.getName(), "Can't load sticker set because we haven't selected sticker or setId", new Object[0]);
    }

    public final void w(long j) {
        fff fffVar = (fff) this.w0.a.getValue();
        if (fffVar == null || fffVar.a != j) {
            x9f x9fVarD = svi.d(this.a, ((q2b) this.c).b(), i84.b, new lff(this, j, null));
            this.B0.O(this, F0[0], x9fVarD);
        }
    }
}

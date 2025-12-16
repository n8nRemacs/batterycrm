package defpackage;

/* loaded from: classes2.dex */
public final class rec extends xfh {
    public static final /* synthetic */ yy7[] E0 = {new z8a(rec.class, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, rec.class, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;")};
    public final ci5 A0;
    public final t9f B0;
    public final t9f C0;
    public final hbd D0;
    public final l24 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final long c;
    public final hec d;
    public final w63 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final tcf w0;
    public final tcf x0;
    public final boolean y0;
    public final ci5 z0;

    public rec(long j, long j2, hec hecVar, w63 w63Var, l24 l24Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.b = j;
        this.c = j2;
        this.d = hecVar;
        this.o = w63Var;
        this.X = l24Var;
        this.Y = k18Var;
        this.Z = k18Var3;
        this.s0 = k18Var2;
        this.t0 = k18Var4;
        this.u0 = k18Var5;
        this.v0 = k18Var6;
        tcf tcfVarA = ucf.a(null);
        this.w0 = tcfVarA;
        this.x0 = ucf.a(null);
        this.y0 = hecVar == hec.b;
        this.z0 = new ci5(0);
        this.A0 = new ci5(0);
        this.B0 = c7j.c();
        this.C0 = c7j.c();
        gw0.w(gw0.u(new g56(new d53(new mwd(new qec(new z41(new d53(w63Var.j(j), 12), new d53(l24Var.c(j2), 12), iec.Z, 3), null, this)), 8), new jec(this, null), 1), ((q2b) ((lzf) k18Var3.getValue())).a()), this.a);
        this.D0 = gw0.C(gw0.u(gw0.m(new uxb(new d53(tcfVarA, 12), this, 5)), ((q2b) ((lzf) k18Var3.getValue())).a()), this.a, yve.a, new kec());
    }

    public static final fec t(rec recVar, pb2 pb2Var, ku3 ku3Var, boolean z) {
        eec eecVar;
        eec eecVar2;
        eec eecVar3;
        eec eecVar4;
        eec eecVar5;
        eec eecVar6;
        eec eecVar7;
        eec eecVar8;
        boolean z2 = ku3Var.p() == pb2Var.b.d;
        long jS = ((w4e) ((pb3) recVar.v0.getValue())).s();
        boolean zI0 = pb2Var.i0();
        boolean z3 = jS == ku3Var.p();
        boolean zD = pb2Var.M() ? ppi.d(pb2Var.g(ku3Var.p()), 256) : ppi.d(pb2Var.g(ku3Var.p()), 1);
        boolean zD2 = pb2Var.M() ? ppi.d(pb2Var.g(jS), 256) : pb2Var.A();
        boolean zD3 = pb2Var.M() ? ppi.d(pb2Var.g(ku3Var.p()), 512) : ppi.d(pb2Var.g(ku3Var.p()), 1);
        boolean zD4 = pb2Var.M() ? ppi.d(pb2Var.g(jS), 512) : pb2Var.A();
        boolean zD5 = pb2Var.M() ? ppi.d(pb2Var.g(ku3Var.p()), 1024) : ppi.d(pb2Var.g(ku3Var.p()), 1);
        boolean zD6 = pb2Var.M() ? ppi.d(pb2Var.g(jS), 1024) : pb2Var.A();
        boolean zD7 = ppi.d(pb2Var.g(ku3Var.p()), 16);
        boolean z4 = pb2Var.z();
        boolean z5 = z2;
        boolean zD8 = ppi.d(pb2Var.g(ku3Var.p()), 8);
        boolean zW = pb2Var.w();
        boolean zD9 = ppi.d(pb2Var.g(ku3Var.p()), 2);
        boolean zD10 = ppi.d(pb2Var.g(jS), 2);
        boolean zD11 = ppi.d(pb2Var.g(ku3Var.p()), 4);
        boolean zU = pb2Var.u();
        boolean z6 = z3;
        boolean z7 = zD;
        Long lE = pb2Var.e(ku3Var.p());
        boolean z8 = (lE != null && lE.longValue() == jS && zU) || zI0;
        boolean zD12 = ppi.d(pb2Var.g(ku3Var.p()), 2048);
        boolean zD13 = ppi.d(pb2Var.g(jS), 2048);
        if (zI0 && z) {
            eecVar4 = new eec(true, true);
            eecVar5 = eecVar4;
            eecVar6 = eecVar5;
            eecVar7 = eecVar6;
            eecVar8 = eecVar7;
            eecVar3 = eecVar8;
            eecVar2 = eecVar3;
            eecVar = new eec(false, true);
        } else if (z) {
            eec eecVar9 = new eec(zD2, zD2);
            eec eecVar10 = new eec(zD4, zD4);
            eec eecVar11 = new eec(zD6, zD6);
            eec eecVar12 = new eec(z4, z4);
            eec eecVar13 = new eec(zW, zW);
            eec eecVar14 = new eec(zD10, zD10);
            eecVar = new eec(false, true);
            eecVar4 = eecVar9;
            eecVar5 = eecVar10;
            eecVar3 = eecVar14;
            eecVar6 = eecVar11;
            eecVar7 = eecVar12;
            eecVar8 = eecVar13;
            eecVar2 = new eec(zD12, zD13);
        } else if (z6) {
            eec eecVar15 = new eec(zD2, false);
            eec eecVar16 = new eec(zD4, false);
            eec eecVar17 = new eec(zD6, false);
            eec eecVar18 = new eec(z4, false);
            eec eecVar19 = new eec(zW, false);
            eec eecVar20 = new eec(zD10, false);
            eecVar = new eec(zU, false);
            eecVar4 = eecVar15;
            eecVar2 = new eec(zD12, false);
            eecVar3 = eecVar20;
            eecVar5 = eecVar16;
            eecVar6 = eecVar17;
            eecVar7 = eecVar18;
            eecVar8 = eecVar19;
        } else if (z5) {
            eecVar4 = new eec(true, false);
            eecVar5 = eecVar4;
            eecVar6 = eecVar5;
            eecVar7 = eecVar6;
            eecVar8 = eecVar7;
            eecVar3 = eecVar8;
            eecVar = eecVar3;
            eecVar2 = eecVar;
        } else {
            eec eecVar21 = new eec(z7, zD2 && z8);
            eec eecVar22 = new eec(zD3, zD4 && z8);
            eec eecVar23 = new eec(zD5, zD6 && z8);
            eec eecVar24 = new eec(zD7, z4 && z8);
            eec eecVar25 = new eec(zD8, zW && z8);
            eec eecVar26 = new eec(zD9, zD10 && z8);
            eecVar = new eec(zD11, zU && z8);
            eecVar2 = new eec(zD12, zD13 && z8);
            eecVar3 = eecVar26;
            eecVar4 = eecVar21;
            eecVar5 = eecVar22;
            eecVar6 = eecVar23;
            eecVar7 = eecVar24;
            eecVar8 = eecVar25;
        }
        return new fec(!z && pb2Var.N() && ppi.d(pb2Var.g(ku3Var.p()), 128), eecVar4, eecVar5, eecVar6, eecVar7, eecVar8, eecVar3, eecVar, eecVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        fec fecVar;
        Object value = this.x0.getValue();
        tcf tcfVar = this.w0;
        if ((!fni.a(value, tcfVar.getValue()) || this.d == hec.b) && (fecVar = (fec) tcfVar.getValue()) != null) {
            eec eecVar = fecVar.d;
            pb2 pb2Var = (pb2) this.o.j(this.b).a.getValue();
            if (pb2Var != null) {
                long j = pb2Var.b.a;
                pb2 pb2VarV = v();
                boolean zM = pb2VarV != null ? pb2VarV.M() : false;
                boolean z = zM ? 0 : eecVar.a;
                boolean z2 = fecVar.g.a;
                boolean z3 = fecVar.h.a;
                boolean z4 = fecVar.f.a;
                boolean z5 = fecVar.e.a;
                boolean z6 = fecVar.a;
                boolean z7 = zM ? fecVar.b.a : false;
                boolean z8 = zM ? fecVar.c.a : false;
                boolean z9 = zM ? eecVar.a : false;
                boolean z10 = zM ? fecVar.i.a : false;
                if (z2) {
                    z = (z ? 1 : 0) | 2;
                }
                if (z3) {
                    z = (z ? 1 : 0) | 4;
                }
                if (z4) {
                    z = (z ? 1 : 0) | '\b';
                }
                if (z5) {
                    z = (z ? 1 : 0) | 16;
                }
                int i = z | 32;
                if (!zM) {
                    i = z | 96;
                }
                if (z6) {
                    i |= 128;
                }
                if (z7) {
                    i |= 256;
                }
                if (z8) {
                    i |= 512;
                }
                if (z9) {
                    i |= 1024;
                }
                if (z10) {
                    i |= 2048;
                }
                if (i == 0) {
                    i = -1;
                }
                svi.e(this.a, ((q2b) ((lzf) this.Z.getValue())).b(), null, new lec(this, j, i, null), 2);
            }
        }
    }

    public final pb2 v() {
        return (pb2) this.o.j(this.b).a.getValue();
    }

    public final ku3 w() {
        return (ku3) this.X.c(this.c).a.getValue();
    }

    public final void x(long j, boolean z) {
        eec eecVar;
        String strS;
        p5g p5gVar;
        long j2 = r8b.C;
        ci5 ci5Var = this.A0;
        if (j != j2) {
            if (j != r8b.L) {
                if (z) {
                    y();
                    return;
                }
                return;
            }
            tcf tcfVar = this.w0;
            fec fecVar = (fec) tcfVar.getValue();
            boolean z2 = (fecVar == null || (eecVar = fecVar.g) == null || !eecVar.a) ? false : true;
            if (((fec) tcfVar.getValue()) == null || z2) {
                return;
            }
            xfh.r(ci5Var, new bec(new n5g(u8b.G0), null));
            return;
        }
        pb2 pb2VarV = v();
        n5g n5gVar = (pb2VarV == null || !pb2VarV.M()) ? new n5g(u8b.K0) : new n5g(u8b.K0);
        pb2 pb2VarV2 = v();
        if (pb2VarV2 == null || !pb2VarV2.M()) {
            int i = u8b.I0;
            pb2 pb2VarV3 = v();
            strS = pb2VarV3 != null ? pb2VarV3.s() : null;
            p5gVar = new p5g(i, ys.D(new Object[]{strS != null ? strS : ""}));
        } else {
            int i2 = u8b.c1;
            ku3 ku3VarW = w();
            String strE = ku3VarW != null ? ku3VarW.e() : null;
            if (strE == null) {
                strE = "";
            }
            pb2 pb2VarV4 = v();
            strS = pb2VarV4 != null ? pb2VarV4.s() : null;
            p5gVar = new p5g(i2, ys.D(new Object[]{strE, strS != null ? strS : ""}));
        }
        xfh.r(ci5Var, new aec(n5gVar, p5gVar, ve3.j(new pq3(r8b.G, new n5g(u8b.H0), 4, 56), new pq3(r8b.F, new n5g(mvd.p), 2, 56))));
    }

    public final void y() {
        x9f x9fVarD = svi.d(this.a, ((q2b) ((lzf) this.Z.getValue())).a(), i84.b, new nec(this, null));
        this.C0.O(this, E0[1], x9fVarD);
    }

    public final void z() {
        if (fni.a(this.x0.getValue(), this.w0.getValue())) {
            xfh.r(this.z0, jc3.b);
        } else {
            xfh.r(this.A0, new aec(new n5g(u8b.P), null, ve3.j(new pq3(r8b.c0, new n5g(u8b.Q), 3, 56), new pq3(r8b.b0, new n5g(u8b.O), 2, 56))));
        }
    }
}

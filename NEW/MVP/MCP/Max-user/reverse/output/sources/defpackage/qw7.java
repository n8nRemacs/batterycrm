package defpackage;

/* loaded from: classes.dex */
public final class qw7 extends uoi {
    public final ggg a;
    public final kc3 b;

    public qw7(ggg gggVar, ew7 ew7Var) {
        this.a = gggVar;
        this.b = ew7Var.b;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final short A() {
        upg upgVar;
        ggg gggVar = this.a;
        String strB = gggVar.B();
        try {
            kpg kpgVarC = lni.c(strB);
            if (kpgVarC != null) {
                int i = kpgVarC.a;
                upgVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new upg((short) i);
            }
            if (upgVar != null) {
                return upgVar.a;
            }
            cnf.g(strB);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'UShort' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yl3
    public final int e(ree reeVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final int k() {
        ggg gggVar = this.a;
        String strB = gggVar.B();
        try {
            kpg kpgVarC = lni.c(strB);
            if (kpgVarC != null) {
                return kpgVarC.a;
            }
            cnf.g(strB);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'UInt' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yl3
    public final kc3 n() {
        return this.b;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final long t() {
        ggg gggVar = this.a;
        String strB = gggVar.B();
        try {
            ppg ppgVarD = lni.d(strB);
            if (ppgVarD != null) {
                return ppgVarD.a;
            }
            cnf.g(strB);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'ULong' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final byte z() {
        fpg fpgVar;
        ggg gggVar = this.a;
        String strB = gggVar.B();
        try {
            kpg kpgVarC = lni.c(strB);
            if (kpgVarC != null) {
                int i = kpgVarC.a;
                fpgVar = Integer.compareUnsigned(i, 255) > 0 ? null : new fpg((byte) i);
            }
            if (fpgVar != null) {
                return fpgVar.a;
            }
            cnf.g(strB);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'UByte' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }
}

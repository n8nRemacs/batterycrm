package defpackage;

/* loaded from: classes2.dex */
public final class xub extends hz {
    public final bwf c;
    public rx d;

    public xub(w10 w10Var, bwf bwfVar) {
        super(w10Var);
        this.c = bwfVar;
    }

    @Override // defpackage.hz
    public final vqa b() {
        vqa vqaVarB = super.b();
        if (vqaVarB != null) {
            return vqaVarB;
        }
        uid uidVar = new uid();
        rx rxVar = this.d;
        uidVar.a = rxVar;
        if (rxVar != null) {
            return rxVar;
        }
        rx rxVar2 = new rx();
        this.d = rxVar2;
        uidVar.a = rxVar2;
        ((ye7) this.c.getValue()).a(this.a.b.a(), new vhb(this, uidVar, false, 2));
        return (vqa) uidVar.a;
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class gra extends k3 {
    public final /* synthetic */ int b;
    public final tm6 c;
    public final int d;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gra(vqa vqaVar, tm6 tm6Var, int i, int i2, int i3) {
        super(vqaVar);
        this.b = i3;
        switch (i3) {
            case 1:
                super(vqaVar);
                this.c = tm6Var;
                this.d = i;
                this.o = i2;
                break;
            default:
                this.c = tm6Var;
                this.o = i2;
                this.d = Math.max(8, i);
                break;
        }
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                lta ltaVar = this.a;
                tm6 tm6Var = this.c;
                if (!czi.b(ltaVar, vtaVar, tm6Var)) {
                    int i = this.d;
                    int i2 = this.o;
                    if (i2 != 1) {
                        ltaVar.a(new era(vtaVar, tm6Var, i, i2 == 3));
                        break;
                    } else {
                        ltaVar.a(new fra(new yee(vtaVar), tm6Var, i));
                        break;
                    }
                }
                break;
            default:
                lta ltaVar2 = this.a;
                tm6 tm6Var2 = this.c;
                if (!czi.b(ltaVar2, vtaVar, tm6Var2)) {
                    ltaVar2.a(new bsa(vtaVar, tm6Var2, this.d, this.o));
                    break;
                }
                break;
        }
    }
}

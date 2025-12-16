package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jw4 implements lud {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw4 b;

    public /* synthetic */ jw4(kw4 kw4Var, int i) {
        this.a = i;
        this.b = kw4Var;
    }

    @Override // defpackage.lud
    public void a(gud gudVar, rud rudVar) {
        ctg ctgVar = (ctg) rudVar;
        switch (this.a) {
            case 0:
                if (!ctgVar.a.isEmpty()) {
                    kw4 kw4Var = this.b;
                    kw4Var.a.log("DisplayLayouts", "Resend next time after response with errors");
                    kw4Var.e = true;
                    break;
                }
                break;
            default:
                this.b.a.log("DisplayLayouts", "Stop stream on participant removed response: " + ctgVar);
                break;
        }
    }

    public void b(gud gudVar, Throwable th) {
        switch (this.a) {
            case 1:
                kw4 kw4Var = this.b;
                kw4Var.a.log("DisplayLayouts", "Resend next time after error");
                kw4Var.e = true;
                break;
            default:
                this.b.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                break;
        }
    }
}

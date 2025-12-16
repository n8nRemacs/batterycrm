package defpackage;

/* loaded from: classes.dex */
public final class vu1 extends k4 {
    public final /* synthetic */ wu1 Z;

    public vu1(wu1 wu1Var) {
        this.Z = wu1Var;
    }

    @Override // defpackage.k4
    public final String j() {
        tu1 tu1Var = (tu1) this.Z.a.get();
        if (tu1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + tu1Var.a + "]";
    }
}

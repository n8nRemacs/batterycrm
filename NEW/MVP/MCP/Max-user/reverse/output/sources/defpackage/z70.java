package defpackage;

/* loaded from: classes2.dex */
public final class z70 {
    public final k18 a;
    public final k18 b;

    public z70(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final Object a(String str, int i, dtf dtfVar) {
        String str2;
        ((dd) this.a.getValue()).e("ACTION_AUTH_GET_CODE");
        m1g m1gVar = (m1g) ((exa) this.b.getValue()).a.getValue();
        wua wuaVar = new wua(xhb.v0, 16);
        wuaVar.x("phone", str);
        if (i == 1) {
            str2 = "START_AUTH";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "RESEND";
        }
        wuaVar.x("type", str2);
        return m1gVar.e(wuaVar, dtfVar);
    }
}

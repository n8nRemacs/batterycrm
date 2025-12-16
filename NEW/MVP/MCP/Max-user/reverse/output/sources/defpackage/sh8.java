package defpackage;

import ru.ok.tamtam.errors.ProtoStateException;

/* loaded from: classes2.dex */
public final class sh8 {
    public final di8 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;

    public sh8(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, di8 di8Var) {
        this.a = di8Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        this.g = k18Var6;
    }

    public final void a(pzf pzfVar, byte[] bArr) {
        wqi.f("sh8", "onLoginFail", pzfVar);
        if ("login.blocked".equals(pzfVar.b) || "login.flood".equals(pzfVar.b) || "login.token".equals(pzfVar.b)) {
            di8 di8Var = this.a;
            bi8 bi8Var = bi8.LOGIN_BACK_BLOCKED;
            di8Var.getClass();
            di8.o(bi8Var);
            pe8 pe8Var = ((z7c) this.b.getValue()).a;
            pe8Var.t0.O(pe8Var, pe8.U0[6], pzfVar.b);
            ((fxa) this.c.getValue()).d(true);
            return;
        }
        if ("session.state".equals(pzfVar.b)) {
            wqi.c("sh8", "session state error: " + pzfVar.c + " do nothing", new Object[0]);
            return;
        }
        if (pzfVar instanceof hzf) {
            if (((fxa) this.c.getValue()).b() && ((oje) this.e.getValue()).k == 2) {
                ((yh8) this.f.getValue()).d(bArr);
                return;
            }
            return;
        }
        if ("proto.state".equals(pzfVar.b)) {
            ((y3b) ((yi5) this.d.getValue())).a(new ProtoStateException(pzfVar));
        }
        di8 di8Var2 = this.a;
        bi8 bi8Var2 = bi8.LOGIN_RESTART;
        di8Var2.getClass();
        di8.o(bi8Var2);
        ((w0g) this.g.getValue()).f();
    }
}

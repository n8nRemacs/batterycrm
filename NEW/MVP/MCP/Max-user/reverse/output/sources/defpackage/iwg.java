package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class iwg implements sk3, es8 {
    public final /* synthetic */ jwg a;
    public final /* synthetic */ bug b;

    public /* synthetic */ iwg(jwg jwgVar, bug bugVar) {
        this.a = jwgVar;
        this.b = bugVar;
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        ttg ttgVar;
        jwg jwgVar = this.a;
        bug bugVar = this.b;
        wqi.c("jwg", "getUpload: upload=" + bugVar, new Object[0]);
        synchronized (jwgVar) {
            try {
                ttgVar = (ttg) jwgVar.a.d(bugVar).a();
            } catch (Exception unused) {
                ttgVar = null;
            }
        }
        if (ttgVar == null) {
            try {
                or8 or8VarD = ((gwg) jwgVar.b.getValue()).d(bugVar);
                lwg lwgVar = jwgVar.a;
                Objects.requireNonNull(lwgVar);
                ttgVar = (ttg) new fs8(or8VarD, new ehg(8, lwgVar), pdf.e, pdf.d).a();
            } catch (Exception unused2) {
            }
        }
        if (rr8Var.e()) {
            return;
        }
        if (ttgVar == null) {
            rr8Var.b();
        } else {
            rr8Var.a(ttgVar);
        }
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        jwg jwgVar = this.a;
        bug bugVar = this.b;
        wqi.c("jwg", "removeUpload: upload=" + bugVar, new Object[0]);
        synchronized (jwgVar) {
            jwgVar.a.c(bugVar).c(((gwg) jwgVar.b.getValue()).c(bugVar)).a();
        }
        if (jk3Var.e()) {
            return;
        }
        jk3Var.b();
    }
}

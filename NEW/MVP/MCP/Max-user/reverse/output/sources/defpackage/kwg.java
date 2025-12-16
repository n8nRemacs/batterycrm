package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class kwg implements sk3, es8 {
    public final /* synthetic */ lwg a;
    public final /* synthetic */ bug b;

    public /* synthetic */ kwg(lwg lwgVar, bug bugVar) {
        this.a = lwgVar;
        this.b = bugVar;
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        ttg ttgVar = (ttg) ((Map) this.a.b).get(this.b);
        if (ttgVar != null) {
            if (rr8Var.e()) {
                return;
            }
            rr8Var.a(ttgVar);
        } else {
            if (rr8Var.e()) {
                return;
            }
            rr8Var.b();
        }
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        ((Map) this.a.b).remove(this.b);
        jk3Var.b();
    }
}

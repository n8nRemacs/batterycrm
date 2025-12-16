package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zk1 implements ep1 {
    public final tt a;
    public final qf1 b;

    public zk1(tt ttVar, qf1 qf1Var) {
        this.a = ttVar;
        this.b = qf1Var;
        qf1Var.g.a.add(this);
    }

    @Override // defpackage.ep1
    public final void a(xt4 xt4Var) {
        eje ejeVar = (eje) xt4Var.c;
        h0f h0fVar = (h0f) xt4Var.b;
        qf1 qf1Var = this.b;
        if (h0fVar == null) {
            qf1Var.i.onRecordStopped(new xk1(null, ejeVar));
        } else {
            qf1Var.i.onRecordStarted(new wk1(ejeVar, cxi.c(h0fVar)));
        }
    }

    public final void b(JSONObject jSONObject) {
        vhb vhbVar;
        try {
            vhbVar = new vhb(tt.a(jSONObject.getJSONObject("recordInfo")), kk4.y(jSONObject), false, 8);
        } catch (JSONException e) {
            this.a.a.logException("RecordInfoParser", "Can't parse record start info", e);
            vhbVar = null;
        }
        if (vhbVar == null) {
            return;
        }
        this.b.i.onRecordStarted(new wk1((fje) vhbVar.c, cxi.c((h0f) vhbVar.b)));
    }

    public final void c(JSONObject jSONObject) {
        wib wibVar = null;
        try {
            String strG = yni.g(jSONObject, "participant");
            ti1 ti1VarA = strG != null ? ti1.a(strG) : null;
            if (jSONObject.has("recordMovieId")) {
                jSONObject.optLong("recordMovieId");
            }
            wibVar = new wib(kk4.y(jSONObject), ti1VarA, false, 8);
        } catch (JSONException e) {
            this.a.a.logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (wibVar == null) {
            return;
        }
        this.b.i.onRecordStopped(new xk1((ti1) wibVar.c, (fje) wibVar.b));
    }
}

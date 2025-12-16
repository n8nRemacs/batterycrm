package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p21 implements dp1 {
    public final tt a;
    public final qf1 b;

    public p21(tt ttVar, qf1 qf1Var) {
        this.a = ttVar;
        this.b = qf1Var;
        qf1Var.h.a.add(this);
    }

    @Override // defpackage.dp1
    public final void a(i5i i5iVar) {
        eje ejeVar = (eje) i5iVar.b;
        k21 k21Var = (k21) i5iVar.a;
        qf1 qf1Var = this.b;
        if (k21Var == null) {
            qf1Var.m.onAsrRecordStopped(new m21(ejeVar));
        } else {
            qf1Var.m.onAsrRecordStarted(new l21(ejeVar, k21Var));
        }
    }

    public final void b(JSONObject jSONObject) {
        rt rtVar = null;
        try {
            k21 k21VarB = tt.b(jSONObject.getJSONObject("asrInfo"));
            if (k21VarB != null) {
                rtVar = new rt(kk4.y(jSONObject), k21VarB);
            }
        } catch (JSONException e) {
            this.a.a.logException("AsrParser", "Can't parse record start info", e);
        }
        if (rtVar == null) {
            return;
        }
        this.b.m.onAsrRecordStarted(new l21(rtVar.a, rtVar.b));
    }

    public final void c(JSONObject jSONObject) {
        st stVar;
        try {
            stVar = new st(kk4.y(jSONObject));
        } catch (JSONException e) {
            this.a.a.logException("AsrParser", "Can't parse record stop info", e);
            stVar = null;
        }
        if (stVar == null) {
            return;
        }
        this.b.m.onAsrRecordStopped(new m21(stVar.a));
    }
}

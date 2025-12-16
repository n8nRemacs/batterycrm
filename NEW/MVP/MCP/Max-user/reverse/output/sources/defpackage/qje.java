package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final class qje {
    public final /* synthetic */ int a = 0;
    public volatile Object b;

    public /* synthetic */ qje() {
    }

    public void a(wxf wxfVar, List list, pje pjeVar) throws JSONException {
        feg fegVar = feg.a;
        String strA = feg.a();
        if (strA == null) {
            return;
        }
        List<y55> listD = feg.b().d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buildUuid", wxfVar.e);
        jSONObject.put("deviceId", wxfVar.h);
        jSONObject.put("sessions", u9j.b(list));
        if (!listD.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (y55 y55Var : listD) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("event", y55Var.a);
                jSONObject2.put(IceCandidatePairChangedStat.KEY_REASON, y55Var.b);
                jSONObject2.put("count", y55Var.c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("drops", jSONArray);
        }
        feg fegVar2 = feg.a;
        Object obj = feg.c().get(nca.b);
        if ((obj instanceof s74 ? (s74) obj : null) == null) {
            new s7c(13).d();
        }
        hc8 hc8Var = new hc8(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", strA).toString(), tha.b("application/json; charset=utf-8", jSONObject.toString()));
        ConditionVariable conditionVariable = new ConditionVariable();
        this.b = conditionVariable;
        afg.b(new u02(hc8Var, this, listD, conditionVariable, pjeVar, 16));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((zzg) this.b).toString();
            default:
                return super.toString();
        }
    }

    public qje(zzg zzgVar) {
        Objects.requireNonNull(zzgVar);
        this.b = zzgVar;
    }
}

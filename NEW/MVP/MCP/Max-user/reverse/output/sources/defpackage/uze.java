package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class uze implements tze {
    public final cs0 a;

    public uze(cs0 cs0Var) {
        this.a = cs0Var;
    }

    @Override // defpackage.tze
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "update-media-modifiers");
        cs0 cs0Var = this.a;
        cs0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", cs0Var.a);
            jSONObject.put("denoiseAnn", cs0Var.b);
        } catch (Exception unused) {
        }
        return jSONObjectPut.put("mediaModifiers", jSONObject);
    }
}

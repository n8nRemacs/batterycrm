package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vze implements tze {
    public final d0f a;
    public final boolean b;
    public final boolean c;

    public vze(d0f d0fVar, boolean z, boolean z2) {
        this.a = d0fVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.tze
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "change-media-settings");
        jSONObject.put("mediaSettings", paj.m(this.a, this.b, this.c));
        return jSONObject;
    }
}

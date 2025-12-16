package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v8i implements mze {
    public final /* synthetic */ pze a;
    public final /* synthetic */ bee b;
    public final /* synthetic */ pze c;

    public v8i(pze pzeVar, bee beeVar) {
        this.c = pzeVar;
        this.b = beeVar;
        this.a = pzeVar;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}

package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fr6 implements tze {
    public final JSONObject a;

    public fr6(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.tze
    public final JSONObject a() {
        return this.a;
    }

    public final void b(int i, String str) {
        this.a.put(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr6) && fni.a(this.a, ((fr6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericCommand(params=" + this.a + ")";
    }
}

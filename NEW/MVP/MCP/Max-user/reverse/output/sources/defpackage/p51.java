package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;

/* loaded from: classes.dex */
public final class p51 {
    public final ow1 a;
    public final k18 b;
    public final k18 c;

    public p51(ow1 ow1Var, k18 k18Var, k18 k18Var2) {
        this.a = ow1Var;
        this.b = k18Var;
        this.c = k18Var2;
    }

    public final o51 a(kr1 kr1Var, naf nafVar, uv1 uv1Var, jx0 jx0Var) {
        long jC = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_video", nafVar.b);
        return new o51(ow1.a(this.a).call(new l51(kr1Var, jSONObject, jC, nafVar, this, uv1Var, jx0Var)), kr1Var, true, false);
    }

    public final o51 b(ir1 ir1Var, final naf nafVar, boolean z, final uv1 uv1Var, final jx0 jx0Var) {
        final long jC = c();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", ir1Var.a);
        jSONObject.put("is_video", z);
        return new o51(ow1.a(this.a).createConfRoom(new em6() { // from class: m51
            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                return ((CreateConfParams.Builder) obj).setPayload(jSONObject.toString()).setMyId(knb.b(jC)).setStartWithVideo(nafVar.b).setEventListener((ConversationEventsListener) this.b.getValue()).setOnPrepared((em6) uv1Var).setOnError((em6) jx0Var).build();
            }
        }), ir1Var, true, false);
    }

    public final long c() {
        return ((w4e) ((pb3) ((at1) this.c.getValue()).a.getValue())).s();
    }

    public final o51 d(String str, boolean z, naf nafVar, boolean z2, uv1 uv1Var, jx0 jx0Var) {
        long jC = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_video", z2);
        return new o51(ow1.a(this.a).joinByLink(new l51(jSONObject, str, jC, nafVar, this, uv1Var, jx0Var)), new jr1(str, z), !z, false);
    }
}

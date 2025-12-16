package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* loaded from: classes.dex */
public final /* synthetic */ class l51 implements em6 {
    public final /* synthetic */ uv1 X;
    public final /* synthetic */ jx0 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ naf d;
    public final /* synthetic */ p51 o;

    public /* synthetic */ l51(kr1 kr1Var, JSONObject jSONObject, long j, naf nafVar, p51 p51Var, uv1 uv1Var, jx0 jx0Var) {
        this.Z = kr1Var;
        this.b = jSONObject;
        this.c = j;
        this.d = nafVar;
        this.o = p51Var;
        this.X = uv1Var;
        this.Y = jx0Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((JoinByLinkParams.Builder) obj).setPayload(this.b.toString()).setLink((String) this.Z).setMyId(knb.b(this.c)).setStartWithVideo(this.d.b).setEventListener((ConversationEventsListener) this.o.b.getValue()).setOnPrepared((em6) this.X).setOnError((em6) this.Y).build();
            default:
                return ((StartCallParams.Builder) obj).setOpponentId(knb.b(((kr1) this.Z).a)).setPayload(this.b.toString()).setWatchTogetherEnabledForAll(false).setMyId(knb.b(this.c)).setStartWithVideo(this.d.b).setEventListener((ConversationEventsListener) this.o.b.getValue()).setOnPrepared((em6) this.X).setOnError((em6) this.Y).build();
        }
    }

    public /* synthetic */ l51(JSONObject jSONObject, String str, long j, naf nafVar, p51 p51Var, uv1 uv1Var, jx0 jx0Var) {
        this.b = jSONObject;
        this.Z = str;
        this.c = j;
        this.d = nafVar;
        this.o = p51Var;
        this.X = uv1Var;
        this.Y = jx0Var;
    }
}

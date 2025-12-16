package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class akh implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ WatchTogetherCommandExecutorImpl b;
    public final /* synthetic */ em6 c;

    public /* synthetic */ akh(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, em6 em6Var, int i) {
        this.a = i;
        this.b = watchTogetherCommandExecutorImpl;
        this.c = em6Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("setVolume", jSONObject, this.c);
                break;
            case 1:
                this.b.parseErrorResponse("pause", jSONObject, this.c);
                break;
            case 2:
                this.b.parseErrorResponse("resume", jSONObject, this.c);
                break;
            case 3:
                this.b.parseErrorResponse("setPosition", jSONObject, this.c);
                break;
            case 4:
                this.b.parseErrorResponse("play", jSONObject, this.c);
                break;
            case 5:
                this.b.parseErrorResponse("setMute", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("stop", jSONObject, this.c);
                break;
        }
    }
}

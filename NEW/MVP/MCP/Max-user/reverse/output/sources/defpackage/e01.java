package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final /* synthetic */ class e01 implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ((tjh) this.b).run();
                break;
            case 1:
                y6d y6dVar = (y6d) ((i40) this.b).e;
                if (jSONObject != null && "command-discarded".equals(jSONObject.optString(NegotiationErrorStat.KEY_ERROR))) {
                    y6dVar.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
                    break;
                } else {
                    y6dVar.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
                    break;
                }
                break;
            case 2:
                ((ts9) this.b).invoke(new RuntimeException("get-participant-list-chunk error " + jSONObject));
                break;
            case 3:
                ((ts9) this.b).invoke(new RuntimeException("get-rooms error " + jSONObject));
                break;
            default:
                MediaDumpManagerImpl.requestMediaDump$lambda$0((MediaDumpManager.RemoteMediaDumpRequestListener) this.b, jSONObject);
                break;
        }
    }

    public /* synthetic */ e01(Object obj, hn6 hn6Var, int i) {
        this.a = i;
        this.b = hn6Var;
    }
}

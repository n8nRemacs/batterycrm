package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogd implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ogd(Object obj, cm6 cm6Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = cm6Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                RecordManagerImpl.stopRecord$lambda$2((RecordManager.StopParams) this.c, this.b, jSONObject);
                break;
            default:
                RecordManagerImpl.startRecord$lambda$0((RecordManager.StartParams) this.c, this.b, jSONObject);
                break;
        }
    }
}

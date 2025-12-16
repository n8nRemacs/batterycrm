package ru.ok.android.externcalls.sdk.participant;

import defpackage.em6;
import defpackage.hu3;
import defpackage.mze;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AddParticipantsCommands c;

    public /* synthetic */ b(Object obj, AddParticipantsCommands addParticipantsCommands, int i) {
        this.a = i;
        this.b = obj;
        this.c = addParticipantsCommands;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                AddParticipantsCommands.C00511.invoke$lambda$0((em6) this.b, this.c, jSONObject);
                break;
            case 1:
                AddParticipantsCommands.C00521.invoke$lambda$0((em6) this.b, this.c, jSONObject);
                break;
            default:
                AddParticipantsCommands.AnonymousClass2.invoke$lambda$1((hu3) this.b, this.c, jSONObject);
                break;
        }
    }
}

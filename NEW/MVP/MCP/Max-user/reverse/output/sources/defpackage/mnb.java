package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class mnb {
    public final y6d a;

    public mnb(y6d y6dVar) {
        this.a = y6dVar;
    }

    public ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(ti1.a(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", "Can't parse id " + string, th);
            }
        }
        return arrayList;
    }

    public mnb(y6d y6dVar, kk4 kk4Var) {
        this.a = y6dVar;
    }
}

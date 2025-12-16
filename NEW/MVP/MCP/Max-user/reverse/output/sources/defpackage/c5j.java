package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c5j {
    public static final ArrayList a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        Iterator it = n7j.h(0, jSONArray.length()).iterator();
        while (((so7) it).c) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((so7) it).nextInt());
            jj3 jj3Var = jSONObjectOptJSONObject == null ? null : new jj3((byte) jSONObjectOptJSONObject.getInt("id"), jSONObjectOptJSONObject.getString("title"));
            if (jj3Var != null) {
                arrayList.add(jj3Var);
            }
        }
        return arrayList;
    }

    public static final void b(esg esgVar) {
        esgVar.d(479, new bya(3));
    }
}

package s01;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s01.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C47954c {

    /* renamed from: a, reason: collision with root package name */
    public final GrsBaseInfo f437279a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f437280b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f437281c = new HashSet();

    public C47954c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f437279a = grsBaseInfo;
        this.f437280b = context;
    }

    public final String a() throws JSONException {
        HashSet hashSet = this.f437281c;
        if (hashSet.size() != 0) {
            Logger.v("GrsRequestInfo", "getGeoipService enter");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            try {
                jSONObject.put("services", jSONArray);
                Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }
        HashSet hashSet2 = com.huawei.hms.framework.network.grs.f.b.a(this.f437280b.getPackageName(), this.f437279a).f363527a.f363524g;
        if (hashSet2.isEmpty()) {
            return "";
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        try {
            jSONObject2.put("services", jSONArray2);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject2.toString());
            return jSONObject2.toString();
        } catch (JSONException unused2) {
            return "";
        }
    }
}

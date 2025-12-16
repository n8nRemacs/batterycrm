package x01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class H implements N {

    /* renamed from: b, reason: collision with root package name */
    public final String f441963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f441964c;

    /* renamed from: d, reason: collision with root package name */
    public final String f441965d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f441966e;

    public H(String str, String str2, String str3, ArrayList arrayList) {
        this.f441963b = str;
        this.f441964c = str2;
        this.f441965d = str3;
        this.f441966e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList arrayList = this.f441966e;
        if (arrayList == null || arrayList.size() == 0) {
            m0.c("failed events is empty");
            return;
        }
        C49714A.a().f441939a.getClass();
        boolean zA2 = W.a(AbstractC49722g.b(), "cached_v2_1", 10485760);
        String str = this.f441964c;
        if (zA2) {
            m0.d("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + str);
            return;
        }
        String str2 = this.f441963b;
        String str3 = this.f441965d;
        String strA = e0.a(str2, str3);
        String strB = C49733s.b(AbstractC49722g.b(), "cached_v2_1", strA);
        HashMap map = new HashMap();
        j0.c(strA, strB, map);
        List list = (List) map.get(strA);
        if (list != null && list.size() != 0) {
            this.f441966e.addAll(list);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f441966e.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((X) it.next()).c());
            } catch (JSONException unused) {
                m0.d("hmsSdk", "event to json error");
            }
        }
        String string = jSONArray.toString();
        C49714A.a().f441939a.getClass();
        if (string.length() > 5242880) {
            m0.d("hmsSdk", "this failed data is too long,can not writing it");
            this.f441966e = null;
            return;
        }
        m0.c("data send failed, write to cache file...reqID:" + str);
        C49733s.e(AbstractC49722g.b(), "cached_v2_1", strA, string);
        C49733s.c(AbstractC49722g.b(), "backup_event", e0.b(str2, str3, str));
    }
}

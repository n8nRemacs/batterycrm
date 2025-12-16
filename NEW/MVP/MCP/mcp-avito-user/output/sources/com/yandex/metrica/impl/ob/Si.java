package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Si {
    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        if (!ui2.O() || (jSONObjectOptJSONObject = aVar.optJSONObject("socket")) == null) {
            return;
        }
        If.q qVar = new If.q();
        long jOptLong = jSONObjectOptJSONObject.optLong("seconds_to_live");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("first_delay_seconds", qVar.f378446e);
        int iOptInt = jSONObjectOptJSONObject.optInt("launch_delay_seconds", qVar.f378447f);
        long jOptLong3 = jSONObjectOptJSONObject.optLong("open_event_interval_seconds", qVar.f378448g);
        long jOptLong4 = jSONObjectOptJSONObject.optLong("min_failed_request_interval_seconds", qVar.f378449h);
        long jOptLong5 = jSONObjectOptJSONObject.optLong("min_successful_request_interval_seconds", qVar.f378450i);
        long jOptLong6 = jSONObjectOptJSONObject.optLong("open_retry_interval_seconds", qVar.f378451j);
        String strOptString = jSONObjectOptJSONObject.optString("token");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ports_https");
        JSONArray jSONArray = new JSONArray();
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONArray;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("ports_http");
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = jSONArray2;
        }
        boolean z12 = jSONArrayOptJSONArray.length() > 0 || jSONArrayOptJSONArray2.length() > 0;
        if (jOptLong <= 0 || TextUtils.isEmpty(strOptString) || !z12) {
            return;
        }
        List<Integer> listA = a(jSONArrayOptJSONArray);
        List<Integer> listA2 = a(jSONArrayOptJSONArray2);
        if (((ArrayList) listA).isEmpty() && ((ArrayList) listA2).isEmpty()) {
            return;
        }
        ui2.a(new C38758di(jOptLong, strOptString, listA, listA2, jOptLong2, iOptInt, jOptLong3, jOptLong4, jOptLong5, jOptLong6));
    }

    @j.N
    private List<Integer> a(@j.N JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            int iOptInt = jSONArray.optInt(i12);
            if (iOptInt != 0) {
                arrayList.add(Integer.valueOf(iOptInt));
            }
        }
        return arrayList;
    }
}

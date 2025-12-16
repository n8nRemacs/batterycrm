package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import s01.C47952a;

/* loaded from: classes7.dex */
final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f363572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f363573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f363574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONArray f363575e;

    public f(long j12, Context context, ArrayList arrayList, JSONArray jSONArray) {
        this.f363572b = j12;
        this.f363573c = context;
        this.f363574d = arrayList;
        this.f363575e = jSONArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47952a c47952a = new C47952a();
        c47952a.put("total_time", this.f363572b);
        c47952a.put("network_type", NetworkUtil.netWork(this.f363573c));
        ArrayList arrayList = this.f363574d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.c()) {
                    c47952a.put(g.a(eVar));
                    it.remove();
                    break;
                }
            } else if (arrayList.size() > 0) {
                e eVar2 = (e) r.j(1, arrayList);
                c47952a.put(g.a(eVar2));
                arrayList.remove(eVar2);
            }
        }
        int size = arrayList.size();
        JSONArray jSONArray = this.f363575e;
        if (size > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray.put(new JSONObject(g.a((e) it2.next())));
            }
        }
        if (jSONArray.length() > 0) {
            c47952a.put("failed_info", jSONArray.toString());
        }
        Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(c47952a.get()));
        HianalyticsHelper.getInstance().onEvent(c47952a.get(), "grs_request");
    }
}

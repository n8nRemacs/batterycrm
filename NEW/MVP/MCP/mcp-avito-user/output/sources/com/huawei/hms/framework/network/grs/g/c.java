package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;

/* loaded from: classes7.dex */
class c implements Callable<e> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f363541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f363542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.c f363543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f363544e;

    public c(d dVar, ExecutorService executorService, String str, q01.c cVar) {
        this.f363544e = dVar;
        this.f363541b = executorService;
        this.f363542c = str;
        this.f363543d = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final e call() {
        d dVar = this.f363544e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.f363553i;
        ExecutorService executorService = this.f363541b;
        String str = this.f363542c;
        q01.c cVar = this.f363543d;
        e eVarA = dVar.a(executorService, copyOnWriteArrayList, str, cVar);
        int i12 = eVarA == null ? 0 : eVarA.f363560c;
        Logger.v("c", "use 2.0 interface return http's code is：{%s}", Integer.valueOf(i12));
        if (i12 == 404 || i12 == 401) {
            if (TextUtils.isEmpty(dVar.c()) && TextUtils.isEmpty(dVar.f363545a.getAppName())) {
                Logger.i("c", "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            dVar.f363549e.clear();
            Logger.i("c", "this env has not deploy new interface,so use old interface.");
            eVarA = dVar.a(executorService, dVar.f363552h, str, cVar);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar.f363550f;
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList2);
        JSONArray jSONArray = dVar.f363551g;
        Context context = dVar.f363546b;
        if (context != null && arrayList.size() > 0 && HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new f(jElapsedRealtime2, context, arrayList, jSONArray));
        }
        copyOnWriteArrayList2.clear();
        return eVarA;
    }
}

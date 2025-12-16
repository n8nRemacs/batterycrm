package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q01.C47180a;
import r01.C47475a;
import s01.C47954c;
import s01.C47955d;
import t01.d;
import w01.C49418a;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final GrsBaseInfo f363545a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f363546b;

    /* renamed from: c, reason: collision with root package name */
    public final C47180a f363547c;

    /* renamed from: d, reason: collision with root package name */
    public e f363548d;

    /* renamed from: j, reason: collision with root package name */
    public final C47954c f363554j;

    /* renamed from: k, reason: collision with root package name */
    public final C47955d f363555k;

    /* renamed from: l, reason: collision with root package name */
    public final String f363556l;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f363549e = new ConcurrentHashMap(16);

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f363550f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f363551g = new JSONArray();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f363552h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f363553i = new CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final long f363557m = 1;

    public d(C47954c c47954c, C47180a c47180a) throws UnsupportedEncodingException {
        C47955d c47955d;
        this.f363556l = "";
        this.f363554j = c47954c;
        this.f363545a = c47954c.f437279a;
        Context context = c47954c.f437280b;
        this.f363546b = context;
        this.f363547c = c47180a;
        synchronized (C47475a.class) {
            try {
                c47955d = C47475a.f429562a;
                if (c47955d == null) {
                    String strA = t01.c.a(context, GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json");
                    ArrayList arrayList = null;
                    if (TextUtils.isEmpty(strA)) {
                        c47955d = null;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(strA).getJSONObject("grs_server");
                            JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                            if (jSONArray != null && jSONArray.length() > 0) {
                                arrayList = new ArrayList();
                                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                    arrayList.add(jSONArray.get(i12).toString());
                                }
                            }
                            C47955d c47955d2 = new C47955d();
                            C47475a.f429562a = c47955d2;
                            c47955d2.f437282a = arrayList;
                            C47475a.f429562a.f437283b = jSONObject.getString("grs_query_endpoint_1.0");
                            C47475a.f429562a.f437284c = jSONObject.getString("grs_query_endpoint_2.0");
                            C47475a.f429562a.f437285d = jSONObject.getInt("grs_query_timeout");
                        } catch (JSONException e12) {
                            Logger.w("a", "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e12.getMessage()));
                        }
                        c47955d = C47475a.f429562a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c47955d == null) {
            Logger.w("c", "g*s***_se****er_conf*** maybe has a big error");
        } else {
            this.f363555k = c47955d;
            ArrayList<String> arrayList2 = c47955d.f437282a;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                Logger.v("c", "maybe grs_base_url config with [],please check.");
            } else {
                if (arrayList2.size() > 10) {
                    throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
                }
                String str = c47955d.f437283b;
                String str2 = c47955d.f437284c;
                if (arrayList2.size() > 0) {
                    for (String str3 : arrayList2) {
                        if (str3.startsWith("https://")) {
                            GrsBaseInfo grsBaseInfo = this.f363545a;
                            if (!TextUtils.isEmpty(grsBaseInfo.getAppName()) || !TextUtils.isEmpty(c())) {
                                StringBuilder sbR = H.r(str3);
                                sbR.append(String.format(Locale.ROOT, str, TextUtils.isEmpty(c()) ? grsBaseInfo.getAppName() : c()));
                                String grsReqParamJoint = grsBaseInfo.getGrsReqParamJoint(false, false, "1.0", this.f363546b);
                                if (!TextUtils.isEmpty(grsReqParamJoint)) {
                                    sbR.append("?");
                                    sbR.append(grsReqParamJoint);
                                }
                                this.f363552h.add(sbR.toString());
                            }
                            StringBuilder sbZ = r.z(str3, str2);
                            String grsReqParamJoint2 = this.f363545a.getGrsReqParamJoint(false, false, c(), this.f363546b);
                            if (!TextUtils.isEmpty(grsReqParamJoint2)) {
                                sbZ.append("?");
                                sbZ.append(grsReqParamJoint2);
                            }
                            this.f363553i.add(sbZ.toString());
                        } else {
                            Logger.w("c", "grs server just support https scheme url,please check.");
                        }
                    }
                }
                Logger.v("c", "request to GRS server url is{%s} and {%s}", this.f363552h, this.f363553i);
            }
        }
        String grsParasKey = this.f363545a.getGrsParasKey(true, true, this.f363546b);
        this.f363556l = this.f363547c.f428946c.a(grsParasKey + "ETag", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[LOOP:0: B:3:0x0005->B:42:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.hms.framework.network.grs.g.e a(java.util.concurrent.ExecutorService r20, java.util.concurrent.CopyOnWriteArrayList r21, java.lang.String r22, q01.c r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.a(java.util.concurrent.ExecutorService, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, q01.c):com.huawei.hms.framework.network.grs.g.e");
    }

    public final synchronized void b(e eVar) {
        this.f363550f.add(eVar);
        e eVar2 = this.f363548d;
        if (eVar2 != null && eVar2.c()) {
            Logger.v("c", "grsResponseResult is ok");
            return;
        }
        if (eVar.f363560c == 503) {
            Logger.i("c", "GRS server open 503 limiting strategy.");
            t01.d.b(this.f363545a.getGrsParasKey(true, true, this.f363546b), new d.a(eVar.f363568k, SystemClock.elapsedRealtime()));
            return;
        }
        if (eVar.b()) {
            Logger.i("c", "GRS server open 304 Not Modified.");
        }
        if (!eVar.c() && !eVar.b()) {
            Logger.v("c", "grsResponseResult has exception so need return");
            return;
        }
        this.f363548d = eVar;
        this.f363547c.a(this.f363545a, eVar, this.f363546b, this.f363554j);
        for (Map.Entry entry : this.f363549e.entrySet()) {
            if (!((String) entry.getKey()).equals(eVar.f363571n) && !((Future) entry.getValue()).isCancelled()) {
                Logger.i("c", "future cancel");
                ((Future) entry.getValue()).cancel(true);
            }
        }
    }

    public final String c() {
        com.huawei.hms.framework.network.grs.f.b bVarA = com.huawei.hms.framework.network.grs.f.b.a(this.f363546b.getPackageName(), this.f363545a);
        C49418a c49418a = bVarA != null ? bVarA.f363527a.f363518a : null;
        if (c49418a == null) {
            return "";
        }
        String str = c49418a.f441142a;
        Logger.v("c", "get appName from local assets is{%s}", str);
        return str;
    }
}

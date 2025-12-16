package x01;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class E implements N {

    /* renamed from: b, reason: collision with root package name */
    public Context f441948b;

    /* renamed from: c, reason: collision with root package name */
    public String f441949c;

    /* renamed from: d, reason: collision with root package name */
    public String f441950d;

    /* renamed from: e, reason: collision with root package name */
    public String f441951e;

    public final void a(String str, List<X> list) {
        Pair pair;
        String strSubstring;
        String str2;
        if ("_default_config_tag".equals(str)) {
            pair = new Pair(str, "");
        } else {
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length > 2) {
                str2 = strArrSplit[strArrSplit.length - 1];
                strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
            } else {
                strSubstring = strArrSplit[0];
                str2 = strArrSplit[1];
            }
            pair = new Pair(strSubstring, str2);
        }
        String str3 = (String) pair.first;
        String str4 = (String) pair.second;
        d0 d0Var = new d0();
        d0Var.f442025a = list;
        d0Var.f442026b = this.f441951e;
        if (!"_default_config_tag".equals(str4)) {
            d0Var.a(str4, str3, list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (X x12 : list) {
            String str5 = x12.f442013a;
            if (TextUtils.isEmpty(str5) || "oper".equals(str5)) {
                arrayList4.add(x12);
            } else if ("maint".equals(str5)) {
                arrayList.add(x12);
            } else if ("preins".equals(str5)) {
                arrayList2.add(x12);
            } else if ("diffprivacy".equals(str5)) {
                arrayList3.add(x12);
            }
        }
        d0Var.a("oper", "_default_config_tag", arrayList4);
        d0Var.a("maint", "_default_config_tag", arrayList);
        d0Var.a("preins", "_default_config_tag", arrayList2);
        d0Var.a("diffprivacy", "_default_config_tag", arrayList3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapB;
        String str = this.f441949c;
        m0.b("eventReportTask is running");
        Context context = this.f441948b;
        boolean z12 = System.currentTimeMillis() - C49733s.a(context, "flashKeyTime") > 43200000;
        if (z12) {
            m0.b("workKey is refresh,begin report all data");
            this.f441950d = "alltype";
        }
        try {
            try {
                mapB = j0.b(context, str, this.f441950d);
            } catch (IllegalArgumentException e12) {
                m0.d("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e12.getMessage());
                if ("alltype".equals(this.f441950d)) {
                    C49733s.c(context, "stat_v2_1", new String[0]);
                    C49733s.c(context, "cached_v2_1", new String[0]);
                } else {
                    String strA = e0.a(str, this.f441950d);
                    C49733s.c(context, "stat_v2_1", strA);
                    C49733s.c(context, "cached_v2_1", strA);
                }
            } catch (Exception e13) {
                m0.d("hmsSdk", "readEventRecords handData Exception:" + e13.getMessage());
                if ("alltype".equals(this.f441950d)) {
                    C49733s.c(context, "stat_v2_1", new String[0]);
                    C49733s.c(context, "cached_v2_1", new String[0]);
                } else {
                    String strA2 = e0.a(str, this.f441950d);
                    C49733s.c(context, "stat_v2_1", strA2);
                    C49733s.c(context, "cached_v2_1", strA2);
                }
            }
            if (mapB.size() == 0) {
                m0.c("no have events to report: tag:" + str + " : type:" + this.f441950d);
                if ("alltype".equals(this.f441950d)) {
                    C49733s.c(context, "stat_v2_1", new String[0]);
                    C49733s.c(context, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String strA3 = e0.a(str, this.f441950d);
                    C49733s.c(context, "stat_v2_1", strA3);
                    C49733s.c(context, "cached_v2_1", strA3);
                    return;
                }
            }
            for (Map.Entry entry : mapB.entrySet()) {
                a((String) entry.getKey(), (List) entry.getValue());
            }
            if ("alltype".equals(this.f441950d)) {
                C49733s.c(context, "stat_v2_1", new String[0]);
                C49733s.c(context, "cached_v2_1", new String[0]);
            } else {
                String strA4 = e0.a(str, this.f441950d);
                C49733s.c(context, "stat_v2_1", strA4);
                C49733s.c(context, "cached_v2_1", strA4);
            }
            if (z12) {
                m0.b("refresh local key");
                C49726k c49726kC = C49726k.c();
                c49726kC.getClass();
                String strB = S01.b.b(16);
                if (C49726k.b(P01.b.d("analytics_keystore", strB))) {
                    c49726kC.f442036a = strB;
                }
            }
        } catch (Throwable th2) {
            if ("alltype".equals(this.f441950d)) {
                C49733s.c(context, "stat_v2_1", new String[0]);
                C49733s.c(context, "cached_v2_1", new String[0]);
            } else {
                String strA5 = e0.a(str, this.f441950d);
                C49733s.c(context, "stat_v2_1", strA5);
                C49733s.c(context, "cached_v2_1", strA5);
            }
            throw th2;
        }
    }
}

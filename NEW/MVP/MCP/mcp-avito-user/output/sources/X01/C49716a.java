package x01;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: HmsHiAnalyticsUtils.java */
/* renamed from: x01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49716a {
    public static void a() {
        o0 o0Var = m0.f442048a;
        o0Var.getClass();
        System.lineSeparator();
        System.lineSeparator();
        System.lineSeparator();
        o0Var.f442060b = 3;
        o0Var.f442059a = true;
    }

    public static boolean b() {
        return S.f441998b.f441999a != null;
    }

    public static void c(Context context, String str) {
        String str2;
        L l12 = new L();
        if (context != null) {
            l12.f441984c = context.getApplicationContext();
        }
        G g12 = new G();
        l12.f441982a = g12;
        G g13 = new G();
        l12.f441983b = g13;
        m0.b("Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        g12.f441955d.getClass();
        g13.f441955d.getClass();
        m0.b("Builder.setEnableUDID(boolean isReportUDID) is execute.");
        g12.f441955d.getClass();
        g13.f441955d.getClass();
        m0.b("Builder.setEnableSN(boolean isReportSN) is execute.");
        g12.f441955d.getClass();
        g13.f441955d.getClass();
        l12.a(0, str);
        l12.a(1, str);
        m0.b("Builder.setAppID is execute");
        l12.f441985d = "com.huawei.hwid";
        if (l12.f441984c == null) {
            m0.a("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        m0.b("Builder.create() is execute.");
        C c12 = new C();
        c12.f441946a = "_hms_config_tag";
        M m12 = new M();
        c12.f441947b = m12;
        C49714A.a().getClass();
        C49714A.f441937b.put("_hms_config_tag", m12);
        G g14 = new G(g12);
        m0.b("HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: _hms_config_tag");
        m12.f441987b = g14;
        G g15 = new G(g13);
        m0.b("HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : _hms_config_tag");
        m12.f441986a = g15;
        C49737w c49737wA = C49737w.a();
        Context context2 = l12.f441984c;
        c49737wA.getClass();
        synchronized (C49737w.f442069c) {
            try {
                if (c49737wA.f442070a != null) {
                    m0.e("hmsSdk", "DataManager already initialized.");
                } else {
                    c49737wA.f442070a = context2;
                    C49714A.a().f441939a.f441974g = c49737wA.f442070a;
                    C49714A.a().f441939a.f441969b = context2.getPackageName();
                    n0 n0VarB = n0.b();
                    if (n0VarB.f442050a == null) {
                        n0VarB.f442050a = context2;
                    }
                }
            } finally {
            }
        }
        C49740z c49740zA = C49740z.a();
        Context context3 = l12.f441984c;
        synchronized (c49740zA.f442079b) {
            try {
                if (c49740zA.f442078a == null) {
                    c49740zA.f442078a = context3;
                    C49736v.a().b(context3);
                }
            } finally {
            }
        }
        S.f441998b.f441999a = c12;
        C49737w c49737wA2 = C49737w.a();
        String str3 = l12.f441985d;
        c49737wA2.getClass();
        m0.b("HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context4 = c49737wA2.f442070a;
        if (context4 == null) {
            m0.d("hmsSdk", "sdk is not init");
            return;
        }
        String packageName = context4.getPackageName();
        if (TextUtils.isEmpty(str3)) {
            m0.e("hmsSdk", "checkStrParameter() Parameter verification failure! Parameter:appID");
        } else {
            if (!TextUtils.isEmpty(str3)) {
                str2 = Pattern.compile("[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}").matcher(str3).matches() ? "checkString() Parameter is null! Parameter:appID" : "checkString() Parameter verification failure! Parameter:appID";
                C49714A.a().f441939a.f441970c = str3;
            }
            m0.e("hmsSdk", str2);
        }
        str3 = packageName;
        C49714A.a().f441939a.f441970c = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.util.LinkedHashMap r6, java.lang.String r7, int r8) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x01.C49716a.d(java.util.LinkedHashMap, java.lang.String, int):void");
    }

    public static void e() {
        if (I.a() == null || !i0.f442032c.a()) {
            return;
        }
        String str = I.f441967a.f441946a;
        o0 o0Var = m0.f442048a;
        m0.c(String.format("HiAnalyticsInstance.onReport() is execute.TAG: %s,TYPE: %d", str, -1));
        C49740z.a().getClass();
        C49736v c49736vA = C49736v.a();
        if (c49736vA.f442067a == null) {
            m0.d("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            m0.b("onReport: Before calling runtaskhandler()");
            c49736vA.e(str, "alltype", C49714A.a().f441939a.f441971d);
        }
    }
}

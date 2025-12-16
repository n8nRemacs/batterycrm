package com.huawei.updatesdk.a.b.c;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.m;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.a.b.c.c.c;
import com.huawei.updatesdk.a.b.c.c.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AsyncTask<c, Void, d> {

    /* renamed from: a, reason: collision with root package name */
    protected c f363789a;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.updatesdk.a.b.c.c.a f363791c;

    /* renamed from: b, reason: collision with root package name */
    private d f363790b = null;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.updatesdk.a.a.b.b f363792d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f363793e = 0;

    public b(c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        this.f363789a = cVar;
        this.f363791c = aVar;
    }

    private String d() throws PackageManager.NameNotFoundException {
        String strA = com.huawei.updatesdk.b.g.a.a();
        com.huawei.updatesdk.a.a.c.a.a.a.c("StoreTask", "UserAgent is: " + strA);
        return TextUtils.isEmpty(strA) ? "Android/1.0" : strA;
    }

    private void e() {
        b(this.f363790b);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.updatesdk.a.b.c.c.d a() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.a():com.huawei.updatesdk.a.b.c.c.d");
    }

    public void b() {
        com.huawei.updatesdk.a.a.b.b bVar = this.f363792d;
        if (bVar != null) {
            bVar.a();
            this.f363792d = null;
        }
    }

    public final d c() {
        d dVarA = null;
        do {
            if (this.f363793e > 0 && dVarA != null) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "call store error! responseCode:" + dVarA.d() + ", retryTimes:" + this.f363793e);
            }
            dVarA = a();
        } while (c(dVarA));
        this.f363790b = dVarA;
        return dVarA;
    }

    private d a(String str, d dVar) {
        try {
            dVar.fromJson(new JSONObject(str));
            dVar.b(0);
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "parse json error", e12);
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.huawei.updatesdk.a.b.c.c.d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "notifyResult, create response error, method:"
            boolean r1 = r4.isCancelled()
            if (r1 != 0) goto L5b
            com.huawei.updatesdk.a.b.c.c.a r1 = r4.f363791c
            if (r1 == 0) goto L5b
            if (r5 != 0) goto L54
            java.lang.String r1 = "notifyResult, response is null"
            java.lang.String r2 = "StoreTask"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r2, r1)
            com.huawei.updatesdk.a.b.c.c.c r1 = r4.f363789a     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            java.lang.String r1 = r1.b()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            com.huawei.updatesdk.a.b.c.c.d r5 = com.huawei.updatesdk.a.b.c.a.a(r1)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            goto L40
        L20:
            r1 = move-exception
            goto L24
        L22:
            r1 = move-exception
            goto L3a
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
        L29:
            com.huawei.updatesdk.a.b.c.c.c r0 = r4.f363789a
            java.lang.String r0 = r0.b()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.updatesdk.a.a.c.a.a.a.a(r2, r0, r1)
            goto L40
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            goto L29
        L40:
            if (r5 != 0) goto L4d
            com.huawei.updatesdk.a.b.c.c.d r5 = new com.huawei.updatesdk.a.b.c.c.d
            r5.<init>()
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.PARAM_ERROR
        L49:
            r5.a(r0)
            goto L50
        L4d:
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.UNKNOWN_EXCEPTION
            goto L49
        L50:
            r0 = 1
            r5.b(r0)
        L54:
            com.huawei.updatesdk.a.b.c.c.a r0 = r4.f363791c
            com.huawei.updatesdk.a.b.c.c.c r1 = r4.f363789a
            r0.b(r1, r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.b(com.huawei.updatesdk.a.b.c.c.d):void");
    }

    private boolean c(d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.d() != 1 && dVar.d() != 2) {
            return false;
        }
        int i12 = this.f363793e;
        this.f363793e = i12 + 1;
        if (i12 >= 3) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry completed total times = " + this.f363793e + ",response.responseCode = " + dVar.d());
            return false;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry times = " + this.f363793e + ",response.responseCode = " + dVar.d());
        return true;
    }

    private void d(String str) {
        com.huawei.updatesdk.a.a.a.a("StoreTask", TextUtils.isEmpty(str) ? "UpdateSDK response error, resData == null" : "UpdateSDK response error, resData is not json string");
    }

    private boolean b(String str) {
        return TextUtils.isEmpty(str) || !h.d(str);
    }

    private boolean c(String str) {
        return (str == null || str.contains("emuiApiLevel") || str.contains("ts") || str.contains("harmonyApiLevel")) ? false : true;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d doInBackground(c... cVarArr) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "doInBackground, method:" + this.f363789a.b());
        com.huawei.updatesdk.b.g.b.a(this);
        d dVarC = c();
        com.huawei.updatesdk.a.b.c.c.a aVar = this.f363791c;
        if (aVar != null) {
            aVar.a(this.f363789a, dVarC);
        }
        return dVarC;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "onPostExecute, method:" + this.f363789a.b());
        com.huawei.updatesdk.b.g.b.a().remove(this);
        e();
    }

    private void a(d dVar, int i12, d.a aVar, Throwable th2) {
        if (dVar != null) {
            dVar.b(i12);
            dVar.a(aVar);
            String string = th2.toString();
            if (a(th2.toString())) {
                string = th2.getClass().getName();
            }
            dVar.a(string);
        }
    }

    private void a(d dVar, Throwable th2, String str) {
        d.a aVar;
        int i12 = 1;
        if (th2 instanceof ConnectException) {
            aVar = d.a.CONNECT_EXCEPTION;
        } else if ((th2 instanceof SocketTimeoutException) || (th2.getMessage() != null && th2.getMessage().contains("ConnectTimeoutException"))) {
            aVar = d.a.CONNECT_EXCEPTION;
            i12 = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            aVar = d.a.PARAM_ERROR;
            i12 = 5;
        } else if (th2 instanceof IllegalAccessException) {
            aVar = d.a.UNKNOWN_EXCEPTION;
        } else {
            if (!(th2 instanceof ArrayIndexOutOfBoundsException)) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof InterruptedIOException)) {
                    a(dVar, 0, d.a.NORMAL, th2);
                    com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK task is canceled");
                } else if (th2 instanceof IOException) {
                    aVar = d.a.IO_EXCEPTION;
                } else if (dVar != null) {
                    dVar.a(th2.toString());
                }
                a(str, th2);
            }
            aVar = d.a.NO_PROGUARD;
            i12 = 6;
        }
        a(dVar, i12, aVar, th2);
        a(str, th2);
    }

    private void a(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder("invoke store error, exceptionType:");
        String string = th2.toString();
        if (a(th2.toString())) {
            string = th2.getClass().getName();
        }
        m.p(sb2, string, ", url:", str, ", method:");
        sb2.append(this.f363789a.b());
        sb2.append(", retryTimes:" + this.f363793e);
        String string2 = sb2.toString();
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", string2, th2);
        com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK call store error: " + string2);
    }

    public final void a(Executor executor) {
        executeOnExecutor(executor, this.f363789a);
    }

    private boolean a(String str) {
        try {
            return Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)").matcher(str).find();
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.a.b("StoreTask", "is contain ip error: " + e12.toString());
            return true;
        }
    }
}

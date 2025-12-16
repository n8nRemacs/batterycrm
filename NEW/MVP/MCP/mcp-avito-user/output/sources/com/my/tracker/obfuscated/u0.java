package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.h0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes7.dex */
public final class u0 extends h0<String> {

    /* renamed from: a, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f365830a;

    public u0(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f365830a = okHttpClientProvider;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.my.tracker.obfuscated.h0
    public h0.b<String> a(String str) {
        Response responseExecute;
        h0.b<String> bVarC = h0.b.c();
        Response response = null;
        try {
            e2.a("OkHttpGetRequest: send request to " + str);
            responseExecute = this.f365830a.getOkHttpClient().newCall(new Request.Builder().url(str).get().build()).execute();
            try {
                int iCode = responseExecute.code();
                if (iCode == 200) {
                    e2.a("OkHttpGetRequest: response successfully received");
                    bVarC.f365655a = true;
                } else {
                    e2.a("OkHttpGetRequest error: response code " + iCode);
                    bVarC.f365655a = false;
                }
                if (iCode == 200) {
                    e2.a("OkHttpGetRequest: processing server response");
                    ResponseBody responseBodyBody = responseExecute.body();
                    ?? String = responseBodyBody != null ? responseBodyBody.string() : 0;
                    if (TextUtils.isEmpty(String)) {
                        e2.a("OkHttpGetRequest: response data is empty");
                    } else {
                        bVarC.f365656b = String;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                response = responseExecute;
                try {
                    e2.a("OkHttpGetRequest error: error while sending data", th);
                    bVarC.f365655a = false;
                    bVarC.f365657c = "OkHttpGetRequest error: error while sending data";
                    if (response != null) {
                        responseExecute = response;
                        responseExecute.close();
                    }
                    return bVarC;
                } catch (Throwable th3) {
                    if (response != null) {
                        response.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
        responseExecute.close();
        return bVarC;
    }
}

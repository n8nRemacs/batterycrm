package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.h0;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes7.dex */
public final class v0 extends h0<String> {

    /* renamed from: d, reason: collision with root package name */
    static final MediaType f365833d = MediaType.parse("application/octet-stream");

    /* renamed from: a, reason: collision with root package name */
    final h0.a f365834a;

    /* renamed from: b, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f365835b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f365836c;

    public v0(h0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z12) {
        this.f365834a = aVar;
        this.f365835b = okHttpClientProvider;
        this.f365836c = z12;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.my.tracker.obfuscated.h0
    public h0.b<String> a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        h0.b<String> bVarC = h0.b.c();
        Response response = null;
        try {
            e2.a("OkHttpPostRequest: send request to " + str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (this.f365836c) {
                e2.a("OkHttpPostRequest: populating post request body using gzip");
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    this.f365834a.a(gZIPOutputStream);
                    gZIPOutputStream.finish();
                } catch (Throwable th4) {
                    th = th4;
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } else {
                e2.a("OkHttpPostRequest: populating post request body without using gzip");
                this.f365834a.a(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                gZIPOutputStream = null;
            }
            Request requestBuild = new Request.Builder().url(str).header("Content-Encoding", "gzip").post(RequestBody.create(byteArrayOutputStream.toByteArray(), f365833d)).build();
            if (gZIPOutputStream != null) {
                gZIPOutputStream.close();
            }
            byteArrayOutputStream.close();
            Response responseExecute = this.f365835b.getOkHttpClient().newCall(requestBuild).execute();
            try {
                int iCode = responseExecute.code();
                if (iCode == 200 || iCode == 204) {
                    e2.a("OkHttpPostRequest: response successfully received");
                    bVarC.f365655a = true;
                } else {
                    e2.a("OkHttpPostRequest error: response code " + iCode);
                    bVarC.f365655a = false;
                }
                if (iCode == 200) {
                    e2.a("OkHttpPostRequest: processing server response");
                    ResponseBody responseBodyBody = responseExecute.body();
                    ?? String = responseBodyBody != null ? responseBodyBody.string() : 0;
                    if (TextUtils.isEmpty(String)) {
                        e2.a("OkHttpPostRequest: response data is empty");
                    } else {
                        bVarC.f365656b = String;
                    }
                }
            } catch (Throwable th5) {
                response = responseExecute;
                th = th5;
                try {
                    e2.a("OkHttpPostRequest error: error while sending data", th);
                    bVarC.f365655a = false;
                    bVarC.f365657c = "OkHttpPostRequest error: error while sending data";
                    if (response != null) {
                        responseExecute = response;
                        responseExecute.close();
                    }
                    return bVarC;
                } catch (Throwable th6) {
                    if (response != null) {
                        response.close();
                    }
                    throw th6;
                }
            }
            responseExecute.close();
            return bVarC;
        } catch (Throwable th7) {
            th = th7;
            gZIPOutputStream = null;
        }
    }
}

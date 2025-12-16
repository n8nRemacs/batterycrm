package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.h0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes7.dex */
public final class f0 extends h0<String> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    @Override // com.my.tracker.obfuscated.h0
    public h0.b<String> a(String str) {
        HttpURLConnection httpURLConnection;
        h0.b<String> bVarC = h0.b.c();
        HttpURLConnection httpURLConnection2 = null;
        Object[] objArr = 0;
        try {
            e2.a("HttpGetRequest: send request to " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            e2.a("HttpGetRequest: response received with response code: " + responseCode);
            bVarC.f365655a = responseCode == 200;
            try {
                e2.a("HttpGetRequest: processing server response");
                BufferedReader bufferedReader = bVarC.f365655a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
                if (sb2.length() > 0) {
                    bVarC.f365656b = sb2.toString();
                } else {
                    e2.a("HttpGetRequest: response data is empty");
                }
                bufferedReader.close();
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                if (0 != 0) {
                    (objArr == true ? 1 : 0).close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
            try {
                e2.a("HttpGetRequest: error", th);
                bVarC.f365655a = false;
                bVarC.f365657c = "HttpGetRequest: error while sending data";
                return bVarC;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
        return bVarC;
    }
}

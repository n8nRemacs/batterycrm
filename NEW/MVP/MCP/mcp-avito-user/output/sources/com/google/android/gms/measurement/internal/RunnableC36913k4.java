package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzok;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@j.l0
/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36913k4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final URL f355244b;

    /* renamed from: c, reason: collision with root package name */
    public final K2 f355245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36899i4 f355246d;

    public RunnableC36913k4(C36899i4 c36899i4, String str, URL url, K2 k22) {
        this.f355246d = c36899i4;
        C36729v.f(str);
        this.f355244b = url;
        this.f355245c = k22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        final int responseCode;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        final Map<String, List<String>> headerFields;
        final IOException iOException;
        C36899i4 c36899i4 = this.f355246d;
        c36899i4.d();
        final Exception exc = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            URLConnection uRLConnectionZza = zzcd.zza().zza(this.f355244b, "client-measurement");
            if (!(uRLConnectionZza instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionZza;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    headerFields = httpURLConnection.getHeaderFields();
                } catch (IOException e12) {
                    iOException = e12;
                    headerFields = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    headerFields = null;
                }
                try {
                    final byte[] bArrI = C36899i4.i(httpURLConnection);
                    httpURLConnection.disconnect();
                    c36899i4.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.j4
                        @Override // java.lang.Runnable
                        public final void run() {
                            K2 k22 = this.f355215b.f355245c;
                            int i12 = responseCode;
                            Exception exc2 = exc;
                            byte[] bArr = bArrI;
                            I2 i22 = k22.f354757a;
                            S1 s12 = i22.f354717i;
                            if ((i12 != 200 && i12 != 204 && i12 != 304) || exc2 != null) {
                                I2.c(s12);
                                s12.f354892i.a(Integer.valueOf(i12), "Network Request for Deferred Deep Link failed. response, exception", exc2);
                                return;
                            }
                            C36876f2 c36876f2 = i22.f354716h;
                            I2.d(c36876f2);
                            c36876f2.f355143u.a(true);
                            if (bArr == null || bArr.length == 0) {
                                I2.c(s12);
                                s12.f354896m.b("Deferred Deep Link response empty.");
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    I2.c(s12);
                                    s12.f354896m.b("Deferred Deep Link is empty.");
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                boolean zZza = zzok.zza();
                                N5 n52 = i22.f354720l;
                                if (zZza && i22.f354715g.o(null, E.f354593Q0)) {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                        return;
                                    }
                                    bundle.putString("gbraid", strOptString3);
                                } else {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.a(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                        return;
                                    }
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                i22.f354724p.c0("auto", "_cmp", bundle);
                                I2.d(n52);
                                if (TextUtils.isEmpty(strOptString) || !n52.Q(strOptString, dOptDouble)) {
                                    return;
                                }
                                n52.f355183a.f354709a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            } catch (JSONException e13) {
                                I2.c(s12);
                                s12.f354889f.c("Failed to parse the Deferred Deep Link response. exception", e13);
                            }
                        }
                    });
                } catch (IOException e13) {
                    iOException = e13;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    A2 a2Zzl = c36899i4.zzl();
                    final Object[] objArr4 = objArr3 == true ? 1 : 0;
                    a2Zzl.n(new Runnable() { // from class: com.google.android.gms.measurement.internal.j4
                        @Override // java.lang.Runnable
                        public final void run() {
                            K2 k22 = this.f355215b.f355245c;
                            int i12 = responseCode;
                            Exception exc2 = iOException;
                            byte[] bArr = objArr4;
                            I2 i22 = k22.f354757a;
                            S1 s12 = i22.f354717i;
                            if ((i12 != 200 && i12 != 204 && i12 != 304) || exc2 != null) {
                                I2.c(s12);
                                s12.f354892i.a(Integer.valueOf(i12), "Network Request for Deferred Deep Link failed. response, exception", exc2);
                                return;
                            }
                            C36876f2 c36876f2 = i22.f354716h;
                            I2.d(c36876f2);
                            c36876f2.f355143u.a(true);
                            if (bArr == null || bArr.length == 0) {
                                I2.c(s12);
                                s12.f354896m.b("Deferred Deep Link response empty.");
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    I2.c(s12);
                                    s12.f354896m.b("Deferred Deep Link is empty.");
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                boolean zZza = zzok.zza();
                                N5 n52 = i22.f354720l;
                                if (zZza && i22.f354715g.o(null, E.f354593Q0)) {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                        return;
                                    }
                                    bundle.putString("gbraid", strOptString3);
                                } else {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.a(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                        return;
                                    }
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                i22.f354724p.c0("auto", "_cmp", bundle);
                                I2.d(n52);
                                if (TextUtils.isEmpty(strOptString) || !n52.Q(strOptString, dOptDouble)) {
                                    return;
                                }
                                n52.f355183a.f354709a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            } catch (JSONException e132) {
                                I2.c(s12);
                                s12.f354889f.c("Failed to parse the Deferred Deep Link response. exception", e132);
                            }
                        }
                    });
                } catch (Throwable th4) {
                    th2 = th4;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    A2 a2Zzl2 = c36899i4.zzl();
                    final Object[] objArr5 = objArr2 == true ? 1 : 0;
                    final Object[] objArr6 = objArr == true ? 1 : 0;
                    a2Zzl2.n(new Runnable() { // from class: com.google.android.gms.measurement.internal.j4
                        @Override // java.lang.Runnable
                        public final void run() {
                            K2 k22 = this.f355215b.f355245c;
                            int i12 = responseCode;
                            Exception exc2 = objArr5;
                            byte[] bArr = objArr6;
                            I2 i22 = k22.f354757a;
                            S1 s12 = i22.f354717i;
                            if ((i12 != 200 && i12 != 204 && i12 != 304) || exc2 != null) {
                                I2.c(s12);
                                s12.f354892i.a(Integer.valueOf(i12), "Network Request for Deferred Deep Link failed. response, exception", exc2);
                                return;
                            }
                            C36876f2 c36876f2 = i22.f354716h;
                            I2.d(c36876f2);
                            c36876f2.f355143u.a(true);
                            if (bArr == null || bArr.length == 0) {
                                I2.c(s12);
                                s12.f354896m.b("Deferred Deep Link response empty.");
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr));
                                String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    I2.c(s12);
                                    s12.f354896m.b("Deferred Deep Link is empty.");
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                boolean zZza = zzok.zza();
                                N5 n52 = i22.f354720l;
                                if (zZza && i22.f354715g.o(null, E.f354593Q0)) {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                        return;
                                    }
                                    bundle.putString("gbraid", strOptString3);
                                } else {
                                    I2.d(n52);
                                    if (!n52.p0(strOptString)) {
                                        I2.c(s12);
                                        s12.f354892i.a(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                        return;
                                    }
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                i22.f354724p.c0("auto", "_cmp", bundle);
                                I2.d(n52);
                                if (TextUtils.isEmpty(strOptString) || !n52.Q(strOptString, dOptDouble)) {
                                    return;
                                }
                                n52.f355183a.f354709a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            } catch (JSONException e132) {
                                I2.c(s12);
                                s12.f354889f.c("Failed to parse the Deferred Deep Link response. exception", e132);
                            }
                        }
                    });
                    throw th2;
                }
            } catch (IOException e14) {
                iOException = e14;
                headerFields = null;
                responseCode = 0;
            } catch (Throwable th5) {
                th2 = th5;
                headerFields = null;
                responseCode = 0;
            }
        } catch (IOException e15) {
            responseCode = 0;
            iOException = e15;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th6) {
            responseCode = 0;
            th2 = th6;
            httpURLConnection = null;
            headerFields = null;
        }
    }
}

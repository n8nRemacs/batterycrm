package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f363558a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f363559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363560c;

    /* renamed from: d, reason: collision with root package name */
    public final long f363561d;

    /* renamed from: e, reason: collision with root package name */
    public long f363562e;

    /* renamed from: f, reason: collision with root package name */
    public long f363563f;

    /* renamed from: g, reason: collision with root package name */
    public final String f363564g;

    /* renamed from: h, reason: collision with root package name */
    public final int f363565h;

    /* renamed from: i, reason: collision with root package name */
    public final int f363566i;

    /* renamed from: j, reason: collision with root package name */
    public String f363567j;

    /* renamed from: k, reason: collision with root package name */
    public final long f363568k;

    /* renamed from: l, reason: collision with root package name */
    public final String f363569l;

    /* renamed from: m, reason: collision with root package name */
    public final IOException f363570m;

    /* renamed from: n, reason: collision with root package name */
    public String f363571n;

    public e(int i12, Map<String, List<String>> map, byte[] bArr, long j12) throws JSONException, NumberFormatException {
        String str;
        int i13;
        this.f363565h = 2;
        int i14 = ConnectionResult.RESOLUTION_REQUIRED;
        this.f363566i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f363567j = "";
        long j13 = 0;
        this.f363568k = 0L;
        this.f363569l = "";
        this.f363560c = i12;
        this.f363558a = map;
        this.f363559b = ByteBuffer.wrap(bArr).array();
        this.f363561d = j12;
        int i15 = 0;
        if (c() || this.f363560c == 503 || b()) {
            HashMap map2 = new HashMap(16);
            if (map == null || map.size() <= 0) {
                Logger.v("d", "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            } else {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        map2.put(key, it.next());
                    }
                }
            }
            if (map2.size() <= 0) {
                Logger.w("d", "parseHeader {headers.size() <= 0}");
            } else {
                try {
                    if (c() || b()) {
                        a(map2);
                        if (map2.containsKey("ETag")) {
                            String str2 = (String) map2.get("ETag");
                            if (TextUtils.isEmpty(str2)) {
                                str = "The Response Heads Etag is Empty";
                            } else {
                                Logger.i("d", "success get Etag from server");
                                this.f363569l = str2;
                            }
                        } else {
                            str = "Response Heads has not Etag";
                        }
                        Logger.i("d", str);
                    }
                    if (this.f363560c == 503) {
                        if (map2.containsKey("Retry-After")) {
                            String str3 = (String) map2.get("Retry-After");
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    j13 = Long.parseLong(str3);
                                } catch (NumberFormatException e12) {
                                    Logger.w("d", "getRetryAfter addHeadersToResult NumberFormatException", e12);
                                }
                            }
                        }
                        long j14 = j13 * 1000;
                        Logger.v("d", "convert retry-afterTime{%s}", Long.valueOf(j14));
                        this.f363568k = j14;
                    }
                } catch (JSONException e13) {
                    Logger.w("d", "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e13.getMessage()));
                }
            }
        }
        if (b()) {
            Logger.i("d", "GRSSDK get httpcode{304} not any changed.");
            this.f363565h = 1;
            return;
        }
        if (c()) {
            try {
                JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f363559b));
                if (jSONObject.has("isSuccess")) {
                    if (jSONObject.getInt("isSuccess") == 1) {
                    }
                } else if (jSONObject.has("resultCode")) {
                    i13 = jSONObject.getInt("resultCode") == 0 ? 1 : 2;
                } else {
                    Logger.e("d", "sth. wrong because server errorcode's key.");
                    i13 = -1;
                }
                if (i13 == 1 || !jSONObject.has("services")) {
                    i15 = i13;
                }
                this.f363565h = i15;
                if (i15 != 1 && i15 != 0) {
                    this.f363566i = jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : i14;
                    if (jSONObject.has("errorDesc")) {
                        jSONObject.getString("errorDesc");
                        return;
                    }
                    return;
                }
                this.f363564g = jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "";
                if (jSONObject.has("errorList")) {
                    jSONObject.getJSONObject("errorList").toString();
                    return;
                }
                return;
            } catch (JSONException e14) {
                Logger.w("d", "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e14.getMessage()));
            }
        } else {
            Logger.i("d", "GRSSDK parse server body all failed.");
        }
        this.f363565h = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r10) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            java.lang.String r0 = "Cache-Control"
            boolean r1 = r10.containsKey(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "d"
            r5 = 0
            if (r1 == 0) goto L48
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto La4
            java.lang.String r0 = "max-age="
            boolean r1 = r10.contains(r0)
            if (r1 == 0) goto La4
            int r0 = r10.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L40
            int r0 = r0 + 8
            java.lang.String r10 = r10.substring(r0)     // Catch: java.lang.NumberFormatException -> L40
            long r0 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.String r10 = "Cache-Control value{%s}"
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.NumberFormatException -> L3e
            com.huawei.hms.framework.common.Logger.v(r4, r10, r7)     // Catch: java.lang.NumberFormatException -> L3e
            goto La5
        L3e:
            r10 = move-exception
            goto L42
        L40:
            r10 = move-exception
            r0 = r5
        L42:
            java.lang.String r7 = "getExpireTime addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.w(r4, r7, r10)
            goto La5
        L48:
            java.lang.String r0 = "Expires"
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L9f
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r7 = "expires is{%s}"
            com.huawei.hms.framework.common.Logger.v(r4, r7, r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r8 = "EEE, d MMM yyyy HH:mm:ss 'GMT'"
            r1.<init>(r8, r7)
            java.lang.String r7 = "Date"
            boolean r8 = r10.containsKey(r7)
            if (r8 == 0) goto L77
            java.lang.Object r10 = r10.get(r7)
            java.lang.String r10 = (java.lang.String) r10
            goto L78
        L77:
            r10 = 0
        L78:
            java.util.Date r0 = r1.parse(r0)     // Catch: java.text.ParseException -> L88
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch: java.text.ParseException -> L88
            if (r7 == 0) goto L8a
            java.util.Date r10 = new java.util.Date     // Catch: java.text.ParseException -> L88
            r10.<init>()     // Catch: java.text.ParseException -> L88
            goto L8e
        L88:
            r10 = move-exception
            goto L99
        L8a:
            java.util.Date r10 = r1.parse(r10)     // Catch: java.text.ParseException -> L88
        L8e:
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> L88
            long r7 = r10.getTime()     // Catch: java.text.ParseException -> L88
            long r0 = r0 - r7
            long r0 = r0 / r2
            goto La5
        L99:
            java.lang.String r0 = "getExpireTime ParseException."
            com.huawei.hms.framework.common.Logger.w(r4, r0, r10)
            goto La4
        L9f:
            java.lang.String r10 = "response headers neither contains Cache-Control nor Expires."
            com.huawei.hms.framework.common.Logger.i(r4, r10)
        La4:
            r0 = r5
        La5:
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 <= 0) goto Lb0
            r5 = 2592000(0x278d00, double:1.280618E-317)
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 <= 0) goto Lb3
        Lb0:
            r0 = 86400(0x15180, double:4.26873E-319)
        Lb3:
            long r0 = r0 * r2
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r2 = "convert expireTime{%s}"
            com.huawei.hms.framework.common.Logger.v(r4, r2, r10)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            java.lang.String r10 = java.lang.String.valueOf(r2)
            r9.f363567j = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.e.a(java.util.HashMap):void");
    }

    public final boolean b() {
        return this.f363560c == 304;
    }

    public final boolean c() {
        return this.f363560c == 200;
    }

    public e(IOException iOException, long j12) {
        this.f363560c = 0;
        this.f363565h = 2;
        this.f363566i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f363567j = "";
        this.f363568k = 0L;
        this.f363569l = "";
        this.f363570m = iOException;
        this.f363561d = j12;
    }
}

package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.camera.camera2.internal.G;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.cct.c;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.a;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.i;
import com.google.firebase.encoders.EncodingException;
import j.P;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes10.dex */
final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.encoders.a f342930a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f342931b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f342932c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f342933d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f342934e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f342935f;

    /* renamed from: g, reason: collision with root package name */
    public final int f342936g;

    /* compiled from: CctTransportBackend.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f342937a;

        /* renamed from: b, reason: collision with root package name */
        public final j f342938b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public final String f342939c;

        public a(URL url, j jVar, @P String str) {
            this.f342937a = url;
            this.f342938b = jVar;
            this.f342939c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f342940a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final URL f342941b;

        /* renamed from: c, reason: collision with root package name */
        public final long f342942c;

        public b(int i12, @P URL url, long j12) {
            this.f342940a = i12;
            this.f342941b = url;
            this.f342942c = j12;
        }
    }

    public c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        com.google.firebase.encoders.json.d dVar = new com.google.firebase.encoders.json.d();
        com.google.android.datatransport.cct.internal.b.f342951a.configure(dVar);
        dVar.f361556d = true;
        this.f342930a = dVar.a();
        this.f342932c = context;
        this.f342931b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f342933d = c(com.google.android.datatransport.cct.a.f342923c);
        this.f342934e = aVar2;
        this.f342935f = aVar;
        this.f342936g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e12) {
            throw new IllegalArgumentException(G.f("Invalid url: ", str), e12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.datatransport.cct.b] */
    @Override // com.google.android.datatransport.runtime.backends.m
    public final BackendResponse a(g gVar) {
        int i12;
        String str;
        Object objA;
        k.a aVarI;
        HashMap map = new HashMap();
        for (com.google.android.datatransport.runtime.j jVar : gVar.b()) {
            String strH = jVar.h();
            if (map.containsKey(strH)) {
                ((List) map.get(strH)).add(jVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jVar);
                map.put(strH, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            i12 = 5;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            com.google.android.datatransport.runtime.j jVar2 = (com.google.android.datatransport.runtime.j) ((List) entry.getValue()).get(0);
            l.a aVarA = l.a();
            QosTier qosTier = QosTier.f342949b;
            aVarA.f();
            aVarA.g(this.f342935f.O());
            aVarA.h(this.f342934e.O());
            ClientInfo.a aVarA2 = ClientInfo.a();
            aVarA2.c();
            a.AbstractC10559a abstractC10559aA = com.google.android.datatransport.cct.internal.a.a();
            abstractC10559aA.m(Integer.valueOf(jVar2.g("sdk-version")));
            abstractC10559aA.j(jVar2.b("model"));
            abstractC10559aA.f(jVar2.b("hardware"));
            abstractC10559aA.d(jVar2.b("device"));
            abstractC10559aA.l(jVar2.b("product"));
            abstractC10559aA.k(jVar2.b("os-uild"));
            abstractC10559aA.h(jVar2.b("manufacturer"));
            abstractC10559aA.e(jVar2.b("fingerprint"));
            abstractC10559aA.c(jVar2.b("country"));
            abstractC10559aA.g(jVar2.b("locale"));
            abstractC10559aA.i(jVar2.b("mcc_mnc"));
            abstractC10559aA.b(jVar2.b("application_build"));
            aVarA2.b(abstractC10559aA.a());
            aVarA.b(aVarA2.a());
            try {
                aVarA.d(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                aVarA.e((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (com.google.android.datatransport.runtime.j jVar3 : (List) entry.getValue()) {
                i iVarE = jVar3.e();
                com.google.android.datatransport.c cVar = iVarE.f343165a;
                boolean zEquals = cVar.equals(new com.google.android.datatransport.c("proto"));
                byte[] bArr = iVarE.f343166b;
                if (zEquals) {
                    aVarI = k.i(bArr);
                } else if (cVar.equals(new com.google.android.datatransport.c("json"))) {
                    aVarI = k.h(new String(bArr, Charset.forName(Constants.ENCODING)));
                } else if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                    new StringBuilder("Received event of unsupported encoding ").append(cVar);
                }
                aVarI.c(jVar3.f());
                aVarI.d(jVar3.i());
                String str2 = jVar3.c().get("tz-offset");
                aVarI.f(str2 == null ? 0L : Long.valueOf(str2).longValue());
                NetworkConnectionInfo.a aVarA3 = NetworkConnectionInfo.a();
                aVarA3.c(NetworkConnectionInfo.NetworkType.f342947b.get(jVar3.g("net-type")));
                aVarA3.b(NetworkConnectionInfo.MobileSubtype.f342945b.get(jVar3.g("mobile-subtype")));
                aVarI.e(aVarA3.a());
                if (jVar3.d() != null) {
                    aVarI.b(jVar3.d());
                }
                arrayList3.add(aVarI.a());
            }
            aVarA.c(arrayList3);
            arrayList2.add(aVarA.a());
        }
        j jVarA = j.a(arrayList2);
        byte[] bArrC = gVar.c();
        URL urlC = this.f342933d;
        if (bArrC != null) {
            try {
                com.google.android.datatransport.cct.a aVarB = com.google.android.datatransport.cct.a.b(gVar.c());
                str = aVarB.f342928b;
                if (str == null) {
                    str = null;
                }
                String str3 = aVarB.f342927a;
                if (str3 != null) {
                    urlC = c(str3);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        } else {
            str = null;
        }
        try {
            a aVar = new a(urlC, jVarA, str);
            ?? r02 = new EX0.a() { // from class: com.google.android.datatransport.cct.b
                public final Object a(Object obj) {
                    c.a aVar2 = (c.a) obj;
                    c cVar2 = this.f342929a;
                    cVar2.getClass();
                    boolean zIsLoggable = Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4);
                    URL url = aVar2.f342937a;
                    if (zIsLoggable) {
                        String.format("Making request to: %s", url);
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(cVar2.f342936g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str4 = aVar2.f342939c;
                    if (str4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                cVar2.f342930a.b(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), aVar2.f342938b);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer numValueOf = Integer.valueOf(responseCode);
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                                    String.format("Status Code: %d", numValueOf);
                                }
                                DX0.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                                DX0.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new c.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (responseCode != 200) {
                                    return new c.b(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        c.b bVar = new c.b(responseCode, null, com.google.android.datatransport.cct.internal.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b());
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return bVar;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (EncodingException | IOException unused3) {
                        Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
                        return new c.b(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
                    } catch (ConnectException | UnknownHostException unused4) {
                        Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
                        return new c.b(500, null, 0L);
                    }
                }
            };
            do {
                objA = r02.a(aVar);
                URL url = ((b) objA).f342941b;
                if (url != null) {
                    DX0.a.a("CctTransportBackend", "Following redirect to: %s", url);
                    aVar = new a(url, aVar.f342938b, aVar.f342939c);
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    break;
                }
                i12--;
            } while (i12 >= 1);
            b bVar = (b) objA;
            int i13 = bVar.f342940a;
            if (i13 == 200) {
                return BackendResponse.e(bVar.f342942c);
            }
            if (i13 < 500 && i13 != 404) {
                return i13 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException unused3) {
            Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
            return BackendResponse.f();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:4)(1:5)|6|(1:8)(7:10|(1:12)(2:13|(0))|15|21|16|19|20)|9|15|21|16|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f1, code lost:
    
        android.util.Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
     */
    @Override // com.google.android.datatransport.runtime.backends.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.datatransport.runtime.j b(com.google.android.datatransport.runtime.j r6) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.c.b(com.google.android.datatransport.runtime.j):com.google.android.datatransport.runtime.j");
    }
}

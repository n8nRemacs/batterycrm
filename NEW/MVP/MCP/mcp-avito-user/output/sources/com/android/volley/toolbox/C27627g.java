package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.D;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;

/* compiled from: BasicNetwork.java */
/* renamed from: com.android.volley.toolbox.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27627g implements com.android.volley.p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC27625e f67119a;

    /* renamed from: b, reason: collision with root package name */
    public final C27628h f67120b;

    public C27627g(q qVar) {
        C27628h c27628h = new C27628h();
        this.f67119a = qVar;
        this.f67120b = c27628h;
    }

    @Override // com.android.volley.p
    public final com.android.volley.r a(Request<?> request) throws IOException, VolleyError {
        o oVarA;
        byte[] bArrB;
        D.b bVar;
        String str;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                oVarA = this.f67119a.a(request, n.a(request.f67037n));
                try {
                    int i13 = oVarA.f67140a;
                    List listUnmodifiableList = Collections.unmodifiableList(oVarA.f67141b);
                    if (i13 == 304) {
                        SystemClock.elapsedRealtime();
                        return D.a(request, listUnmodifiableList);
                    }
                    InputStream inputStream = oVarA.f67143d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    bArrB = inputStream != null ? D.b(inputStream, oVarA.f67142c, this.f67120b) : new byte[0];
                    try {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (com.android.volley.z.f67166a || jElapsedRealtime2 > 3000) {
                            com.android.volley.z.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(jElapsedRealtime2), bArrB != null ? Integer.valueOf(bArrB.length) : "null", Integer.valueOf(i13), Integer.valueOf(request.f67036m.f67084b));
                        }
                        if (i13 < 200 || i13 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new com.android.volley.r(i13, bArrB, false, listUnmodifiableList);
                    } catch (IOException e12) {
                        e = e12;
                        if (e instanceof SocketTimeoutException) {
                            bVar = new D.b("socket", new TimeoutError(), null);
                        } else {
                            boolean z12 = e instanceof MalformedURLException;
                            String str2 = request.f67027d;
                            if (z12) {
                                throw new RuntimeException(androidx.camera.camera2.internal.G.f("Bad URL ", str2), e);
                            }
                            if (oVarA == null) {
                                throw new NoConnectionError(e);
                            }
                            int i14 = oVarA.f67140a;
                            com.android.volley.z.a("Unexpected response code %d for %s", Integer.valueOf(i14), str2);
                            if (bArrB != null) {
                                List listUnmodifiableList2 = Collections.unmodifiableList(oVarA.f67141b);
                                SystemClock.elapsedRealtime();
                                com.android.volley.r rVar = new com.android.volley.r(i14, bArrB, false, listUnmodifiableList2);
                                if (i14 != 401 && i14 != 403) {
                                    if (i14 < 400 || i14 > 499) {
                                        throw new ServerError(rVar);
                                    }
                                    throw new ClientError(rVar);
                                }
                                bVar = new D.b("auth", new AuthFailureError(rVar), null);
                            } else {
                                bVar = new D.b("network", new NetworkError(), null);
                            }
                        }
                        str = bVar.f67107a;
                        com.android.volley.m mVar = request.f67036m;
                        i12 = mVar.f67083a;
                        try {
                            VolleyError volleyError = bVar.f67108b;
                            int i15 = mVar.f67084b + 1;
                            mVar.f67084b = i15;
                            mVar.f67083a = ((int) (i12 * mVar.f67086d)) + i12;
                            if (i15 > mVar.f67085c) {
                                throw volleyError;
                            }
                            request.a(str + "-retry [timeout=" + i12 + "]");
                        } catch (VolleyError e13) {
                            request.a(str + "-timeout-giveup [timeout=" + i12 + "]");
                            throw e13;
                        }
                    }
                } catch (IOException e14) {
                    e = e14;
                    bArrB = null;
                }
            } catch (IOException e15) {
                e = e15;
                oVarA = null;
                bArrB = null;
            }
            request.a(str + "-retry [timeout=" + i12 + "]");
        }
    }
}

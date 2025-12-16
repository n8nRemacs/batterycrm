package com.google.net.cronet.okhttptransport;

import com.google.common.base.C37257c;
import com.google.common.base.b0;
import com.google.common.collect.H1;
import com.google.common.collect.W1;
import com.google.common.util.concurrent.p1;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Y;
import okio.e0;
import org.chromium.net.UrlResponseInfo;

/* compiled from: ResponseConverter.java */
/* loaded from: classes14.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final H1<String> f362576a = H1.t(4, "br", "deflate", "gzip", "x-gzip");

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f362577b;

    static {
        b0 b0VarE = b0.a(',').e();
        f362577b = new b0(b0VarE.f358998c, true, b0VarE.f358996a, b0VarE.f358999d);
    }

    public static Response a(Request request, g gVar) throws NumberFormatException, IOException {
        long j12;
        List<String> list;
        Response.Builder builder = new Response.Builder();
        try {
            UrlResponseInfo urlResponseInfo = (UrlResponseInfo) p1.a(gVar.f362529e);
            List<String> list2 = urlResponseInfo.getAllHeaders().get("Content-Type");
            String str = (list2 == null || list2.isEmpty()) ? null : (String) W1.d(list2);
            ArrayList arrayList = new ArrayList();
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            List<String> listEmptyList = Collections.emptyList();
            List<String> list3 = allHeaders.get("Content-Encoding");
            if (list3 == null) {
                listEmptyList.getClass();
            } else {
                listEmptyList = list3;
            }
            Iterator<String> it = listEmptyList.iterator();
            while (it.hasNext()) {
                W1.a(f362577b.c(it.next()), arrayList);
            }
            boolean z12 = arrayList.isEmpty() || !f362576a.containsAll(arrayList);
            String str2 = (!z12 || (list = urlResponseInfo.getAllHeaders().get("Content-Length")) == null || list.isEmpty()) ? null : (String) W1.d(list);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            try {
                e0 e0Var = (e0) p1.a(gVar.f362525a);
                if (request.method().equals("HEAD")) {
                    j12 = 0;
                } else {
                    j12 = -1;
                    if (str2 != null) {
                        try {
                            j12 = Long.parseLong(str2);
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                if ((httpStatusCode == 204 || httpStatusCode == 205) && j12 > 0) {
                    throw new ProtocolException("HTTP " + httpStatusCode + " had non-zero Content-Length: " + str2);
                }
                ResponseBody responseBodyCreate = ResponseBody.create(str != null ? MediaType.parse(str) : null, j12, new Y(e0Var));
                Response.Builder builderMessage = builder.request(request).code(urlResponseInfo.getHttpStatusCode()).message(urlResponseInfo.getHttpStatusText());
                String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                Protocol protocol = (negotiatedProtocol.contains("quic") || negotiatedProtocol.contains("h3")) ? Protocol.QUIC : (negotiatedProtocol.contains("spdy") || negotiatedProtocol.contains("h2")) ? Protocol.HTTP_2 : negotiatedProtocol.contains("http1.1") ? Protocol.HTTP_1_1 : Protocol.HTTP_1_0;
                builderMessage.protocol(protocol).body(responseBodyCreate);
                for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
                    if (z12 || (!C37257c.a(entry.getKey(), "Content-Length") && !C37257c.a(entry.getKey(), "Content-Encoding"))) {
                        builder.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                return builder.build();
            } catch (ExecutionException e12) {
                throw new IOException(e12);
            }
        } catch (ExecutionException e13) {
            throw new IOException(e13);
        }
    }
}

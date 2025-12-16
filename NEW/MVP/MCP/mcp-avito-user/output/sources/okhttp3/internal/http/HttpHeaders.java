package okhttp3.internal.http;

import X41.i;
import Y61.k;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43047d;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.C44802l;
import okio.C44805o;

/* compiled from: HttpHeaders.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokio/l;", "", "result", "Lkotlin/G0;", "readChallengeHeader", "(Lokio/l;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lokio/l;)Z", "", "prefix", "startsWith", "(Lokio/l;B)Z", "readQuotedString", "(Lokio/l;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", ContextActionHandler.Link.URL, "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lokio/o;", "QUOTED_STRING_DELIMITERS", "Lokio/o;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* loaded from: classes7.dex */
public final class HttpHeaders {

    @k
    private static final C44805o QUOTED_STRING_DELIMITERS;

    @k
    private static final C44805o TOKEN_DELIMITERS;

    static {
        C44805o.f420139e.getClass();
        QUOTED_STRING_DELIMITERS = C44805o.a.c("\"\\");
        TOKEN_DELIMITERS = C44805o.a.c("\t ,=");
    }

    @InterfaceC42830m
    public static final boolean hasBody(@k Response response) {
        return promisesBody(response);
    }

    @k
    public static final List<Challenge> parseChallenges(@k Headers headers, @k String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (str.equalsIgnoreCase(headers.name(i12))) {
                C44802l c44802l = new C44802l();
                c44802l.O(headers.value(i12));
                try {
                    readChallengeHeader(c44802l, arrayList);
                } catch (EOFException e12) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e12);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@k Response response) {
        if (L.f(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(okio.C44802l r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.W2()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.P0.c()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L5e
            if (r6 != 0) goto L40
            boolean r2 = r7.W2()
            if (r2 == 0) goto L5e
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = androidx.compose.foundation.H.r(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = kotlin.text.C43066x.Z(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5e:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L68:
            if (r3 != 0) goto L79
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb2
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L79:
            if (r6 == 0) goto Lb2
            r5 = 1
            if (r6 <= r5) goto L7f
            return
        L7f:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L86
            return
        L86:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L93
            java.lang.String r5 = readQuotedString(r7)
            goto L97
        L93:
            java.lang.String r5 = readToken(r7)
        L97:
            if (r5 != 0) goto L9a
            return
        L9a:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La3
            return
        La3:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb0
            boolean r3 = r7.W2()
            if (r3 != 0) goto Lb0
            return
        Lb0:
            r3 = r0
            goto L68
        Lb2:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.l, java.util.List):void");
    }

    private static final String readQuotedString(C44802l c44802l) {
        if (c44802l.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C44802l c44802l2 = new C44802l();
        while (true) {
            long jO2 = c44802l.o(0L, QUOTED_STRING_DELIMITERS);
            if (jO2 == -1) {
                return null;
            }
            if (c44802l.m(jO2) == 34) {
                c44802l2.write(c44802l, jO2);
                c44802l.readByte();
                return c44802l2.u();
            }
            if (c44802l.f420125c == jO2 + 1) {
                return null;
            }
            c44802l2.write(c44802l, jO2);
            c44802l.readByte();
            c44802l2.write(c44802l, 1L);
        }
    }

    private static final String readToken(C44802l c44802l) {
        long jO2 = c44802l.o(0L, TOKEN_DELIMITERS);
        if (jO2 == -1) {
            jO2 = c44802l.f420125c;
        }
        if (jO2 != 0) {
            return c44802l.z1(jO2, C43047d.f410589b);
        }
        return null;
    }

    public static final void receiveHeaders(@k CookieJar cookieJar, @k HttpUrl httpUrl, @k Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(C44802l c44802l) {
        boolean z12 = false;
        while (!c44802l.W2()) {
            byte bM2 = c44802l.m(0L);
            if (bM2 == 44) {
                c44802l.readByte();
                z12 = true;
            } else {
                if (bM2 != 32 && bM2 != 9) {
                    break;
                }
                c44802l.readByte();
            }
        }
        return z12;
    }

    private static final boolean startsWith(C44802l c44802l, byte b12) {
        return !c44802l.W2() && c44802l.m(0L) == b12;
    }
}

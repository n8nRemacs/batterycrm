package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* loaded from: classes.dex */
public abstract class w77 {
    public static final c17[] a;
    public static final Map b;

    static {
        c17 c17Var = new c17(c17.i, "");
        xx0 xx0Var = c17.f;
        c17 c17Var2 = new c17(xx0Var, HttpGet.METHOD_NAME);
        c17 c17Var3 = new c17(xx0Var, HttpPost.METHOD_NAME);
        xx0 xx0Var2 = c17.g;
        c17 c17Var4 = new c17(xx0Var2, "/");
        c17 c17Var5 = new c17(xx0Var2, "/index.html");
        xx0 xx0Var3 = c17.h;
        c17 c17Var6 = new c17(xx0Var3, HttpHost.DEFAULT_SCHEME_NAME);
        c17 c17Var7 = new c17(xx0Var3, "https");
        xx0 xx0Var4 = c17.e;
        c17[] c17VarArr = {c17Var, c17Var2, c17Var3, c17Var4, c17Var5, c17Var6, c17Var7, new c17(xx0Var4, "200"), new c17(xx0Var4, "204"), new c17(xx0Var4, "206"), new c17(xx0Var4, "304"), new c17(xx0Var4, "400"), new c17(xx0Var4, "404"), new c17(xx0Var4, "500"), new c17("accept-charset", ""), new c17("accept-encoding", "gzip, deflate"), new c17("accept-language", ""), new c17("accept-ranges", ""), new c17("accept", ""), new c17("access-control-allow-origin", ""), new c17("age", ""), new c17("allow", ""), new c17("authorization", ""), new c17("cache-control", ""), new c17("content-disposition", ""), new c17("content-encoding", ""), new c17("content-language", ""), new c17("content-length", ""), new c17("content-location", ""), new c17("content-range", ""), new c17("content-type", ""), new c17("cookie", ""), new c17("date", ""), new c17("etag", ""), new c17("expect", ""), new c17(ClientCookie.EXPIRES_ATTR, ""), new c17("from", ""), new c17(CandidateTypeHintConfig.TYPE_HOST, ""), new c17("if-match", ""), new c17("if-modified-since", ""), new c17("if-none-match", ""), new c17("if-range", ""), new c17("if-unmodified-since", ""), new c17("last-modified", ""), new c17("link", ""), new c17("location", ""), new c17("max-forwards", ""), new c17("proxy-authenticate", ""), new c17("proxy-authorization", ""), new c17("range", ""), new c17("referer", ""), new c17("refresh", ""), new c17("retry-after", ""), new c17("server", ""), new c17("set-cookie", ""), new c17("strict-transport-security", ""), new c17("transfer-encoding", ""), new c17("user-agent", ""), new c17("vary", ""), new c17("via", ""), new c17("www-authenticate", "")};
        a = c17VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c17VarArr[i].b)) {
                linkedHashMap.put(c17VarArr[i].b, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(xx0 xx0Var) throws IOException {
        int iD = xx0Var.d();
        for (int i = 0; i < iD; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bH = xx0Var.h(i);
            if (b2 <= bH && b3 >= bH) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(xx0Var.l()));
            }
        }
    }
}

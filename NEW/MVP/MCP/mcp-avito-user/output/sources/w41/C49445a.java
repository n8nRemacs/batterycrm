package w41;

import AK.c;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.dsn.InvalidDsnException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.slf4j.b;

/* compiled from: Dsn.java */
/* renamed from: w41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49445a {

    /* renamed from: k, reason: collision with root package name */
    public static final org.slf4j.a f441268k = b.d(C49445a.class);

    /* renamed from: a, reason: collision with root package name */
    public final String f441269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f441270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f441271c;

    /* renamed from: d, reason: collision with root package name */
    public final String f441272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f441273e;

    /* renamed from: f, reason: collision with root package name */
    public final int f441274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f441275g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<String> f441276h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f441277i;

    /* renamed from: j, reason: collision with root package name */
    public final URI f441278j;

    public C49445a(String str) {
        URI uriCreate = URI.create(str);
        if (uriCreate == null) {
            throw new InvalidDsnException("DSN constructed with null value!");
        }
        this.f441277i = new HashMap();
        this.f441276h = new HashSet();
        String scheme = uriCreate.getScheme();
        if (scheme != null) {
            String[] strArrSplit = scheme.split("\\+");
            this.f441276h.addAll(Arrays.asList(strArrSplit).subList(0, strArrSplit.length - 1));
            this.f441272d = strArrSplit[strArrSplit.length - 1];
        }
        String userInfo = uriCreate.getUserInfo();
        if (userInfo != null) {
            String[] strArrSplit2 = userInfo.split(":");
            this.f441270b = strArrSplit2[0];
            if (strArrSplit2.length > 1) {
                this.f441269a = strArrSplit2[1];
            }
        }
        this.f441273e = uriCreate.getHost();
        this.f441274f = uriCreate.getPort();
        String path = uriCreate.getPath();
        if (path != null) {
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            this.f441275g = path.substring(0, iLastIndexOf);
            this.f441271c = path.substring(iLastIndexOf);
        }
        String query = uriCreate.getQuery();
        if (query != null && !query.isEmpty()) {
            for (String str2 : query.split(ContainerUtils.FIELD_DELIMITER)) {
                try {
                    String[] strArrSplit3 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    this.f441277i.put(URLDecoder.decode(strArrSplit3[0], Constants.ENCODING), strArrSplit3.length > 1 ? URLDecoder.decode(strArrSplit3[1], Constants.ENCODING) : null);
                } catch (UnsupportedEncodingException e12) {
                    throw new IllegalArgumentException(c.k("Impossible to decode the query parameter '", str2, "'"), e12);
                }
            }
        }
        this.f441277i = Collections.unmodifiableMap(this.f441277i);
        this.f441276h = Collections.unmodifiableSet(this.f441276h);
        LinkedList linkedList = new LinkedList();
        if (this.f441273e == null) {
            linkedList.add("host");
        }
        String str3 = this.f441272d;
        if (str3 != null && !str3.equalsIgnoreCase("noop") && !this.f441272d.equalsIgnoreCase("out")) {
            if (this.f441270b == null) {
                linkedList.add("public key");
            }
            String str4 = this.f441271c;
            if (str4 == null || str4.isEmpty()) {
                linkedList.add("project ID");
            }
        }
        if (!linkedList.isEmpty()) {
            throw new InvalidDsnException("Invalid DSN, the following properties aren't set '" + linkedList + "'");
        }
        try {
            this.f441278j = new URI(this.f441272d, null, this.f441273e, this.f441274f, this.f441275g, null, null);
        } catch (URISyntaxException e13) {
            throw new InvalidDsnException("Impossible to determine Sentry's URI from the DSN '" + uriCreate + "'", e13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C49445a c49445a = (C49445a) obj;
        if (this.f441274f != c49445a.f441274f || !this.f441273e.equals(c49445a.f441273e) || !this.f441277i.equals(c49445a.f441277i) || !this.f441275g.equals(c49445a.f441275g) || !this.f441271c.equals(c49445a.f441271c)) {
            return false;
        }
        String str = this.f441272d;
        if (str == null ? c49445a.f441272d != null : !str.equals(c49445a.f441272d)) {
            return false;
        }
        if (!this.f441276h.equals(c49445a.f441276h) || !this.f441270b.equals(c49445a.f441270b)) {
            return false;
        }
        String str2 = this.f441269a;
        String str3 = c49445a.f441269a;
        return str2 == str3 || (str2 != null && str2.equals(str3));
    }

    public final int hashCode() {
        return this.f441275g.hashCode() + ((H.d(H.d(this.f441270b.hashCode() * 31, 31, this.f441271c), 31, this.f441273e) + this.f441274f) * 31);
    }

    public final String toString() {
        return "Dsn{uri=" + this.f441278j + '}';
    }
}

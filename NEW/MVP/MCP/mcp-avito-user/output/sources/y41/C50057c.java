package y41;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import x41.C49764a;

/* compiled from: HttpInterface.java */
/* renamed from: y41.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50057c implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final String f442897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f442898c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f442899d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final String f442900e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f442901f;

    /* renamed from: g, reason: collision with root package name */
    public final String f442902g;

    /* renamed from: h, reason: collision with root package name */
    public final String f442903h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442904i;

    /* renamed from: j, reason: collision with root package name */
    public final String f442905j;

    /* renamed from: k, reason: collision with root package name */
    public final String f442906k;

    /* renamed from: l, reason: collision with root package name */
    public final int f442907l;

    /* renamed from: m, reason: collision with root package name */
    public final String f442908m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f442909n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f442910o;

    /* renamed from: p, reason: collision with root package name */
    public final String f442911p;

    /* renamed from: q, reason: collision with root package name */
    public final String f442912q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f442913r;

    public C50057c(HttpServletRequest httpServletRequest, C49764a c49764a) {
        this.f442897b = httpServletRequest.getRequestURL().toString();
        this.f442898c = httpServletRequest.getMethod();
        for (Map.Entry entry : httpServletRequest.getParameterMap().entrySet()) {
            this.f442899d.put(entry.getKey(), Arrays.asList((Object[]) entry.getValue()));
        }
        this.f442900e = httpServletRequest.getQueryString();
        if (httpServletRequest.getCookies() != null) {
            this.f442901f = new HashMap();
            for (Cookie cookie : httpServletRequest.getCookies()) {
                this.f442901f.put(cookie.getName(), cookie.getValue());
            }
        } else {
            this.f442901f = Collections.emptyMap();
        }
        this.f442902g = c49764a.a(httpServletRequest);
        this.f442903h = httpServletRequest.getServerName();
        this.f442904i = httpServletRequest.getServerPort();
        this.f442905j = httpServletRequest.getLocalAddr();
        this.f442906k = httpServletRequest.getLocalName();
        this.f442907l = httpServletRequest.getLocalPort();
        this.f442908m = httpServletRequest.getProtocol();
        this.f442909n = httpServletRequest.isSecure();
        this.f442910o = httpServletRequest.isAsyncStarted();
        this.f442911p = httpServletRequest.getAuthType();
        this.f442912q = httpServletRequest.getRemoteUser();
        this.f442913r = new HashMap();
        Iterator it = Collections.list(httpServletRequest.getHeaderNames()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f442913r.put(str, Collections.list(httpServletRequest.getHeaders(str)));
        }
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "sentry.interfaces.Http";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C50057c c50057c = (C50057c) obj;
        if (this.f442910o != c50057c.f442910o || this.f442907l != c50057c.f442907l || this.f442909n != c50057c.f442909n || this.f442904i != c50057c.f442904i) {
            return false;
        }
        String str = c50057c.f442911p;
        String str2 = this.f442911p;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!this.f442901f.equals(c50057c.f442901f) || !this.f442913r.equals(c50057c.f442913r)) {
            return false;
        }
        String str3 = c50057c.f442905j;
        String str4 = this.f442905j;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = c50057c.f442906k;
        String str6 = this.f442906k;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = c50057c.f442898c;
        String str8 = this.f442898c;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        if (!this.f442899d.equals(c50057c.f442899d)) {
            return false;
        }
        String str9 = c50057c.f442908m;
        String str10 = this.f442908m;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        String str11 = c50057c.f442900e;
        String str12 = this.f442900e;
        if (str12 == null ? str11 != null : !str12.equals(str11)) {
            return false;
        }
        String str13 = c50057c.f442902g;
        String str14 = this.f442902g;
        if (str14 == null ? str13 != null : !str14.equals(str13)) {
            return false;
        }
        String str15 = c50057c.f442912q;
        String str16 = this.f442912q;
        if (str16 == null ? str15 != null : !str16.equals(str15)) {
            return false;
        }
        if (!this.f442897b.equals(c50057c.f442897b)) {
            return false;
        }
        String str17 = c50057c.f442903h;
        String str18 = this.f442903h;
        return str18 == null ? str17 == null : str18.equals(str17);
    }

    public final int hashCode() {
        int iHashCode = this.f442897b.hashCode() * 31;
        String str = this.f442898c;
        return this.f442899d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HttpInterface{requestUrl='" + this.f442897b + "', method='" + this.f442898c + "', queryString='" + this.f442900e + "', parameters=" + this.f442899d + '}';
    }
}

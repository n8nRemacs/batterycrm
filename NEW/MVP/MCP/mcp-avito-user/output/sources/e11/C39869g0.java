package e11;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@TargetApi(9)
/* renamed from: e11.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39869g0 implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final SharedPreferences f394601a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final HashMap f394602b;

    public C39869g0(@j.N Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mytarget_httpcookie_prefs", 0);
        this.f394601a = sharedPreferences;
        HashMap map = new HashMap();
        this.f394602b = map;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            try {
                URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                String str = (String) entry.getValue();
                new C39890n0();
                HttpCookie httpCookieA = C39890n0.a(str);
                Set hashSet = (Set) map.get(uri);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(uri, hashSet);
                }
                hashSet.add(httpCookieA);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    @j.N
    public final ArrayList a(@j.N URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f394602b.entrySet()) {
            URI uri2 = (URI) entry.getKey();
            String host = uri2.getHost();
            String host2 = uri.getHost();
            if (!host2.equals(host)) {
                if (host2.endsWith("." + host)) {
                }
            }
            String path = uri2.getPath();
            String path2 = uri.getPath();
            if (path2.equals(path) || ((path2.startsWith(path) && path.charAt(path.length() - 1) == '/') || (path2.startsWith(path) && path2.substring(path.length()).charAt(0) == '/'))) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences.Editor editorEdit = this.f394601a.edit();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                editorEdit.remove(uri.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((HttpCookie) it2.next()).getName());
            }
            editorEdit.apply();
        }
        return new ArrayList(hashSet);
    }

    @Override // java.net.CookieStore
    public final synchronized void add(URI uri, HttpCookie httpCookie) {
        try {
            if (httpCookie.getDomain() != null) {
                String domain = httpCookie.getDomain();
                if (domain.charAt(0) == '.') {
                    domain = domain.substring(1);
                }
                try {
                    uri = new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), null);
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            Set hashSet = (Set) this.f394602b.get(uri);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f394602b.put(uri, hashSet);
            }
            hashSet.remove(httpCookie);
            hashSet.add(httpCookie);
            b(uri, httpCookie);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b(@j.N URI uri, @j.N HttpCookie httpCookie) {
        String string;
        SharedPreferences.Editor editorEdit = this.f394601a.edit();
        String str = uri.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + httpCookie.getName();
        new C39890n0();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", httpCookie.getName());
            jSONObject.putOpt("value", httpCookie.getValue());
            jSONObject.putOpt("comment", httpCookie.getComment());
            jSONObject.putOpt("commentUrl", httpCookie.getCommentURL());
            jSONObject.putOpt("domain", httpCookie.getDomain());
            jSONObject.putOpt("maxage", Long.valueOf(httpCookie.getMaxAge()));
            jSONObject.putOpt("path", httpCookie.getPath());
            jSONObject.putOpt("portlist", httpCookie.getPortlist());
            jSONObject.putOpt("version", Integer.valueOf(httpCookie.getVersion()));
            jSONObject.putOpt("secure", Boolean.valueOf(httpCookie.getSecure()));
            jSONObject.putOpt("discard", Boolean.valueOf(httpCookie.getDiscard()));
            jSONObject.putOpt("httpOnly", Boolean.valueOf(httpCookie.isHttpOnly()));
            string = jSONObject.toString();
        } catch (Throwable th2) {
            th2.getMessage();
            string = null;
        }
        editorEdit.putString(str, string);
        editorEdit.apply();
    }

    @Override // java.net.CookieStore
    @j.N
    public final synchronized List<HttpCookie> get(URI uri) {
        return a(uri);
    }

    @Override // java.net.CookieStore
    @j.N
    public final synchronized List<HttpCookie> getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f394602b.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(a((URI) it.next()));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    @j.N
    public final synchronized List<URI> getURIs() {
        return new ArrayList(this.f394602b.keySet());
    }

    @Override // java.net.CookieStore
    public final synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z12;
        try {
            Set set = (Set) this.f394602b.get(uri);
            z12 = set != null && set.remove(httpCookie);
            if (z12) {
                SharedPreferences.Editor editorEdit = this.f394601a.edit();
                editorEdit.remove(uri.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + httpCookie.getName());
                editorEdit.apply();
            }
        } finally {
        }
        return z12;
    }

    @Override // java.net.CookieStore
    public final synchronized boolean removeAll() {
        this.f394602b.clear();
        this.f394601a.edit().clear().apply();
        return true;
    }
}

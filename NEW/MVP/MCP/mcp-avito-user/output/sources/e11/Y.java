package e11;

import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public static volatile Y f394509b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final CookieManager f394510a;

    public Y(@j.N CookieManager cookieManager) {
        this.f394510a = cookieManager;
    }

    public static void a(@j.N HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                httpURLConnection.addRequestProperty(str, (String) it.next());
            }
        }
    }
}

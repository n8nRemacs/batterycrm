package com.avito.android.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* compiled from: PreferencesCookieJar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/b4;", "Lokhttp3/CookieJar;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.b4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35759b4 implements CookieJar {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.o f318827a;

    public C35759b4(@Y61.k AK0.o oVar) {
        this.f318827a = oVar;
    }

    @Override // okhttp3.CookieJar
    @Y61.k
    public final List<Cookie> loadForRequest(@Y61.k HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AK0.o oVar = this.f318827a;
        Map<String, ?> all = oVar.f316a.getAll();
        for (String str : all.keySet()) {
            try {
                Cookie cookie = Cookie.INSTANCE.parse(httpUrl, (String) all.get(str));
                if (cookie != null) {
                    if (cookie.expiresAt() > System.currentTimeMillis()) {
                        String strEncodedPath = httpUrl.encodedPath();
                        String strPath = cookie.path();
                        if (kotlin.jvm.internal.L.f(strPath, "/") ? true : kotlin.jvm.internal.L.f(strPath, strEncodedPath)) {
                            arrayList.add(cookie);
                        }
                    } else {
                        arrayList2.add(str);
                    }
                }
            } catch (Throwable th2) {
                V2.f318762a.a("PreferencesCookieJar", "failed when execute loadForRequest", new CookieJarException(androidx.camera.camera2.internal.G.f("PreferencesCookieJar could not handle cookie ", str), th2));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            oVar.remove((String) it.next());
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(@Y61.k HttpUrl httpUrl, @Y61.k List<Cookie> list) {
        for (Cookie cookie : list) {
            this.f318827a.putString(cookie.name(), cookie.toString());
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface gn extends dn {

    public interface a {
        gn a();
    }

    long a(kn knVar);

    void a(ua1 ua1Var);

    default Map<String, List<String>> b() {
        return Collections.emptyMap();
    }

    void close();

    @j.P
    Uri d();
}

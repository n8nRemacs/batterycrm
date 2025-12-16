package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39301a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final fc1 f383362a;

    public C39301a(@Y61.k fc1 fc1Var) {
        this.f383362a = fc1Var;
    }

    public final boolean a(@Y61.l String str) {
        List<String> pathSegments;
        this.f383362a.getClass();
        String str2 = null;
        try {
            pathSegments = Uri.parse(str).getPathSegments();
        } catch (Throwable unused) {
            pathSegments = null;
        }
        if (pathSegments != null && !pathSegments.isEmpty()) {
            str2 = pathSegments.get(0);
        }
        return "appcry".equals(str2);
    }
}

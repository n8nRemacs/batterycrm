package com.google.android.play.core.splitinstall.testing;

import j.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f358903a;

    static {
        C37245c c37245c = new C37245c();
        c37245c.f358855b = new HashMap();
        c37245c.a(Collections.unmodifiableMap(c37245c.b()));
        Map map = c37245c.f358855b;
        if (map == null) {
            throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        }
        f358903a = new f(c37245c.f358854a, map, null);
    }

    @PY0.a
    @P
    public abstract Integer a();

    public abstract Map b();
}

package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f358701a = new HashMap();

    public final void a(String str, String str2, String str3) {
        HashMap map = this.f358701a;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
    }

    public final Z b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f358701a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new Z(Collections.unmodifiableMap(map), null);
    }
}

package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakHashMap<Activity, a> f381684a = new WeakHashMap<>();

    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    public boolean a(@j.P Activity activity, @j.N a aVar) {
        if (activity != null && this.f381684a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f381684a.put(activity, aVar);
        return true;
    }
}

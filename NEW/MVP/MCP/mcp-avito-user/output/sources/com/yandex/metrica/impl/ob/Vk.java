package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes7.dex */
class Vk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ok f379791a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Yk f379792b;

    public Vk(@j.N Ok ok2, @j.N Yk yk2) {
        this.f379791a = ok2;
        this.f379792b = yk2;
    }

    public boolean a(@j.N Activity activity, @j.N C39227wl c39227wl) {
        Bundle bundleA = this.f379791a.a(activity);
        return this.f379792b.a(bundleA == null ? null : bundleA.getString("yandex:ads:context"), c39227wl);
    }
}

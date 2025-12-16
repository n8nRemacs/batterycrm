package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39354p0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final Object f388673b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C39354p0 f388674c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f388675a = new HashMap();

    private C39354p0() {
        a("window_type_browser", new C39342l0());
    }

    @j.N
    public static C39354p0 a() {
        if (f388674c == null) {
            synchronized (f388673b) {
                try {
                    if (f388674c == null) {
                        f388674c = new C39354p0();
                    }
                } finally {
                }
            }
        }
        return f388674c;
    }

    public final synchronized void a(@j.N String str, @j.N InterfaceC39351o0 interfaceC39351o0) {
        if (!this.f388675a.containsKey(str)) {
            this.f388675a.put(str, interfaceC39351o0);
        }
    }

    @j.P
    public final synchronized InterfaceC39348n0 a(@j.N Context context, @j.N RelativeLayout relativeLayout, @j.P ResultReceiver resultReceiver, @j.N C39311c1 c39311c1, @j.N C39362s0 c39362s0, @j.N Intent intent, @j.N Window window) {
        InterfaceC39351o0 interfaceC39351o0;
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (interfaceC39351o0 = (InterfaceC39351o0) this.f388675a.get(stringExtra)) == null) {
            return null;
        }
        return interfaceC39351o0.a(context, relativeLayout, c39311c1, c39362s0, intent, window);
    }
}

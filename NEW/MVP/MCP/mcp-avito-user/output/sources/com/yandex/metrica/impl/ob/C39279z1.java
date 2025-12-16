package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39279z1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final B0 f382295a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f382296b;

    public C39279z1(@j.N Xl xl2) {
        this(xl2, new B0());
    }

    public void a(@j.N Context context) {
        long jOptLong;
        String strA;
        synchronized (this) {
        }
        if (this.f382296b) {
            return;
        }
        synchronized (this) {
            try {
                strA = L0.a(this.f382295a.a(context, "metrica_service_settings.dat"));
            } catch (Throwable unused) {
            }
            jOptLong = !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
        }
        if (jOptLong > 0) {
            try {
                Thread.sleep(jOptLong);
            } catch (Throwable unused2) {
            }
        }
        this.f382296b = true;
    }

    @j.k0
    public C39279z1(@j.N Xl xl2, @j.N B0 b02) {
        this.f382296b = false;
        this.f382295a = b02;
    }
}

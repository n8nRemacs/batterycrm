package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f354865a;

    public Q5(I2 i22) {
        this.f354865a = i22;
    }

    @j.l0
    public final void a(String str, Bundle bundle) {
        String string;
        I2 i22 = this.f354865a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        if (i22.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C36876f2 c36876f2 = i22.f354716h;
        I2.d(c36876f2);
        c36876f2.f355146x.b(string);
        I2.d(c36876f2);
        i22.f354722n.getClass();
        c36876f2.f355147y.b(System.currentTimeMillis());
    }

    public final boolean b() {
        C36876f2 c36876f2 = this.f354865a.f354716h;
        I2.d(c36876f2);
        return c36876f2.f355147y.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        I2 i22 = this.f354865a;
        i22.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C36876f2 c36876f2 = i22.f354716h;
        I2.d(c36876f2);
        return jCurrentTimeMillis - c36876f2.f355147y.a() > i22.f354715g.l(null, E.f354600U);
    }
}

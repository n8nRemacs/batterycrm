package com.google.firebase.installations;

import android.text.TextUtils;
import j.N;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import zZ0.C50533b;

/* compiled from: Utils.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final long f361684b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f361685c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static p f361686d;

    /* renamed from: a, reason: collision with root package name */
    public final C50533b f361687a;

    public p(C50533b c50533b) {
        this.f361687a = c50533b;
    }

    public final boolean a(@N com.google.firebase.installations.local.c cVar) {
        if (TextUtils.isEmpty(cVar.a())) {
            return true;
        }
        long jB2 = cVar.b() + cVar.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f361687a.getClass();
        return jB2 < timeUnit.toSeconds(System.currentTimeMillis()) + f361684b;
    }
}

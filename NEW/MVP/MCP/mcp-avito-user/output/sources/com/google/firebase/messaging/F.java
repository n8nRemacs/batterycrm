package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j.k0;
import j.l0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes6.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f361743a;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f361747e;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    @k0
    public final ArrayDeque<String> f361746d = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f361744b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    public final String f361745c = ",";

    public F(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f361743a = sharedPreferences;
        this.f361747e = scheduledThreadPoolExecutor;
    }

    @l0
    public static F a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        F f12 = new F(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (f12.f361746d) {
            try {
                f12.f361746d.clear();
                String string = f12.f361743a.getString(f12.f361744b, "");
                if (!TextUtils.isEmpty(string) && string.contains(f12.f361745c)) {
                    String[] strArrSplit = string.split(f12.f361745c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            f12.f361746d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return f12;
    }
}

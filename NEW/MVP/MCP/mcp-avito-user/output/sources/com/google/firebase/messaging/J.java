package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: TopicsStore.java */
/* loaded from: classes6.dex */
final class J {

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public static WeakReference<J> f361785c;

    /* renamed from: a, reason: collision with root package name */
    public F f361786a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f361787b;

    public J(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f361787b = scheduledThreadPoolExecutor;
    }

    @j.P
    public final synchronized I a() {
        String strPeek;
        I i12;
        F f12 = this.f361786a;
        synchronized (f12.f361746d) {
            strPeek = f12.f361746d.peek();
        }
        Pattern pattern = I.f361781d;
        i12 = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                i12 = new I(strArrSplit[0], strArrSplit[1]);
            }
        }
        return i12;
    }
}

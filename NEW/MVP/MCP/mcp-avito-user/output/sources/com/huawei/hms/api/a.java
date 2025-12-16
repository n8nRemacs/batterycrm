package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BindingFailedResolveMgr.java */
/* loaded from: classes7.dex */
class a {

    /* renamed from: b, reason: collision with root package name */
    static final a f363327b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f363328c = new Object();

    /* renamed from: a, reason: collision with root package name */
    List<Activity> f363329a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f363328c) {
            try {
                for (Activity activity2 : this.f363329a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f363329a.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f363328c) {
            this.f363329a.remove(activity);
        }
    }
}

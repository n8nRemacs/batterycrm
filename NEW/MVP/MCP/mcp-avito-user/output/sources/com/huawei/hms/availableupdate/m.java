package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AppSpoofResolveMgr.java */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f363402c = new m();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f363403d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f363404a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public List<Activity> f363405b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f363403d) {
            try {
                for (Activity activity2 : this.f363405b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f363405b.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f363403d) {
            this.f363405b.remove(activity);
        }
    }

    public void a(boolean z12) {
        this.f363404a.set(z12);
    }

    public AtomicBoolean a() {
        return this.f363404a;
    }
}

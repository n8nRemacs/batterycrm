package com.yandex.mobile.ads.impl;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.C42745f0;

/* renamed from: com.yandex.mobile.ads.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39326g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ArrayList f385542a;

    /* renamed from: com.yandex.mobile.ads.impl.g0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<WeakReference<Activity>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f385543a = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            Activity activity = weakReference.get();
            return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
        }
    }

    public C39326g0(@Y61.l Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f385542a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(@Y61.k Activity activity) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f385542a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.L.f(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                this.f385542a.add(new WeakReference(activity));
                Objects.toString(activity);
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@Y61.k Activity activity) {
        Object next;
        synchronized (this) {
            try {
                Iterator it = this.f385542a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (kotlin.jvm.internal.L.f(((WeakReference) next).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) next;
                if (weakReference != null) {
                    this.f385542a.remove(weakReference);
                    Objects.toString(activity);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Y61.l
    public final Activity a() {
        Activity activity;
        synchronized (this) {
            C42745f0.l0(a.f385543a, this.f385542a);
            WeakReference weakReference = (WeakReference) C42745f0.G(this.f385542a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }
}

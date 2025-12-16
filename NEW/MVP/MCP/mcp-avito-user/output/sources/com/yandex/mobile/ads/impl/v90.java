package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class v90 {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f390825d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static volatile v90 f390826e;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f390827a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final mj0 f390828b = new mj0("YandexMobileAds.BaseController");

    /* renamed from: c, reason: collision with root package name */
    private int f390829c = 0;

    private v90() {
    }

    @j.N
    public static v90 a() {
        if (f390826e == null) {
            synchronized (f390825d) {
                try {
                    if (f390826e == null) {
                        f390826e = new v90();
                    }
                } finally {
                }
            }
        }
        return f390826e;
    }

    @j.N
    public final Executor b() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f390825d) {
            try {
                if (this.f390827a.size() < 4) {
                    executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f390828b);
                    this.f390827a.add(executorNewSingleThreadExecutor);
                } else {
                    executorNewSingleThreadExecutor = (Executor) this.f390827a.get(this.f390829c);
                    int i12 = this.f390829c + 1;
                    this.f390829c = i12;
                    if (i12 == 4) {
                        this.f390829c = 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorNewSingleThreadExecutor;
    }
}

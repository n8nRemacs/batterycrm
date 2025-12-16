package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes13.dex */
class b implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadFactory f360807f = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f360808b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    public final String f360809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360810d;

    /* renamed from: e, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f360811e;

    public b(String str, int i12, @I41.h StrictMode.ThreadPolicy threadPolicy) {
        this.f360809c = str;
        this.f360810d = i12;
        this.f360811e = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f360807f.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f360809c + " Thread #" + this.f360808b.getAndIncrement());
        return threadNewThread;
    }
}

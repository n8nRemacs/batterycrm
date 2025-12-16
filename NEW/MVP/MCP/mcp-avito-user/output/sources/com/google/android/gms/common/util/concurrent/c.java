package com.google.android.gms.common.util.concurrent;

import j.N;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final String f349607b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f349608c = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f349609d = Executors.defaultThreadFactory();

    @RX0.a
    public c(@N String str) {
        this.f349607b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @N
    public final Thread newThread(@N Runnable runnable) {
        Thread threadNewThread = this.f349609d.newThread(new d(runnable));
        threadNewThread.setName(this.f349607b + "[" + this.f349608c.getAndIncrement() + "]");
        return threadNewThread;
    }
}

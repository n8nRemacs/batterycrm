package com.google.android.gms.common.util.concurrent;

import j.N;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final String f349605b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f349606c = Executors.defaultThreadFactory();

    @RX0.a
    public b(@N String str) {
        this.f349605b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @N
    public final Thread newThread(@N Runnable runnable) {
        Thread threadNewThread = this.f349606c.newThread(new d(runnable));
        threadNewThread.setName(this.f349605b);
        return threadNewThread;
    }
}

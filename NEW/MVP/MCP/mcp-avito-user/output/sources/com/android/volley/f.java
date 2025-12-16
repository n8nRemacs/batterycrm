package com.android.volley;

import j.N;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: AsyncRequestQueue.java */
/* loaded from: classes10.dex */
class f implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@N Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName("Volley-" + ((String) null));
        return threadNewThread;
    }
}

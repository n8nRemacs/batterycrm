package com.bumptech.glide.load.engine;

import android.os.Process;
import j.N;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* renamed from: com.bumptech.glide.load.engine.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class ThreadFactoryC36355a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class RunnableC10501a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f338910b;

        public RunnableC10501a(Runnable runnable) {
            this.f338910b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            this.f338910b.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@N Runnable runnable) {
        return new Thread(new RunnableC10501a(runnable), "glide-active-resources");
    }
}

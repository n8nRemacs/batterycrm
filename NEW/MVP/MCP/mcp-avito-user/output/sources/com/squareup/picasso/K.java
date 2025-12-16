package com.squareup.picasso;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import okio.C44805o;

/* compiled from: Utils.java */
/* loaded from: classes7.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final StringBuilder f366360a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public static final C44805o f366361b;

    /* renamed from: c, reason: collision with root package name */
    public static final C44805o f366362c;

    /* compiled from: Utils.java */
    public static class a extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static {
        C44805o.f420139e.getClass();
        f366361b = C44805o.a.c("RIFF");
        f366362c = C44805o.a.c("WEBP");
    }
}

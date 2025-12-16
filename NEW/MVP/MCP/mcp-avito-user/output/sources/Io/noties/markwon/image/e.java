package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import j.N;

/* compiled from: AsyncDrawableScheduler.java */
/* loaded from: classes8.dex */
public abstract class e {

    /* compiled from: AsyncDrawableScheduler.java */
    public static class a implements Drawable.Callback {

        /* compiled from: AsyncDrawableScheduler.java */
        /* renamed from: io.noties.markwon.image.e$a$a, reason: collision with other inner class name */
        public class RunnableC11437a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* compiled from: AsyncDrawableScheduler.java */
        public interface b {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@N Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw null;
            }
            drawable.getBounds();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j12) {
            SystemClock.uptimeMillis();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
            throw null;
        }
    }

    /* compiled from: AsyncDrawableScheduler.java */
    public static class b implements a.b, Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }
}

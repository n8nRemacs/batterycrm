package com.yandex.mobile.ads.exo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.fs;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.qy;
import j.P;
import j.X;

@X
/* loaded from: classes8.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f383145d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f383146e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f383147a;

    /* renamed from: b, reason: collision with root package name */
    private final a f383148b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f383149c;

    public /* synthetic */ PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z12, int i12) {
        this(aVar, surfaceTexture, z12);
    }

    public static synchronized boolean a(Context context) {
        try {
            if (!f383146e) {
                f383145d = qy.a(context) ? qy.c() ? 1 : 2 : 0;
                f383146e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f383145d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f383148b) {
            try {
                if (!this.f383149c) {
                    this.f383148b.a();
                    this.f383149c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z12) {
        super(surfaceTexture);
        this.f383148b = aVar;
        this.f383147a = z12;
    }

    public static PlaceholderSurface a(Context context, boolean z12) {
        db.b(!z12 || a(context));
        return new a().a(z12 ? f383145d : 0);
    }

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private fs f383150b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f383151c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private Error f383152d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private RuntimeException f383153e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private PlaceholderSurface f383154f;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i12) {
            this.f383150b.getClass();
            this.f383150b.a(i12);
            this.f383154f = new PlaceholderSurface(this, this.f383150b.a(), i12 != 0, 0);
        }

        public final PlaceholderSurface a(int i12) {
            boolean z12;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f383151c = handler;
            this.f383150b = new fs(handler);
            synchronized (this) {
                z12 = false;
                this.f383151c.obtainMessage(1, i12, 0).sendToTarget();
                while (this.f383154f == null && this.f383153e == null && this.f383152d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z12 = true;
                    }
                }
            }
            if (z12) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f383153e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f383152d;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.f383154f;
            placeholderSurface.getClass();
            return placeholderSurface;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            try {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return true;
                    }
                    try {
                        this.f383150b.getClass();
                        this.f383150b.b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    ka0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f383152d = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    ka0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f383153e = e13;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        public final void a() {
            this.f383151c.getClass();
            this.f383151c.sendEmptyMessage(2);
        }
    }
}

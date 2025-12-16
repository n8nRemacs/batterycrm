package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.my.target.P0;
import e11.W1;
import java.util.Objects;

/* renamed from: com.my.target.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class TextureViewSurfaceTextureListenerC37790i implements P0, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final W1 f364860b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final a f364861c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final MediaPlayer f364862d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public P0.a f364863e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Surface f364864f;

    /* renamed from: g, reason: collision with root package name */
    public int f364865g;

    /* renamed from: h, reason: collision with root package name */
    public float f364866h;

    /* renamed from: i, reason: collision with root package name */
    public int f364867i;

    /* renamed from: j, reason: collision with root package name */
    public long f364868j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public U0 f364869k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public Uri f364870l;

    @j.k0
    /* renamed from: com.my.target.i$a */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public TextureViewSurfaceTextureListenerC37790i f364871b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public P0.a f364872c;

        /* renamed from: d, reason: collision with root package name */
        public int f364873d;

        /* renamed from: e, reason: collision with root package name */
        public float f364874e;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f364871b == null) {
                return;
            }
            float fQ2 = r0.q() / 1000.0f;
            float fP2 = this.f364871b.p();
            if (this.f364874e == fQ2) {
                this.f364873d++;
            } else {
                P0.a aVar = this.f364872c;
                if (aVar != null) {
                    aVar.a(fQ2, fP2);
                }
                this.f364874e = fQ2;
                if (this.f364873d > 0) {
                    this.f364873d = 0;
                }
            }
            if (this.f364873d > 50) {
                P0.a aVar2 = this.f364872c;
                if (aVar2 != null) {
                    aVar2.k();
                }
                this.f364873d = 0;
            }
        }
    }

    public TextureViewSurfaceTextureListenerC37790i() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        a aVar = new a();
        this.f364860b = new W1(200);
        this.f364865g = 0;
        this.f364866h = 1.0f;
        this.f364868j = 0L;
        this.f364862d = mediaPlayer;
        this.f364861c = aVar;
        aVar.f364871b = this;
    }

    @Override // com.my.target.P0
    public final void a() {
        MediaPlayer mediaPlayer = this.f364862d;
        if (this.f364865g == 2) {
            this.f364860b.a(this.f364861c);
            try {
                mediaPlayer.start();
            } catch (Throwable unused) {
            }
            int i12 = this.f364867i;
            if (i12 > 0) {
                try {
                    mediaPlayer.seekTo(i12);
                } catch (Throwable unused2) {
                }
                this.f364867i = 0;
            }
            this.f364865g = 1;
            P0.a aVar = this.f364863e;
            if (aVar != null) {
                aVar.i();
            }
        }
    }

    @Override // com.my.target.P0
    @SuppressLint({"Recycle"})
    public final void b(@j.P U0 u02) {
        g();
        if (u02 == null) {
            this.f364869k = null;
            d(null);
            return;
        }
        this.f364869k = u02;
        TextureView textureView = u02.getTextureView();
        textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        d(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    @Override // com.my.target.P0
    @SuppressLint({"Recycle"})
    public final void c(@j.N Context context, @j.N Uri uri) {
        this.f364870l = uri;
        Objects.toString(uri);
        int i12 = this.f364865g;
        MediaPlayer mediaPlayer = this.f364862d;
        if (i12 != 0) {
            try {
                mediaPlayer.reset();
            } catch (Throwable unused) {
            }
            this.f364865g = 0;
        }
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnInfoListener(this);
        try {
            mediaPlayer.setDataSource(context, uri);
            P0.a aVar = this.f364863e;
            if (aVar != null) {
                aVar.g();
            }
            try {
                mediaPlayer.prepareAsync();
            } catch (Throwable th2) {
                th2.getMessage();
            }
            this.f364860b.a(this.f364861c);
        } catch (Throwable th3) {
            if (this.f364863e != null) {
                this.f364863e.a(androidx.camera.camera2.internal.G.i(th3, new StringBuilder("DefaultVideoPlayer data source error: ")));
            }
            th3.getMessage();
            this.f364865g = 5;
            th3.printStackTrace();
        }
    }

    public final void d(@j.P Surface surface) {
        try {
            this.f364862d.setSurface(surface);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        Surface surface2 = this.f364864f;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.f364864f = surface;
    }

    @Override // com.my.target.P0
    public final void destroy() {
        this.f364863e = null;
        this.f364865g = 5;
        this.f364860b.b(this.f364861c);
        g();
        boolean zS2 = s();
        MediaPlayer mediaPlayer = this.f364862d;
        if (zS2) {
            try {
                mediaPlayer.stop();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        try {
            mediaPlayer.release();
        } catch (Throwable th3) {
            th3.getMessage();
        }
        this.f364869k = null;
    }

    @Override // com.my.target.P0
    public final void e() {
        this.f364860b.b(this.f364861c);
        try {
            this.f364862d.stop();
        } catch (Throwable th2) {
            th2.getMessage();
        }
        P0.a aVar = this.f364863e;
        if (aVar != null) {
            aVar.j();
        }
        this.f364865g = 3;
    }

    @Override // com.my.target.P0
    public final boolean f() {
        return this.f364865g == 1;
    }

    public final void g() {
        U0 u02 = this.f364869k;
        TextureView textureView = u02 != null ? u02.getTextureView() : null;
        if (textureView == null || textureView.getSurfaceTextureListener() != this) {
            return;
        }
        textureView.setSurfaceTextureListener(null);
    }

    @Override // com.my.target.P0
    public final void h() {
        if (this.f364866h == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    @Override // com.my.target.P0
    public final boolean i() {
        return this.f364865g == 2;
    }

    @Override // com.my.target.P0
    public final boolean j() {
        int i12 = this.f364865g;
        return i12 >= 1 && i12 < 3;
    }

    @Override // com.my.target.P0
    public final void k() {
        try {
            this.f364862d.start();
            this.f364865g = 1;
        } catch (Throwable th2) {
            th2.getMessage();
        }
        a(0L);
    }

    @Override // com.my.target.P0
    public final boolean l() {
        return this.f364866h == 0.0f;
    }

    @Override // com.my.target.P0
    public final void m() {
        setVolume(1.0f);
    }

    @Override // com.my.target.P0
    @j.P
    public final Uri n() {
        return this.f364870l;
    }

    @Override // com.my.target.P0
    public final void o() {
        setVolume(0.2f);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        P0.a aVar;
        float fP2 = p();
        this.f364865g = 4;
        if (fP2 > 0.0f && (aVar = this.f364863e) != null) {
            aVar.a(fP2, fP2);
        }
        P0.a aVar2 = this.f364863e;
        if (aVar2 != null) {
            aVar2.onVideoCompleted();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i12, int i13) {
        this.f364860b.b(this.f364861c);
        g();
        d(null);
        String strL = androidx.media3.exoplayer.analytics.m.l(i12 == 100 ? "Server died" : "Unknown error", " (reason: ", i13 == -1004 ? "IO error" : i13 == -1007 ? "Malformed error" : i13 == -1010 ? "Unsupported error" : i13 == -110 ? "Timed out error" : i13 == Integer.MIN_VALUE ? "Low-level system error" : "Unknown", ")");
        P0.a aVar = this.f364863e;
        if (aVar != null) {
            aVar.a(strL);
        }
        if (this.f364865g > 0) {
            try {
                this.f364862d.reset();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        this.f364865g = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i12, int i13) {
        if (i12 != 3) {
            return false;
        }
        P0.a aVar = this.f364863e;
        if (aVar == null) {
            return true;
        }
        aVar.o();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f12 = this.f364866h;
            mediaPlayer.setVolume(f12, f12);
            this.f364865g = 1;
            mediaPlayer.start();
            long j12 = this.f364868j;
            if (j12 > 0) {
                a(j12);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
        d(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d(null);
        return true;
    }

    @Override // com.my.target.P0
    public final float p() {
        if (!s()) {
            return 0.0f;
        }
        try {
            return this.f364862d.getDuration() / 1000.0f;
        } catch (Throwable th2) {
            th2.getMessage();
            return 0.0f;
        }
    }

    @Override // com.my.target.P0
    public final long q() {
        if (!s() || this.f364865g == 3) {
            return 0L;
        }
        try {
            return this.f364862d.getCurrentPosition();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0L;
        }
    }

    @Override // com.my.target.P0
    public final void r() {
        setVolume(0.0f);
    }

    public final boolean s() {
        int i12 = this.f364865g;
        return i12 >= 1 && i12 <= 4;
    }

    @Override // com.my.target.P0
    public final void setVolume(float f12) {
        this.f364866h = f12;
        if (s()) {
            try {
                this.f364862d.setVolume(f12, f12);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        P0.a aVar = this.f364863e;
        if (aVar != null) {
            aVar.a(f12);
        }
    }

    @Override // com.my.target.P0
    public final void a(long j12) {
        this.f364868j = j12;
        if (s()) {
            try {
                this.f364862d.seekTo((int) j12);
                this.f364868j = 0L;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    @Override // com.my.target.P0
    public final void b() {
        MediaPlayer mediaPlayer = this.f364862d;
        if (this.f364865g == 1) {
            this.f364860b.b(this.f364861c);
            try {
                this.f364867i = mediaPlayer.getCurrentPosition();
                mediaPlayer.pause();
            } catch (Throwable th2) {
                th2.getMessage();
            }
            this.f364865g = 2;
            P0.a aVar = this.f364863e;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // com.my.target.P0
    public final void a(@j.P P0.a aVar) {
        this.f364863e = aVar;
        this.f364861c.f364872c = aVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
    }
}

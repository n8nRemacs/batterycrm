package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes5.dex */
public class k implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config f338930f = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final o f338931a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f338932b;

    /* renamed from: c, reason: collision with root package name */
    public final b f338933c;

    /* renamed from: d, reason: collision with root package name */
    public final long f338934d;

    /* renamed from: e, reason: collision with root package name */
    public long f338935e;

    /* compiled from: LruBitmapPool.java */
    public interface a {
    }

    /* compiled from: LruBitmapPool.java */
    public static final class b implements a {
    }

    /* compiled from: LruBitmapPool.java */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Bitmap> f338936a = Collections.synchronizedSet(new HashSet());
    }

    public k() {
        throw null;
    }

    public k(long j12) {
        o oVar = new o();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f338934d = j12;
        this.f338931a = oVar;
        this.f338932b = setUnmodifiableSet;
        this.f338933c = new b();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public final void a(int i12) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i12 >= 40 || i12 >= 20) {
            c();
        } else if (i12 >= 20 || i12 == 15) {
            g(this.f338934d / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f338931a.getClass();
                if (com.bumptech.glide.util.m.c(bitmap) <= this.f338934d && this.f338932b.contains(bitmap.getConfig())) {
                    this.f338931a.getClass();
                    int iC2 = com.bumptech.glide.util.m.c(bitmap);
                    this.f338931a.g(bitmap);
                    this.f338933c.getClass();
                    this.f338935e += iC2;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f338931a.f(bitmap);
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f338931a);
                    }
                    g(this.f338934d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f338931a.f(bitmap);
                bitmap.isMutable();
                this.f338932b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public final void c() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public final Bitmap d(int i12, int i13, Bitmap.Config config) {
        Bitmap bitmapF = f(i12, i13, config);
        if (bitmapF != null) {
            return bitmapF;
        }
        if (config == null) {
            config = f338930f;
        }
        return Bitmap.createBitmap(i12, i13, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public final Bitmap e(int i12, int i13, Bitmap.Config config) {
        Bitmap bitmapF = f(i12, i13, config);
        if (bitmapF != null) {
            bitmapF.eraseColor(0);
            return bitmapF;
        }
        if (config == null) {
            config = f338930f;
        }
        return Bitmap.createBitmap(i12, i13, config);
    }

    @P
    public final synchronized Bitmap f(int i12, int i13, @P Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f338931a.b(i12, i13, config != null ? config : f338930f);
            if (bitmapB != null) {
                long j12 = this.f338935e;
                this.f338931a.getClass();
                this.f338935e = j12 - com.bumptech.glide.util.m.c(bitmapB);
                this.f338933c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f338931a.e(i12, i13, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f338931a.e(i12, i13, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f338931a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapB;
    }

    public final synchronized void g(long j12) {
        while (this.f338935e > j12) {
            o oVar = this.f338931a;
            Bitmap bitmapC = oVar.f338943b.c();
            if (bitmapC != null) {
                oVar.a(Integer.valueOf(com.bumptech.glide.util.m.c(bitmapC)), bitmapC);
            }
            if (bitmapC == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f338931a);
                }
                this.f338935e = 0L;
                return;
            }
            this.f338933c.getClass();
            long j13 = this.f338935e;
            this.f338931a.getClass();
            this.f338935e = j13 - com.bumptech.glide.util.m.c(bitmapC);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f338931a.f(bitmapC);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f338931a);
            }
            bitmapC.recycle();
        }
    }
}

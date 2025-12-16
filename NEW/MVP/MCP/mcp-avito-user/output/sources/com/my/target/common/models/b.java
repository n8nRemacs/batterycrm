package com.my.target.common.models;

import android.graphics.Bitmap;
import android.util.LruCache;
import e11.D0;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class b extends D0<Bitmap> {

    /* renamed from: f, reason: collision with root package name */
    @N
    public static volatile LruCache<b, Bitmap> f364776f = new a(31457280);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f364777e;

    public static class a extends LruCache<b, Bitmap> {
        @Override // android.util.LruCache
        public final int sizeOf(b bVar, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public final Bitmap a() {
        return this.f364777e ? f364776f.get(this) : (Bitmap) this.f394307d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (true == this.f364777e) {
            return;
        }
        this.f364777e = true;
        Bitmap bitmap = (Bitmap) this.f394307d;
        if (bitmap != null) {
            this.f394307d = null;
            f364776f.put(this, bitmap);
        }
    }

    @N
    public final String toString() {
        return "ImageData{url='" + this.f394304a + "', width=" + this.f394305b + ", height=" + this.f394306c + ", bitmap=" + a() + '}';
    }
}

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import j.N;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes5.dex */
public class f implements e {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public final Bitmap d(int i12, int i13, Bitmap.Config config) {
        return Bitmap.createBitmap(i12, i13, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public final Bitmap e(int i12, int i13, Bitmap.Config config) {
        return Bitmap.createBitmap(i12, i13, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public final void a(int i12) {
    }
}

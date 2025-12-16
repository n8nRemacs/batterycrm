package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import j.N;

/* compiled from: BitmapPool.java */
/* loaded from: classes5.dex */
public interface e {
    void a(int i12);

    void b(Bitmap bitmap);

    void c();

    @N
    Bitmap d(int i12, int i13, Bitmap.Config config);

    @N
    Bitmap e(int i12, int i13, Bitmap.Config config);
}

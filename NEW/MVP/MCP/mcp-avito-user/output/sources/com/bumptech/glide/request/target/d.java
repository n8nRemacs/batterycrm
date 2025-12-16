package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: BitmapThumbnailImageViewTarget.java */
/* loaded from: classes5.dex */
public class d extends r<Bitmap> {
    @Override // com.bumptech.glide.request.target.r
    public final Drawable l(Bitmap bitmap) {
        return new BitmapDrawable(this.f339616c.getResources(), bitmap);
    }
}

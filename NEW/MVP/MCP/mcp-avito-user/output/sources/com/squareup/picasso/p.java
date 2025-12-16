package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: ImageViewAction.java */
/* loaded from: classes7.dex */
class p extends AbstractC37864a<ImageView> {
    @Override // com.squareup.picasso.AbstractC37864a
    public final void a() {
        this.f366399g = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.AbstractC37864a
    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f366395c.get();
        if (imageView == null) {
            return;
        }
        Context context = this.f366393a.f366369d;
        int i12 = w.f366471e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new w(context, bitmap, drawable, loadedFrom));
    }

    @Override // com.squareup.picasso.AbstractC37864a
    public final void c(Exception exc) {
        ImageView imageView = (ImageView) this.f366395c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }
}

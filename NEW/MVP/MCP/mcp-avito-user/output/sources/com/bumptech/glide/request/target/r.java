package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.request.target.j;
import j.P;

/* compiled from: ThumbnailImageViewTarget.java */
/* loaded from: classes5.dex */
public abstract class r<T> extends k<T> {
    @Override // com.bumptech.glide.request.target.k
    public final void i(@P T t12) {
        ImageView imageView = this.f339616c;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Drawable drawableL = l(t12);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableL = new j(new j.a(drawableL.getConstantState(), layoutParams.width, layoutParams.height), drawableL);
        }
        imageView.setImageDrawable(drawableL);
    }

    public abstract Drawable l(T t12);
}

package com.bumptech.glide.request.transition;

import android.widget.ImageView;

/* compiled from: ViewTransition.java */
/* loaded from: classes5.dex */
public class k<R> implements f<R> {

    /* compiled from: ViewTransition.java */
    public interface a {
    }

    @Override // com.bumptech.glide.request.transition.f
    public final boolean a(Object obj, com.bumptech.glide.request.target.k kVar) {
        ImageView imageView = kVar.f339616c;
        if (imageView == null) {
            return false;
        }
        imageView.clearAnimation();
        imageView.getContext();
        throw null;
    }
}

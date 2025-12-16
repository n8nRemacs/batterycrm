package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes5.dex */
public class d implements f<Drawable> {
    @Override // com.bumptech.glide.request.transition.f
    public final boolean a(Object obj, com.bumptech.glide.request.target.k kVar) {
        Drawable drawable = (Drawable) obj;
        Drawable drawable2 = kVar.f339616c.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(300);
        kVar.d(transitionDrawable);
        return true;
    }
}

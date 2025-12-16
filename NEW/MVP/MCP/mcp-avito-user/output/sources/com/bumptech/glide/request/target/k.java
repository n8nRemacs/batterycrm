package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.f;
import j.N;
import j.P;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes5.dex */
public abstract class k<Z> extends t<ImageView, Z> implements f.a {

    /* renamed from: e, reason: collision with root package name */
    @P
    public Animatable f339612e;

    @Override // com.bumptech.glide.request.target.t, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    public final void b(@P Drawable drawable) {
        super.b(drawable);
        Animatable animatable = this.f339612e;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f339612e = null;
        d(drawable);
    }

    @Override // com.bumptech.glide.request.target.q
    public void c(@N Z z12, @P com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar != null && fVar.a(z12, this)) {
            if (!(z12 instanceof Animatable)) {
                this.f339612e = null;
                return;
            }
            Animatable animatable = (Animatable) z12;
            this.f339612e = animatable;
            animatable.start();
            return;
        }
        i(z12);
        if (!(z12 instanceof Animatable)) {
            this.f339612e = null;
            return;
        }
        Animatable animatable2 = (Animatable) z12;
        this.f339612e = animatable2;
        animatable2.start();
    }

    public final void d(Drawable drawable) {
        this.f339616c.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    public void g(@P Drawable drawable) {
        i(null);
        this.f339612e = null;
        d(drawable);
    }

    public abstract void i(@P Z z12);

    @Override // com.bumptech.glide.request.target.t, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    public void k(@P Drawable drawable) {
        i(null);
        this.f339612e = null;
        d(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.i
    public final void onStart() {
        Animatable animatable = this.f339612e;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.i
    public final void onStop() {
        Animatable animatable = this.f339612e;
        if (animatable != null) {
            animatable.stop();
        }
    }
}

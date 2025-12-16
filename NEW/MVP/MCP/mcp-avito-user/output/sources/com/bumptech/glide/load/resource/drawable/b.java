package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.util.k;
import j.N;

/* compiled from: DrawableResource.java */
/* loaded from: classes5.dex */
public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: b, reason: collision with root package name */
    public final T f339422b;

    public b(T t12) {
        k.c(t12, "Argument must not be null");
        this.f339422b = t12;
    }

    public void a() {
        T t12 = this.f339422b;
        if (t12 instanceof BitmapDrawable) {
            ((BitmapDrawable) t12).getBitmap().prepareToDraw();
        } else if (t12 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t12).c().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Object get() {
        T t12 = this.f339422b;
        Drawable.ConstantState constantState = t12.getConstantState();
        return constantState == null ? t12 : constantState.newDrawable();
    }
}

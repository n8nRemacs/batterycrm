package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import j.N;
import j.P;

/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes5.dex */
public class f implements l<Drawable, Drawable> {
    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N Drawable drawable, @N k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final w<Drawable> b(@N Drawable drawable, int i12, int i13, @N k kVar) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d(drawable2);
        }
        return null;
    }
}

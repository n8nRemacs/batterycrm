package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.resource.bitmap.x;
import j.N;
import j.P;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes5.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f339476a;

    public b(@N Resources resources) {
        this.f339476a = resources;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public final w<BitmapDrawable> a(@N w<Bitmap> wVar, @N k kVar) {
        if (wVar == null) {
            return null;
        }
        return new x(this.f339476a, wVar);
    }
}

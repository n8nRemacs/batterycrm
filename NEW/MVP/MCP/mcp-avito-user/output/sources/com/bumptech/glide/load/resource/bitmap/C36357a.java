package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j.N;

/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36357a<DataType> implements com.bumptech.glide.load.l<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.l<DataType, Bitmap> f339360a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f339361b;

    public C36357a(@N Resources resources, @N com.bumptech.glide.load.l<DataType, Bitmap> lVar) {
        this.f339361b = resources;
        this.f339360a = lVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N DataType datatype, @N com.bumptech.glide.load.k kVar) {
        return this.f339360a.a(datatype, kVar);
    }

    @Override // com.bumptech.glide.load.l
    public final com.bumptech.glide.load.engine.w<BitmapDrawable> b(@N DataType datatype, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        com.bumptech.glide.load.engine.w<Bitmap> wVarB = this.f339360a.b(datatype, i12, i13, kVar);
        if (wVarB == null) {
            return null;
        }
        return new x(this.f339361b, wVarB);
    }
}

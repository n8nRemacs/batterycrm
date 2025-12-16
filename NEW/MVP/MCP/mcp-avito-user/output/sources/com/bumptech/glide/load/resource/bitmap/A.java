package com.bumptech.glide.load.resource.bitmap;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import j.N;
import j.P;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes5.dex */
public class A implements com.bumptech.glide.load.l<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.drawable.e f339319a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339320b;

    public A(com.bumptech.glide.load.resource.drawable.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar2) {
        this.f339319a = eVar;
        this.f339320b = eVar2;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N Uri uri, @N com.bumptech.glide.load.k kVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N Uri uri, int i12, int i13, @N com.bumptech.glide.load.k kVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        com.bumptech.glide.load.engine.w wVarC = this.f339319a.c(uri);
        if (wVarC == null) {
            return null;
        }
        return p.a(this.f339320b, (Drawable) ((com.bumptech.glide.load.resource.drawable.b) wVarC).get(), i12, i13);
    }
}

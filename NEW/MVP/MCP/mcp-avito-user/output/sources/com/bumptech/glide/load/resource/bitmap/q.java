package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import j.N;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes5.dex */
public class q implements com.bumptech.glide.load.n<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.n<Bitmap> f339389b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f339390c;

    public q(com.bumptech.glide.load.n<Bitmap> nVar, boolean z12) {
        this.f339389b = nVar;
        this.f339390c = z12;
    }

    @Override // com.bumptech.glide.load.n
    @N
    public final com.bumptech.glide.load.engine.w<Drawable> a(@N Context context, @N com.bumptech.glide.load.engine.w<Drawable> wVar, int i12, int i13) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVar = com.bumptech.glide.b.b(context).f338682b;
        Drawable drawable = wVar.get();
        C36363g c36363gA = p.a(eVar, drawable, i12, i13);
        if (c36363gA != null) {
            com.bumptech.glide.load.engine.w<Bitmap> wVarA = this.f339389b.a(context, c36363gA, i12, i13);
            if (!wVarA.equals(c36363gA)) {
                return new x(context.getResources(), wVarA);
            }
            wVarA.c();
            return wVar;
        }
        if (!this.f339390c) {
            return wVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        this.f339389b.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f339389b.equals(((q) obj).f339389b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f339389b.hashCode();
    }
}

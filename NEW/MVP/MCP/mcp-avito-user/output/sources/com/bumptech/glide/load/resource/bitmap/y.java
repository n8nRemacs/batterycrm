package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.v;
import j.N;
import j.P;
import j.X;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
@X
/* loaded from: classes5.dex */
public final class y implements com.bumptech.glide.load.l<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final o f339413a;

    public y(o oVar) {
        this.f339413a = oVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N ParcelFileDescriptor parcelFileDescriptor, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N ParcelFileDescriptor parcelFileDescriptor, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        o oVar = this.f339413a;
        return oVar.a(new v.b(parcelFileDescriptor, oVar.f339386d, oVar.f339385c), i12, i13, kVar, o.f339380k);
    }
}

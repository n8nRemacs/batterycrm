package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import j.N;
import j.P;
import j.X;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
@X
/* renamed from: com.bumptech.glide.load.resource.bitmap.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36367k implements com.bumptech.glide.load.l<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final C36362f f339371a = new C36362f();

    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N ByteBuffer byteBuffer, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N ByteBuffer byteBuffer, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        return this.f339371a.c(ImageDecoder.createSource(byteBuffer), i12, i13, kVar);
    }
}

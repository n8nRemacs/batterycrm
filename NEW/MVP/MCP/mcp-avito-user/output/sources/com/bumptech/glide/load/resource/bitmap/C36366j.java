package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.v;
import j.N;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36366j implements com.bumptech.glide.load.l<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final o f339370a;

    public C36366j(o oVar) {
        this.f339370a = oVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N ByteBuffer byteBuffer, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N ByteBuffer byteBuffer, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        InputStream inputStreamD = com.bumptech.glide.util.a.d(byteBuffer);
        o.b bVar = o.f339380k;
        o oVar = this.f339370a;
        return oVar.a(new v.a(oVar.f339385c, inputStreamD, oVar.f339386d), i12, i13, kVar, bVar);
    }
}

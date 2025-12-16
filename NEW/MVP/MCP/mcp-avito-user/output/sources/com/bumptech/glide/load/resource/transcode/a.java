package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import j.N;
import j.P;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes5.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f339474a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b, reason: collision with root package name */
    public final int f339475b = 100;

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public final w<byte[]> a(@N w<Bitmap> wVar, @N k kVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f339474a, this.f339475b, byteArrayOutputStream);
        wVar.c();
        return new hW0.b(byteArrayOutputStream.toByteArray());
    }
}

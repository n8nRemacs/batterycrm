package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import j.N;
import j.P;
import j.X;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
@X
/* loaded from: classes5.dex */
public final class w implements com.bumptech.glide.load.l<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final C36362f f339410a = new C36362f();

    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N InputStream inputStream, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N InputStream inputStream, int i12, int i13, @N com.bumptech.glide.load.k kVar) throws IOException {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = com.bumptech.glide.util.a.f339626a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        AtomicReference<byte[]> atomicReference2 = com.bumptech.glide.util.a.f339626a;
        byte[] andSet = atomicReference2.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        }
        while (true) {
            int i14 = inputStream2.read(andSet);
            if (i14 < 0) {
                atomicReference2.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f339410a.c(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i12, i13, kVar);
            }
            byteArrayOutputStream.write(andSet, 0, i14);
        }
    }
}

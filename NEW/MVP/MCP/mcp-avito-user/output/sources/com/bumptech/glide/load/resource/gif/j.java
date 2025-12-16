package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes5.dex */
public class j implements l<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339471a;

    /* renamed from: b, reason: collision with root package name */
    public final a f339472b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339473c;

    public j(ArrayList arrayList, a aVar, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339471a = arrayList;
        this.f339472b = aVar;
        this.f339473c = jVar;
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N InputStream inputStream, @N k kVar) {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) kVar.c(i.f339470b)).booleanValue()) {
            if (com.bumptech.glide.load.g.c(this.f339473c, inputStream2, this.f339471a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.l
    public final w<c> b(@N InputStream inputStream, int i12, int i13, @N k kVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i14 = inputStream2.read(bArr);
                if (i14 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i14);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f339472b.b(ByteBuffer.wrap(byteArray), i12, i13, kVar);
    }
}

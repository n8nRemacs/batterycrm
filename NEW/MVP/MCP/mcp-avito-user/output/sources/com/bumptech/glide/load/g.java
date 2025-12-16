package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.z;
import j.N;
import j.P;
import j.X;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes5.dex */
public final class g {

    /* compiled from: ImageHeaderParserUtils.java */
    public interface a {
    }

    /* compiled from: ImageHeaderParserUtils.java */
    public interface b {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(@N com.bumptech.glide.load.engine.bitmap_recycle.j jVar, @P InputStream inputStream, @N ArrayList arrayList) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, jVar);
        }
        inputStream.mark(5242880);
        e eVar = new e(inputStream, jVar);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i12);
            InputStream inputStream2 = eVar.f338891a;
            try {
                int iA2 = imageHeaderParser.a(inputStream2, eVar.f338892b);
                if (iA2 != -1) {
                    return iA2;
                }
            } finally {
                inputStream2.reset();
            }
        }
        return -1;
    }

    @X
    public static int b(@N ArrayList arrayList, @N com.bumptech.glide.load.data.m mVar, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) throws Throwable {
        f fVar = new f(mVar, jVar);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i12);
            com.bumptech.glide.load.engine.bitmap_recycle.j jVar2 = fVar.f339192b;
            com.bumptech.glide.load.data.m mVar2 = fVar.f339191a;
            z zVar = null;
            try {
                z zVar2 = new z(new FileInputStream(mVar2.a().getFileDescriptor()), jVar2);
                try {
                    int iA2 = imageHeaderParser.a(zVar2, jVar2);
                    try {
                        zVar2.close();
                    } catch (IOException unused) {
                    }
                    mVar2.a();
                    if (iA2 != -1) {
                        return iA2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zVar = zVar2;
                    if (zVar != null) {
                        try {
                            zVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    mVar2.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return -1;
    }

    @N
    public static ImageHeaderParser.ImageType c(@N com.bumptech.glide.load.engine.bitmap_recycle.j jVar, @P InputStream inputStream, @N ArrayList arrayList) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, jVar);
        }
        inputStream.mark(5242880);
        return f(arrayList, new com.bumptech.glide.load.b(inputStream));
    }

    @N
    @X
    public static ImageHeaderParser.ImageType d(@N ArrayList arrayList, @N com.bumptech.glide.load.data.m mVar, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        return f(arrayList, new d(mVar, jVar));
    }

    @N
    public static ImageHeaderParser.ImageType e(@N ArrayList arrayList, @P ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : f(arrayList, new c(byteBuffer));
    }

    @N
    public static ImageHeaderParser.ImageType f(@N ArrayList arrayList, b bVar) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ImageHeaderParser.ImageType imageTypeA = bVar.a((ImageHeaderParser) arrayList.get(i12));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

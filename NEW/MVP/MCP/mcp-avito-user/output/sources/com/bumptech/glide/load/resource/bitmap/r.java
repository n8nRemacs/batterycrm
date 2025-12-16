package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import j.N;
import j.X;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser.java */
@X
/* loaded from: classes5.dex */
public final class r implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@N InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        int iE2 = new androidx.exifinterface.media.a(inputStream).e(1, "Orientation");
        if (iE2 == 0) {
            return -1;
        }
        return iE2;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @N
    public final ImageHeaderParser.ImageType b(@N ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @N
    public final ImageHeaderParser.ImageType c(@N InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

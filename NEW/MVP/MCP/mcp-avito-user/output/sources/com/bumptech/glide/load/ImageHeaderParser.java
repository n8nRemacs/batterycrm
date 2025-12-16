package com.bumptech.glide.load;

import j.N;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f338841b;

        ImageType(boolean z12) {
            this.f338841b = z12;
        }

        public boolean hasAlpha() {
            return this.f338841b;
        }
    }

    int a(@N InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar);

    @N
    ImageType b(@N ByteBuffer byteBuffer);

    @N
    ImageType c(@N InputStream inputStream);
}

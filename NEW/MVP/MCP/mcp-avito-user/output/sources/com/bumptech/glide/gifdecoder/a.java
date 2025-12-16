package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: GifDecoder.java */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: GifDecoder.java */
    /* renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC10499a {
        @N
        byte[] a(int i12);

        @N
        int[] b(int i12);

        void c(@N byte[] bArr);

        void d(@N int[] iArr);

        @N
        Bitmap e(int i12, int i13, @N Bitmap.Config config);

        void f(@N Bitmap bitmap);
    }

    /* compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @P
    Bitmap getNextFrame();
}

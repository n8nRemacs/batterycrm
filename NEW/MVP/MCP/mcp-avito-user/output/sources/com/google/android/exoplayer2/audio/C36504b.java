package com.google.android.exoplayer2.audio;

import com.facebook.imageutils.JfifUtil;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Ac3Util.java */
/* renamed from: com.google.android.exoplayer2.audio.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36504b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f343954a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f343955b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f343956c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f343957d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f343958e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f343959f = {69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: Ac3Util.java */
    /* renamed from: com.google.android.exoplayer2.audio.b$b, reason: collision with other inner class name */
    public static final class C10570b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final String f343960a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343961b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343962c;

        /* renamed from: d, reason: collision with root package name */
        public final int f343963d;

        /* renamed from: e, reason: collision with root package name */
        public final int f343964e;

        /* compiled from: Ac3Util.java */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.exoplayer2.audio.b$b$a */
        public @interface a {
        }

        public C10570b(String str, int i12, int i13, int i14, int i15, int i16, a aVar) {
            this.f343960a = str;
            this.f343962c = i13;
            this.f343961b = i14;
            this.f343963d = i15;
            this.f343964e = i16;
        }
    }

    public static int a(int i12, int i13) {
        int i14 = i13 / 2;
        if (i12 < 0 || i12 >= 3 || i13 < 0 || i14 >= 19) {
            return -1;
        }
        int i15 = f343955b[i12];
        if (i15 == 44100) {
            return ((i13 % 2) + f343959f[i14]) * 2;
        }
        int i16 = f343958e[i14];
        return i15 == 32000 ? i16 * 6 : i16 * 4;
    }
}

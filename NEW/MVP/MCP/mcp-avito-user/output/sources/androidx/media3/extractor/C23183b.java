package androidx.media3.extractor;

import com.facebook.imageutils.JfifUtil;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Ac3Util.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23183b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f50472a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f50473b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f50474c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f50475d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f50476e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f50477f = {69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: Ac3Util.java */
    /* renamed from: androidx.media3.extractor.b$b, reason: collision with other inner class name */
    public static final class C1849b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final String f50478a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50479b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50480c;

        /* renamed from: d, reason: collision with root package name */
        public final int f50481d;

        /* renamed from: e, reason: collision with root package name */
        public final int f50482e;

        /* renamed from: f, reason: collision with root package name */
        public final int f50483f;

        /* compiled from: Ac3Util.java */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.media3.extractor.b$b$a */
        public @interface a {
        }

        public C1849b(String str, int i12, int i13, int i14, int i15, int i16, int i17, a aVar) {
            this.f50478a = str;
            this.f50480c = i13;
            this.f50479b = i14;
            this.f50481d = i15;
            this.f50482e = i16;
            this.f50483f = i17;
        }
    }

    public static int a(int i12, int i13) {
        int i14 = i13 / 2;
        if (i12 < 0 || i12 >= 3 || i13 < 0 || i14 >= 19) {
            return -1;
        }
        int i15 = f50473b[i12];
        if (i15 == 44100) {
            return ((i13 % 2) + f50477f[i14]) * 2;
        }
        int i16 = f50476e[i14];
        return i15 == 32000 ? i16 * 6 : i16 * 4;
    }
}

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.E;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: AacUtil.java */
/* renamed from: com.google.android.exoplayer2.audio.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36503a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f343949a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f343950b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.audio.a$b */
    public @interface b {
    }

    /* compiled from: AacUtil.java */
    /* renamed from: com.google.android.exoplayer2.audio.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f343951a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343952b;

        /* renamed from: c, reason: collision with root package name */
        public final String f343953c;

        public c(int i12, int i13, String str, C10569a c10569a) {
            this.f343951a = i12;
            this.f343952b = i13;
            this.f343953c = str;
        }
    }

    public static int a(E e12) throws ParserException {
        int iG2 = e12.g(4);
        if (iG2 == 15) {
            return e12.g(24);
        }
        if (iG2 < 13) {
            return f343949a[iG2];
        }
        throw ParserException.a(null, null);
    }

    public static c b(E e12, boolean z12) throws ParserException {
        int iG2 = e12.g(5);
        if (iG2 == 31) {
            iG2 = e12.g(6) + 32;
        }
        int iA2 = a(e12);
        int iG3 = e12.g(4);
        String strG = AK.c.g(iG2, "mp4a.40.");
        if (iG2 == 5 || iG2 == 29) {
            iA2 = a(e12);
            int iG4 = e12.g(5);
            if (iG4 == 31) {
                iG4 = e12.g(6) + 32;
            }
            iG2 = iG4;
            if (iG2 == 22) {
                iG3 = e12.g(4);
            }
        }
        if (z12) {
            if (iG2 != 1 && iG2 != 2 && iG2 != 3 && iG2 != 4 && iG2 != 6 && iG2 != 7 && iG2 != 17) {
                switch (iG2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + iG2);
                }
            }
            e12.f();
            if (e12.f()) {
                e12.m(14);
            }
            boolean zF2 = e12.f();
            if (iG3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iG2 == 6 || iG2 == 20) {
                e12.m(3);
            }
            if (zF2) {
                if (iG2 == 22) {
                    e12.m(16);
                }
                if (iG2 == 17 || iG2 == 19 || iG2 == 20 || iG2 == 23) {
                    e12.m(3);
                }
                e12.m(1);
            }
            switch (iG2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG5 = e12.g(2);
                    if (iG5 == 2 || iG5 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iG5);
                    }
            }
        }
        int i12 = f343950b[iG3];
        if (i12 != -1) {
            return new c(iA2, i12, strG, null);
        }
        throw ParserException.a(null, null);
    }
}

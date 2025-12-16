package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.N;
import j.P;
import j.X;

/* compiled from: BlendModeUtils.java */
/* renamed from: androidx.core.graphics.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22764d {

    /* compiled from: BlendModeUtils.java */
    /* renamed from: androidx.core.graphics.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44736a;

        static {
            int[] iArr = new int[BlendModeCompat.values().length];
            f44736a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44736a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44736a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44736a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44736a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44736a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44736a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44736a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44736a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44736a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44736a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44736a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44736a[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44736a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44736a[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44736a[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44736a[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44736a[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44736a[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44736a[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44736a[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f44736a[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f44736a[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f44736a[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f44736a[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f44736a[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f44736a[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f44736a[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f44736a[28] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* compiled from: BlendModeUtils.java */
    @X
    /* renamed from: androidx.core.graphics.d$b */
    public static class b {
        @P
        public static Object a(@N BlendModeCompat blendModeCompat) {
            switch (blendModeCompat.ordinal()) {
                case 0:
                    return BlendMode.CLEAR;
                case 1:
                    return BlendMode.SRC;
                case 2:
                    return BlendMode.DST;
                case 3:
                    return BlendMode.SRC_OVER;
                case 4:
                    return BlendMode.DST_OVER;
                case 5:
                    return BlendMode.SRC_IN;
                case 6:
                    return BlendMode.DST_IN;
                case 7:
                    return BlendMode.SRC_OUT;
                case 8:
                    return BlendMode.DST_OUT;
                case 9:
                    return BlendMode.SRC_ATOP;
                case 10:
                    return BlendMode.DST_ATOP;
                case 11:
                    return BlendMode.XOR;
                case 12:
                    return BlendMode.PLUS;
                case 13:
                    return BlendMode.MODULATE;
                case 14:
                    return BlendMode.SCREEN;
                case 15:
                    return BlendMode.OVERLAY;
                case 16:
                    return BlendMode.DARKEN;
                case 17:
                    return BlendMode.LIGHTEN;
                case 18:
                    return BlendMode.COLOR_DODGE;
                case 19:
                    return BlendMode.COLOR_BURN;
                case 20:
                    return BlendMode.HARD_LIGHT;
                case 21:
                    return BlendMode.SOFT_LIGHT;
                case 22:
                    return BlendMode.DIFFERENCE;
                case 23:
                    return BlendMode.EXCLUSION;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    return BlendMode.MULTIPLY;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    return BlendMode.HUE;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    return BlendMode.SATURATION;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    return BlendMode.COLOR;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    @P
    public static PorterDuff.Mode a(@P BlendModeCompat blendModeCompat) {
        if (blendModeCompat == null) {
            return null;
        }
        switch (blendModeCompat.ordinal()) {
        }
        return null;
    }
}

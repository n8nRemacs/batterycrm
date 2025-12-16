package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.E;
import kotlin.Metadata;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22243b {

    /* compiled from: AndroidBlendMode.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    @Y61.k
    @j.X
    public static final BlendMode a(int i12) {
        E.f39229b.getClass();
        return E.a(i12, 0) ? BlendMode.CLEAR : E.a(i12, E.f39230c) ? BlendMode.SRC : E.a(i12, E.f39231d) ? BlendMode.DST : E.a(i12, E.f39232e) ? BlendMode.SRC_OVER : E.a(i12, E.f39233f) ? BlendMode.DST_OVER : E.a(i12, E.f39234g) ? BlendMode.SRC_IN : E.a(i12, E.f39235h) ? BlendMode.DST_IN : E.a(i12, E.f39236i) ? BlendMode.SRC_OUT : E.a(i12, E.f39237j) ? BlendMode.DST_OUT : E.a(i12, E.f39238k) ? BlendMode.SRC_ATOP : E.a(i12, E.f39239l) ? BlendMode.DST_ATOP : E.a(i12, E.f39240m) ? BlendMode.XOR : E.a(i12, E.f39241n) ? BlendMode.PLUS : E.a(i12, E.f39242o) ? BlendMode.MODULATE : E.a(i12, E.f39243p) ? BlendMode.SCREEN : E.a(i12, E.f39244q) ? BlendMode.OVERLAY : E.a(i12, E.f39245r) ? BlendMode.DARKEN : E.a(i12, E.f39246s) ? BlendMode.LIGHTEN : E.a(i12, E.f39247t) ? BlendMode.COLOR_DODGE : E.a(i12, E.f39248u) ? BlendMode.COLOR_BURN : E.a(i12, E.f39249v) ? BlendMode.HARD_LIGHT : E.a(i12, E.f39250w) ? BlendMode.SOFT_LIGHT : E.a(i12, E.f39251x) ? BlendMode.DIFFERENCE : E.a(i12, E.f39252y) ? BlendMode.EXCLUSION : E.a(i12, E.f39253z) ? BlendMode.MULTIPLY : E.a(i12, E.f39225A) ? BlendMode.HUE : E.a(i12, E.f39226B) ? BlendMode.SATURATION : E.a(i12, E.f39227C) ? BlendMode.COLOR : E.a(i12, E.f39228D) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    @Y61.k
    public static final PorterDuff.Mode b(int i12) {
        E.a aVar = E.f39229b;
        aVar.getClass();
        if (E.a(i12, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        aVar.getClass();
        if (E.a(i12, E.f39230c)) {
            return PorterDuff.Mode.SRC;
        }
        aVar.getClass();
        if (E.a(i12, E.f39231d)) {
            return PorterDuff.Mode.DST;
        }
        aVar.getClass();
        if (E.a(i12, E.f39232e)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        aVar.getClass();
        if (E.a(i12, E.f39233f)) {
            return PorterDuff.Mode.DST_OVER;
        }
        aVar.getClass();
        if (E.a(i12, E.f39234g)) {
            return PorterDuff.Mode.SRC_IN;
        }
        aVar.getClass();
        if (E.a(i12, E.f39235h)) {
            return PorterDuff.Mode.DST_IN;
        }
        aVar.getClass();
        if (E.a(i12, E.f39236i)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        aVar.getClass();
        if (E.a(i12, E.f39237j)) {
            return PorterDuff.Mode.DST_OUT;
        }
        aVar.getClass();
        if (E.a(i12, E.f39238k)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        aVar.getClass();
        if (E.a(i12, E.f39239l)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        aVar.getClass();
        if (E.a(i12, E.f39240m)) {
            return PorterDuff.Mode.XOR;
        }
        aVar.getClass();
        if (E.a(i12, E.f39241n)) {
            return PorterDuff.Mode.ADD;
        }
        aVar.getClass();
        if (E.a(i12, E.f39243p)) {
            return PorterDuff.Mode.SCREEN;
        }
        aVar.getClass();
        if (E.a(i12, E.f39244q)) {
            return PorterDuff.Mode.OVERLAY;
        }
        aVar.getClass();
        if (E.a(i12, E.f39245r)) {
            return PorterDuff.Mode.DARKEN;
        }
        aVar.getClass();
        if (E.a(i12, E.f39246s)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        aVar.getClass();
        return E.a(i12, E.f39242o) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

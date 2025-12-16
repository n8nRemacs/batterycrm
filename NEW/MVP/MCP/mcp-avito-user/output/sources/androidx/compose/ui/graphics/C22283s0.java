package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;

/* compiled from: ImageBitmap.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22283s0 {
    public static C22261k a(int i12, int i13, int i14, int i15) {
        int i16;
        Bitmap.Config config;
        ColorSpace rgb;
        float[] fArr;
        ColorSpace colorSpace;
        if ((i15 & 4) != 0) {
            C22281r0.f39749b.getClass();
            i16 = 0;
        } else {
            i16 = i14;
        }
        androidx.compose.ui.graphics.colorspace.f fVar = androidx.compose.ui.graphics.colorspace.f.f39390a;
        fVar.getClass();
        androidx.compose.ui.graphics.colorspace.r rVar = androidx.compose.ui.graphics.colorspace.f.f39395f;
        C22263l.b(i16);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = C.f39218a;
        Bitmap.Config configB = C22263l.b(i16);
        int i19 = C22246c0.f39354a;
        fVar.getClass();
        if (kotlin.jvm.internal.L.f(rVar, rVar)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39407r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39408s)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39405p)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39400k)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39399j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39410u)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39409t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39401l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39402m)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39397h)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39398i)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39396g)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39403n)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39406q)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39404o)) {
                ColorSpace.Rgb.TransferParameters transferParameters = null;
                if (i17 >= 34) {
                    int i22 = C22248d0.f39474a;
                    ColorSpace colorSpace2 = kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39412w) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : kotlin.jvm.internal.L.f(rVar, androidx.compose.ui.graphics.colorspace.f.f39413x) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                        config = configB;
                        return new C22261k(Bitmap.createBitmap((DisplayMetrics) null, i12, i13, config, true, colorSpace));
                    }
                }
                if (rVar != null) {
                    float[] fArrA = rVar.f39448d.a();
                    androidx.compose.ui.graphics.colorspace.s sVar = rVar.f39451g;
                    if (sVar != null) {
                        config = configB;
                        fArr = fArrA;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(sVar.f39465b, sVar.f39466c, sVar.f39467d, sVar.f39468e, sVar.f39469f, sVar.f39470g, sVar.f39464a);
                    } else {
                        config = configB;
                        fArr = fArrA;
                    }
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(rVar.f39386a, rVar.f39452h, fArr, transferParameters);
                    } else {
                        String str = rVar.f39386a;
                        final Y41.l<Double, Double> lVar = rVar.f39456l;
                        final int i23 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.b0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d12) {
                                Y41.l lVar2 = lVar;
                                switch (i23) {
                                    case 0:
                                        int i24 = C22246c0.f39354a;
                                        break;
                                    default:
                                        int i25 = C22246c0.f39354a;
                                        break;
                                }
                                return ((Number) lVar2.invoke(Double.valueOf(d12))).doubleValue();
                            }
                        };
                        final Y41.l<Double, Double> lVar2 = rVar.f39459o;
                        final int i24 = 1;
                        rgb = new ColorSpace.Rgb(str, rVar.f39452h, fArr, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.b0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d12) {
                                Y41.l lVar22 = lVar2;
                                switch (i24) {
                                    case 0:
                                        int i242 = C22246c0.f39354a;
                                        break;
                                    default:
                                        int i25 = C22246c0.f39354a;
                                        break;
                                }
                                return ((Number) lVar22.invoke(Double.valueOf(d12))).doubleValue();
                            }
                        }, rVar.f39449e, rVar.f39450f);
                    }
                } else {
                    config = configB;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                colorSpace = rgb;
                return new C22261k(Bitmap.createBitmap((DisplayMetrics) null, i12, i13, config, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        config = configB;
        colorSpace = rgb;
        return new C22261k(Bitmap.createBitmap((DisplayMetrics) null, i12, i13, config, true, colorSpace));
    }
}

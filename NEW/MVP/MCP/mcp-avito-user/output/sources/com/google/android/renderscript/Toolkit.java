package com.google.android.renderscript;

import AK.c;
import UY0.d;
import Y61.k;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: Toolkit.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010!\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "<init>", "()V", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "radius", "Lcom/google/android/renderscript/Range2d;", "restriction", "Lkotlin/G0;", "nativeBlurBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/google/android/renderscript/Range2d;)V", "", "matrix", "addVector", "nativeColorMatrixBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/google/android/renderscript/Range2d;)V", "coefficients", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "nativeResizeBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V", "", "inputArray", "sizeX", "sizeY", "value", "nativeYuvToRgbBitmap", "(J[BIILandroid/graphics/Bitmap;I)V", "_design-modules_renderscript-toolkit"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Toolkit {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Toolkit f358945a = new Toolkit();

    /* renamed from: b, reason: collision with root package name */
    public static final long f358946b;

    static {
        try {
            System.loadLibrary("renderscript-toolkit");
        } catch (Exception e12) {
            V2.f318762a.a("RenderscriptToolkit", "Error initializing native lib", e12);
        }
        f358946b = f358945a.createNative();
    }

    public static Bitmap a(Toolkit toolkit, Bitmap bitmap, int i12) {
        toolkit.getClass();
        d.b(bitmap, "blur");
        if (1 > i12 || i12 >= 26) {
            throw new IllegalArgumentException(G.e(i12, "RenderScript Toolkit blur. The radius should be between 1 and 25. ", " provided.").toString());
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap bitmapA = d.a(bitmap);
        toolkit.nativeBlurBitmap(f358946b, bitmap, bitmapA, i12, null);
        return bitmapA;
    }

    public static Bitmap b(Toolkit toolkit, Bitmap bitmap, float[] fArr) {
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        toolkit.getClass();
        d.b(bitmap, "colorMatrix");
        if (fArr.length != 16) {
            throw new IllegalArgumentException(c.i(fArr.length, " provided.", new StringBuilder("RenderScript Toolkit colorMatrix. matrix should have 16 entries. ")).toString());
        }
        if (fArr2.length != 4) {
            throw new IllegalArgumentException("RenderScript Toolkit colorMatrix. addVector should have 4 entries.");
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap bitmapA = d.a(bitmap);
        toolkit.nativeColorMatrixBitmap(f358946b, bitmap, bitmapA, fArr, fArr2, null);
        return bitmapA;
    }

    public static Bitmap c(Toolkit toolkit, Bitmap bitmap, float[] fArr) {
        toolkit.getClass();
        d.b(bitmap, "convolve");
        if (fArr.length != 9 && fArr.length != 25) {
            throw new IllegalArgumentException(c.i(fArr.length, " coefficients provided.", new StringBuilder("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. ")).toString());
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap bitmapA = d.a(bitmap);
        toolkit.nativeConvolveBitmap(f358946b, bitmap, bitmapA, fArr, null);
        return bitmapA;
    }

    private final native long createNative();

    public static Bitmap d(Toolkit toolkit, Bitmap bitmap, int i12, int i13) {
        toolkit.getClass();
        d.b(bitmap, "resize");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        toolkit.nativeResizeBitmap(f358946b, bitmap, bitmapCreateBitmap, null);
        return bitmapCreateBitmap;
    }

    private final native void nativeBlurBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, int radius, Range2d restriction);

    private final native void nativeColorMatrixBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] matrix, float[] addVector, Range2d restriction);

    private final native void nativeConvolveBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);

    private final native void nativeResizeBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, Range2d restriction);

    private final native void nativeYuvToRgbBitmap(long nativeHandle, byte[] inputArray, int sizeX, int sizeY, Bitmap outputBitmap, int value);

    @k
    public final Bitmap e(int i12, int i13, @k byte[] bArr) {
        YuvFormat[] yuvFormatArr = YuvFormat.f358947b;
        if (i12 % 2 != 0 || i13 % 2 != 0) {
            throw new IllegalArgumentException(r.l(i12, i13, "RenderScript Toolkit yuvToRgbBitmap. Non-even dimensions are not supported. ", " and ", " were provided.").toString());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        nativeYuvToRgbBitmap(f358946b, bArr, i12, i13, bitmapCreateBitmap, 17);
        return bitmapCreateBitmap;
    }
}

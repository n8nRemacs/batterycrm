package ru.cyberity.cbr.core.common;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.camera2.internal.G;
import androidx.camera.core.InterfaceC20120j0;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.common.c0;
import ru.cyberity.log.logger.Logger;

/* compiled from: ImageExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\r\u001aA\u0010\u0005\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/camera/core/j0;", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "frameBufferProvider", "a", "(Landroidx/camera/core/j0;LY41/p;)Landroid/graphics/Bitmap;", "degrees", "", "recycleOriginal", "Landroid/util/Size;", "targetSize", "b", "(Landroid/graphics/Bitmap;IZLandroid/util/Size;)Landroid/graphics/Bitmap;", "orientation", "Landroid/graphics/Matrix;", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "applyRotation", "maintainAspectRatio", "(Landroid/graphics/Matrix;IIIIIZ)Landroid/graphics/Matrix;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f0 {

    /* compiled from: ImageExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC20120j0 f432661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y41.p<Integer, Integer, Bitmap> f432662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC20120j0 interfaceC20120j0, Y41.p<? super Integer, ? super Integer, Bitmap> pVar) {
            super(0);
            this.f432661a = interfaceC20120j0;
            this.f432662b = pVar;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() throws Throwable {
            int i12 = 0;
            try {
                int iW2 = this.f432661a.e4()[0].w() / 4;
                try {
                    Bitmap bitmapInvoke = this.f432662b.invoke(Integer.valueOf(iW2), Integer.valueOf(this.f432661a.getHeight()));
                    ByteBuffer byteBufferV = this.f432661a.e4()[0].v();
                    byteBufferV.rewind();
                    bitmapInvoke.copyPixelsFromBuffer(byteBufferV);
                    return f0.b(bitmapInvoke, this.f432661a.r1().d(), false, iW2 > this.f432661a.getWidth() ? new Size(this.f432661a.getWidth(), this.f432661a.getHeight()) : null);
                } catch (Throwable th2) {
                    th = th2;
                    i12 = iW2;
                    ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "ImageExtensions", "Failed to copyPixelsFromBuffer. Reported width: " + this.f432661a.getWidth() + ", real width: " + i12, null, 4, null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Y61.k
    public static final Bitmap a(@Y61.k InterfaceC20120j0 interfaceC20120j0, @Y61.k Y41.p<? super Integer, ? super Integer, Bitmap> pVar) {
        a aVar = new a(interfaceC20120j0, pVar);
        try {
            return aVar.invoke();
        } catch (OutOfMemoryError unused) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "ImageExtensions", "Caught OutOfMemoryError while converting ImageProxy to Bitmap", null, 4, null);
            c0.a.f432656a.a();
            return aVar.invoke();
        }
    }

    @Y61.k
    public static final Bitmap b(@Y61.k Bitmap bitmap, int i12, boolean z12, @Y61.l Size size) {
        Bitmap bitmapA;
        if (i12 == 90) {
            bitmapA = a(bitmap, 6, z12, size);
        } else if (i12 == 180) {
            bitmapA = a(bitmap, 3, z12, size);
        } else if (i12 != 270) {
            bitmapA = size != null ? Bitmap.createBitmap(bitmap, 0, 0, size.getWidth(), size.getHeight(), (Matrix) null, true) : bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            if (z12) {
                bitmap.recycle();
            }
        } else {
            bitmapA = a(bitmap, 8, z12, size);
        }
        if (bitmapA != bitmap) {
            return bitmapA;
        }
        ru.cyberity.log.b.c(ru.cyberity.log.a.f436064a, "ImageExtensions", "creating an image copy. Rotated image is same as original", new Exception("creating an image copy. Rotated image is same as original"));
        return bitmapA.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
    }

    @Y61.k
    public static final Bitmap a(@Y61.k Bitmap bitmap, int i12, boolean z12, @Y61.l Size size) {
        Matrix matrix = new Matrix();
        switch (i12) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, size != null ? size.getWidth() : bitmap.getWidth(), size != null ? size.getHeight() : bitmap.getHeight(), matrix, true);
            if (z12) {
                bitmap.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e12) {
            ru.cyberity.log.a.f436064a.e("ImageExtensions", "Rotate bitmap", e12);
            return bitmap;
        }
    }

    @Y61.k
    public static final Matrix a(@Y61.k Matrix matrix, int i12, int i13, int i14, int i15, int i16, boolean z12) {
        matrix.reset();
        if (i16 != 0) {
            if (i16 % 90 != 0) {
                Logger.w$default(ru.cyberity.log.a.f436064a, "getTransformationMatrix", G.e(i16, "Rotation of ", " % 90 != 0"), null, 4, null);
            }
            matrix.postTranslate((-i12) / 2.0f, (-i13) / 2.0f);
            matrix.postRotate(i16);
        }
        boolean z13 = (Math.abs(i16) + 90) % 180 == 0;
        int i17 = z13 ? i13 : i12;
        if (!z13) {
            i12 = i13;
        }
        if (i17 != i14 || i12 != i15) {
            float f12 = i14;
            float f13 = i17;
            float f14 = f12 / f13;
            float f15 = i15 / i12;
            if (z12) {
                float fMax = Math.max(f14, f15);
                matrix.postScale(fMax, fMax);
                float f16 = f13 * fMax;
                if (f16 > f12) {
                    matrix.postTranslate(((f16 - f12) / 2.0f) * (-1.0f), 0.0f);
                }
            } else {
                matrix.postScale(f14, f15);
            }
        }
        if (i16 != 0) {
            matrix.postTranslate(i14 / 2.0f, i15 / 2.0f);
        }
        return matrix;
    }
}

package com.avito.android.photo_picker.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.avito.android.photo_camera_view.F;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CameraPhotoResizer.kt */
@com.avito.android.di.B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/g;", "Lcom/avito/android/photo_camera_view/F;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AspectRatio f218967a;

    @Inject
    public g(@Y61.k AspectRatio aspectRatio) {
        this.f218967a = aspectRatio;
    }

    @Override // com.avito.android.photo_camera_view.F
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Bitmap> a(@Y61.k final byte[] bArr, @Y61.k u80.c cVar, final float f12) {
        return io.reactivex.rxjava3.core.z.W(new Callable() { // from class: com.avito.android.photo_picker.camera.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmapCreateBitmap;
                byte[] bArr2 = bArr;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                int width = bitmapDecodeByteArray.getWidth();
                int height = bitmapDecodeByteArray.getHeight();
                g gVar = this;
                if (width < height) {
                    int height2 = bitmapDecodeByteArray.getHeight();
                    int width2 = bitmapDecodeByteArray.getWidth();
                    AspectRatio aspectRatio = gVar.f218967a;
                    int i12 = (height2 - ((width2 * aspectRatio.f218906c) / aspectRatio.f218905b)) / 2;
                    int width3 = bitmapDecodeByteArray.getWidth();
                    int width4 = bitmapDecodeByteArray.getWidth();
                    AspectRatio aspectRatio2 = gVar.f218967a;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, i12, width3, (width4 * aspectRatio2.f218906c) / aspectRatio2.f218905b, (Matrix) null, false);
                } else {
                    int width5 = bitmapDecodeByteArray.getWidth();
                    int height3 = bitmapDecodeByteArray.getHeight();
                    AspectRatio aspectRatio3 = gVar.f218967a;
                    int i13 = (width5 - ((height3 * aspectRatio3.f218906c) / aspectRatio3.f218905b)) / 2;
                    int height4 = bitmapDecodeByteArray.getHeight();
                    AspectRatio aspectRatio4 = gVar.f218967a;
                    int i14 = (height4 * aspectRatio4.f218906c) / aspectRatio4.f218905b;
                    int height5 = bitmapDecodeByteArray.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(f12);
                    G0 g02 = G0.f406611a;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, i13, 0, i14, height5, matrix, false);
                }
                bitmapDecodeByteArray.recycle();
                return bitmapCreateBitmap;
            }
        });
    }
}

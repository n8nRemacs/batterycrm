package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import java.io.FileOutputStream;
import java.io.IOException;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* loaded from: classes2.dex */
public final /* synthetic */ class rl6 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgTamCropImage b;

    public /* synthetic */ rl6(FrgTamCropImage frgTamCropImage, int i) {
        this.a = i;
        this.b = frgTamCropImage;
    }

    @Override // defpackage.p6
    public final void run() throws IOException {
        d6 d6VarU0;
        switch (this.a) {
            case 0:
                FrgTamCropImage frgTamCropImage = this.b;
                ((t1b) ((qm3) frgTamCropImage.l1.b)).a().e("LOCAL_MEDIA_ROTATE");
                rr6 rr6Var = frgTamCropImage.u1.a;
                Matrix matrix = rr6Var.C0;
                matrix.reset();
                float currentScale = 1.0f / rr6Var.getCurrentScale();
                matrix.postScale(currentScale, currentScale);
                RectF rectF = rr6Var.D0;
                rectF.set(rr6Var.B0);
                matrix.mapRect(rectF);
                float fWidth = rectF.width();
                rr6 rr6Var2 = frgTamCropImage.u1.a;
                RectF rectF2 = rr6Var2.B0;
                float fCenterX = rectF2.centerX();
                float fCenterY = rectF2.centerY();
                Matrix matrix2 = rr6Var2.t0;
                matrix2.postRotate(90.0f, fCenterX, fCenterY);
                rr6Var2.setImageMatrix(matrix2);
                tkb tkbVar = frgTamCropImage.u1.b;
                float f = 1.0f / tkbVar.s0;
                tkbVar.s0 = f;
                RectF rectF3 = tkbVar.a;
                tkbVar.a(rectF3, f);
                tkbVar.b();
                ukb ukbVar = tkbVar.L0;
                if (ukbVar != null) {
                    ((ImageCropView) ukbVar).a.setCropRect(rectF3);
                }
                tkbVar.postInvalidateOnAnimation();
                rr6 rr6Var3 = frgTamCropImage.u1.a;
                Matrix matrix3 = rr6Var3.C0;
                matrix3.reset();
                float currentScale2 = 1.0f / rr6Var3.getCurrentScale();
                matrix3.postScale(currentScale2, currentScale2);
                RectF rectF4 = rr6Var3.D0;
                rectF4.set(rr6Var3.B0);
                matrix3.mapRect(rectF4);
                float fHeight = rectF4.height() / fWidth;
                rr6 rr6Var4 = frgTamCropImage.u1.a;
                RectF rectF5 = rr6Var4.B0;
                float fCenterX2 = rectF5.centerX();
                float fCenterY2 = rectF5.centerY();
                Matrix matrix4 = rr6Var4.t0;
                if (fHeight != 0.0f) {
                    matrix4.postScale(fHeight, fHeight, fCenterX2, fCenterY2);
                    rr6Var4.setImageMatrix(matrix4);
                }
                frgTamCropImage.u1.a();
                return;
            case 1:
                FrgTamCropImage frgTamCropImage2 = this.b;
                ((t1b) ((qm3) frgTamCropImage2.l1.b)).a().e("LOCAL_MEDIA_FLIP");
                rr6 rr6Var5 = frgTamCropImage2.u1.a;
                RectF rectF6 = rr6Var5.B0;
                float fCenterX3 = rectF6.centerX();
                float fCenterY3 = rectF6.centerY();
                Matrix matrix5 = rr6Var5.t0;
                matrix5.postScale(-1.0f, 1.0f, fCenterX3, fCenterY3);
                rr6Var5.setImageMatrix(matrix5);
                frgTamCropImage2.u1.a();
                return;
            case 2:
                rr6 rr6Var6 = this.b.u1.a;
                rr6Var6.E0 = 0.0f;
                rr6Var6.a();
                return;
            case 3:
                this.b.s0();
                return;
            case 4:
                FrgTamCropImage frgTamCropImage3 = this.b;
                try {
                    new kk3(1, new rl6(frgTamCropImage3, 5)).h(u0e.a()).f(new pk3(new qu1(new sl6(0, frgTamCropImage3), 0, new rl6(frgTamCropImage3, 6)), de.a()));
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            case 5:
                FrgTamCropImage frgTamCropImage4 = this.b;
                ImageCropView imageCropView = frgTamCropImage4.u1;
                Bitmap.CompressFormat compressFormat = frgTamCropImage4.X.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                rr6 rr6Var7 = imageCropView.a;
                Bitmap viewBitmap = rr6Var7.getViewBitmap();
                String imageOutputPath = rr6Var7.getImageOutputPath();
                da4 cropState = rr6Var7.getCropState();
                if (viewBitmap == null || viewBitmap.isRecycled()) {
                    throw new IllegalStateException("bitmap recycled or null");
                }
                Matrix matrix6 = new Matrix();
                float[] fArr = cropState.c;
                RectF rectF7 = cropState.a;
                matrix6.setValues(fArr);
                Matrix matrix7 = new Matrix();
                matrix7.set(matrix6);
                float fB = 1.0f / mei.b(matrix6);
                matrix7.postScale(fB, fB, 0.0f, 0.0f);
                float[] fArr2 = mei.a;
                matrix7.getValues(fArr2);
                float f2 = -fArr2[2];
                matrix7.getValues(fArr2);
                matrix7.postTranslate(f2, -fArr2[5]);
                matrix7.mapRect(rectF7);
                matrix7.postTranslate(-rectF7.left, -rectF7.top);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF7.width(), (int) rectF7.height(), Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawBitmap(viewBitmap, matrix7, null);
                FileOutputStream fileOutputStream = new FileOutputStream(imageOutputPath);
                try {
                    bitmapCreateBitmap.compress(compressFormat, 100, fileOutputStream);
                    bitmapCreateBitmap.recycle();
                    fileOutputStream.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                FrgTamCropImage frgTamCropImage5 = this.b;
                if (frgTamCropImage5.u0() == null || (d6VarU0 = frgTamCropImage5.u0()) == null) {
                    return;
                }
                Intent intent = new Intent();
                Uri uri = (Uri) frgTamCropImage5.X.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
                intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uri);
                wqi.c("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: result: %s", uri.toString());
                rr6 rr6Var8 = frgTamCropImage5.u1.a;
                if (!rr6Var8.getInitialMatrix().equals(rr6Var8.t0)) {
                    intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", frgTamCropImage5.u1.getCropState());
                }
                d6VarU0.setResult(-1, intent);
                frgTamCropImage5.s0();
                return;
        }
    }
}

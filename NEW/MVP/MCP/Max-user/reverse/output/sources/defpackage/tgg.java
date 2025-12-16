package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.ExifInterface;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class tgg {
    public final /* synthetic */ k18 a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ k18 c;
    public final /* synthetic */ bwf d;
    public final /* synthetic */ k18 e;
    public final /* synthetic */ k18 f;

    public tgg(k18 k18Var, k18 k18Var2, k18 k18Var3, bwf bwfVar, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = bwfVar;
        this.e = k18Var4;
        this.f = k18Var5;
    }

    public static void d(jvg jvgVar, String str) {
        yqb.e(kvg.g, jvgVar, str);
    }

    public final os3 a() {
        return ((ur3) this.c.getValue()).b();
    }

    public final void b(String str) {
        ((y3b) ((yi5) this.b.getValue())).a(new IllegalStateException("Transfer exception. ".concat(str)));
    }

    public final void c(Throwable th) {
        ((y3b) ((yi5) this.b.getValue())).a(new te2("ONEME-11028", th.getMessage(), th));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [xf7] */
    public final void e(String str, String str2) throws IOException {
        Bitmap bitmapDecodeBitmap;
        Bitmap bitmapCreateBitmap;
        l5c l5cVar = (l5c) ((u6b) this.f.getValue()).c;
        l5cVar.getClass();
        long j = 1920;
        final int iM = (int) l5cVar.m(PmsKey.f64imagewidth, j);
        final int iM2 = (int) l5cVar.m(PmsKey.f61imageheight, j);
        int iR = l5cVar.r();
        String str3 = ave.d;
        wqi.c(str3, "convertToJpeg: path=%s", str);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(str)), new ImageDecoder.OnHeaderDecodedListener() { // from class: xf7
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        int i = iM;
                        int i2 = iM2;
                        float width = imageInfo.getSize().getWidth();
                        float height = imageInfo.getSize().getHeight();
                        float fMin = Math.min(i / width, Math.min(i2 / height, 1.0f));
                        if (fMin < 1.0f) {
                            imageDecoder.setTargetSize((int) (width * fMin), (int) (height * fMin));
                        }
                        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                        imageDecoder.setAllocator(1);
                    }
                });
                wqi.c(str3, "convertToJpeg: decoded with ImageDecoder", new Object[0]);
            } catch (IOException e) {
                wqi.p(str3, "convertToJpeg: ImageDecoder failed, trying BitmapFactory", e);
            }
        } else {
            bitmapDecodeBitmap = null;
        }
        if (bitmapDecodeBitmap == null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                Point point = new Point(options.outWidth, options.outHeight);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                int i = 1;
                while (true) {
                    if (point.x / i <= iM && point.y / i <= iM2) {
                        break;
                    }
                    i *= 2;
                }
                options2.inSampleSize = i;
                bitmapDecodeBitmap = BitmapFactory.decodeFile(str, options2);
                wqi.c(str3, "convertToJpeg: decoded with BitmapFactory", new Object[0]);
            } catch (IOException e2) {
                wqi.e(str3, "convertToJpeg: BitmapFactory failed", e2);
                throw new IOException("Cannot decode image", e2);
            }
        }
        if (bitmapDecodeBitmap == null) {
            throw new IOException("Failed to decode bitmap from: ".concat(str));
        }
        try {
            if (bitmapDecodeBitmap.hasAlpha()) {
                wqi.c(str3, "convertToJpeg: flattening alpha channel", new Object[0]);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeBitmap.getWidth(), bitmapDecodeBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(bitmapDecodeBitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                bitmapCreateBitmap = bitmapDecodeBitmap;
            }
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            ave.c(str2, bitmapCreateBitmap, iR);
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
                    ExifInterface exifInterface = new ExifInterface(str2);
                    exifInterface.setAttribute("Orientation", String.valueOf(attributeInt));
                    exifInterface.saveAttributes();
                } catch (IOException e3) {
                    wqi.p(str3, "convertToJpeg: failed to copy orientation", e3);
                }
            }
            wqi.c(str3, "convertToJpeg: successfully converted to JPEG", new Object[0]);
            if (bitmapCreateBitmap != bitmapDecodeBitmap) {
                bitmapCreateBitmap.recycle();
            }
            bitmapDecodeBitmap.recycle();
        } catch (Throwable th) {
            bitmapDecodeBitmap.recycle();
            throw th;
        }
    }

    public final q34 f(String str) {
        return ((u6b) this.f.getValue()).f(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01b5  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r18, java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgg.g(java.lang.String, java.lang.String):boolean");
    }
}

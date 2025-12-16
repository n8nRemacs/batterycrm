package one.me.sdk.uikit.qr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import defpackage.cei;
import defpackage.imb;
import defpackage.ipd;
import defpackage.kpd;
import defpackage.kti;
import defpackage.qqg;
import defpackage.tg3;
import defpackage.uha;
import defpackage.wqi;
import defpackage.yeb;
import defpackage.ywc;
import defpackage.zqc;
import kotlin.Metadata;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0083 ¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/qr/QrCodeGenerator;", "", "", "content", "logo", "", "size", "", "coordinates", "nativeGenerateQR", "(Ljava/lang/String;Ljava/lang/String;I[I)[I", "svg", "width", "height", "nativeRenderSvg", "(Ljava/lang/String;II)[I", "qr_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QrCodeGenerator {
    public static final QrCodeGenerator a = new QrCodeGenerator();
    public static final uha b = zqc.a;
    public static final boolean c;
    public static final PorterDuffXfermode d;
    public static Path e;
    public static imb f;

    static {
        Object ipdVar;
        try {
            System.loadLibrary("qrcode");
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof UnsatisfiedLinkError) {
                b.getClass();
                wqi.e("QrCodeGenerator", "Failed to load native library qrcode (UnsatisfiedLinkError)", thA);
            } else {
                b.getClass();
                wqi.e("QrCodeGenerator", "Unexpected error while loading qrcode", thA);
            }
        }
        c = !(ipdVar instanceof ipd);
        d = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    }

    public static void a(Canvas canvas, Bitmap bitmap, Paint paint, int i, int i2, float f2, float f3, float f4, float f5) {
        float width = (bitmap.getWidth() * f2) / 100.0f;
        float height = (bitmap.getHeight() * f3) / 100.0f;
        float width2 = (bitmap.getWidth() * f4) / 100.0f;
        float height2 = (bitmap.getHeight() * f5) / 100.0f;
        float fMax = Math.max(width2, height2);
        paint.setShader(new RadialGradient(width, height, fMax, i, i2, Shader.TileMode.CLAMP));
        float f6 = width2 / fMax;
        float f7 = height2 / fMax;
        int iSave = canvas.save();
        try {
            canvas.scale(f6, f7, width, height);
            canvas.drawCircle(width, height, fMax, paint);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static imb b(QrCodeGenerator qrCodeGenerator, String str, int i, yeb yebVar) {
        qrCodeGenerator.getClass();
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i + 2;
        int i3 = i2 * 2;
        int[] iArrNativeGenerateQR = nativeGenerateQR(str, "", i3, new int[4]);
        if (iArrNativeGenerateQR == null) {
            throw new IllegalStateException(("nativeGenerateQR returned null for size=" + i3).toString());
        }
        int i4 = yebVar.a().G().b.d.b;
        int length = iArrNativeGenerateQR.length;
        for (int i5 = 0; i5 < length; i5++) {
            iArrNativeGenerateQR[i5] = iArrNativeGenerateQR[i5] == -1 ? 0 : i4;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArrNativeGenerateQR, 0, i3, 0, 0, i3, i3);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i2, true);
        bitmapCreateBitmap.recycle();
        float f2 = i2 / i3;
        int[] iArr = new int[4];
        for (int i6 = 0; i6 < 4; i6++) {
            iArr[i6] = kti.d(r8[i6] * f2);
        }
        return new imb(bitmapCreateScaledBitmap, iArr);
    }

    public static void c(Canvas canvas, Bitmap bitmap, Context context, int i, int i2, Layout layout, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Path path = e;
        if (path == null) {
            VectorPath vectorPathFindPath = new EnhancedVectorDrawable(context, ywc.avatar_shape).findPath("avatar_shape");
            path = vectorPathFindPath != null ? vectorPathFindPath.getPath() : null;
            if (path != null) {
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    Matrix matrix = new Matrix();
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    float f2 = i;
                    matrix.postScale(f2 / rectF.width(), f2 / rectF.height());
                    path.transform(matrix);
                }
            }
            e = path;
        }
        if (path == null) {
            return;
        }
        float height = (((((i6 - i7) - i8) - i9) - i5) - i3) - layout.getHeight();
        float f3 = i;
        float f4 = (i2 / 2.0f) - (f3 / 2.0f);
        float f5 = (height - i4) - f3;
        int iSave = canvas.save();
        try {
            canvas.translate(f4, f5);
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i, i), (Paint) null);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static void d(Bitmap bitmap, Drawable drawable, Canvas canvas, int[] iArr, int i, int i2, int i3, int i4, yeb yebVar) {
        int width = (i / 2) - (bitmap.getWidth() / 2);
        int height = ((i3 - i4) - i2) - bitmap.getHeight();
        Canvas canvas2 = new Canvas(bitmap);
        int i5 = (int) (iArr[2] * 0.9d);
        int i6 = (int) (iArr[3] * 0.9d);
        int width2 = (bitmap.getWidth() / 2) - (i5 / 2);
        int height2 = (bitmap.getHeight() / 2) - (i6 / 2);
        cei.k(drawable, yebVar.a().G().b.d.b);
        drawable.setBounds(width2, height2, i5 + width2, i6 + height2);
        drawable.draw(canvas2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(d);
        tg3 tg3Var = yebVar.a().G().b.d;
        a(canvas2, bitmap, paint, tg3Var.c, tg3Var.d, 4.33f, 102.75f, 53.7f, 101.94f);
        a(canvas2, bitmap, paint, tg3Var.e, tg3Var.f, 100.15f, 59.09f, 121.47f, 103.78f);
        canvas.drawBitmap(bitmap, width, height, (Paint) null);
    }

    public static void e(Canvas canvas, Layout layout, Layout layout2, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        int iSave;
        int height = ((i3 - i5) - i6) - bitmap.getHeight();
        if (layout2 != null) {
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() / 2.0f) - (layout2.getWidth() / 2.0f), (height - i) - i2);
            try {
                layout2.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        float height2 = (((height - i) - i2) - i4) - layout.getHeight();
        iSave = canvas.save();
        canvas.translate((canvas.getWidth() / 2.0f) - (layout.getWidth() / 2.0f), height2);
        try {
            layout.draw(canvas);
        } finally {
        }
    }

    private static final native int[] nativeGenerateQR(String content, String logo, int size, int[] coordinates);

    public static final native int[] nativeRenderSvg(String svg, int width, int height);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b4  */
    /* JADX WARN: Type inference failed for: r56v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v29, types: [float] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [iz5] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [erc] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r48, int r49, defpackage.iz5 r50, defpackage.lzf r51, defpackage.erc r52, java.lang.String r53, android.graphics.drawable.Drawable r54, android.graphics.Bitmap r55, android.graphics.drawable.Drawable r56, java.lang.CharSequence r57, java.lang.CharSequence r58, defpackage.q44 r59) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.uikit.qr.QrCodeGenerator.f(android.content.Context, int, iz5, lzf, erc, java.lang.String, android.graphics.drawable.Drawable, android.graphics.Bitmap, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, q44):java.lang.Object");
    }
}

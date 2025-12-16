package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public abstract class tfi {
    public static final byte[] a = {48, 49, 53, 0};
    public static final byte[] b = {48, 49, 48, 0};
    public static final byte[] c = {48, 48, 57, 0};
    public static final byte[] d = {48, 48, 53, 0};
    public static final byte[] e = {48, 48, 49, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 50, 0};
    public static final /* synthetic */ int h = 0;

    public static Point a(FileDescriptor fileDescriptor, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i == 6 || i == 8) ? new Point(point.y, point.x) : point;
    }

    public static Point b(String str, boolean z) {
        int iE;
        if (z) {
            try {
                iE = new pk5(str).e(1, "Orientation");
            } catch (IOException unused) {
            }
        } else {
            iE = 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (iE == 6 || iE == 8) ? new Point(point.y, point.x) : point;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r4, defpackage.k09 r5) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfi.c(android.content.Context, k09):java.lang.String");
    }

    public static int d(Point point, int i, int i2) {
        int i3 = 1;
        while (true) {
            if (point.x / i3 <= i && point.y / i3 <= i2) {
                return i3;
            }
            i3 *= 2;
        }
    }

    public static int e(String str) {
        int iH = xz9.h(str);
        if (iH == 4) {
            return 2;
        }
        return iH;
    }

    public static int f(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static Uri g(String str) {
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        return Uri.parse(strH);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = m6g.a;
        return (str.regionMatches(true, 0, "file:", 0, 5) || str.regionMatches(true, 0, HttpHost.DEFAULT_SCHEME_NAME, 0, 4) || str.regionMatches(true, 0, "content", 0, 7) || str.regionMatches(true, 0, "android.resource:/", 0, 18) || str.regionMatches(true, 0, "res:/", 0, 5) || str.regionMatches(true, 0, "data", 0, 4)) ? str : Uri.fromFile(new File(str)).toString();
    }

    public static float i(wg7 wg7Var, hf6 hf6Var) {
        int i = hf6Var.z;
        int i2 = hf6Var.v;
        int i3 = hf6Var.u;
        int i4 = i % 180;
        int i5 = i4 == 0 ? i3 : i2;
        int i6 = i4 == 0 ? i2 : i3;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < wg7Var.size(); i7++) {
            s95 s95Var = (s95) wg7Var.get(i7);
            if (!(s95Var instanceof mu6)) {
                return -1.0f;
            }
            mu6 mu6Var = (mu6) s95Var;
            if (s95Var instanceof pyd) {
                pyd pydVar = (pyd) s95Var;
                pydVar.getClass();
                float f3 = pydVar.a;
                if (f3 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f2 += f3;
                float f4 = f2 % 180.0f;
                i5 = f4 == 0.0f ? i3 : i2;
                i6 = f4 == 0.0f ? i2 : i3;
            } else if (!mu6Var.d(i5, i6)) {
                return -1.0f;
            }
        }
        float f5 = f2 % 360.0f;
        if (f5 % 90.0f == 0.0f) {
            return f5;
        }
        return -1.0f;
    }

    public static void j(age ageVar, String str) throws Throwable {
        int iF = f(new pk5(str).e(1, "Orientation"));
        if (iF == 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iF);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        bitmapDecodeFile.recycle();
        try {
            m(str, bitmapCreateBitmap, ((l5c) ageVar).r(), Bitmap.CompressFormat.JPEG);
        } catch (IOException unused) {
        }
        bitmapCreateBitmap.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160 A[Catch: all -> 0x0170, Exception -> 0x0173, TryCatch #18 {Exception -> 0x0173, all -> 0x0170, blocks: (B:91:0x015c, B:93:0x0160, B:100:0x017e, B:99:0x0176), top: B:151:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176 A[Catch: all -> 0x0170, Exception -> 0x0173, TryCatch #18 {Exception -> 0x0173, all -> 0x0170, blocks: (B:91:0x015c, B:93:0x0160, B:100:0x017e, B:99:0x0176), top: B:151:0x015c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(defpackage.age r17, java.lang.String r18, java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfi.k(age, java.lang.String, java.lang.String):boolean");
    }

    public static Bitmap l(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        return (height < i || height > i2 || width < i || width > i2) ? (height < i || width < i) ? Bitmap.createScaledBitmap(bitmap, i, i, false) : Bitmap.createScaledBitmap(bitmap, i2, i2, false) : bitmap;
    }

    public static void m(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(compressFormat, i, fileOutputStream);
            wqi.c("tfi", "save bitmap success! %s", str);
            gbj.c(fileOutputStream);
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            wqi.e("tfi", "save bitmap failure!", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            gbj.c(fileOutputStream2);
            throw th;
        }
    }

    public static Bitmap n(int i, int i2, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        matrix.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight(), 0.0f, 0.0f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return bitmapCreateBitmap;
    }

    public static Bitmap o(int i, int i2, Context context) {
        Drawable drawableB = r34.b(context, i);
        if (drawableB == null) {
            return null;
        }
        t35.h(drawableB, ColorStateList.valueOf(i2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableB.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableB.draw(canvas);
        return bitmapCreateBitmap;
    }
}

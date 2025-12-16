package com.yandex.mapkit.render.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.yandex.runtime.device.internal.DeviceInfo;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes7.dex */
public class TextualImageProvider extends ImageProvider {
    private static final float DELTA = 1.5f;
    private static final float FONT_SCALE = 1.0f;
    private static final SparseArray<Paint> map = new SparseArray<>();
    private final Bitmap bitmap;

    /* renamed from: id, reason: collision with root package name */
    private final String f377458id;

    public TextualImageProvider(String str, int i12, boolean z12, int i13, int i14) {
        this.f377458id = "text:" + str + " fontSize:" + i12 + " isOutlined:" + z12;
        Paint paint = getPaint(i12);
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (fMeasureText + 0.5f), (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom) + 0.5f), Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float fAbs = Math.abs(fontMetrics.ascent);
        synchronized (map) {
            if (z12) {
                try {
                    paint.setColor(i14);
                    float f12 = fAbs - DELTA;
                    canvas.drawText(str, -1.5f, f12, paint);
                    canvas.drawText(str, DELTA, f12, paint);
                    float f13 = fAbs + DELTA;
                    canvas.drawText(str, DELTA, f13, paint);
                    canvas.drawText(str, -1.5f, f13, paint);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            paint.setColor(i13);
            canvas.drawText(str, 0.0f, fAbs, paint);
        }
    }

    public static int baseline(int i12) {
        return Math.round(Math.abs(getPaint(i12).getFontMetrics().ascent));
    }

    private static Paint getPaint(int i12) {
        Paint paint;
        SparseArray<Paint> sparseArray = map;
        synchronized (sparseArray) {
            try {
                paint = sparseArray.get(i12);
                if (paint == null) {
                    paint = new Paint();
                    paint.setTextSize(i12 * 1.0f * DeviceInfo.pixelsPerPoint());
                    paint.setTextAlign(Paint.Align.LEFT);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                    sparseArray.put(i12, paint);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return paint;
    }

    public static Size measureText(String str, int i12) {
        Paint paint = getPaint(i12);
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new Size((int) (fMeasureText + 0.5f), (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom) + 0.5f));
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public String getId() {
        return this.f377458id;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public Bitmap getImage() {
        return this.bitmap;
    }
}

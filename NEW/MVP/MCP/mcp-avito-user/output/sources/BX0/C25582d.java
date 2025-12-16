package bX0;

import I41.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.cache.common.j;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RoundPostprocessor.java */
@Nullsafe
/* renamed from: bX0.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C25582d extends com.facebook.imagepipeline.request.a {

    /* renamed from: c, reason: collision with root package name */
    @h
    public j f57110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57111d = true;

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @h
    public final com.facebook.cache.common.c a() {
        if (this.f57110c == null) {
            this.f57110c = new j("XferRoundFilter");
        }
        return this.f57110c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height) / 2;
        int i12 = width / 2;
        int i13 = height / 2;
        if (iMin == 0) {
            return;
        }
        if (!(iMin >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(width > 0 && ((float) width) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        if (!(height > 0 && ((float) height) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        if (!(i12 > 0 && i12 < width)) {
            throw new IllegalArgumentException();
        }
        if (!(i13 > 0 && i13 < height)) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = iMin - 1;
        if (!(i12 - i14 >= 0 && i13 - i14 >= 0 && i12 + i14 < width && i13 + i14 < height)) {
            throw new IllegalArgumentException();
        }
        int i15 = (-iMin) * 2;
        int[] iArr2 = new int[width];
        int i16 = i15 + 1;
        int i17 = 1;
        int i18 = 1;
        int i19 = 0;
        while (i14 >= i19) {
            int i22 = i12 + i14;
            int i23 = i12 - i14;
            int i24 = i12 + i19;
            int i25 = iMin;
            int i26 = i12 - i19;
            int i27 = i13 + i14;
            int i28 = i13 - i14;
            int i29 = i12;
            int i32 = i13 + i19;
            int i33 = i13 - i19;
            if (!(i14 >= 0 && i24 < width && i26 >= 0 && i32 < height && i33 >= 0)) {
                throw new IllegalArgumentException();
            }
            int i34 = i32 * width;
            int i35 = height;
            int i36 = width * i33;
            int i37 = i13;
            int i38 = width * i27;
            int i39 = i15;
            int i42 = width * i28;
            int i43 = i17;
            System.arraycopy(iArr2, 0, iArr, i34, i23);
            System.arraycopy(iArr2, 0, iArr, i36, i23);
            System.arraycopy(iArr2, 0, iArr, i38, i26);
            System.arraycopy(iArr2, 0, iArr, i42, i26);
            int i44 = width - i22;
            System.arraycopy(iArr2, 0, iArr, i34 + i22, i44);
            System.arraycopy(iArr2, 0, iArr, i36 + i22, i44);
            int i45 = width - i24;
            System.arraycopy(iArr2, 0, iArr, i38 + i24, i45);
            System.arraycopy(iArr2, 0, iArr, i42 + i24, i45);
            if (i16 <= 0) {
                i19++;
                i18 += 2;
                i16 += i18;
            }
            if (i16 > 0) {
                i14--;
                i17 = i43 + 2;
                i16 += i17 + i39;
                iMin = i25;
                i15 = i39;
            } else {
                iMin = i25;
                i15 = i39;
                i17 = i43;
            }
            i12 = i29;
            i13 = i37;
            height = i35;
        }
        int i46 = height;
        int i47 = iMin;
        int i48 = i13;
        for (int i49 = i48 - i47; i49 >= 0; i49--) {
            System.arraycopy(iArr2, 0, iArr, i49 * width, width);
        }
        for (int i52 = i48 + i47; i52 < i46; i52++) {
            System.arraycopy(iArr2, 0, iArr, i52 * width, width);
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i46);
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void e(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint;
        Paint paint2;
        bitmap2.getClass();
        bitmap.setHasAlpha(true);
        if (this.f57111d) {
            paint = new Paint(1);
            paint2 = new Paint(1);
        } else {
            paint = new Paint();
            paint2 = new Paint();
        }
        paint.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Canvas canvas = new Canvas(bitmap);
        float width = bitmap2.getWidth() / 2.0f;
        float height = bitmap2.getHeight() / 2.0f;
        canvas.drawCircle(width, height, Math.min(width, height), paint);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
    }
}

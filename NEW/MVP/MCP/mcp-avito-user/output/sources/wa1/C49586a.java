package wa1;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.renderscript.Toolkit;
import java.util.ArrayList;
import ya1.C50207c;

/* renamed from: wa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49586a {

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f441577b = {0.0f, -1.0f, 0.0f, -1.0f, 4.0f, -1.0f, 0.0f, -1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public final u f441578a;

    public C49586a(u uVar, C50207c c50207c) {
        this.f441578a = uVar;
    }

    public final boolean a(Bitmap bitmap, ArrayList arrayList, boolean z12) {
        float f12 = 0.0f;
        Bitmap bitmapC = C50207c.c(bitmap, this.f441578a.a(arrayList, bitmap.getWidth(), bitmap.getHeight()));
        if (bitmapC.getWidth() > 300) {
            bitmapC = C50207c.a(bitmapC, 300, (bitmapC.getHeight() / bitmapC.getWidth()) * 300);
        }
        Toolkit toolkit = Toolkit.f358945a;
        toolkit.getClass();
        Bitmap bitmapC2 = Toolkit.c(toolkit, Toolkit.b(toolkit, bitmapC, new float[]{0.299f, 0.299f, 0.299f, 0.0f, 0.587f, 0.587f, 0.587f, 0.0f, 0.114f, 0.114f, 0.114f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}), f441577b);
        bitmapC2.setHasAlpha(false);
        int width = bitmapC2.getWidth() * bitmapC2.getHeight();
        int[] iArr = new int[width];
        bitmapC2.getPixels(iArr, 0, bitmapC2.getWidth(), 0, 0, bitmapC2.getWidth(), bitmapC2.getHeight());
        float fRed = 0.0f;
        for (int i12 = 0; i12 < width; i12++) {
            fRed += Color.red(iArr[i12]);
            f12 += r5 * r5;
        }
        float f13 = width;
        return (f12 / f13) - ((float) Math.pow((double) (fRed / f13), (double) 2)) < ((float) (z12 ? 500 : 350));
    }
}

package ya1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.core.z0;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.android.renderscript.Toolkit;
import com.google.android.renderscript.YuvFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.collections.C42756l;
import pc1.b;
import wa1.v;

/* renamed from: ya1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50207c {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f443201a;

    public C50207c(Context context) {
        this.f443201a = H91.b.a(context);
    }

    public static Bitmap a(Bitmap bitmap, int i12, int i13) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i12 / width, i13 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static Bitmap c(Bitmap bitmap, ArrayList arrayList) {
        int iIntValue = C42756l.V(new int[]{((int[]) arrayList.get(5))[0], ((int[]) arrayList.get(4))[0], ((int[]) arrayList.get(5))[0]}).intValue();
        int[] iArr = {((int[]) arrayList.get(1))[0], ((int[]) arrayList.get(2))[0], ((int[]) arrayList.get(3))[0]};
        int i12 = iArr[0];
        int i13 = 1;
        while (true) {
            int i14 = iArr[i13];
            if (i12 < i14) {
                i12 = i14;
            }
            if (i13 == 2) {
                int iMin = Math.min(((int[]) arrayList.get(0))[1], ((int[]) arrayList.get(1))[1]);
                int iMax = Math.max(((int[]) arrayList.get(3))[1], ((int[]) arrayList.get(4))[1]);
                return Bitmap.createBitmap(bitmap, Math.max(Math.min(iIntValue, i12), 0), Math.max(Math.min(iMin, iMax), 0), Math.min(i12 - iIntValue, bitmap.getWidth()), Math.min(iMax - iMin, bitmap.getHeight()));
            }
            i13++;
        }
    }

    public static C50205a e(Bitmap bitmap) {
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int iRed = 0;
        int iBlue = 0;
        int iGreen = 0;
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = iArr[i12];
            iRed += Color.red(i13);
            iGreen += Color.green(i13);
            iBlue += Color.blue(i13);
        }
        float f12 = height;
        return new C50205a(iRed / f12, iGreen / f12, iBlue / f12);
    }

    public static void g(Bitmap bitmap, float[] fArr) {
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = iArr[i13];
            float f12 = 255;
            fArr[i12] = Color.red(i14) / f12;
            int i15 = i12 + 2;
            fArr[i12 + 1] = Color.green(i14) / f12;
            i12 += 3;
            fArr[i15] = Color.blue(i14) / f12;
        }
    }

    public final Bitmap b(Bitmap bitmap, Rect rect) {
        float width = bitmap.getWidth();
        Rect rect2 = this.f443201a;
        float fMin = Math.min(width / rect2.width(), bitmap.getHeight() / rect2.height());
        Rect rect3 = new Rect((int) (rect.left * fMin), (int) (rect.top * fMin), (int) (rect.right * fMin), (int) (rect.bottom * fMin));
        return Bitmap.createBitmap(bitmap, rect3.left, rect3.top, rect3.width(), rect3.height());
    }

    public final Bitmap d(z0 z0Var) {
        int iB2;
        int iB3;
        Rect rect;
        int i12;
        int iB4;
        int i13 = 1;
        int i14 = z0Var.f24619h;
        int i15 = z0Var.f24620i;
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(i14, i15);
        Rect rect2 = this.f443201a;
        float f12 = iMax;
        float f13 = iMin;
        int i16 = 2;
        if (f12 / (rect2.height() / rect2.width()) > f13) {
            float f14 = 2;
            iB3 = kotlin.math.b.b(f13 / f14) * 2;
            iB2 = kotlin.math.b.b(((int) (iB3 * r7)) / f14) * 2;
        } else {
            float f15 = 2;
            iB2 = kotlin.math.b.b(f12 / f15) * 2;
            iB3 = kotlin.math.b.b(((int) (iB2 / r7)) / f15) * 2;
        }
        int iD2 = z0Var.f24617f.d();
        int i17 = 0;
        if (iD2 == 90 || iD2 == 270) {
            int i18 = (i15 - iB3) / 2;
            rect = new Rect(0, i18, iB2, iB3 + i18);
        } else {
            int i19 = (i14 - iB3) / 2;
            rect = new Rect(i19, 0, iB3 + i19, iB2);
        }
        InterfaceC20120j0 interfaceC20120j0 = z0Var.f23633c;
        int iW2 = interfaceC20120j0.w();
        int iWidth = rect.width();
        int iHeight = rect.height();
        InterfaceC20120j0.a[] aVarArrE4 = interfaceC20120j0.e4();
        int i22 = iWidth * iHeight;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(iW2) * i22) / 8];
        byte[] bArr2 = new byte[aVarArrE4[0].w()];
        int length = aVarArrE4.length;
        int i23 = 1;
        int i24 = 0;
        int i25 = 0;
        while (i24 < length) {
            if (i24 == 0) {
                i16 = i13;
                i25 = i17;
            } else if (i24 == i13) {
                i25 = i22 + 1;
            } else if (i24 != i16) {
                i16 = i23;
            } else {
                i25 = i22;
            }
            ByteBuffer byteBufferV = aVarArrE4[i24].v();
            int iW3 = aVarArrE4[i24].w();
            int iX2 = aVarArrE4[i24].x();
            InterfaceC20120j0.a[] aVarArr = aVarArrE4;
            int i26 = i24 == 0 ? 0 : 1;
            int i27 = iWidth >> i26;
            int i28 = iHeight >> i26;
            int i29 = length;
            int i32 = iWidth;
            byteBufferV.position(((rect.left >> i26) * iX2) + ((rect.top >> i26) * iW3));
            int i33 = i25;
            int i34 = 0;
            while (true) {
                Rect rect3 = rect;
                if (i34 < i28) {
                    if (iX2 == 1 && i16 == 1) {
                        byteBufferV.get(bArr, i33, i27);
                        i12 = i33 + i27;
                        iB4 = i27;
                    } else {
                        i12 = i33;
                        iB4 = H.b(i27, 1, iX2, 1);
                        byteBufferV.get(bArr2, 0, iB4);
                        for (int i35 = 0; i35 < i27; i35++) {
                            bArr[i12] = bArr2[i35 * iX2];
                            i12 += i16;
                        }
                    }
                    if (i34 < i28 - 1) {
                        byteBufferV.position((byteBufferV.position() + iW3) - iB4);
                    }
                    i34++;
                    rect = rect3;
                    i33 = i12;
                }
            }
            i24++;
            aVarArrE4 = aVarArr;
            i23 = i16;
            i25 = i33;
            i13 = 1;
            length = i29;
            iWidth = i32;
            i16 = 2;
            i17 = 0;
        }
        byte[] bArrA = (iD2 == 90 || iD2 == 270) ? v.a(iB2, iB3, iD2, bArr) : v.a(iB3, iB2, iD2, bArr);
        Toolkit toolkit = Toolkit.f358945a;
        YuvFormat[] yuvFormatArr = YuvFormat.f358947b;
        return toolkit.e(iB3, iB2, bArrA);
    }

    public final C50206b f(Bitmap bitmap, int i12, int i13, int i14, Rect rect) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Rect rect2 = this.f443201a;
        int iWidth = (rect == null ? rect2 : rect).width();
        if (rect != null) {
            rect2 = rect;
        }
        float fHeight = rect2.height();
        float f12 = iWidth;
        float f13 = fHeight / f12;
        int i15 = i13 - i14;
        int i16 = i12 - i14;
        float f14 = i15 / f13;
        float f15 = i16;
        if (f14 > f15) {
            i15 = (int) (f15 * f13);
        } else {
            i16 = (int) f14;
        }
        float f16 = i16;
        float width = bitmap.getWidth() / f16;
        float f17 = i15;
        float height = bitmap.getHeight() / f17;
        float f18 = f12 / f16;
        float f19 = fHeight / f17;
        float f22 = 2;
        float f23 = (i12 - i16) / f22;
        float f24 = (i13 - i15) / f22;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i16, i15, true);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j12 = jCurrentTimeMillis2 - jCurrentTimeMillis;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, bitmapCreateScaledBitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(bitmapCreateScaledBitmap, f23, f24, (Paint) null);
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
        b.C12280b c12280b = pc1.b.f428696a;
        c12280b.b(e.i(j12, "Resize time ", " ms"), new Object[0]);
        c12280b.b(AK.c.j(jCurrentTimeMillis3, " ms", new StringBuilder("Border time ")), new Object[0]);
        return new C50206b(bitmapCreateBitmap, bitmapCreateScaledBitmap, width, height, f18, f19, f23, f24);
    }
}

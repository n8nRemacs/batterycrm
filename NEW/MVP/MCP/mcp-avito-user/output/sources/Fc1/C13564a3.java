package Fc1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.a3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13564a3 implements InterfaceC13590d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D4 f5380b;

    public C13564a3(int i12, @Y61.k D4 d42) {
        this.f5379a = i12;
        this.f5380b = d42;
    }

    @Override // Fc1.InterfaceC13590d2
    @Y61.k
    public final Bitmap a(@Y61.k Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap.copy(config, true), 0.0f, 0.0f, new Paint());
        canvas.drawColor(Color.parseColor(C13566a5.a((int) (this.f5379a * 2.55f), this.f5380b).f5864a));
        return bitmapCreateBitmap;
    }
}

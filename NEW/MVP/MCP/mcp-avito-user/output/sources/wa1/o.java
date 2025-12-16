package wa1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class o extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441612m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f441613n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Bitmap bitmap, ArrayList arrayList) {
        super(0);
        this.f441611l = pVar;
        this.f441612m = bitmap;
        this.f441613n = arrayList;
    }

    @Override // Y41.a
    public final Object invoke() {
        Bitmap bitmap = this.f441612m;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ArrayList arrayList = this.f441613n;
        p pVar = this.f441611l;
        pVar.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int[] iArr = (int[]) arrayList.get(0);
        int[] iArr2 = (int[]) arrayList.get(1);
        int[] iArr3 = (int[]) arrayList.get(2);
        int[] iArr4 = (int[]) arrayList.get(5);
        int[] iArr5 = (int[]) arrayList.get(5);
        int[] iArr6 = (int[]) arrayList.get(2);
        int[] iArr7 = (int[]) arrayList.get(3);
        int[] iArr8 = (int[]) arrayList.get(4);
        int i12 = iArr6[0];
        int i13 = iArr5[0];
        float f12 = i12 - i13;
        int i14 = iArr6[1];
        int i15 = iArr5[1];
        float f13 = i14 - i15;
        float f14 = iArr8[0] - i13;
        float f15 = iArr8[1] - i15;
        float f16 = i13;
        float f17 = (f12 * 0.04f) + f16;
        float f18 = f14 * 0.18181819f;
        float f19 = i15;
        float f22 = (0.04f * f13) + f19;
        float f23 = 0.18181819f * f15;
        float f24 = (f12 * 0.32f) + f16;
        float f25 = f24 + f18;
        float f26 = (f13 * 0.32f) + f19;
        float f27 = f26 + f23;
        float f28 = f14 * 0.6931818f;
        float f29 = f15 * 0.6931818f;
        Paint paint = pVar.f441620g;
        paint.setColor(-16777216);
        canvas.drawPaint(paint);
        Path path = new Path();
        path.moveTo(iArr[0], iArr[1]);
        path.lineTo(iArr2[0], iArr2[1]);
        path.lineTo(iArr3[0], iArr3[1]);
        path.lineTo(iArr4[0], iArr4[1]);
        path.close();
        paint.setColor(-65536);
        canvas.drawPath(path, paint);
        Path path2 = new Path();
        path2.moveTo(iArr5[0], iArr5[1]);
        path2.lineTo(iArr6[0], iArr6[1]);
        path2.lineTo(iArr7[0], iArr7[1]);
        path2.lineTo(iArr8[0], iArr8[1]);
        path2.close();
        paint.setColor(-16711936);
        canvas.drawPath(path2, paint);
        Path path3 = new Path();
        path3.moveTo(f17 + f18, f22 + f23);
        path3.lineTo(f25, f27);
        path3.lineTo(f24 + f28, f26 + f29);
        path3.lineTo(f17 + f28, f22 + f29);
        path3.close();
        paint.setColor(-16711681);
        canvas.drawPath(path3, paint);
        return bitmapCreateBitmap;
    }
}

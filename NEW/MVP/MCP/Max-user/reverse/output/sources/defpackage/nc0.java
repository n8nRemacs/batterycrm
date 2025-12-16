package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes2.dex */
public final class nc0 extends lk0 {
    public final /* synthetic */ int c;
    public final h8a d;
    public final Paint e;
    public final Matrix f;

    public nc0(int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.d = new h8a(1);
                Paint paint = new Paint(1);
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.e = paint;
                this.f = new Matrix();
                break;
            default:
                this.d = new h8a(1);
                Paint paint2 = new Paint(1);
                paint2.setAntiAlias(true);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.e = paint2;
                this.f = new Matrix();
                break;
        }
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        switch (this.c) {
            case 0:
                int width = bitmap.getWidth() / 2;
                h8a h8aVar = this.d;
                Object objC = h8aVar.c(width);
                Object obj = objC;
                if (objC == null) {
                    Path path = new Path();
                    path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, width, Path.Direction.CW);
                    path.setFillType(Path.FillType.INVERSE_WINDING);
                    int iA = h8aVar.a(width);
                    h8aVar.b[iA] = width;
                    h8aVar.c[iA] = path;
                    obj = path;
                }
                Path path2 = (Path) obj;
                vc3 vc3VarC = r2cVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas((Bitmap) vc3VarC.Z());
                    canvas.drawBitmap(bitmap, this.f, null);
                    canvas.drawPath(path2, this.e);
                    vc3 vc3VarW = vc3VarC.w();
                    vc3VarC.close();
                    return vc3VarW;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                int width2 = bitmap.getWidth() / 2;
                h8a h8aVar2 = this.d;
                Object objC2 = h8aVar2.c(width2);
                Object obj2 = objC2;
                if (objC2 == null) {
                    Path path3 = new Path();
                    float f = 2;
                    path3.addCircle(bitmap.getWidth() / f, bitmap.getHeight() / f, width2, Path.Direction.CW);
                    path3.setFillType(Path.FillType.INVERSE_WINDING);
                    int iA2 = h8aVar2.a(width2);
                    h8aVar2.b[iA2] = width2;
                    h8aVar2.c[iA2] = path3;
                    obj2 = path3;
                }
                Path path4 = (Path) obj2;
                vc3 vc3VarC2 = r2cVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas2 = new Canvas((Bitmap) vc3VarC2.Z());
                    canvas2.drawBitmap(bitmap, this.f, null);
                    canvas2.drawPath(path4, this.e);
                    vc3 vc3VarClone = vc3VarC2.clone();
                    vc3VarC2.close();
                    return vc3VarClone;
                } finally {
                }
        }
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        switch (this.c) {
            case 0:
                return new c1f("AvatarAsCirclePostProcessor");
            default:
                return new c1f("CropOutOfCirclePostProcessor");
        }
    }
}

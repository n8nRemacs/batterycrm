package defpackage;

import android.graphics.Matrix;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes.dex */
public final class otb implements p4h {
    public final Object a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Object i;

    public otb(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.b = z;
        this.a = new Matrix();
    }

    @Override // defpackage.p4h
    public SurfaceTextureHelper.FrameGeometry a(Matrix matrix, int i, int i2) {
        Matrix matrix2;
        int i3 = this.e;
        int i4 = this.c;
        int i5 = this.d;
        int i6 = this.f;
        SurfaceTextureHelper.FrameGeometry frameGeometry = (SurfaceTextureHelper.FrameGeometry) this.i;
        Matrix matrix3 = (Matrix) this.a;
        if (frameGeometry != null && frameGeometry.width == i && frameGeometry.height == i2 && fni.a(matrix3, matrix)) {
            return frameGeometry;
        }
        if (this.b) {
            Matrix matrix4 = new Matrix(matrix);
            float f = i;
            float f2 = i2;
            matrix4.postTranslate(i4 / f, (i2 - (i5 + i6)) / f2);
            matrix4.postScale(i3 / f, i6 / f2);
            matrix2 = matrix4;
        } else {
            Matrix matrix5 = new Matrix();
            float f3 = i;
            float f4 = i2;
            matrix5.preTranslate(i4 / f3, (i2 - (i5 + i6)) / f4);
            matrix5.preScale(i3 / f3, i6 / f4);
            Matrix matrix6 = new Matrix(matrix);
            matrix6.preConcat(matrix5);
            matrix2 = matrix6;
        }
        SurfaceTextureHelper.FrameGeometry frameGeometry2 = new SurfaceTextureHelper.FrameGeometry(i, i2, this.g, this.h, matrix2);
        matrix3.set(matrix);
        this.i = frameGeometry2;
        return frameGeometry2;
    }

    public otb(int i) {
        switch (i) {
            case 1:
                this.i = new umb();
                this.a = new int[256];
                break;
            default:
                this.i = new qyg(2, false);
                this.a = new int[256];
                break;
        }
    }
}

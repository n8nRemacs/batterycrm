package defpackage;

import android.opengl.Matrix;
import android.util.Size;

/* loaded from: classes2.dex */
public final class m2c {
    public Size a;
    public Size b;
    public final float[] c = new float[16];
    public final float[] d;
    public final ao6 e;
    public k1f f;

    public m2c() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.d = fArr;
        this.e = new ao6(ao6.c, ao6.d);
    }
}

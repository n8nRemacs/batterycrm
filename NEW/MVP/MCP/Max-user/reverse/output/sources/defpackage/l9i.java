package defpackage;

import android.opengl.GLES20;

/* loaded from: classes.dex */
public final class l9i implements r9i {
    public static final float[] b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] c = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public final r9i a;

    public l9i(int i, int i2) {
        String strGlGetString = GLES20.glGetString(7938);
        float[] fArr = b;
        float[] fArr2 = c;
        this.a = (strGlGetString == null || !strGlGetString.contains("3.")) ? new s9f(i, i2, fArr, fArr2) : new rbd(i, i2, fArr, fArr2);
    }

    @Override // defpackage.r9i
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.r9i
    public final void b() {
        this.a.b();
    }
}

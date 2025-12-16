package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class dte extends ete {
    public float b;
    public float c;

    @Override // defpackage.ete
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}

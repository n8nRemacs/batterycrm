package lY0;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import j.N;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes6.dex */
public class g extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f413887a;

    public g() {
        super(Matrix.class, "imageMatrixProperty");
        this.f413887a = new Matrix();
    }

    @Override // android.util.Property
    @N
    public final Matrix get(@N ImageView imageView) {
        Matrix matrix = this.f413887a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(@N ImageView imageView, @N Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

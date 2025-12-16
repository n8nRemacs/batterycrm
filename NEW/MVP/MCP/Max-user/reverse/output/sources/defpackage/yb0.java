package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yb0 {
    public int a;
    public final Executor b;
    public final v32 c;
    public final Rect d;
    public final Matrix e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;

    public yb0(Executor executor, v32 v32Var, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        this.a = ((CaptureFailedRetryQuirk) ov4.a.e(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.b = executor;
        this.c = v32Var;
        this.d = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.e = matrix;
        this.f = i;
        this.g = i2;
        this.h = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.i = list;
    }

    public final boolean equals(Object obj) {
        v32 v32Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yb0) {
            yb0 yb0Var = (yb0) obj;
            Executor executor = yb0Var.b;
            v32 v32Var2 = yb0Var.c;
            if (this.b.equals(executor) && ((v32Var = this.c) != null ? v32Var.equals(v32Var2) : v32Var2 == null) && this.d.equals(yb0Var.d) && this.e.equals(yb0Var.e) && this.f == yb0Var.f && this.g == yb0Var.g && this.h == yb0Var.h && this.i.equals(yb0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        v32 v32Var = this.c;
        return ((((((((((((iHashCode ^ (v32Var == null ? 0 : v32Var.hashCode())) * 583896283) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.b);
        sb.append(", inMemoryCallback=");
        sb.append(this.c);
        sb.append(", onDiskCallback=null, outputFileOptions=null, cropRect=");
        sb.append(this.d);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", rotationDegrees=");
        sb.append(this.f);
        sb.append(", jpegQuality=");
        sb.append(this.g);
        sb.append(", captureMode=");
        sb.append(this.h);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return az1.j(sb, this.i, "}");
    }
}

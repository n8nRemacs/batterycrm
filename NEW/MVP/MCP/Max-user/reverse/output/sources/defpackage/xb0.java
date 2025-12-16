package defpackage;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes.dex */
public final class xb0 {
    public final int a;
    public final ImageCaptureException b;

    public xb0(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xb0) {
            xb0 xb0Var = (xb0) obj;
            if (this.a == xb0Var.a && this.b.equals(xb0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}

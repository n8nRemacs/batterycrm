package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;

/* loaded from: classes.dex */
public final class be implements m7i {
    public final boolean X;
    public final i12 a;
    public final Range b;
    public tu1 d;
    public float c = 1.0f;
    public float o = 1.0f;

    public be(i12 i12Var) {
        boolean z = false;
        this.X = false;
        this.a = i12Var;
        this.b = (Range) i12Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) i12Var.b.b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.X = z;
    }

    @Override // defpackage.m7i
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.o == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // defpackage.m7i
    public final void b(ukd ukdVar) {
        ukdVar.M(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (!this.X || Build.VERSION.SDK_INT < 34) {
            return;
        }
        ukdVar.M(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    @Override // defpackage.m7i
    public final float c() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.m7i
    public final float d() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.m7i
    public final Rect e() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // defpackage.m7i
    public final void f(float f, tu1 tu1Var) {
        this.c = f;
        tu1 tu1Var2 = this.d;
        if (tu1Var2 != null) {
            tu1Var2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.o = this.c;
        this.d = tu1Var;
    }

    @Override // defpackage.m7i
    public final void g() {
        this.c = 1.0f;
        tu1 tu1Var = this.d;
        if (tu1Var != null) {
            tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.d = null;
        }
    }
}

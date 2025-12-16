package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class c86 {
    public static final MeteringRectangle[] v = new MeteringRectangle[0];
    public final ry1 a;
    public final qee b;
    public final a07 c;
    public final y6i f;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public tu1 s;
    public boolean t;
    public b86 u;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public z76 o = null;

    public c86(ry1 ry1Var, a07 a07Var, qee qeeVar, i17 i17Var) {
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = null;
        this.t = false;
        this.u = null;
        this.a = ry1Var;
        this.b = qeeVar;
        this.c = a07Var;
        this.f = new y6i(25, i17Var);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            w30 w30Var = new w30();
            w30Var.b = true;
            w30Var.c = this.n;
            x8a x8aVarB = x8a.b();
            if (z) {
                x8aVarB.n(e02.N(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                x8aVarB.n(e02.N(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            w30Var.c(new e02(9, fjb.a(x8aVarB)));
            this.a.z(Collections.singletonList(w30Var.d()));
        }
    }

    public final void b() {
        ry1 ry1Var = this.a;
        ((HashSet) ry1Var.b.b).remove(null);
        ((HashSet) ry1Var.b.b).remove(this.o);
        tu1 tu1Var = this.s;
        if (tu1Var != null) {
            tu1Var.d(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.s = null;
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.p.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.g = false;
        ry1Var.A();
    }

    public final ha8 c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        ag7 ag7Var = ag7.c;
        if (i < 28) {
            u45.o(i, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API ", "FocusMeteringControl");
            return ag7Var;
        }
        if (ry1.t(this.a.e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return ag7Var;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return ixi.a(new eq4(1, this, z));
    }

    public final List d(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iz9 iz9Var = (iz9) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = iz9Var.a;
            float f2 = iz9Var.c;
            if (f >= 0.0f && f <= 1.0f) {
                float f3 = iz9Var.b;
                if (f3 >= 0.0f && f3 <= 1.0f) {
                    Rational rational3 = iz9Var.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && ((i17) this.f.b).d(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f3) : new PointF(f, f3);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f2)) / 2;
                    int iHeight2 = ((int) (f2 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(tu1 tu1Var) {
        gri.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.d) {
            tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            return;
        }
        w30 w30Var = new w30();
        w30Var.c = this.n;
        w30Var.b = true;
        x8a x8aVarB = x8a.b();
        x8aVarB.n(e02.N(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        w30Var.c(new e02(9, fjb.a(x8aVarB)));
        w30Var.b(new rz1(tu1Var, 1));
        this.a.z(Collections.singletonList(w30Var.d()));
    }

    public final void f(boolean z) {
        if (this.d) {
            w30 w30Var = new w30();
            w30Var.c = this.n;
            w30Var.b = true;
            x8a x8aVarB = x8a.b();
            x8aVarB.n(e02.N(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(ry1.t(this.a.e, 1));
                x8aVarB.m(e02.N(key), zn3.b, numValueOf);
            }
            w30Var.c(new e02(9, fjb.a(x8aVarB)));
            w30Var.b(new m52(1));
            this.a.z(Collections.singletonList(w30Var.d()));
        }
    }
}

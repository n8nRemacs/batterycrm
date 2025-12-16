package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hz1 implements l22 {
    public final String a;
    public final i12 b;
    public final a3b c;
    public ry1 e;
    public final gz1 h;
    public final i17 j;
    public final qea k;
    public final Object d = new Object();
    public gz1 f = null;
    public gz1 g = null;
    public ArrayList i = null;

    public hz1(t22 t22Var, String str) {
        str.getClass();
        this.a = str;
        i12 i12VarB = t22Var.b(str);
        this.b = i12VarB;
        a3b a3bVar = new a3b(7, false);
        a3bVar.b = this;
        this.c = a3bVar;
        i17 i17VarA = uxi.a(i12VarB);
        this.j = i17VarA;
        this.k = new qea(str, i17VarA);
        this.h = new gz1(new m90(5, null));
    }

    @Override // defpackage.l22
    public final Set a() {
        return ((y75) iv6.o(this.b).b).a();
    }

    @Override // defpackage.l22
    public final int b() {
        return l(0);
    }

    @Override // defpackage.l22
    public final boolean c() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.l22
    public final String d() {
        return this.a;
    }

    @Override // defpackage.l22
    public final cb8 e() {
        synchronized (this.d) {
            try {
                ry1 ry1Var = this.e;
                if (ry1Var == null) {
                    if (this.f == null) {
                        this.f = new gz1(0);
                    }
                    return this.f;
                }
                gz1 gz1Var = this.f;
                if (gz1Var != null) {
                    return gz1Var;
                }
                return ry1Var.j.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l22
    public final void f(Executor executor, oy1 oy1Var) {
        synchronized (this.d) {
            try {
                ry1 ry1Var = this.e;
                if (ry1Var != null) {
                    ry1Var.c.execute(new cj(ry1Var, executor, oy1Var, 12));
                    return;
                }
                if (this.i == null) {
                    this.i = new ArrayList();
                }
                this.i.add(new Pair(oy1Var, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l22
    public final int h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        z5j.a("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(wy1.e(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // defpackage.l22
    public final f9g i() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? f9g.a : f9g.b;
    }

    @Override // defpackage.l22
    public final String k() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.l22
    public final int l(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return sxi.a(sxi.b(i), num.intValue(), 1 == h());
    }

    @Override // defpackage.l22
    public final boolean m() {
        i12 i12Var = this.b;
        Objects.requireNonNull(i12Var);
        return if0.c(new xtd(22, i12Var));
    }

    @Override // defpackage.l22
    public final cf5 n() {
        return this.k;
    }

    @Override // defpackage.l22
    public final i17 o() {
        return this.j;
    }

    @Override // defpackage.l22
    public final List p(int i) {
        Size[] sizeArrV = this.b.b().v(i);
        return sizeArrV != null ? Arrays.asList(sizeArrV) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.l22
    public final cb8 q() {
        synchronized (this.d) {
            try {
                ry1 ry1Var = this.e;
                if (ry1Var != null) {
                    gz1 gz1Var = this.g;
                    if (gz1Var != null) {
                        return gz1Var;
                    }
                    return (j8a) ry1Var.i.o;
                }
                if (this.g == null) {
                    m7i m7iVarB = fo4.b(this.b);
                    r7i r7iVar = new r7i(m7iVarB.c(), m7iVarB.d());
                    r7iVar.f(1.0f);
                    this.g = new gz1(ka0.e(r7iVar));
                }
                return this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l22
    public final void r(k02 k02Var) {
        synchronized (this.d) {
            try {
                ry1 ry1Var = this.e;
                if (ry1Var != null) {
                    ry1Var.c.execute(new ud(ry1Var, 29, k02Var));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == k02Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(ry1 ry1Var) {
        synchronized (this.d) {
            try {
                this.e = ry1Var;
                gz1 gz1Var = this.g;
                if (gz1Var != null) {
                    gz1Var.m((j8a) ry1Var.i.o);
                }
                gz1 gz1Var2 = this.f;
                if (gz1Var2 != null) {
                    gz1Var2.m(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ry1 ry1Var2 = this.e;
                        ry1Var2.c.execute(new cj(ry1Var2, (Executor) pair.second, (k02) pair.first, 12));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        String strH = wy1.h("Device Level: ", iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? ho7.f(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
        if (gri.d(4, "Camera2CameraInfo")) {
            Log.i("Camera2CameraInfo", strH);
        }
    }
}

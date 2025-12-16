package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jie implements kie {
    public final List a;
    public final b12 b;
    public final qee c;
    public im7 d = null;

    public jie(ArrayList arrayList, qee qeeVar, b12 b12Var) {
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = b12Var;
        this.c = qeeVar;
    }

    @Override // defpackage.kie
    public final Object a() {
        return null;
    }

    @Override // defpackage.kie
    public final im7 b() {
        return this.d;
    }

    @Override // defpackage.kie
    public final Executor c() {
        return this.c;
    }

    @Override // defpackage.kie
    public final int d() {
        return 0;
    }

    @Override // defpackage.kie
    public final CameraCaptureSession.StateCallback e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jie) {
            jie jieVar = (jie) obj;
            im7 im7Var = this.d;
            im7 im7Var2 = jieVar.d;
            List list = jieVar.a;
            if (Objects.equals(im7Var, im7Var2)) {
                List list2 = this.a;
                if (list2.size() == list.size()) {
                    for (int i = 0; i < list2.size(); i++) {
                        if (((ekb) list2.get(i)).equals(list.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kie
    public final List f() {
        return this.a;
    }

    @Override // defpackage.kie
    public final void g(CaptureRequest captureRequest) {
    }

    @Override // defpackage.kie
    public final void h(im7 im7Var) {
        this.d = im7Var;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        im7 im7Var = this.d;
        int iHashCode2 = (im7Var == null ? 0 : im7Var.a.a.hashCode()) ^ i;
        return (iHashCode2 << 5) - iHashCode2;
    }
}

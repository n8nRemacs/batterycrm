package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class oxi {
    public static CameraDevice.StateCallback a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new c22() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new b22(arrayList);
    }

    public static final Object b(j9a j9aVar, Object obj, em6 em6Var, q44 q44Var) {
        qid qidVar = new qid(j9aVar);
        return q44Var.getContext().get(qidVar) != null ? em6Var.invoke(q44Var) : svi.i(new pid(qidVar), new k9a(j9aVar, obj, em6Var, null), q44Var);
    }
}

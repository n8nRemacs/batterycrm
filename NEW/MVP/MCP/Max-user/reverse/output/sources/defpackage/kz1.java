package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class kz1 {
    public static final kz1 a = new kz1();

    public void a(xwg xwgVar, w30 w30Var) {
        h52 h52Var = (h52) xwgVar.d(xwg.i0, null);
        fjb fjbVar = fjb.c;
        s90 s90Var = h52.i;
        HashSet hashSet = new HashSet();
        x8a x8aVarB = x8a.b();
        ArrayList arrayList = new ArrayList();
        g9a g9aVarA = g9a.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        fjb fjbVarA = fjb.a(x8aVarB);
        ArrayList arrayList3 = new ArrayList(arrayList);
        ryf ryfVar = ryf.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9aVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new h52(arrayList2, fjbVarA, -1, false, arrayList3, false, new ryf(arrayMap), null);
        if (h52Var != null) {
            i = h52Var.c;
            w30Var.a(h52Var.e);
            fjbVar = h52Var.b;
        }
        w30Var.f = x8a.k(fjbVar);
        w30Var.c = ((Integer) xwgVar.d(e02.X, Integer.valueOf(i))).intValue();
        w30Var.b(new g52((CameraCaptureSession.CaptureCallback) xwgVar.d(e02.t0, new jz1())));
        w30Var.c(a3b.m(xwgVar).l());
    }
}

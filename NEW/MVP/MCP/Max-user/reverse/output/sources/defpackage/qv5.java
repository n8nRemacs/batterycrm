package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qv5 {
    public final ov5 a = new ov5(0);
    public final iu5 b;
    public final ve2 c;
    public final qi9 d;
    public final gwg e;
    public final bn9 f;
    public final u2h g;
    public final quf h;
    public final sv5 i;
    public final rv5 j;
    public final pv5 k;

    public qv5(iu5 iu5Var, qm4 qm4Var, ve2 ve2Var, qi9 qi9Var, gwg gwgVar, bn9 bn9Var, u2h u2hVar, quf qufVar, sv5 sv5Var, rv5 rv5Var, pv5 pv5Var) {
        this.b = iu5Var;
        this.c = ve2Var;
        this.d = qi9Var;
        this.e = gwgVar;
        this.f = bn9Var;
        this.g = u2hVar;
        this.h = qufVar;
        this.i = sv5Var;
        this.j = rv5Var;
        this.k = pv5Var;
    }

    public final jdc a(y6i y6iVar) {
        zy0 zy0Var = zy0.a;
        sv5 sv5Var = this.i;
        ArrayList arrayListB = b(sv5Var.a(zy0Var), null, y6iVar);
        if (sv5Var.k == null) {
            Context context = ((iz5) sv5Var.a).c;
            sv5Var.k = Arrays.asList(context.getExternalCacheDir(), context.getFilesDir());
        }
        List list = sv5Var.k;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListB.addAll(b((File) it.next(), null, y6iVar));
            }
        }
        Collections.sort(arrayListB, this.a);
        return new jdc(arrayListB, this.j, sv5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.io.File r17, defpackage.zy0 r18, defpackage.y6i r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv5.b(java.io.File, zy0, y6i):java.util.ArrayList");
    }
}

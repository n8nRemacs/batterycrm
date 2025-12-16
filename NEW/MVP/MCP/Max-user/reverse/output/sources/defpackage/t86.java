package defpackage;

import android.util.Range;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t86 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ t86(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0, types: [n2, pd6] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [pd6] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [pd6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.t86 r9, defpackage.pd6 r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t86.a(t86, pd6, q44):java.lang.Object");
    }

    public g90 b() {
        String strI = ((Range) this.a) == null ? " bitrate" : "";
        if (((Range) this.d) == null) {
            strI = az1.i(strI, " sampleRate");
        }
        if (strI.isEmpty()) {
            return new g90((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.d, ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public void c(n22 n22Var, n22 n22Var2, dsf dsfVar, dsf dsfVar2, Map.Entry entry) {
        dsf dsfVar3 = (dsf) entry.getValue();
        rb0 rb0Var = new rb0(dsfVar.g.a, ((v90) entry.getKey()).a.d, dsfVar.c ? n22Var : null, ((v90) entry.getKey()).a.f, ((v90) entry.getKey()).a.g);
        rb0 rb0Var2 = new rb0(dsfVar2.g.a, ((v90) entry.getKey()).b.d, dsfVar2.c ? n22Var2 : null, ((v90) entry.getKey()).b.f, ((v90) entry.getKey()).b.g);
        int i = ((v90) entry.getKey()).a.c;
        dsfVar3.getClass();
        jei.b();
        dsfVar3.b();
        z5j.f("Consumer can only be linked once.", !dsfVar3.j);
        dsfVar3.j = true;
        csf csfVar = dsfVar3.l;
        wsf.b(wsf.l(csfVar.c(), new bsf(dsfVar3, csfVar, i, rb0Var, rb0Var2), ayi.d()), new xt4(this, dsfVar3, false, 16), ayi.d());
    }
}

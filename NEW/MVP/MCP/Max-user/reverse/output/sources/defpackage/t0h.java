package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class t0h {
    public final evb a;
    public final k18 b;
    public final bwf c;
    public final bwf d = new bwf(new kvf(14, this));

    public t0h(Context context, k18 k18Var, k18 k18Var2, evb evbVar) {
        this.a = evbVar;
        this.b = k18Var2;
        this.c = new bwf(new dvb(k18Var, context, 2));
    }

    public final s0h a(v10 v10Var, w10 w10Var, String str) {
        Uri uri;
        int i = v10Var.f;
        int i2 = v10Var.e;
        long j = v10Var.c;
        p10 p10Var = w10Var.o;
        Uri uriG = tfi.g(w10Var.s);
        Uri uriG2 = tfi.g(v10Var.d);
        Uri uriB = ((z10) this.b.getValue()).b(w10Var, true);
        if (uriG2 == null && uriG != null) {
            uri = uriG;
        } else if (uriG2 != null) {
            uri = uriG2;
        } else if (uriB != null) {
            uri = uriB;
        } else {
            uriG = null;
            uri = uriG;
        }
        bwf bwfVar = this.d;
        evb evbVar = this.a;
        if (uri != null) {
            long j2 = v10Var.a;
            int i3 = v10Var.e;
            int i4 = v10Var.f;
            int iIntValue = ((Number) bwfVar.getValue()).intValue();
            int i5 = s65.d;
            return new s0h(j2, uri, i3, i4, iIntValue, v9j.i(j, y65.MILLISECONDS), str, uriB, evbVar.a(i2, i), p10Var, 1024);
        }
        s0h s0hVar = s0h.l;
        long j3 = v10Var.a;
        int i6 = v10Var.e;
        int i7 = v10Var.f;
        int iIntValue2 = ((Number) bwfVar.getValue()).intValue();
        int i8 = s65.d;
        return new s0h(j3, s0hVar.b, i6, i7, iIntValue2, v9j.i(j, y65.MILLISECONDS), str, uriB, evbVar.a(i2, i), p10Var, s0hVar.k);
    }
}

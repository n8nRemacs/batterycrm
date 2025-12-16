package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class v65 implements zy7 {
    public static final v65 a = new v65();
    public static final j9c b = new j9c("kotlin.time.Duration", h9c.j);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        long j = ((s65) obj).a;
        int i = s65.d;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jO = j < 0 ? s65.o(j) : j;
        long jM = s65.m(jO, y65.HOURS);
        boolean z = false;
        int iM = s65.j(jO) ? 0 : (int) (s65.m(jO, y65.MINUTES) % 60);
        int iM2 = s65.j(jO) ? 0 : (int) (s65.m(jO, y65.SECONDS) % 60);
        int i2 = s65.i(jO);
        if (s65.j(j)) {
            jM = 9999999999999L;
        }
        boolean z2 = jM != 0;
        boolean z3 = (iM2 == 0 && i2 == 0) ? false : true;
        if (iM != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM);
            sb.append('H');
        }
        if (z) {
            sb.append(iM);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            s65.c(sb, iM2, i2, 9, "S", true);
        }
        bVar.r(sb.toString());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        int i = s65.d;
        String strQ = lh4Var.q();
        try {
            return new s65(v9j.a(strQ));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ho7.i("Invalid ISO duration string format: '", strQ, "'."), e);
        }
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}

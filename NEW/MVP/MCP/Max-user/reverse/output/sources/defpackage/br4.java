package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class br4 {
    public final /* synthetic */ int a;
    public final int b;
    public final List c;

    public /* synthetic */ br4(List list, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public njg a(int i, sa9 sa9Var) {
        String str = (String) sa9Var.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new mtb(new e4a(str));
            }
            if (i == 21) {
                return new mtb(new n75(2));
            }
            if (i == 27) {
                if (e(4)) {
                    return null;
                }
                return new mtb(new tz6(new wib(c(sa9Var)), e(1), e(8)));
            }
            if (i == 36) {
                return new mtb(new vz6(new wib(c(sa9Var))));
            }
            if (i == 89) {
                return new mtb(new n75(0, (List) sa9Var.a));
            }
            if (i != 138) {
                if (i == 172) {
                    return new mtb(new r4(str, 1));
                }
                if (i == 257) {
                    return new p8e(new u5i("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (e(16)) {
                        return null;
                    }
                    return new p8e(new u5i("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            if (e(2)) {
                                return null;
                            }
                            return new mtb(new ec(false, str));
                        case 16:
                            return new mtb(new pz6(new aqc(c(sa9Var))));
                        case LangUtils.HASH_SEED /* 17 */:
                            if (e(2)) {
                                return null;
                            }
                            return new mtb(new c18(str));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!e(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new mtb(new r4(str, 0));
            }
            return new mtb(new e65(str));
        }
        return new mtb(new lz6(new aqc(c(sa9Var))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ojg b(int r6, defpackage.uaj r7) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br4.b(int, uaj):ojg");
    }

    public List c(sa9 sa9Var) {
        String str;
        int i;
        boolean zE = e(32);
        List list = this.c;
        if (zE) {
            return list;
        }
        qyg qygVar = new qyg((byte[]) sa9Var.c);
        while (qygVar.c() > 0) {
            int iS = qygVar.s();
            int iS2 = qygVar.b + qygVar.s();
            if (iS == 134) {
                ArrayList arrayList = new ArrayList();
                int iS3 = qygVar.s() & 31;
                for (int i2 = 0; i2 < iS3; i2++) {
                    String strQ = qygVar.q(3, mb2.c);
                    int iS4 = qygVar.s();
                    boolean z = (iS4 & 128) != 0;
                    if (z) {
                        i = iS4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bS = (byte) qygVar.s();
                    qygVar.F(1);
                    List listSingletonList = z ? Collections.singletonList((bS & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    ef6 ef6Var = new ef6();
                    ef6Var.k = str;
                    ef6Var.c = strQ;
                    ef6Var.C = i;
                    ef6Var.m = listSingletonList;
                    arrayList.add(new gf6(ef6Var));
                }
                list = arrayList;
            }
            qygVar.E(iS2);
        }
        return list;
    }

    public List d(uaj uajVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zE = e(32);
        List list = this.c;
        if (zE) {
            return list;
        }
        umb umbVar = new umb((byte[]) uajVar.e);
        while (umbVar.a() > 0) {
            int iX = umbVar.x();
            int iX2 = umbVar.b + umbVar.x();
            if (iX == 134) {
                ArrayList arrayList = new ArrayList();
                int iX3 = umbVar.x() & 31;
                for (int i2 = 0; i2 < iX3; i2++) {
                    String strV = umbVar.v(3, StandardCharsets.UTF_8);
                    int iX4 = umbVar.x();
                    boolean z = (iX4 & 128) != 0;
                    if (z) {
                        i = iX4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bX = (byte) umbVar.x();
                    umbVar.K(1);
                    if (z) {
                        boolean z2 = (bX & 64) != 0;
                        byte[] bArr = ed3.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    ff6 ff6Var = new ff6();
                    ff6Var.m = xz9.n(str);
                    ff6Var.d = strV;
                    ff6Var.J = i;
                    ff6Var.p = listSingletonList;
                    arrayList.add(new hf6(ff6Var));
                }
                list = arrayList;
            }
            umbVar.J(iX2);
        }
        return list;
    }

    public final boolean e(int i) {
        switch (this.a) {
            case 0:
                if ((i & this.b) != 0) {
                }
                break;
            default:
                if ((i & this.b) != 0) {
                }
                break;
        }
        return false;
    }
}

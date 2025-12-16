package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ddh extends l0g {
    public ArrayList c;

    public ddh(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int iF;
        if (!fni.a(str, "info")) {
            try {
                tm9Var.v();
                return;
            } catch (Throwable th) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = vfe.a.iterator();
                while (it.hasNext()) {
                    ((qwa) it.next()).getClass();
                    qwa.a(th);
                }
                int iV = az1.v(ctd.a);
                if (iV != 0) {
                    if (iV == 1) {
                        throw th;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        this.c = new ArrayList();
        try {
            iF = efi.f(tm9Var);
        } catch (Throwable th2) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = vfe.a.iterator();
            while (it2.hasNext()) {
                ((qwa) it2.next()).getClass();
                qwa.a(th2);
            }
            int iV2 = az1.v(ctd.a);
            if (iV2 != 0) {
                if (iV2 == 1) {
                    throw th2;
                }
                throw new NoWhenBranchMatchedException();
            }
            iF = 0;
        }
        for (int i = 0; i < iF; i++) {
            try {
                ArrayList arrayList = this.c;
                if (arrayList != null) {
                    int iU0 = tm9Var.u0();
                    String strO = null;
                    String strO2 = null;
                    long jL = 0;
                    for (int i2 = 0; i2 < iU0; i2++) {
                        String strW0 = tm9Var.w0();
                        strW0.getClass();
                        switch (strW0) {
                            case "url":
                                strO = efi.o(tm9Var);
                                break;
                            case "token":
                                strO2 = efi.o(tm9Var);
                                break;
                            case "videoId":
                                jL = efi.l(tm9Var, 0L);
                                break;
                            default:
                                tm9Var.v();
                                break;
                        }
                    }
                    arrayList.add(new edh(jL, strO, strO2));
                }
            } catch (Throwable th3) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it3 = vfe.a.iterator();
                while (it3.hasNext()) {
                    ((qwa) it3.next()).getClass();
                    qwa.a(th3);
                }
                int iV3 = az1.v(ctd.a);
                if (iV3 != 0) {
                    if (iV3 == 1) {
                        throw th3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        ArrayList arrayList = this.c;
        return ho7.i("{videoUploadInfo=[", ue3.N(arrayList != null ? ue3.d0(arrayList) : hd5.a, null, null, null, new u7g(7), 31), "]}");
    }
}

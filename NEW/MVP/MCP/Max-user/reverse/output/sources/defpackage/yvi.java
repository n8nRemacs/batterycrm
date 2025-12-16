package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class yvi {
    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return hw0.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static rl9 b(tm9 tm9Var) {
        String strO;
        String strO2;
        int iM = efi.m(tm9Var);
        ql9 ql9Var = null;
        int iIntValue = 0;
        for (int i = 0; i < iM; i++) {
            try {
                strO = efi.o(tm9Var);
            } catch (Throwable th) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = vfe.a.iterator();
                while (it.hasNext()) {
                    ((qwa) it.next()).getClass();
                    qwa.a(th);
                }
                int iV = az1.v(ctd.a);
                if (iV != 0) {
                    if (iV != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                strO = null;
            }
            if (fni.a(strO, "reaction")) {
                try {
                    strO2 = efi.o(tm9Var);
                } catch (Throwable th2) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                    Iterator it2 = vfe.a.iterator();
                    while (it2.hasNext()) {
                        ((qwa) it2.next()).getClass();
                        qwa.a(th2);
                    }
                    int iV2 = az1.v(ctd.a);
                    if (iV2 != 0) {
                        if (iV2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th2;
                    }
                }
                if (strO2 == null) {
                    strO2 = "";
                }
                ql9Var = new ql9(vl9.b, strO2);
            } else if (fni.a(strO, "count")) {
                Integer numValueOf = 0;
                try {
                    numValueOf = Integer.valueOf(efi.k(tm9Var, 0));
                } catch (Throwable th3) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = vfe.a.iterator();
                    while (it3.hasNext()) {
                        ((qwa) it3.next()).getClass();
                        qwa.a(th3);
                    }
                    int iV3 = az1.v(ctd.a);
                    if (iV3 != 0) {
                        if (iV3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                }
                iIntValue = numValueOf.intValue();
            } else {
                try {
                    tm9Var.v();
                } catch (Throwable th4) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it4 = vfe.a.iterator();
                    while (it4.hasNext()) {
                        ((qwa) it4.next()).getClass();
                        qwa.a(th4);
                    }
                    int iV4 = az1.v(ctd.a);
                    if (iV4 != 0) {
                        if (iV4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (ql9Var != null) {
            return new rl9(ql9Var, iIntValue);
        }
        throw new IllegalArgumentException("reaction is null");
    }
}

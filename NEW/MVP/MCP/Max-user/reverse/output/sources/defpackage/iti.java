package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.io.IOException;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.msgpack.core.MessageInsufficientBufferException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public abstract class iti {
    public static int a(int i, int i2) {
        return xrf.k(i, i2, 31);
    }

    public static l6j b(int i) {
        if (i != 0 && i == 1) {
            return new ic4();
        }
        return new qtd();
    }

    public static void c(View view, wq8 wq8Var) {
        ca5 ca5Var = wq8Var.a.b;
        if (ca5Var == null || !ca5Var.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = hfh.a;
            fI += veh.i((View) parent);
        }
        vq8 vq8Var = wq8Var.a;
        if (vq8Var.l != fI) {
            vq8Var.l = fI;
            wq8Var.p();
        }
    }

    public static j70 d(tm9 tm9Var) throws IOException {
        String strP;
        int iU0 = tm9Var.u0();
        String strP2 = null;
        Long lValueOf = null;
        for (int i = 0; i < iU0; i++) {
            try {
                strP = efi.p(tm9Var, null);
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
                strP = null;
            }
            if (fni.a(strP, ApiProtocol.KEY_TOKEN)) {
                try {
                    strP2 = efi.p(tm9Var, null);
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
                    strP2 = null;
                }
            } else if (!fni.a(strP, "tokenTtl")) {
                try {
                    tm9Var.v();
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
            } else {
                if (!tm9Var.l()) {
                    throw new MessageInsufficientBufferException();
                }
                if (tm9Var.Z.getByte(tm9Var.s0) == -64) {
                    tm9Var.readByte();
                    lValueOf = null;
                } else {
                    long jL = 0;
                    try {
                        jL = efi.l(tm9Var, 0L);
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
                    lValueOf = Long.valueOf(jL);
                }
            }
        }
        if (strP2 == null) {
            strP2 = "";
        }
        return new j70(strP2, lValueOf);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class pdf {
    public static boolean a;
    public static final lcj b = new lcj(20);
    public static final o6 c = new o6(3);
    public static final jn6 d = new jn6();
    public static final r8j e = new r8j(20);
    public static final kc3 f;
    public static final kk4 g;

    static {
        int i = 21;
        f = new kc3(i);
        g = new kk4(i);
    }

    public static synchronized void a() {
        if (!a) {
            nca.b("static-webp");
            a = true;
        }
    }

    public static wib b(tm9 tm9Var) {
        int iM;
        String strP;
        try {
            iM = efi.m(tm9Var);
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
            iM = 0;
        }
        if (iM != 0) {
            List listB = null;
            String strP2 = null;
            for (int i = 0; i < iM; i++) {
                try {
                    strP = efi.p(tm9Var, null);
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
                    strP = null;
                }
                if (strP != null) {
                    if (strP.equals("text")) {
                        try {
                            strP2 = efi.p(tm9Var, null);
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
                            strP2 = null;
                        }
                    } else if (strP.equals("elements")) {
                        listB = vfe.b(tm9Var, hd5.a, new ts9(1, aj9.Y, zi9.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/messages/MessageElement;", 0, 17));
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
            }
            if (strP2 != null && strP2.length() != 0) {
                if (strP2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return new wib(strP2, listB, false, 13);
            }
        }
        return null;
    }
}

package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class nbj {
    public static final void a(File file) {
        if (!file.exists() || jz5.b(file)) {
            return;
        }
        throw new IOException("Can't delete " + file);
    }

    public static final void b(File file) {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Can't create " + file);
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file + " is not a directory");
    }

    public static tbf c(tm9 tm9Var) {
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
        wib wibVarB = null;
        xy xyVarB = null;
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
                try {
                    if (strP.equals("media")) {
                        try {
                            xyVarB = xy.b(tm9Var);
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
                            xyVarB = null;
                        }
                    } else if (strP.equals("text")) {
                        try {
                            wibVarB = pdf.b(tm9Var);
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
                            wibVarB = null;
                        }
                    } else {
                        try {
                            tm9Var.v();
                        } catch (Throwable th5) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it5 = vfe.a.iterator();
                            while (it5.hasNext()) {
                                ((qwa) it5.next()).getClass();
                                qwa.a(th5);
                            }
                            int iV5 = az1.v(ctd.a);
                            if (iV5 != 0) {
                                if (iV5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it6 = vfe.a.iterator();
                        while (it6.hasNext()) {
                            ((qwa) it6.next()).getClass();
                            qwa.a(th6);
                        }
                        int iV6 = az1.v(ctd.a);
                        if (iV6 != 0) {
                            if (iV6 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it7 = vfe.a.iterator();
                        while (it7.hasNext()) {
                            ((qwa) it7.next()).getClass();
                            qwa.a(th7);
                        }
                        int iV7 = az1.v(ctd.a);
                        if (iV7 != 0) {
                            if (iV7 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th7;
                        }
                    }
                }
            }
        }
        if (wibVarB == null) {
            return null;
        }
        return new tbf(xyVarB, wibVarB);
    }

    public static final void d(File file, File file2) throws IOException {
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }
}

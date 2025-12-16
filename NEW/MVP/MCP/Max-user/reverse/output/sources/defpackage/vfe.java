package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class vfe {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final List b(tm9 tm9Var, List list, em6 em6Var) {
        int iF;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            if (tm9Var.w().a() != 7) {
                tm9Var.v();
                return list;
            }
            ArrayList arrayList = new ArrayList();
            try {
                iF = efi.f(tm9Var);
            } catch (Throwable th) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = copyOnWriteArraySet.iterator();
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
                iF = 0;
            }
            for (int i = 0; i < iF; i++) {
                Object objInvoke = em6Var.invoke(tm9Var);
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((qwa) it2.next()).getClass();
                qwa.a(th2);
            }
            int iV2 = az1.v(ctd.a);
            if (iV2 == 0) {
                return list;
            }
            if (iV2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th2;
        }
    }

    public static final long[] c(tm9 tm9Var) {
        int iF;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            try {
                iF = efi.f(tm9Var);
            } catch (Throwable th) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = copyOnWriteArraySet.iterator();
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
                iF = 0;
            }
            if (iF == 0) {
                return null;
            }
            long[] jArr = new long[iF];
            for (int i = 0; i < iF; i++) {
                jArr[i] = efi.l(tm9Var, 0L);
            }
            return jArr;
        } catch (Throwable th2) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((qwa) it2.next()).getClass();
                qwa.a(th2);
            }
            int iV2 = az1.v(ctd.a);
            if (iV2 == 0) {
                return null;
            }
            if (iV2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th2;
        }
    }
}

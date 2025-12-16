package defpackage;

import java.io.InterruptedIOException;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ExecutionTimeInterceptor;

/* loaded from: classes.dex */
public abstract class gzi {
    public static pv0 a(int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            if (i2 != 1) {
                return new xq3(1, i2);
            }
            n92.m.getClass();
            return new pv0(m92.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new pv0(i) : new xq3(i, i2) : new pv0(Integer.MAX_VALUE) : i2 == 1 ? new pv0(0) : new xq3(1, i2);
        }
        if (i2 == 1) {
            return new xq3(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final Object b(kob kobVar, yl ylVar, tl tlVar, List list) throws InterruptedIOException {
        pua puaVar;
        oua ouaVar = new oua(ylVar, tlVar);
        if (list.size() <= 0) {
            try {
                puaVar = new pua(kobVar.a(ylVar, tlVar));
            } catch (InterruptedIOException e) {
                if (!(ylVar instanceof nua)) {
                    throw e;
                }
                puaVar = new pua(((nua) ylVar).handleInterruptedIO());
            }
        } else {
            puaVar = ((ExecutionTimeInterceptor) list.get(0)).intercept(new uaj(kobVar, ouaVar, list, 1, 7));
        }
        return puaVar.a;
    }
}

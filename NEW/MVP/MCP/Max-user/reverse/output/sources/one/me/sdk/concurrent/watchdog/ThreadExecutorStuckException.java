package one.me.sdk.concurrent.watchdog;

import defpackage.c46;
import defpackage.ckh;
import defpackage.ip8;
import defpackage.s65;
import defpackage.ue3;
import defpackage.v9j;
import defpackage.wy1;
import defpackage.y65;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/concurrent/watchdog/ThreadExecutorStuckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-concurrent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadExecutorStuckException extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThreadExecutorStuckException(Collection collection) {
        Object obj;
        Thread thread;
        StackTraceElement[] stackTrace;
        int i = s65.d;
        long jNanoTime = System.nanoTime();
        y65 y65Var = y65.NANOSECONDS;
        long jI = v9j.i(jNanoTime, y65Var);
        super(ue3.N(ue3.X(collection, new ip8(jI, 2)), null, wy1.e(collection.size(), "Tasks in queue: ", "\n"), null, new c46(jI, 4), 29));
        long jI2 = v9j.i(System.nanoTime(), y65Var);
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                s65 s65Var = new s65(((ckh) next).b(jI2));
                do {
                    Object next2 = it.next();
                    s65 s65Var2 = new s65(((ckh) next2).b(jI2));
                    if (s65Var.compareTo(s65Var2) < 0) {
                        next = next2;
                        s65Var = s65Var2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        ckh ckhVar = (ckh) obj;
        if (ckhVar == null || (thread = ckhVar.d) == null || (stackTrace = thread.getStackTrace()) == null) {
            return;
        }
        setStackTrace(stackTrace);
    }
}

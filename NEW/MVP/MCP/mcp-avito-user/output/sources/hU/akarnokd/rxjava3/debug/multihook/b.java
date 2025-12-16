package hu.akarnokd.rxjava3.debug.multihook;

import hu.akarnokd.rxjava3.debug.multihook.a;
import java.util.Iterator;
import l41.InterfaceC43544b;
import l41.o;

/* compiled from: OnScheduleMultiHandlerManager.java */
/* loaded from: classes8.dex */
public class b extends a<o<Runnable, Runnable>> implements o<Runnable, Runnable>, InterfaceC43544b<Runnable[], o<Runnable, Runnable>> {
    @Override // l41.InterfaceC43544b
    public final void accept(Runnable[] runnableArr, o<Runnable, Runnable> oVar) {
        Runnable[] runnableArr2 = runnableArr;
        runnableArr2[0] = oVar.apply(runnableArr2[0]);
    }

    @Override // l41.o
    public final Runnable apply(Runnable runnable) {
        Runnable[] runnableArr = {runnable};
        Iterator it = this.f397846b.iterator();
        while (it.hasNext()) {
            try {
                H h12 = ((a.C11318a) it.next()).get();
                if (h12 != 0) {
                    accept(runnableArr, h12);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        return runnableArr[0];
    }
}

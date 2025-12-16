package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class mp5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5i b;
    public final /* synthetic */ gud c;

    public /* synthetic */ mp5(u5i u5iVar, gud gudVar, int i) {
        this.a = i;
        this.b = u5iVar;
        this.c = gudVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gud gudVar = this.c;
                u5i u5iVar = this.b;
                Iterator it = ((CopyOnWriteArrayList) u5iVar.b).iterator();
                while (it.hasNext()) {
                    kud kudVar = (kud) it.next();
                    try {
                        kudVar.d.put(gudVar, Long.valueOf(kudVar.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((y6d) u5iVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                break;
            case 1:
                gud gudVar2 = this.c;
                u5i u5iVar2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) u5iVar2.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((kud) it2.next()).d.remove(gudVar2);
                    } catch (Throwable th2) {
                        ((y6d) u5iVar2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                break;
            default:
                gud gudVar3 = this.c;
                u5i u5iVar3 = this.b;
                Iterator it3 = ((CopyOnWriteArrayList) u5iVar3.b).iterator();
                while (it3.hasNext()) {
                    kud kudVar2 = (kud) it3.next();
                    try {
                        Long l = (Long) kudVar2.d.get(gudVar3);
                        if (l != null) {
                            kudVar2.b.log(kudVar2.a, "-> [" + l + "]: " + gudVar3);
                        }
                    } catch (Throwable th3) {
                        ((y6d) u5iVar3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                break;
        }
    }
}

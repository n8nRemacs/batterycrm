package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class np5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5i b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ np5(u5i u5iVar, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = u5iVar;
        this.c = bArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.d;
                u5i u5iVar = this.b;
                Iterator it = ((CopyOnWriteArrayList) u5iVar.b).iterator();
                while (it.hasNext()) {
                    kud kudVar = (kud) it.next();
                    try {
                        y6d y6dVar = kudVar.b;
                        String str = kudVar.a;
                        int i2 = h8i.a[az1.v(i)];
                        byte[] bArr = this.c;
                        y6dVar.log(str, "-> ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : h27.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((y6d) u5iVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th);
                    }
                }
                break;
            default:
                int i3 = this.d;
                u5i u5iVar2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) u5iVar2.b).iterator();
                while (it2.hasNext()) {
                    kud kudVar2 = (kud) it2.next();
                    try {
                        y6d y6dVar2 = kudVar2.b;
                        String str2 = kudVar2.a;
                        int i4 = h8i.a[az1.v(i3)];
                        byte[] bArr2 = this.c;
                        y6dVar2.log(str2, "<- ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : h27.a(bArr2) : new String(bArr2)));
                    } catch (Throwable th2) {
                        ((y6d) u5iVar2.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th2);
                    }
                }
                break;
        }
    }
}

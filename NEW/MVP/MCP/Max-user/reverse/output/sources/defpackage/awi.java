package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class awi implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                z8j z8jVar = (z8j) this.b;
                z8jVar.b.a("reportBinderDeath", new Object[0]);
                if (z8jVar.i.get() != null) {
                    throw new ClassCastException();
                }
                z8jVar.b.a("%s : Binder has died.", z8jVar.c);
                Iterator it = z8jVar.d.iterator();
                while (it.hasNext()) {
                    uti utiVar = (uti) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(z8jVar.c).concat(" : Binder has died."));
                    n2g n2gVar = utiVar.a;
                    if (n2gVar != null) {
                        n2gVar.c(remoteException);
                    }
                }
                z8jVar.d.clear();
                synchronized (z8jVar.f) {
                    z8jVar.c();
                }
                return;
            default:
                jcj jcjVar = (jcj) this.b;
                jcjVar.b.v("reportBinderDeath", new Object[0]);
                if (jcjVar.i.get() != null) {
                    throw new ClassCastException();
                }
                jcjVar.b.v("%s : Binder has died.", jcjVar.c);
                Iterator it2 = jcjVar.d.iterator();
                while (it2.hasNext()) {
                    z1j z1jVar = (z1j) it2.next();
                    RemoteException remoteException2 = new RemoteException(String.valueOf(jcjVar.c).concat(" : Binder has died."));
                    n2g n2gVar2 = z1jVar.a;
                    if (n2gVar2 != null) {
                        n2gVar2.c(remoteException2);
                    }
                }
                jcjVar.d.clear();
                synchronized (jcjVar.f) {
                    jcjVar.d();
                }
                return;
        }
    }
}

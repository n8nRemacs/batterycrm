package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ua8 {
    public final mwf a;
    public final wwf b;
    public final ra8 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public ua8(Looper looper, mwf mwfVar, ra8 ra8Var) {
        this(new CopyOnWriteArraySet(), looper, mwfVar, ra8Var, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new ta8(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        wwf wwfVar = this.b;
        if (!wwfVar.a.hasMessages(1)) {
            wwfVar.getClass();
            uwf uwfVarC = wwf.c();
            Message messageObtainMessage = wwfVar.a.obtainMessage(1);
            uwfVarC.a = messageObtainMessage;
            Handler handler = wwfVar.a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            uwfVarC.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, pa8 pa8Var) {
        g();
        this.f.add(new mn1(new CopyOnWriteArraySet(this.d), i, pa8Var, 13));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ta8) it.next()).a(this.c);
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ta8 ta8Var = (ta8) it.next();
            if (ta8Var.a.equals(obj)) {
                ta8Var.a(this.c);
                copyOnWriteArraySet.remove(ta8Var);
            }
        }
    }

    public final void f(int i, pa8 pa8Var) {
        c(i, pa8Var);
        b();
    }

    public final void g() {
        if (this.i) {
            hsi.g(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public ua8(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, mwf mwfVar, ra8 ra8Var, boolean z) {
        this.a = mwfVar;
        this.d = copyOnWriteArraySet;
        this.c = ra8Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = mwfVar.a(looper, new dn3(4, this));
        this.i = z;
    }
}

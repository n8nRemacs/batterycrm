package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class a9g extends Handler {
    public final long a;
    public final vhb b;
    public volatile long c;
    public volatile long d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a9g(long j, vhb vhbVar, Looper looper) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        super(looper);
        this.a = j;
        this.b = vhbVar;
        this.d = -1L;
    }

    public final long a() {
        long jElapsedRealtime;
        synchronized (this) {
            jElapsedRealtime = this.c + (this.d > 0 ? SystemClock.elapsedRealtime() - this.d : 0L);
        }
        return jElapsedRealtime;
    }

    public final void b() {
        synchronized (this) {
            if (this.d != -1) {
                this.c = (SystemClock.elapsedRealtime() - this.d) + this.c;
                this.d = -1L;
                removeCallbacksAndMessages(this);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.d != -1 && message.what == 1 && message.obj == this) {
            vhb vhbVar = this.b;
            long jA = a();
            Iterator it = ((LinkedHashSet) vhbVar.b).iterator();
            while (it.hasNext()) {
                vgb vgbVar = ((ol0) it.next()).a;
                ((a9g) vgbVar.c.c).getClass();
                vgbVar.b(jA);
            }
            sendMessageDelayed(obtainMessage(1, this), this.a);
        }
    }
}

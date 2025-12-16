package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class b8h implements c8h {
    public final c8h a;
    public final Handler b;

    public b8h(q8h q8hVar) {
        this.a = q8hVar;
        Looper looperMyLooper = Looper.myLooper();
        this.b = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
    }

    @Override // defpackage.c8h
    public final void c() {
        this.b.post(new m1h(4, this.a));
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

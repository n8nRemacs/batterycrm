package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ej3 {
    public final u1j a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ej3(u1j u1jVar) {
        this.a = u1jVar;
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.getClass();
        u1j.a(this);
    }

    public final void b(int i, String str) {
        this.c.put(Integer.valueOf(i), str);
    }

    public final void c(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
    }
}

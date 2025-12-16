package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class eie implements fie {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final fie b;

    public eie(fie fieVar) {
        this.b = fieVar;
    }

    @Override // defpackage.fie
    public final void a(hie hieVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(hieVar);
    }

    public final void b() {
        this.a.set(true);
    }
}

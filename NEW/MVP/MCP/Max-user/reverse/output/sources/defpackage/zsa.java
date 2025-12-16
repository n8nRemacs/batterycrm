package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zsa extends AtomicInteger implements py4 {
    public final cta a;
    public final vta b;
    public Serializable c;
    public volatile boolean d;

    public zsa(cta ctaVar, vta vtaVar) {
        this.a = ctaVar;
        this.b = vtaVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a(this);
        this.c = null;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d;
    }
}

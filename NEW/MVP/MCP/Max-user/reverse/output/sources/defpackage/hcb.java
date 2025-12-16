package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hcb {
    public final ocb a;
    public final WeakReference b;

    public hcb(fcb fcbVar, ocb ocbVar) {
        this.a = ocbVar;
        this.b = new WeakReference(fcbVar);
    }
}

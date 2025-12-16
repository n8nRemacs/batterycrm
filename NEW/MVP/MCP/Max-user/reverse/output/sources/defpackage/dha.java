package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class dha extends j0e {
    public static final yvd d = new yvd("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory c = d;

    @Override // defpackage.j0e
    public final h0e a() {
        return new eha(this.c);
    }
}

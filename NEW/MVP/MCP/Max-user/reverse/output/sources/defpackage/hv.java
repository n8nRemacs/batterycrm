package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class hv implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ iv o;

    public hv(iv ivVar, List list, List list2, int i, Runnable runnable) {
        this.o = ivVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.c.execute(new zn6(this, q08.b(new gv(this)), false, 3));
    }
}

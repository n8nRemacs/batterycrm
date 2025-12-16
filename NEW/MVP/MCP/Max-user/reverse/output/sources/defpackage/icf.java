package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class icf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y87 b;
    public final /* synthetic */ o9i c;

    public /* synthetic */ icf(y87 y87Var, o9i o9iVar, int i) {
        this.a = i;
        this.b = y87Var;
        this.c = o9iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q(this.c);
                break;
            default:
                ((LinkedHashSet) this.b.l).remove(this.c);
                break;
        }
    }
}

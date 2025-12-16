package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b26 implements zde {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final em6 c;
    public final Object d;

    public b26(Object obj, em6 em6Var, em6 em6Var2) {
        this.b = obj;
        this.c = em6Var;
        this.d = em6Var2;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new nz5(this);
            default:
                return new ay5(this);
        }
    }

    public b26(zde zdeVar, em6 em6Var, em6 em6Var2) {
        this.d = zdeVar;
        this.c = em6Var;
        this.b = em6Var2;
    }
}

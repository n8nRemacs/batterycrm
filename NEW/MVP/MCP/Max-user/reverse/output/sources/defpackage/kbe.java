package defpackage;

import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class kbe {
    public final Object a;
    public final um6 b;
    public final um6 c;
    public final Object d;
    public final dtf e;
    public final um6 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ mbe i;

    public kbe(mbe mbeVar, Object obj, um6 um6Var, um6 um6Var2, Object obj2, dtf dtfVar, um6 um6Var3) {
        this.i = mbeVar;
        this.a = obj;
        this.b = um6Var;
        this.c = um6Var2;
        this.d = obj2;
        this.e = dtfVar;
        this.f = um6Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof Segment) {
            ((Segment) obj).onCancellation(this.h, null, this.i.a);
            return;
        }
        sy4 sy4Var = obj instanceof sy4 ? (sy4) obj : null;
        if (sy4Var != null) {
            sy4Var.dispose();
        }
    }
}

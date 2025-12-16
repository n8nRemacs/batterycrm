package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h48 implements b48 {
    public final /* synthetic */ in a;
    public final /* synthetic */ i48 b;
    public final /* synthetic */ l48 c;

    public h48(in inVar, i48 i48Var, l48 l48Var) {
        this.a = inVar;
        this.b = i48Var;
        this.c = l48Var;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        if (k38Var.a().compareTo(l38.a) <= 0) {
            wqi.h("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", null);
            ArrayList arrayList = this.a.u0;
            if (arrayList != null) {
                arrayList.remove(this.b);
            }
            this.c.f(this);
        }
    }
}

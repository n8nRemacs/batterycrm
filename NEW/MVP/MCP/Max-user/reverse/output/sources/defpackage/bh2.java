package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class bh2 extends q44 {
    public Collection X;
    public Iterator Y;
    public /* synthetic */ Object Z;
    public ch2 d;
    public Comparator o;
    public final /* synthetic */ ch2 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh2(ch2 ch2Var, q44 q44Var) {
        super(q44Var);
        this.s0 = ch2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.h(this, null, false);
    }
}

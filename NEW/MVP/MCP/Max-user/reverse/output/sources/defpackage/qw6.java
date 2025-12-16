package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class qw6 extends q44 {
    public Serializable X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ tw6 Z;
    public tw6 d;
    public String o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw6(tw6 tw6Var, q44 q44Var) {
        super(q44Var);
        this.Z = tw6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return tw6.a(this.Z, null, this);
    }
}

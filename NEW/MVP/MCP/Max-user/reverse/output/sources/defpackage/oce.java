package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class oce extends q44 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fde Z;
    public fde d;
    public LinkedHashSet o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oce(fde fdeVar, q44 q44Var) {
        super(q44Var);
        this.Z = fdeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.u(this);
    }
}

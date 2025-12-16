package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i33 extends q44 {
    public h33 X;
    public final /* synthetic */ h33 Y;
    public z26 Z;
    public /* synthetic */ Object d;
    public int o;
    public List s0;
    public List t0;
    public Collection u0;
    public Iterator v0;
    public Collection w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i33(h33 h33Var, Continuation continuation) {
        super(continuation);
        this.Y = h33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

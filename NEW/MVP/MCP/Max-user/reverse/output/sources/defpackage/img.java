package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class img extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ w7b o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public img(w7b w7bVar, q44 q44Var) {
        super(q44Var);
        this.o = w7bVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        Serializable serializableA = this.o.a(null, null, this);
        return serializableA == g84.a ? serializableA : new kpd(serializableA);
    }
}

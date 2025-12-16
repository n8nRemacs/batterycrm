package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class idd extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kdd Y;
    public int Z;
    public kdd d;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idd(kdd kddVar, q44 q44Var) {
        super(q44Var);
        this.Y = kddVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}

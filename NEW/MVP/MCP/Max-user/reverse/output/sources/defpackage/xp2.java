package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xp2 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yq2 Y;
    public int Z;
    public yq2 d;
    public j09 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp2(yq2 yq2Var, Continuation continuation) {
        super(continuation);
        this.Y = yq2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return yq2.t(this.Y, null, this);
    }
}

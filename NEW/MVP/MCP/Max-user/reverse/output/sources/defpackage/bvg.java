package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bvg extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cvg Y;
    public int Z;
    public Object d;
    public tid o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvg(cvg cvgVar, Continuation continuation) {
        super(continuation);
        this.Y = cvgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(this);
    }
}

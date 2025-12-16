package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eh3 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kh3 Y;
    public int Z;
    public kh3 d;
    public wg3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(kh3 kh3Var, Continuation continuation) {
        super(continuation);
        this.Y = kh3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return kh3.a(this.Y, null, this);
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wqd extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ drd Y;
    public int Z;
    public drd d;
    public List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqd(drd drdVar, Continuation continuation) {
        super(continuation);
        this.Y = drdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return drd.c(this.Y, null, this);
    }
}

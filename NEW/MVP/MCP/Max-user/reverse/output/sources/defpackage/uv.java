package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uv extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xw Y;
    public int Z;
    public xw d;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(xw xwVar, Continuation continuation) {
        super(continuation);
        this.Y = xwVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.j(null, this);
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tna extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wna Y;
    public int Z;
    public wna d;
    public List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tna(wna wnaVar, Continuation continuation) {
        super(continuation);
        this.Y = wnaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return wna.a(this.Y, null, null, this);
    }
}

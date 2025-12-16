package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w9h extends dtf implements um6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ long o;

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        w9h w9hVar = new w9h(3, (Continuation) obj3);
        w9hVar.o = jLongValue;
        w9hVar.X = zBooleanValue;
        return w9hVar.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        if (this.X) {
            return new Long(j);
        }
        return null;
    }
}

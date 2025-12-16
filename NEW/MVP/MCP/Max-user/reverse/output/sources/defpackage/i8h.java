package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i8h extends dtf implements sm6 {
    public /* synthetic */ boolean o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((i8h) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i8h i8hVar = new i8h(2, continuation);
        i8hVar.o = ((Boolean) obj).booleanValue();
        return i8hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(this.o);
    }
}

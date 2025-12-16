package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class r96 extends dtf implements sm6 {
    public final /* synthetic */ AbstractCollection X;
    public final /* synthetic */ ca6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r96(AbstractCollection abstractCollection, ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.X = abstractCollection;
        this.Y = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r96(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ContextScope contextScopeA = d7j.a(this.b);
            AbstractCollection abstractCollection = this.X;
            ArrayList arrayList = new ArrayList(we3.q(abstractCollection, 10));
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                arrayList.add(svi.b(contextScopeA, null, new q96(it.next(), null, this.Y), 3));
            }
            this.o = 1;
            obj = hui.b(arrayList, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return ue3.E((Iterable) obj);
    }
}

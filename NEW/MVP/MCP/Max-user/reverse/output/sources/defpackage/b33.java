package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b33(b43 b43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b33(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            vb2 vb2Var = (vb2) this.X.y0.getValue();
            this.o = 1;
            obj = vb2Var.a(this.Y, null, this);
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((rb2) obj2) != rb2.y0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qzi.a((rb2) it.next()));
        }
        return arrayList2;
    }
}

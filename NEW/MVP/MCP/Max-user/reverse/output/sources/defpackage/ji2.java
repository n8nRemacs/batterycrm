package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ji2 extends dtf implements sm6 {
    public final /* synthetic */ ve2 X;
    public final /* synthetic */ ArrayList Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji2(ve2 ve2Var, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.X = ve2Var;
        this.Y = arrayList;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ji2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ji2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        m3 m3Var = new m3(this.X, 23, this.Y);
        this.o = 1;
        Object objI = vmi.i(bd5.a, m3Var, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}

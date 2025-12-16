package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tpf extends dtf implements sm6 {
    public final /* synthetic */ a93 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpf(a93 a93Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.X = a93Var;
        this.Y = str;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tpf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tpf(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Integer num;
        int i = this.o;
        a93 a93Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            List list = (List) a93Var.X;
            String str = (String) a93Var.Z;
            String str2 = this.Y;
            boolean zA = fni.a(str2, str);
            int i2 = this.Z;
            if (zA && (num = (Integer) a93Var.o) != null && num.intValue() == i2 && list != null) {
                return list;
            }
            xqf xqfVar = (xqf) a93Var.c;
            this.o = 1;
            obj = xqfVar.d(str2, i2, this);
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
        a93Var.X = (List) obj;
        return obj;
    }
}

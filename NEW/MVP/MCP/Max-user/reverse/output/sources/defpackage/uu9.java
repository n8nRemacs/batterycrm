package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class uu9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uu9) l((hr9) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uu9 uu9Var = new uu9(this.Y, continuation);
        uu9Var.X = obj;
        return uu9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        List<MessageModel> list = ((hr9) this.X).a;
        xs xsVar = new xs(0);
        for (MessageModel messageModel : list) {
            Long l = messageModel.C0 ? new Long(messageModel.a) : null;
            if (l != null) {
                xsVar.add(l);
            }
        }
        if (!xsVar.isEmpty()) {
            vu9 vu9Var = this.Y;
            pb2 pb2Var = (pb2) vu9Var.B1.a.getValue();
            if (pb2Var != null) {
                long j = pb2Var.b.a;
                psg psgVar = (psg) vu9Var.j1.getValue();
                this.o = 1;
                Object objD = psgVar.d(j, xsVar, this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            }
        }
        return qqgVar;
    }
}

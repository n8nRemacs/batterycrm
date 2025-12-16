package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class op9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        op9 op9Var = (op9) l((zpf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        op9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        op9 op9Var = new op9(continuation, this.X);
        op9Var.o = obj;
        return op9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zpf zpfVar = (zpf) this.o;
        MessageWriteWidget messageWriteWidget = this.X;
        z34 z34Var = messageWriteWidget.E0;
        if (z34Var != null) {
            z34Var.dismiss();
        }
        if (zpfVar != null) {
            fqf fqfVar = zpfVar.b;
            if (!fqfVar.X.isEmpty()) {
                View view = zpfVar.a;
                List list = fqfVar.X;
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ve3.p();
                        throw null;
                    }
                    arrayList.add(new b44(i, new r5g((String) obj2), (Integer) null, (Integer) null, 28));
                    i = i2;
                }
                z34 z34VarBuild = h6j.a(1).B(view).o(arrayList).f().build();
                z34VarBuild.u(messageWriteWidget);
                messageWriteWidget.E0 = z34VarBuild;
            }
        }
        return qqg.a;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w41 extends dtf implements um6 {
    public /* synthetic */ Throwable X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w41(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                w41 w41Var = new w41(3, continuation, 0);
                w41Var.X = th;
                qqg qqgVar = qqg.a;
                w41Var.n(qqgVar);
                return qqgVar;
            case 1:
                w41 w41Var2 = new w41(3, continuation, 1);
                w41Var2.X = th;
                qqg qqgVar2 = qqg.a;
                w41Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                w41 w41Var3 = new w41(3, continuation, 2);
                w41Var3.X = th;
                qqg qqgVar3 = qqg.a;
                w41Var3.n(qqgVar3);
                return qqgVar3;
            case 3:
                w41 w41Var4 = new w41(3, continuation, 3);
                w41Var4.X = th;
                qqg qqgVar4 = qqg.a;
                w41Var4.n(qqgVar4);
                return qqgVar4;
            case 4:
                w41 w41Var5 = new w41(3, continuation, 4);
                w41Var5.X = th;
                qqg qqgVar5 = qqg.a;
                w41Var5.n(qqgVar5);
                return qqgVar5;
            default:
                w41 w41Var6 = new w41(3, continuation, 5);
                w41Var6.X = th;
                qqg qqgVar6 = qqg.a;
                w41Var6.n(qqgVar6);
                return qqgVar6;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                g8j.b(obj);
                Throwable th = this.X;
                if (!(th instanceof CancellationException)) {
                    wqi.e("CallChatRepositoryTag", "fail no get chat", th);
                }
                return qqgVar;
            case 1:
                g8j.b(obj);
                wqi.e("py2", "catch error in chatUpdateFlow", this.X);
                return qqgVar;
            case 2:
                g8j.b(obj);
                wqi.e("ChatVM/MissedContactsController", "fail", this.X);
                return qqgVar;
            case 3:
                g8j.b(obj);
                Throwable th2 = this.X;
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                wqi.e("MiniChatsUpdated", "fail", th2);
                return qqgVar;
            case 4:
                g8j.b(obj);
                Throwable th3 = this.X;
                if (!(th3 instanceof CancellationException)) {
                    ((y3b) ((yi5) t1b.a.getAccessor().c(9))).a(th3);
                }
                return qqgVar;
            default:
                g8j.b(obj);
                wqi.p("ViewThemeUtils", "fail to change theme for spans", this.X);
                return qqgVar;
        }
    }
}

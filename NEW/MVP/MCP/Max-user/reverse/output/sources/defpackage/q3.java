package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q3 extends dtf implements um6 {
    public /* synthetic */ View X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                q3 q3Var = new q3(3, continuation, 0);
                q3Var.X = view;
                q3Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                q3Var.n(qqgVar);
                return qqgVar;
            case 1:
                q3 q3Var2 = new q3(3, continuation, 1);
                q3Var2.X = view;
                q3Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                q3Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                q3 q3Var3 = new q3(3, continuation, 2);
                q3Var3.X = view;
                q3Var3.Y = yebVar;
                qqg qqgVar3 = qqg.a;
                q3Var3.n(qqgVar3);
                return qqgVar3;
            default:
                q3 q3Var4 = new q3(3, continuation, 3);
                q3Var4.X = view;
                q3Var4.Y = yebVar;
                qqg qqgVar4 = qqg.a;
                q3Var4.n(qqgVar4);
                return qqgVar4;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.i().b.b);
                break;
            case 1:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().a.k);
                break;
            case 2:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.i().b.c);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
        }
        return qqg.a;
    }
}

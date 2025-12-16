package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b62 extends dtf implements um6 {
    public /* synthetic */ AppCompatTextView X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b62(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                b62 b62Var = new b62(3, continuation, 0);
                b62Var.X = appCompatTextView;
                qqg qqgVar = qqg.a;
                b62Var.n(qqgVar);
                return qqgVar;
            case 1:
                b62 b62Var2 = new b62(3, continuation, 1);
                b62Var2.X = appCompatTextView;
                qqg qqgVar2 = qqg.a;
                b62Var2.n(qqgVar2);
                return qqgVar2;
            default:
                b62 b62Var3 = new b62(3, continuation, 2);
                b62Var3.X = appCompatTextView;
                qqg qqgVar3 = qqg.a;
                b62Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                AppCompatTextView appCompatTextView = this.X;
                appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().i);
                break;
            case 1:
                g8j.b(obj);
                AppCompatTextView appCompatTextView2 = this.X;
                appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                break;
            default:
                g8j.b(obj);
                AppCompatTextView appCompatTextView3 = this.X;
                appCompatTextView3.setTextColor(a93.s0.y(appCompatTextView3).getText().e);
                break;
        }
        return qqg.a;
    }
}

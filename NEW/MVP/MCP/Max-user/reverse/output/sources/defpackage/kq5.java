package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kq5 extends dtf implements um6 {
    public /* synthetic */ AppCompatTextView X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                kq5 kq5Var = new kq5(this.X, (Continuation) obj3);
                kq5Var.Y = (yeb) obj2;
                qqg qqgVar = qqg.a;
                kq5Var.n(qqgVar);
                return qqgVar;
            case 1:
                kq5 kq5Var2 = new kq5(3, (Continuation) obj3, 1);
                kq5Var2.X = (AppCompatTextView) obj;
                kq5Var2.Y = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                kq5Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                kq5 kq5Var3 = new kq5(3, (Continuation) obj3, 2);
                kq5Var3.X = (AppCompatTextView) obj;
                kq5Var3.Y = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                kq5Var3.n(qqgVar3);
                return qqgVar3;
            default:
                kq5 kq5Var4 = new kq5(3, (Continuation) obj3, 3);
                kq5Var4.X = (AppCompatTextView) obj;
                kq5Var4.Y = (yeb) obj2;
                qqg qqgVar4 = qqg.a;
                kq5Var4.n(qqgVar4);
                return qqgVar4;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setTextColor(this.Y.getText().e);
                break;
            case 1:
                g8j.b(obj);
                this.X.setTextColor(this.Y.getText().e);
                break;
            case 2:
                g8j.b(obj);
                this.X.setTextColor(this.Y.getText().g);
                break;
            default:
                g8j.b(obj);
                this.X.setTextColor(this.Y.getText().h);
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq5(AppCompatTextView appCompatTextView, Continuation continuation) {
        super(3, continuation);
        this.o = 0;
        this.X = appCompatTextView;
    }
}

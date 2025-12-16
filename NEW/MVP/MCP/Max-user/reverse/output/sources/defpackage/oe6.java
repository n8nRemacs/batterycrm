package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class oe6 extends dtf implements um6 {
    public /* synthetic */ yeb X;
    public final /* synthetic */ TextView Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe6(TextView textView, TextView textView2, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = textView;
        this.Z = textView2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                TextView textView = this.Z;
                oe6 oe6Var = new oe6(this.Y, textView, (Continuation) obj3, 0);
                oe6Var.X = (yeb) obj2;
                qqg qqgVar = qqg.a;
                oe6Var.n(qqgVar);
                return qqgVar;
            case 1:
                TextView textView2 = this.Z;
                oe6 oe6Var2 = new oe6(this.Y, textView2, (Continuation) obj3, 1);
                oe6Var2.X = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                oe6Var2.n(qqgVar2);
                return qqgVar2;
            default:
                TextView textView3 = this.Z;
                oe6 oe6Var3 = new oe6(this.Y, textView3, (Continuation) obj3, 2);
                oe6Var3.X = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                oe6Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                yeb yebVar = this.X;
                this.Y.setTextColor(yebVar.getText().e);
                this.Z.setTextColor(yebVar.getText().e);
                break;
            case 1:
                g8j.b(obj);
                yeb yebVar2 = this.X;
                this.Y.setTextColor(yebVar2.getText().e);
                this.Z.setTextColor(yebVar2.getText().g);
                break;
            default:
                g8j.b(obj);
                yeb yebVar3 = this.X;
                this.Y.setTextColor(yebVar3.getText().e);
                this.Z.setTextColor(yebVar3.getText().i);
                break;
        }
        return qqg.a;
    }
}

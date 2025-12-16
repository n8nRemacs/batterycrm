package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ua6 extends dtf implements um6 {
    public /* synthetic */ TextView X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua6(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextView textView = (TextView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                ua6 ua6Var = new ua6(3, continuation, 0);
                ua6Var.X = textView;
                qqg qqgVar = qqg.a;
                ua6Var.n(qqgVar);
                return qqgVar;
            case 1:
                ua6 ua6Var2 = new ua6(3, continuation, 1);
                ua6Var2.X = textView;
                qqg qqgVar2 = qqg.a;
                ua6Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                ua6 ua6Var3 = new ua6(3, continuation, 2);
                ua6Var3.X = textView;
                qqg qqgVar3 = qqg.a;
                ua6Var3.n(qqgVar3);
                return qqgVar3;
            default:
                ua6 ua6Var4 = new ua6(3, continuation, 3);
                ua6Var4.X = textView;
                qqg qqgVar4 = qqg.a;
                ua6Var4.n(qqgVar4);
                return qqgVar4;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                TextView textView = this.X;
                v1a v1aVar = a93.s0;
                textView.setTextColor(v1aVar.y(textView).getText().e);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(textView).c().a.a.i), null, new ColorDrawable(-1)));
                break;
            case 1:
                g8j.b(obj);
                TextView textView2 = this.X;
                textView2.setTextColor(a93.s0.y(textView2).getText().h);
                break;
            case 2:
                g8j.b(obj);
                TextView textView3 = this.X;
                textView3.setTextColor(a93.s0.y(textView3).getText().e);
                break;
            default:
                g8j.b(obj);
                TextView textView4 = this.X;
                textView4.setTextColor(a93.s0.y(textView4).getText().g);
                break;
        }
        return qqg.a;
    }
}

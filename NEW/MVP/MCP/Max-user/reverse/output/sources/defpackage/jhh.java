package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jhh extends dtf implements sm6 {
    public final /* synthetic */ TextView X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhh(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.X = textView;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jhh jhhVar = (jhh) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jhhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jhh jhhVar = new jhh(this.X, continuation);
        jhhVar.o = obj;
        return jhhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yeb yebVar = (yeb) this.o;
        CharSequence text = this.X.getText();
        if (text != null) {
            a8i.b(text, yebVar);
        }
        return qqg.a;
    }
}

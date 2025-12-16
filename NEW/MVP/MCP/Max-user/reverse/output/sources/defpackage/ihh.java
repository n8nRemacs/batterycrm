package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ihh extends dtf implements sm6 {
    public final /* synthetic */ TextView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihh(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.o = textView;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ihh ihhVar = (ihh) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ihhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ihh(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        TextView textView = this.o;
        CharSequence text = textView.getText();
        if (text != null) {
            a8i.b(text, a93.s0.x(textView.getContext()).k());
        }
        return qqg.a;
    }
}

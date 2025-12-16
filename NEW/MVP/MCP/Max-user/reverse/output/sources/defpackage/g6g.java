package defpackage;

import android.util.TypedValue;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class g6g implements f84 {
    public final /* synthetic */ ContextScope a;
    public final TextView b;
    public final fqg c;
    public final float d;

    public g6g(TextView textView, fqg fqgVar) {
        arf arfVarA = zk6.a();
        ep4 ep4Var = gy4.a;
        this.a = new ContextScope(arfVarA.plus(MainDispatcherLoader.dispatcher));
        this.b = textView;
        this.c = fqgVar;
        this.d = textView.getTextSize();
        if (textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new d6g(textView, this, 1));
            return;
        }
        try {
            CancellationException cancellationException = new CancellationException("onDetach");
            cancellationException.initCause(null);
            d7j.c(this, cancellationException);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        Object ipdVar;
        fqg fqgVar = this.c;
        float fFloatValue = ((Number) fqgVar.a.getValue()).floatValue();
        TextView textView = this.b;
        textView.getContext();
        textView.setTextSize(0, TypedValue.applyDimension(2, fFloatValue, vw4.d().getDisplayMetrics()) + this.d);
        if (!textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new d6g(textView, this, 0));
            return;
        }
        g56 g56Var = new g56(new uxb(fqgVar.a, this, 27), new e6g(this, null), 1);
        try {
            ipdVar = tfh.b(textView);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = this;
        }
        gw0.w(g56Var, (f84) ipdVar);
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}

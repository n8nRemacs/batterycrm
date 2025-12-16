package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d2c extends ugc {
    public final /* synthetic */ int E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2c(View view, int i) {
        super(view);
        this.E0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence] */
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        int i = this.E0;
        View view = this.a;
        switch (i) {
            case 0:
                TextView textView = (TextView) view;
                ?? B = ((k2c) t98Var).a.b(textView.getContext());
                textView.setText(B != 0 ? B : "");
                tqi.c(new x9(3, null, 27), textView);
                break;
            case 1:
                a8e a8eVar = (a8e) t98Var;
                TextView textView2 = (TextView) view;
                ?? B2 = a8eVar.a.b(textView2.getContext());
                textView2.setText(B2 != 0 ? B2 : "");
                tqi.c(new z8e(a8eVar, (Continuation) null, 0), textView2);
                t5g t5gVar = dpg.a;
                a8eVar.c.b(textView2, t75.b);
                break;
            default:
                break;
        }
    }

    public d2c(Context context) {
        this.E0 = 1;
        TextView textView = new TextView(context);
        super(textView);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}

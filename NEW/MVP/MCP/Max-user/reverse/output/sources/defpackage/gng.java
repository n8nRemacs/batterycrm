package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class gng extends d2f {
    public final /* synthetic */ int E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gng(View view, int i) {
        super(view);
        this.E0 = i;
    }

    private final void F(t98 t98Var) {
    }

    private final void G(t98 t98Var) {
    }

    private final void H(t98 t98Var) {
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                if (t98Var instanceof dng) {
                    TextView textView = (TextView) this.a;
                    textView.setText(((dng) t98Var).a.b(textView.getContext()));
                    break;
                }
                break;
        }
    }
}

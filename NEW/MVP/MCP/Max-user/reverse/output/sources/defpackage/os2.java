package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class os2 extends ugc {
    public final veb E0;
    public final Object F0;

    public os2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        veb vebVar = new veb(context);
        vebVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.O));
        vebVar.setHintColorAttr(w9b.Y);
        vebVar.setClipToOutline(true);
        vebVar.setOutlineProvider(new u74(kti.d(16 * vw4.d().getDisplayMetrics().density)));
        this.E0 = vebVar;
        this.F0 = ipi.b(3, new ns2(context, 0));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(vebVar);
        linearLayout.setBackground(null);
        tqi.c(new ld0(this, (Continuation) null, 6), linearLayout);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void F(zf3 zf3Var) {
        ?? r0 = this.F0;
        if (r0.e() || zf3Var != null) {
            TextView textView = (TextView) r0.getValue();
            textView.setVisibility(zf3Var != null ? 0 : 8);
            textView.setText(zf3Var != null ? zf3Var.a(textView.getContext()) : null);
            fqi.c((ViewGroup) this.a, textView, -1);
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        ms2 ms2Var = (ms2) t98Var;
        CharSequence charSequenceA = ms2Var.b.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        String string = charSequenceA.toString();
        veb vebVar = this.E0;
        vebVar.setHint(string);
        vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ms2Var.d)});
        String str = ms2Var.a;
        if (str != null) {
            vebVar.setText(str);
        }
        F(ms2Var.c);
    }
}

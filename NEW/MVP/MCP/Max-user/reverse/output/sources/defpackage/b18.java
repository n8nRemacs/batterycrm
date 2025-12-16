package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b18 extends ugc {
    public final w3b E0;
    public final Object F0;

    public b18(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        w3b w3bVar = new w3b(context, 14);
        w3bVar.setId(hzc.profile_edit_last_name_field);
        w3bVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        float f = 12;
        float f2 = 16;
        w3bVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2));
        w3bVar.setSingleLine(true);
        dpg.h.b(w3bVar, t75.b);
        w3bVar.setHint(w3bVar.getResources().getText(u8b.f0));
        w3bVar.setClipToOutline(true);
        w3bVar.setOutlineProvider(new u74(kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        w3bVar.setInputType(w3bVar.getInputType() | 16384);
        this.E0 = w3bVar;
        this.F0 = ipi.b(3, new ns2(context, 15));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(w3bVar);
        tqi.c(new ld0(this, (Continuation) null, 18), linearLayout);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void F(zf3 zf3Var) {
        ?? r0 = this.F0;
        if (r0.e() || zf3Var != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) r0.getValue();
            appCompatTextView.setVisibility(zf3Var != null ? 0 : 8);
            appCompatTextView.setText(zf3Var != null ? zf3Var.a(appCompatTextView.getContext()) : null);
            fqi.c((ViewGroup) this.a, appCompatTextView, null);
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        a18 a18Var = (a18) t98Var;
        String str = a18Var.a;
        if (str != null) {
            this.E0.setText(str);
        }
        F(a18Var.b);
    }
}

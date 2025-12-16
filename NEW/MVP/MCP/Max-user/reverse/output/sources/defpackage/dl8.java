package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class dl8 extends y0f {
    public final po9 o;

    public dl8(ScheduledExecutorService scheduledExecutorService, po9 po9Var) {
        super(scheduledExecutorService);
        this.o = po9Var;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        en0 en0Var = new en0(textView);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(new xhd(-2, -1));
        textView.setPaddingRelative(iD2, iD, iD2, iD);
        dpg.G.b(textView, t75.b);
        f8j.d(textView, 300L, new kg6(en0Var, 9, this.o));
        textView.setGravity(16);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        tqi.c(new x9(3, null, 22), textView);
        return en0Var;
    }
}

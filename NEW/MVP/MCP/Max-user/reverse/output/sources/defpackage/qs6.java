package defpackage;

import android.content.Context;
import android.text.Spannable;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class qs6 {
    public final k18 a;
    public final k18 b;

    public qs6(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final CharSequence a(String str, List list) {
        f7b f7bVar = (f7b) this.a.getValue();
        Pattern pattern = m6g.a;
        if (!l8g.c(str)) {
            str = m6g.i.matcher(str).replaceAll("\n");
        }
        Spannable spannableH = mni.H(ssi.p(f7bVar.b(f7bVar.l(f7bVar.j.e(str), list, true, (int) (sw4.d(dpg.G.e(t75.b)) * vw4.d().getDisplayMetrics().density), true), false, false, false, true, list, true)), a93.s0.x((Context) this.b.getValue()).k().a().i().d.b, (24 & 4) != 0, null);
        return spannableH == null ? "" : spannableH;
    }
}

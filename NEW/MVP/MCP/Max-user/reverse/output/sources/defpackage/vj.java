package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class vj {
    public AtomicReference a;
    public HashMap b;

    static {
        vid.a(vj.class).b();
    }

    public final List a(CharSequence charSequence) {
        HashMap map = this.b;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0 || map.isEmpty()) {
            return hd5.a;
        }
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        Object[] spans = null;
        try {
            Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, apg.class);
            }
        } catch (Throwable unused) {
        }
        apg[] apgVarArr = (apg[]) spans;
        if (apgVarArr != null) {
            for (apg apgVar : apgVarArr) {
                if (map.get(charSequence.subSequence(((Spanned) charSequence).getSpanStart(apgVar), ((Spanned) charSequence).getSpanEnd(apgVar)).toString()) != null) {
                    throw new ClassCastException();
                }
            }
        }
        return ue3.X(arrayList, new s55(8));
    }
}

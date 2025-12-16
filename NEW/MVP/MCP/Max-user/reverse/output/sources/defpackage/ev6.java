package defpackage;

import android.net.Uri;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes2.dex */
public final class ev6 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(dv6 dv6Var) {
        String string;
        List list = dv6Var.Z;
        f7c f7cVar = dv6Var.d;
        v0b v0bVar = (v0b) this.a;
        v0bVar.setId(Long.hashCode(dv6Var.t0));
        f7c f7cVar2 = dv6Var.c;
        CharSequence charSequence = f7cVar2.a;
        CharSequence charSequenceL = f7cVar2.a;
        String string2 = charSequence.toString();
        TextView textView = v0bVar.c;
        if (string2 != null && string2.length() != 0 && textView.getPaint().measureText(string2) > textView.getMeasuredWidth()) {
            charSequenceL = uzi.l(charSequenceL, list, f7cVar2.b);
        }
        v0bVar.setTitle(charSequenceL);
        CharSequence charSequence2 = f7cVar.a;
        CharSequence charSequenceL2 = f7cVar.a;
        if (v0bVar.e(charSequence2.toString())) {
            charSequenceL2 = uzi.l(charSequenceL2, list, f7cVar.b);
        }
        v0bVar.setSubtitle(charSequenceL2);
        long j = dv6Var.a;
        String str = dv6Var.b;
        Uri uri = dv6Var.X;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        v0bVar.g(j, str, string);
        v0bVar.setVerified(dv6Var.o);
    }
}

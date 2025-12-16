package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mx3 {
    public final k18 a;

    public mx3(k18 k18Var) {
        this.a = k18Var;
    }

    public final void a(Context context, Uri uri) {
        l5c l5cVar = (l5c) ((age) this.a.getValue());
        String string = l5cVar.g.getString("invite-long", null);
        if (string == null) {
            string = String.format(context.getString(fvd.J), Arrays.copyOf(new Object[]{l5cVar.l()}, 1));
        }
        xb3.a(context, string.toString());
        String str = ap7.a;
        ap7.i(context, string, uri);
    }
}

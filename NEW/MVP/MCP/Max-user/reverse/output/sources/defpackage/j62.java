package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class j62 implements hig {
    public final a3b a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final hc3 e;
    public final hc3 f;
    public final int g;

    public j62(Context context, hc3 hc3Var, hc3 hc3Var2) {
        pw7 pw7Var = new pw7();
        i80 i80Var = i80.a;
        pw7Var.b(gm0.class, i80Var);
        pw7Var.b(k90.class, i80Var);
        l80 l80Var = l80.a;
        pw7Var.b(ng8.class, l80Var);
        pw7Var.b(qa0.class, l80Var);
        j80 j80Var = j80.a;
        pw7Var.b(mb3.class, j80Var);
        pw7Var.b(r90.class, j80Var);
        h80 h80Var = h80.a;
        pw7Var.b(nd.class, h80Var);
        pw7Var.b(c90.class, h80Var);
        k80 k80Var = k80.a;
        pw7Var.b(ig8.class, k80Var);
        pw7Var.b(pa0.class, k80Var);
        m80 m80Var = m80.a;
        pw7Var.b(cea.class, m80Var);
        pw7Var.b(ta0.class, m80Var);
        pw7Var.d = true;
        this.a = new a3b(22, pw7Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(dy0.c);
        this.e = hc3Var2;
        this.f = hc3Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(wy1.h("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ba0 a(defpackage.ba0 r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j62.a(ba0):ba0");
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public abstract class aw7 {
    public int a;
    public final Object b;
    public final Object c;

    public aw7(String str, int i, bw7 bw7Var) {
        this.b = str;
        this.a = i;
        this.c = bw7Var;
    }

    public static aw7 b(a aVar, int i) {
        if (i == 0) {
            return new jjb(aVar, 0);
        }
        if (i == 1) {
            return new jjb(aVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(((String) this.b).concat("."));
        sb.append(str);
        bw7 bw7VarL = l();
        if (bw7VarL != null && (str2 = bw7VarL.a) != null) {
            sb.append(".".concat(str2));
        }
        return sb.toString();
    }

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public bw7 l() {
        return (bw7) this.c;
    }

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public aw7(a aVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = aVar;
    }
}

package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t7 {
    public long a;
    public boolean b;
    public Object c;
    public Serializable d;
    public Object e;

    public void a() {
        if (this.b) {
            this.b = false;
            q7 q7Var = (q7) this.e;
            if (q7Var == null) {
                return;
            }
            ((ir9) this.d).invoke(q7Var, Long.valueOf(((y8g) this.c).getMsSinceBoot() - this.a));
        }
    }
}

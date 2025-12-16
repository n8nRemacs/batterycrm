package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b69 {
    public boolean X;
    public c69 Y;
    public boolean Z;
    public final Context a;
    public final a3b b;
    public final ey c = new ey(9, this);
    public x6i d;
    public j59 o;

    public b69(Context context, a3b a3bVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (a3bVar != null) {
            this.b = a3bVar;
        } else {
            this.b = new a3b(25, new ComponentName(context, getClass()));
        }
    }

    public z59 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract a69 d(String str);

    public a69 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(j59 j59Var);

    public final void g(c69 c69Var) {
        l69.b();
        if (this.Y != c69Var) {
            this.Y = c69Var;
            if (this.Z) {
                return;
            }
            this.Z = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void h(j59 j59Var) {
        l69.b();
        if (Objects.equals(this.o, j59Var)) {
            return;
        }
        this.o = j59Var;
        if (this.X) {
            return;
        }
        this.X = true;
        this.c.sendEmptyMessage(2);
    }
}

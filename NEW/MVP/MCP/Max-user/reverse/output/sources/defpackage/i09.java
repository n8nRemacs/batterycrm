package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i09 implements lw0 {
    public static final zb8 X;
    public final String a;
    public final c09 b;
    public final xz8 c;
    public final v19 d;
    public final rz8 o;

    static {
        nz8 nz8Var = new nz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        nz8Var.a();
        v19 v19Var = v19.R0;
        X = new zb8(27);
    }

    public i09(String str, rz8 rz8Var, c09 c09Var, xz8 xz8Var, v19 v19Var) {
        this.a = str;
        this.b = c09Var;
        this.c = xz8Var;
        this.d = v19Var;
        this.o = rz8Var;
    }

    public static i09 a(Uri uri) {
        nz8 nz8Var = new nz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        return new i09("", new rz8(nz8Var), uri != null ? new c09(uri, null, zjd.o) : null, new xz8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), v19.R0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i09)) {
            return false;
        }
        i09 i09Var = (i09) obj;
        return xxg.a(this.a, i09Var.a) && this.o.equals(i09Var.o) && xxg.a(this.b, i09Var.b) && this.c.equals(i09Var.c) && xxg.a(this.d, i09Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c09 c09Var = this.b;
        return this.d.hashCode() + ((this.o.hashCode() + ((this.c.hashCode() + ((iHashCode + (c09Var != null ? c09Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xmd {
    public final gf6 a;
    public final wg7 b;
    public final long c;
    public final List d;
    public final q7d o;

    public xmd(gf6 gf6Var, List list, hae haeVar, List list2) {
        fsi.b(!list.isEmpty());
        this.a = gf6Var;
        this.b = wg7.j(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.o = haeVar.a(this);
        this.c = xxg.H(haeVar.b, 1000000L, haeVar.a);
    }

    public abstract String a();

    public abstract td4 c();

    public abstract q7d d();
}

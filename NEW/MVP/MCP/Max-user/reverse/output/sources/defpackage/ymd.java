package defpackage;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ymd {
    public final hf6 a;
    public final wg7 b;
    public final long c;
    public final List d;
    public final r7d o;

    public ymd(hf6 hf6Var, List list, hae haeVar, List list2) {
        hsi.b(!list.isEmpty());
        this.a = hf6Var;
        this.b = wg7.j(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.o = haeVar.b(this);
        long j = haeVar.b;
        long j2 = haeVar.a;
        String str = zxg.a;
        this.c = zxg.e0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract ud4 c();

    public abstract r7d d();
}

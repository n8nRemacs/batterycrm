package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public final class df6 {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final cf6 b = new cf6(this);
    public final ArrayList c = new ArrayList();

    public final af6 a(String str, Iterable iterable, cm6 cm6Var) {
        af6 af6Var = new af6(str, new u02(iterable, cm6Var, this, str, 6));
        ArrayList arrayList = this.c;
        bf6 bf6Var = af6Var.b;
        arrayList.add(0, bf6Var);
        ForkJoinPool.commonPool().execute(bf6Var);
        return af6Var;
    }
}

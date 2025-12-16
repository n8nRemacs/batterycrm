package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bxg {
    public static final List d = Arrays.asList(1, 2, 4, 3, 7);
    public chh a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(uwg uwgVar) {
        this.b.add(uwgVar);
    }

    public final u5i b() {
        ArrayList arrayList = this.b;
        z5j.a("UseCase must not be empty.", !arrayList.isEmpty());
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((j5h) it.next()).a;
            rmb.b(i2, d);
            int i3 = i & i2;
            if (i3 > 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(ho7.i("More than one effects has targets ", rmb.c(i3), "."));
            }
            i |= i2;
        }
        return new u5i(this.a, arrayList, arrayList2);
    }
}

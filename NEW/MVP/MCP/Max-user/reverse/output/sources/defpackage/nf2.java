package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class nf2 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final boolean e;

    public nf2(t7 t7Var) {
        this.a = (String) t7Var.c;
        this.b = (String) t7Var.d;
        ArrayList arrayList = (ArrayList) t7Var.e;
        this.c = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        this.d = t7Var.a;
        this.e = t7Var.b;
    }
}

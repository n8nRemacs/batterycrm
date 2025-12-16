package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s57 implements mz5 {
    public final String a;
    public final List b;
    public final boolean c;

    public s57(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}

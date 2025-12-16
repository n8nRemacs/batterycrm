package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public final class kii extends PhantomReference {
    public final Set a;
    public final o6 b;

    public /* synthetic */ kii(ia3 ia3Var, ReferenceQueue referenceQueue, Set set, o6 o6Var) {
        super(ia3Var, referenceQueue);
        this.a = set;
        this.b = o6Var;
    }
}

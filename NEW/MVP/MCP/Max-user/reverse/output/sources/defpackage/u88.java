package defpackage;

import java.util.Collection;
import java.util.function.Predicate;
import one.me.sdk.concurrent.LinkedTransferQueue34;

/* loaded from: classes2.dex */
public final /* synthetic */ class u88 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ u88(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return LinkedTransferQueue34.lambda$retainAll$1(this.b, obj);
            default:
                return this.b.contains(obj);
        }
    }
}

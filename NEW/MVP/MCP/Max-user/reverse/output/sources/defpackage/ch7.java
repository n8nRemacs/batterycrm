package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ch7 extends AbstractMap {
    public final lyg[] a;

    public ch7(lyg[] lygVarArr) {
        this.a = lygVarArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ps(this.a);
    }
}

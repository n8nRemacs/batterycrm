package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class jx9 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ jx9(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new mx9(4, false, false, this.b, 0L, 46);
            case 1:
                return new mx9(3, false, true, this.b, 0L, 38);
            case 2:
                return new mx9(2, false, false, 0L, this.b, 26);
            default:
                LinkedHashSet linkedHashSet = new LinkedHashSet((Set) obj);
                linkedHashSet.removeIf(new a6(11, new c46(this.b, 3)));
                return linkedHashSet;
        }
    }
}

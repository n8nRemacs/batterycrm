package defpackage;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class dn4 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ dn4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj).equals(this.b);
            case 1:
                return vmf.s(((wr0) obj).c, this.b, false);
            default:
                return fni.a(((wr0) obj).c, this.b);
        }
    }
}

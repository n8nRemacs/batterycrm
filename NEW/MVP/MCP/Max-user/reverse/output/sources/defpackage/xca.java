package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class xca implements Comparator {
    public static final xca b = new xca(0);
    public static final xca c = new xca(1);
    public final /* synthetic */ int a;

    public /* synthetic */ xca(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}

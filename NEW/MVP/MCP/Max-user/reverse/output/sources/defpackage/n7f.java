package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class n7f implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ n7f(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o7f o7fVar = (o7f) obj;
                o7f o7fVar2 = (o7f) obj2;
                int iCompare = Integer.compare(o7fVar2.a, o7fVar.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = o7fVar2.c.compareTo(o7fVar.c);
                return iCompareTo != 0 ? iCompareTo : o7fVar2.d.compareTo(o7fVar.d);
            case 1:
                return ((ytb) obj2).c().compareTo(((ytb) obj).c());
            case 2:
                return Integer.compare(((ffg) obj).X, ((ffg) obj2).X);
            case 3:
                return Integer.compare(((m1i) obj).a.b, ((m1i) obj2).a.b);
            case 4:
                return Integer.compare(((n1i) obj).a.b, ((n1i) obj2).a.b);
            case 5:
                return Long.compare(((k1i) obj).b, ((k1i) obj2).b);
            default:
                return Long.compare(((l1i) obj).b, ((l1i) obj2).b);
        }
    }
}

package defpackage;

import java.time.Instant;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class cn4 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                qha qhaVar = (qha) this.b;
                String str = (String) this.c;
                String str2 = (String) obj;
                qhaVar.getClass();
                if (str == null || str2 == null || str.trim().equals("") || str2.trim().equals("")) {
                    throw new IllegalArgumentException("can't be null or empty");
                }
                if (!str2.startsWith("*.")) {
                    return str.equals(str2);
                }
                int iIndexOf = str.indexOf(".");
                return (iIndexOf > 0 && str.substring(iIndexOf + 1).equals(str2.substring(2))) || str.equals(str2.substring(2));
            case 1:
                return ((BiPredicate) this.b).test((String) ((Map.Entry) this.c).getKey(), (String) obj);
            case 2:
                lk8 lk8Var = (lk8) this.b;
                Instant instant = (Instant) this.c;
                tlb tlbVar = (tlb) obj;
                lk8Var.getClass();
                return tlbVar.b.m().longValue() <= lk8Var.i - 3 || (tlbVar.b.m().longValue() <= lk8Var.i && tlbVar.a.isBefore(instant));
            default:
                o7e o7eVar = (o7e) this.b;
                String str3 = (String) this.c;
                String str4 = (String) obj;
                o7eVar.getClass();
                return !l8g.c(str4) && o7eVar.i(str4, str3);
        }
    }
}

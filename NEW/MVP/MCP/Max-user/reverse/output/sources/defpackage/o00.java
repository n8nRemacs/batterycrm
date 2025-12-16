package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ o00(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        cj3 cj3VarC = cj3.a;
        switch (i3) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                i = ((gf6) obj2).Z;
                i2 = ((gf6) obj).Z;
                break;
            case 2:
                i = ((hf6) obj2).j;
                i2 = ((hf6) obj).j;
                break;
            case 3:
                jl0 jl0Var = (jl0) obj;
                jl0 jl0Var2 = (jl0) obj2;
                int iCompare = Integer.compare(jl0Var.c, jl0Var2.c);
                return iCompare != 0 ? iCompare : jl0Var.b.compareTo(jl0Var2.b);
            case 4:
                kl0 kl0Var = (kl0) obj;
                kl0 kl0Var2 = (kl0) obj2;
                int iCompare2 = Integer.compare(kl0Var.c, kl0Var2.c);
                return iCompare2 != 0 ? iCompare2 : kl0Var.b.compareTo(kl0Var2.b);
            case 5:
                return Long.compare(((eh9) obj2).getC(), ((eh9) obj).getC());
            case 6:
                return Integer.compare(((q62) obj2).b, ((q62) obj).b);
            case 7:
                return Integer.compare(((r62) obj2).b, ((r62) obj).b);
            case 8:
                pb2 pb2Var = (pb2) obj;
                pb2Var.getClass();
                return pmi.a(((pb2) obj2).q(), pb2Var.q());
            case 9:
                pb2 pb2Var2 = (pb2) obj;
                pb2 pb2Var3 = (pb2) obj2;
                int iA = pmi.a(pb2Var3.b.a().e, pb2Var2.b.a().e);
                return iA != 0 ? iA : pmi.a(pb2Var3.q(), pb2Var2.q());
            case 10:
                j37 j37Var = (j37) obj;
                j37 j37Var2 = (j37) obj2;
                int iB = b5j.b(Long.valueOf(j37Var2.getC()), Long.valueOf(j37Var.getC()));
                return iB != 0 ? iB : b5j.b(Long.valueOf(j37Var.getA()), Long.valueOf(j37Var2.getA()));
            case 11:
                return fni.c(((Long) obj2).longValue(), ((Long) obj).longValue());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return 0;
            case 13:
                return Long.compare(((jf2) obj).a, ((jf2) obj2).a);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                i = ((bud) obj2).f;
                i2 = ((bud) obj).f;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 16:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case LangUtils.HASH_SEED /* 17 */:
                ijb ijbVar = zq4.f;
                return 0;
            case 18:
                return Integer.compare(((iq4) ((List) obj).get(0)).X, ((iq4) ((List) obj2).get(0)).X);
            case 19:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i4 = 25;
                int i5 = 27;
                return aj3.g(xq4.d((xq4) Collections.max(list, new o00(i4)), (xq4) Collections.max(list2, new o00(i4)))).a(list.size(), list2.size()).c((xq4) Collections.max(list, new o00(i5)), (xq4) Collections.max(list2, new o00(i5)), new o00(i5)).f();
            case 20:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                int i6 = 26;
                int i7 = 28;
                return aj3.g(yq4.d((yq4) Collections.max(list3, new o00(i6)), (yq4) Collections.max(list4, new o00(i6)))).a(list3.size(), list4.size()).c((yq4) Collections.max(list3, new o00(i7)), (yq4) Collections.max(list4, new o00(i7)), new o00(i7)).f();
            case 21:
                return ((gq4) Collections.max((List) obj)).compareTo((gq4) Collections.max((List) obj2));
            case 22:
                return ((hq4) Collections.max((List) obj)).compareTo((hq4) Collections.max((List) obj2));
            case 23:
                return ((rq4) ((List) obj).get(0)).compareTo((rq4) ((List) obj2).get(0));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((sq4) ((List) obj).get(0)).compareTo((sq4) ((List) obj2).get(0));
            case 25:
                return xq4.d((xq4) obj, (xq4) obj2);
            case 26:
                return yq4.d((yq4) obj, (yq4) obj2);
            case 27:
                xq4 xq4Var = (xq4) obj;
                xq4 xq4Var2 = (xq4) obj2;
                boolean z = xq4Var.o;
                int i8 = xq4Var.s0;
                ijb ijbVarB = (z && xq4Var.Z) ? zq4.f : zq4.f.b();
                return cj3VarC.c(Integer.valueOf(i8), Integer.valueOf(xq4Var2.s0), xq4Var.X.F0 ? zq4.f.b() : zq4.g).c(Integer.valueOf(xq4Var.t0), Integer.valueOf(xq4Var2.t0), ijbVarB).c(Integer.valueOf(i8), Integer.valueOf(xq4Var2.s0), ijbVarB).f();
            case 28:
                yq4 yq4Var = (yq4) obj;
                yq4 yq4Var2 = (yq4) obj2;
                boolean z2 = yq4Var.o;
                int i9 = yq4Var.t0;
                ijb ijbVarB2 = (z2 && yq4Var.Z) ? ar4.k : ar4.k.b();
                if (yq4Var.X.B) {
                    cj3VarC = cj3VarC.c(Integer.valueOf(i9), Integer.valueOf(yq4Var2.t0), ar4.k.b());
                }
                return cj3VarC.c(Integer.valueOf(yq4Var.u0), Integer.valueOf(yq4Var2.u0), ijbVarB2).c(Integer.valueOf(i9), Integer.valueOf(yq4Var2.t0), ijbVarB2).f();
            default:
                return Long.compare(((xz4) obj).c, ((xz4) obj2).c);
        }
        return i - i2;
    }
}

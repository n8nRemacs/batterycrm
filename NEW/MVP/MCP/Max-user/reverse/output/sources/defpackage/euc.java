package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class euc implements uqa {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ euc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uqa
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((ju3) this.b).accept(obj);
                return;
            case 1:
                ((bhd) this.b).b.D((Boolean) obj);
                return;
            default:
                nb0 nb0Var = (nb0) obj;
                s1h s1hVar = (s1h) this.b;
                if (nb0Var == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                int i = nb0Var.a;
                if (s1hVar.v == 3) {
                    return;
                }
                gri.a("VideoCapture", "Stream info update: old: " + s1hVar.r + " new: " + nb0Var);
                nb0 nb0Var2 = s1hVar.r;
                s1hVar.r = nb0Var;
                ob0 ob0Var = s1hVar.g;
                ob0Var.getClass();
                int i2 = nb0Var2.a;
                Set set = nb0.e;
                if ((!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i)) && i2 != i) || (s1hVar.z && nb0Var2.c != null && nb0Var.c == null)) {
                    s1hVar.N();
                    return;
                }
                int i3 = nb0Var2.a;
                if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                    s1hVar.H(s1hVar.s, nb0Var, ob0Var);
                    Object[] objArr = {s1hVar.s.h()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    s1hVar.E(Collections.unmodifiableList(arrayList));
                    s1hVar.q();
                    return;
                }
                if (nb0Var2.b != nb0Var.b) {
                    s1hVar.H(s1hVar.s, nb0Var, ob0Var);
                    Object[] objArr2 = {s1hVar.s.h()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    s1hVar.E(Collections.unmodifiableList(arrayList2));
                    Iterator it = s1hVar.a.iterator();
                    while (it.hasNext()) {
                        ((twg) it.next()).h(s1hVar);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.uqa
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                gri.c("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                break;
            case 1:
                dy dyVar = ((bhd) this.b).b;
                dyVar.getClass();
                dyVar.D(new mb0(th));
                break;
            default:
                gri.j("VideoCapture", "Receive onError from StreamState observer", th);
                break;
        }
    }
}

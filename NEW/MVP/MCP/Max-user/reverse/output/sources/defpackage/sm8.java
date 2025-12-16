package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final /* synthetic */ class sm8 implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm8 b;

    public /* synthetic */ sm8(zm8 zm8Var, int i) {
        this.a = i;
        this.b = zm8Var;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                zm8 zm8Var = this.b;
                zm8Var.getClass();
                zm8Var.o = ((ym8) obj).b;
                break;
            default:
                zm8 zm8Var2 = this.b;
                Throwable th = (Throwable) obj;
                zm8Var2.getClass();
                wqi.b("zm8", "searchMessages: exception", th);
                ((y3b) zm8Var2.g).a(new IllegalStateException("searchMessages: exception", th));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // defpackage.tm6
    public Object apply(Object obj) {
        ?? arrayList;
        RuntimeException runtimeException;
        switch (this.a) {
            case 2:
                zm8 zm8Var = this.b;
                iqc iqcVar = (iqc) obj;
                List list = iqcVar.c;
                List list2 = zm8Var.o;
                gha ghaVar = o7e.b;
                list.removeAll((List) list.stream().filter(new m7e(list2, (List) list2.stream().filter(new kk8(21)).map(new xga(8)).collect(Collectors.toList()), (List) list2.stream().filter(new kk8(22)).map(new xga(9)).collect(Collectors.toList()), 1)).collect(Collectors.toList()));
                int i = iqcVar.d;
                Long l = iqcVar.o;
                iqc iqcVar2 = new iqc();
                iqcVar2.c = list;
                iqcVar2.d = i;
                iqcVar2.o = l;
                return iqcVar2;
            case 3:
                zm8 zm8Var2 = this.b;
                List list3 = (List) obj;
                if (list3 == null || list3.isEmpty()) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList(list3.size());
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        try {
                            qb2 qb2Var = ((jqc) it.next()).a;
                            if (qb2Var != null) {
                                arrayList.add(qb2Var);
                            }
                        } finally {
                        }
                    }
                }
                return new hs8(e2f.g(list3), q8j.b(new an8(zm8Var2, arrayList, null)));
            default:
                zm8 zm8Var3 = this.b;
                ay2 ay2Var = (ay2) obj;
                zm8Var3.getClass();
                List<gm9> list4 = ay2Var.c;
                ArrayList arrayList2 = new ArrayList(list4.size());
                for (gm9 gm9Var : list4) {
                    try {
                        arrayList2.add(u6e.c(gm9Var.b, gm9Var.a, gm9Var.c, gm9Var.d));
                    } finally {
                    }
                }
                String str = ay2Var.o;
                if (str == null || !str.equals("0")) {
                    zm8Var3.s = ay2Var.o;
                } else {
                    zm8Var3.s = null;
                }
                return arrayList2;
        }
    }
}

package org.joda.time.format;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.joda.time.format.r;

/* compiled from: ISOPeriodFormat.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static q f420850a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    public static q a() {
        r.i iVar;
        ArrayList arrayListSubList;
        if (f420850a == null) {
            r rVar = new r();
            r.e eVar = new r.e("P");
            rVar.a(eVar, eVar);
            rVar.b(0);
            rVar.c("Y");
            rVar.b(1);
            rVar.c("M");
            rVar.b(2);
            rVar.c("W");
            rVar.b(3);
            rVar.c("D");
            ArrayList arrayList = rVar.f420854a;
            if (arrayList.size() == 0) {
                r.e eVar2 = r.e.f420869b;
                r.i iVar2 = new r.i("T", "T", null, eVar2, eVar2, false);
                rVar.a(iVar2, iVar2);
            } else {
                int size = arrayList.size();
                while (true) {
                    int i12 = size - 1;
                    if (i12 < 0) {
                        iVar = null;
                        arrayListSubList = arrayList;
                        break;
                    }
                    if (arrayList.get(i12) instanceof r.i) {
                        iVar = (r.i) arrayList.get(i12);
                        arrayListSubList = arrayList.subList(size, arrayList.size());
                        break;
                    }
                    size -= 2;
                }
                if (iVar != null && arrayListSubList.size() == 0) {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
                Object[] objArrD = r.d(arrayListSubList);
                arrayListSubList.clear();
                r.i iVar3 = new r.i("T", "T", null, (t) objArrD[0], (s) objArrD[1], false);
                arrayListSubList.add(iVar3);
                arrayListSubList.add(iVar3);
            }
            rVar.b(4);
            rVar.c("H");
            rVar.b(5);
            rVar.c("M");
            rVar.b(9);
            rVar.c("S");
            q qVarE = r.e(rVar.f420854a, rVar.f420855b, rVar.f420856c);
            for (r.c cVar : rVar.f420857d) {
                if (cVar != null) {
                    r.c[] cVarArr = rVar.f420857d;
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    for (r.c cVar2 : cVarArr) {
                        if (cVar2 != null && !cVar.equals(cVar2)) {
                            hashSet.add(null);
                            hashSet2.add(cVar2.f420867e);
                        }
                    }
                    r.d dVar = cVar.f420867e;
                    if (dVar != null && dVar.f420868a == null) {
                        int length = Integer.MAX_VALUE;
                        String str = null;
                        for (String str2 : dVar.c()) {
                            if (str2.length() < length) {
                                length = str2.length();
                                str = str2;
                            }
                        }
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            r.f fVar = (r.f) it.next();
                            if (fVar != null) {
                                for (String str3 : fVar.c()) {
                                    if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                        hashSet3.add(str3);
                                    }
                                }
                            }
                        }
                        dVar.f420868a = (String[]) hashSet3.toArray(new String[hashSet3.size()]);
                    }
                }
            }
            rVar.f420857d = (r.c[]) rVar.f420857d.clone();
            f420850a = qVarE;
        }
        return f420850a;
    }
}

package kotlinx.datetime.internal.format.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Parser.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r {
    @Y61.k
    public static final <T> v<T> a(@Y61.k List<? extends v<? super T>> list) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        v vVar = new v(c42784z0, c42784z0);
        if (!list.isEmpty()) {
            ListIterator<? extends v<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                vVar = b(listIterator.previous(), vVar);
            }
        }
        return c(vVar, C42784z0.f406748b);
    }

    public static final <T> v<T> b(v<? super T> vVar, v<? super T> vVar2) {
        boolean zIsEmpty = vVar.f412585b.isEmpty();
        List<s<? super T>> list = vVar.f412584a;
        if (zIsEmpty) {
            return new v<>(C42745f0.h0(vVar2.f412584a, list), vVar2.f412585b);
        }
        List<v<? super T>> list2 = vVar.f412585b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((v) it.next(), vVar2));
        }
        return new v<>(list, arrayList);
    }

    public static final <T> v<T> c(v<? super T> vVar, List<E<T>> list) {
        v vVar2;
        List listSingletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        ArrayList arrayList3 = null;
        for (s<? super T> sVar : vVar.f412584a) {
            if (sVar instanceof k) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((k) sVar).f412568a);
                } else {
                    arrayList3 = new ArrayList(((k) sVar).f412568a);
                }
            } else if (sVar instanceof E) {
                arrayList2.add(sVar);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new k(arrayList3));
                    arrayList3 = null;
                }
                arrayList.add(sVar);
            }
        }
        List<v<? super T>> list2 = vVar.f412585b;
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            v vVarC = c((v) it.next(), arrayList2);
            if (vVarC.f412584a.isEmpty()) {
                Collection collectionSingletonList = vVarC.f412585b;
                if (collectionSingletonList.isEmpty()) {
                    collectionSingletonList = Collections.singletonList(vVarC);
                }
                listSingletonList = (List) collectionSingletonList;
            } else {
                listSingletonList = Collections.singletonList(vVarC);
            }
            C42745f0.h(listSingletonList, arrayList4);
        }
        boolean zIsEmpty = arrayList4.isEmpty();
        Collection collectionSingletonList2 = arrayList4;
        if (zIsEmpty) {
            collectionSingletonList2 = Collections.singletonList(new v(arrayList2, C42784z0.f406748b));
        }
        ArrayList arrayList5 = (List) collectionSingletonList2;
        if (arrayList3 == null) {
            return new v<>(arrayList, arrayList5);
        }
        ArrayList<v> arrayList6 = arrayList5;
        if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
            Iterator<T> it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) C42745f0.G(((v) it2.next()).f412584a);
                if (sVar2 != null && (sVar2 instanceof k)) {
                    ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList6, 10));
                    for (v vVar3 : arrayList6) {
                        s sVar3 = (s) C42745f0.G(vVar3.f412584a);
                        boolean z12 = sVar3 instanceof k;
                        Iterable iterable = vVar3.f412584a;
                        List<v<Output>> list3 = vVar3.f412585b;
                        if (z12) {
                            vVar2 = new v(C42745f0.h0(C42745f0.w(iterable, 1), Collections.singletonList(new k(C42745f0.h0(((k) sVar3).f412568a, arrayList3)))), list3);
                        } else if (sVar3 == null) {
                            vVar2 = new v(Collections.singletonList(new k(arrayList3)), list3);
                        } else {
                            vVar2 = new v(C42745f0.h0(iterable, Collections.singletonList(new k(arrayList3))), list3);
                        }
                        arrayList7.add(vVar2);
                    }
                    return new v<>(arrayList, arrayList7);
                }
            }
        }
        arrayList.add(new k(arrayList3));
        return new v<>(arrayList, arrayList5);
    }
}

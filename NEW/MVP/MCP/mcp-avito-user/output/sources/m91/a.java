package M91;

import O91.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import ru.mts.biometry.api.dataSource.j;
import ru.mts.biometry.api.dataSource.o;
import ru.mts.biometry.sdk.domain.entity.selector.d;
import ru.mts.biometry.sdk.domain.entity.selector.f;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f10430a;

    /* renamed from: b, reason: collision with root package name */
    public final o f10431b;

    public a(j jVar, o oVar) {
        this.f10430a = jVar;
        this.f10431b = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static l a() throws Exception {
        ArrayList arrayListB = b(((ru.mts.biometry.sdk.domain.entity.selector.b) C42745f0.D(c().f436416c.values())).f436410b, null);
        Collection collectionValues = c().f436416c.values();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionValues, 10));
        int i12 = 0;
        for (Object obj : collectionValues) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ru.mts.biometry.sdk.domain.entity.selector.b bVar = (ru.mts.biometry.sdk.domain.entity.selector.b) obj;
            arrayList.add(new c(bVar.f436410b, bVar.f436411c, i12 == 0));
            i12 = i13;
        }
        return new l(arrayListB, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
    public static ArrayList b(String str, b bVar) throws Exception {
        ArrayList arrayList;
        Object obj;
        List list = (List) c().f436417d.get(str);
        if (list == null) {
            f fVarC = c();
            arrayList = new ArrayList();
            for (Object obj2 : fVarC.f436415b) {
                if (((d) obj2).f436414d.contains(str)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            f fVarC2 = c();
            arrayList = new ArrayList();
            for (Object obj3 : fVarC2.f436415b) {
                if (list.contains(((d) obj3).f436412b)) {
                    arrayList.add(obj3);
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((d) it.next()).f436412b, bVar != null ? bVar.f10432a : null)) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            i12 = 0;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        int i13 = 0;
        for (Object obj4 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            d dVar = (d) obj4;
            arrayList2.add(new b(dVar.f436412b, dVar.f436413c, i13 == i12));
            i13 = i14;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (L.f(((b) next).f10432a, "_any_")) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (L.f(((b) next2).f10432a, "_any_")) {
                arrayList3.add(next2);
            }
        }
        return arrayList3;
    }

    public static f c() throws Exception {
        f fVar;
        E91.a aVar = C91.a.f2018e.f3821g;
        if (aVar == null || (fVar = aVar.f3814f) == null) {
            throw new Exception("Bad config");
        }
        return fVar;
    }
}

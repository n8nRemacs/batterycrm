package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItemInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/m;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/l;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f299534a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f299535b = new ArrayList();

    @Inject
    public m() {
    }

    public static boolean g(List list) {
        List<com.avito.conveyor_item.a> list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            d dVar = aVar instanceof d ? (d) aVar : null;
            if (dVar != null && !dVar.getF299463e()) {
                return true;
            }
            if ((aVar instanceof d.a) && (list2 = ((d.a) aVar).f299473o) != null) {
                g(list2);
            }
        }
        return false;
    }

    public static void h(ArrayList arrayList, d dVar) {
        int i12 = 0;
        if (L.f(dVar.getF299464f(), Boolean.TRUE)) {
            int i13 = 0;
            for (Object obj : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
                if (aVar instanceof d.b) {
                    arrayList.set(i13, d.b.Q((d.b) aVar, dVar.a()));
                } else if (aVar instanceof d.a) {
                    d.a aVar2 = (d.a) aVar;
                    arrayList.set(i13, d.a.Q(aVar2, dVar.a(), false, 2043));
                    List<com.avito.conveyor_item.a> list = aVar2.f299473o;
                    if (list != null) {
                        i(list, dVar);
                    }
                }
                i13 = i14;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) it.next();
            if ((aVar3 instanceof d.b) && L.f(((d.b) aVar3).f299482m, Boolean.TRUE)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        d.b bVar = (d.b) arrayList.get(i12);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof d) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2.getF299461c() != State.f181147b && !L.f(dVar2.getF299464f(), Boolean.TRUE)) {
                    arrayList.set(i12, d.b.Q(bVar, State.f181148c));
                    return;
                }
            }
        }
        arrayList.set(i12, d.b.Q(bVar, State.f181147b));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(java.util.List r6, com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d r7) {
        /*
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L3e
            com.avito.conveyor_item.a r2 = (com.avito.conveyor_item.a) r2
            boolean r4 = r2 instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b
            if (r4 == 0) goto L2f
            r4 = r2
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b r4 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b) r4
            boolean r5 = r4.f299481l
            if (r5 == 0) goto L2f
            com.avito.android.lib.design.toggle.State r2 = r7.a()
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b r2 = com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b.Q(r4, r2)
            r6.set(r1, r2)
            goto L3c
        L2f:
            boolean r1 = r2 instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.a
            if (r1 == 0) goto L3c
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$a r2 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.a) r2
            java.util.List<com.avito.conveyor_item.a> r1 = r2.f299473o
            if (r1 == 0) goto L3c
            i(r1, r7)
        L3c:
            r1 = r3
            goto L8
        L3e:
            kotlin.collections.C42745f0.H0()
            r6 = 0
            throw r6
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_lf_constructor.configure.checkbox_selector.m.i(java.util.List, com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d):void");
    }

    public static void k(List list, State state) {
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (aVar instanceof d.a) {
                d.a aVar2 = (d.a) aVar;
                list.set(i12, d.a.Q(aVar2, state, false, 2043));
                List<com.avito.conveyor_item.a> list2 = aVar2.f299473o;
                if (list2 != null) {
                    k(list2, state);
                }
            } else if (aVar instanceof d.b) {
                d.b bVar = (d.b) aVar;
                if (bVar.f299481l) {
                    list.set(i12, d.b.Q(bVar, state));
                }
            }
            i12 = i13;
        }
    }

    public static void m(List list, d.a aVar) {
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj;
            if (aVar2 instanceof d.a) {
                if (L.f(((d.a) aVar2).f299465g, aVar.f299465g)) {
                    list.set(i12, d.a.Q((d.a) aVar2, null, !aVar.f299474p, 1535));
                } else {
                    List<com.avito.conveyor_item.a> list2 = ((d.a) aVar2).f299473o;
                    if (list2 != null) {
                        m(list2, aVar);
                    }
                }
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(java.util.List r7, com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b r8) {
        /*
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L4b
            com.avito.conveyor_item.a r2 = (com.avito.conveyor_item.a) r2
            boolean r4 = r2 instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b
            if (r4 == 0) goto L3c
            r4 = r2
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b r4 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b) r4
            boolean r5 = r4.f299481l
            if (r5 == 0) goto L3c
            r5 = r2
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b r5 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b) r5
            java.lang.String r5 = r5.f299476g
            java.lang.String r6 = r8.f299476g
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto L3c
            com.avito.android.lib.design.toggle.State r2 = r4.a()
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b r2 = com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.b.Q(r4, r2)
            r7.set(r1, r2)
            goto L49
        L3c:
            boolean r1 = r2 instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.a
            if (r1 == 0) goto L49
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$a r2 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d.a) r2
            java.util.List<com.avito.conveyor_item.a> r1 = r2.f299473o
            if (r1 == 0) goto L49
            n(r1, r8)
        L49:
            r1 = r3
            goto L8
        L4b:
            kotlin.collections.C42745f0.H0()
            r7 = 0
            throw r7
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_lf_constructor.configure.checkbox_selector.m.n(java.util.List, com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d$b):void");
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l
    public final int a(@Y61.l Integer num) {
        return (num != null && num.intValue() == 2) ? y6.b(54) : (num != null && num.intValue() == 3) ? y6.b(92) : (num != null && num.intValue() == 4) ? y6.b(130) : y6.b(16);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l
    @Y61.k
    public final ArrayList b(@Y61.k d.a aVar) {
        ArrayList arrayList = this.f299534a;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) next;
            if (aVar2 instanceof d.a) {
                if (L.f(((d.a) aVar2).f299465g, aVar.f299465g)) {
                    arrayList.set(i12, d.a.Q((d.a) aVar2, null, !aVar.f299474p, 1535));
                } else {
                    List<com.avito.conveyor_item.a> list = ((d.a) aVar2).f299473o;
                    if (list != null) {
                        m(list, aVar);
                    }
                }
            }
            i12 = i13;
        }
        ArrayList arrayList2 = this.f299535b;
        arrayList2.clear();
        l(arrayList);
        return arrayList2;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l
    @Y61.k
    public final ArrayList c(@Y61.k d.b bVar) {
        ArrayList arrayList = this.f299534a;
        n(arrayList, bVar);
        if (bVar.f299479j != null) {
            j(arrayList);
        }
        h(arrayList, bVar);
        ArrayList arrayList2 = this.f299535b;
        arrayList2.clear();
        l(arrayList);
        return arrayList2;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l
    @Y61.k
    public final ArrayList d(@Y61.k List list) {
        ArrayList arrayList = this.f299534a;
        arrayList.clear();
        arrayList.addAll(list);
        ArrayList arrayList2 = this.f299535b;
        arrayList2.clear();
        j(arrayList);
        l(arrayList);
        return arrayList2;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l
    @Y61.k
    public final ArrayList e(@Y61.k d.a aVar) {
        ArrayList arrayList = this.f299534a;
        f(arrayList, aVar);
        h(arrayList, aVar);
        ArrayList arrayList2 = this.f299535b;
        arrayList2.clear();
        l(arrayList);
        return arrayList2;
    }

    public final void f(List<com.avito.conveyor_item.a> list, d.a aVar) {
        State stateA;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj;
            if (aVar2 instanceof d.a) {
                if (L.f(((d.a) aVar2).f299465g, aVar.f299465g)) {
                    if (g(list)) {
                        State state = ((d.a) aVar2).f299467i;
                        if (state == State.f181149d || state == (stateA = State.f181147b)) {
                            stateA = State.f181148c;
                        }
                    } else {
                        stateA = ((d.a) aVar2).a();
                    }
                    d.a aVar3 = (d.a) aVar2;
                    list.set(i12, d.a.Q(aVar3, stateA, false, 2043));
                    List<com.avito.conveyor_item.a> list2 = aVar3.f299473o;
                    if (list2 != null) {
                        k(list2, stateA);
                    }
                    j(this.f299534a);
                } else {
                    List<com.avito.conveyor_item.a> list3 = ((d.a) aVar2).f299473o;
                    if (list3 != null) {
                        f(list3, aVar);
                    }
                }
            }
            i12 = i13;
        }
    }

    public final void j(List<? extends com.avito.conveyor_item.a> list) {
        State state;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof d.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d.a aVar = (d.a) it.next();
            List<com.avito.conveyor_item.a> list2 = aVar.f299473o;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof d) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((d) next).getF299461c() != State.f181148c) {
                        arrayList3.add(next);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                int i12 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        state = i12 == list2.size() ? State.f181147b : i12 == 0 ? State.f181148c : State.f181149d;
                    } else {
                        if (((d) it3.next()).getF299461c() != State.f181147b) {
                            state = State.f181149d;
                            break;
                        }
                        i12++;
                    }
                }
                if (aVar.f299467i != state) {
                    aVar.f299467i = state;
                    j(this.f299534a);
                } else {
                    j(list2);
                }
            }
        }
    }

    public final void l(List<? extends com.avito.conveyor_item.a> list) {
        List<com.avito.conveyor_item.a> list2;
        for (com.avito.conveyor_item.a aVar : list) {
            this.f299535b.add(aVar);
            if (aVar instanceof d.a) {
                d.a aVar2 = (d.a) aVar;
                if (aVar2.f299474p && (list2 = aVar2.f299473o) != null) {
                    l(list2);
                }
            }
        }
    }
}

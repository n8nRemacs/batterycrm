package com.avito.android.select.bottom_sheet.blueprints.group;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.category_parameters.GroupSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItemInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/f;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/e;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f265105a = new ArrayList();

    @Inject
    public f() {
    }

    public static State g(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((com.avito.android.select.variant.a) it.next()).f266842j) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((com.avito.android.select.variant.a) it2.next()).f266842j) {
                                return State.f181149d;
                            }
                        }
                    }
                    return State.f181148c;
                }
            }
        }
        return State.f181147b;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ArrayList getF265105a() {
        return this.f265105a;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    @Y61.k
    public final ArrayList b(@Y61.k a aVar, @Y61.k Y41.p pVar, boolean z12) throws Throwable {
        State state;
        ArrayList<com.avito.android.select.variant.a> arrayList;
        Throwable th2;
        ArrayList arrayList2 = new ArrayList(this.f265105a);
        Iterator it = arrayList2.iterator();
        boolean z13 = false;
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            Throwable th3 = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) next;
            if (L.f(aVar2.getF266834b(), aVar.f265089b) && (aVar2 instanceof a)) {
                a aVar3 = (a) aVar2;
                State state2 = aVar3.f265094g;
                int iOrdinal = state2.ordinal();
                if (iOrdinal == 0) {
                    state = State.f181148c;
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    state = State.f181147b;
                }
                int iOrdinal2 = state2.ordinal();
                List<com.avito.android.select.variant.a> list = aVar3.f265091d;
                if (iOrdinal2 == 0) {
                    List<com.avito.android.select.variant.a> list2 = list;
                    arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(com.avito.android.select.variant.a.a((com.avito.android.select.variant.a) it2.next(), null, z13, 524031));
                    }
                } else {
                    if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<com.avito.android.select.variant.a> list3 = list;
                    arrayList = new ArrayList(C42745f0.q(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(com.avito.android.select.variant.a.a((com.avito.android.select.variant.a) it3.next(), null, true, 524031));
                    }
                }
                arrayList2.set(i12, a.a(aVar3, arrayList, z13, state, 27));
                if (z12) {
                    for (com.avito.android.select.variant.a aVar4 : arrayList) {
                        Iterator it4 = arrayList2.iterator();
                        int i14 = z13 ? 1 : 0;
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                Throwable th4 = th3;
                                C42745f0.H0();
                                throw th4;
                            }
                            com.avito.conveyor_item.a aVar5 = (com.avito.conveyor_item.a) next2;
                            if (aVar5 instanceof com.avito.android.select.variant.a) {
                                com.avito.android.select.variant.a aVar6 = (com.avito.android.select.variant.a) aVar5;
                                if (aVar6.f266846n || !L.f(((com.avito.android.select.variant.a) aVar5).f266834b, aVar4.f266834b)) {
                                    th2 = null;
                                } else {
                                    th2 = null;
                                    arrayList2.set(i14, com.avito.android.select.variant.a.a(aVar6, null, aVar4.f266842j, 524031));
                                }
                            } else {
                                th2 = th3;
                            }
                            th3 = th2;
                            i14 = i15;
                            z13 = false;
                        }
                    }
                }
                pVar.invoke(state, arrayList);
            }
            i12 = i13;
            z13 = false;
        }
        return arrayList2;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    public final void c(@Y61.k List<? extends com.avito.conveyor_item.a> list) {
        ArrayList arrayList = this.f265105a;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    @Y61.k
    public final a d(@Y61.k GroupSection groupSection, boolean z12, @Y61.k ArrayList arrayList) {
        return new a(String.valueOf(groupSection.hashCode()), groupSection.getF265546c(), arrayList, false, z12, g(arrayList));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    @Y61.k
    public final ArrayList e(@Y61.k a aVar) {
        ArrayList arrayList = new ArrayList(this.f265105a);
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
            if ((aVar2 instanceof a) && L.f(((a) aVar2).f265089b, aVar.f265089b)) {
                arrayList.set(i12, a.a((a) aVar2, null, !aVar.f265092e, null, 55));
            }
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.e
    @Y61.k
    public final ArrayList f(@Y61.k com.avito.android.select.variant.a aVar) {
        String str;
        boolean z12;
        ArrayList arrayList = new ArrayList(this.f265105a);
        Iterator it = arrayList.iterator();
        int i12 = 0;
        loop0: while (true) {
            boolean zHasNext = it.hasNext();
            str = aVar.f266834b;
            if (!zHasNext) {
                i12 = -1;
                break;
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
            if (aVar2 instanceof a) {
                List<com.avito.android.select.variant.a> list = ((a) aVar2).f265091d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (L.f(((com.avito.android.select.variant.a) it2.next()).f266834b, str)) {
                            break loop0;
                        }
                    }
                }
            }
            i12++;
        }
        if (i12 == -1) {
            return arrayList;
        }
        a aVar3 = (a) arrayList.get(i12);
        List<com.avito.android.select.variant.a> list2 = aVar3.f265091d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (true) {
            boolean zHasNext2 = it3.hasNext();
            z12 = aVar.f266846n;
            if (!zHasNext2) {
                break;
            }
            com.avito.android.select.variant.a aVarA = (com.avito.android.select.variant.a) it3.next();
            if (!z12 && L.f(str, aVarA.f266834b)) {
                aVarA = com.avito.android.select.variant.a.a(aVarA, null, aVar.f266842j, 524031);
            }
            arrayList2.add(aVarA);
        }
        if (z12) {
            Iterator it4 = arrayList.iterator();
            int i13 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.conveyor_item.a aVar4 = (com.avito.conveyor_item.a) next;
                if (aVar4 instanceof com.avito.android.select.variant.a) {
                    com.avito.android.select.variant.a aVar5 = (com.avito.android.select.variant.a) aVar4;
                    if (!aVar5.f266846n && L.f(((com.avito.android.select.variant.a) aVar4).f266834b, str)) {
                        arrayList.set(i13, com.avito.android.select.variant.a.a(aVar5, null, aVar.f266842j, 524031));
                    }
                }
                i13 = i14;
            }
        }
        arrayList.set(i12, a.a(aVar3, arrayList2, false, g(arrayList2), 27));
        return arrayList;
    }
}

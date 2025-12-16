package e10;

import KZ.C14285o;
import Y61.k;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.list.items.bank.f;
import com.avito.android.mortgage.root.list.items.legacy_status.c;
import g10.C40511a;
import g10.C40513c;
import g10.InterfaceC40512b;
import g10.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le10/b;", "Le10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39844b implements InterfaceC39843a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.root.mvi.mapper.a f394261a;

    @Inject
    public C39844b(@k com.avito.android.mortgage.root.mvi.mapper.a aVar) {
        this.f394261a = aVar;
    }

    public static d.a c(d.a aVar) {
        List<InterfaceC19665b> list = aVar.f396257b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC19665b interfaceC19665bN = (InterfaceC19665b) it.next();
            InterfaceC19664a interfaceC19664a = interfaceC19665bN instanceof InterfaceC19664a ? (InterfaceC19664a) interfaceC19665bN : null;
            if (interfaceC19664a != null) {
                interfaceC19665bN = interfaceC19664a.N();
            }
            arrayList.add(interfaceC19665bN);
        }
        C40511a c40511a = aVar.f396258c;
        return d.a.a(aVar, arrayList, c40511a != null ? C40511a.a(c40511a, null, 15) : null, 1);
    }

    @Override // e10.InterfaceC39843a
    @k
    public final C40513c a(@k C40513c c40513c) {
        d dVarB;
        d bVar;
        InterfaceC40512b interfaceC40512b = c40513c.f396254j;
        if (interfaceC40512b instanceof InterfaceC40512b.d) {
            dVarB = d.c.f396261a;
        } else {
            if (interfaceC40512b instanceof InterfaceC40512b.c) {
                bVar = new d.b(((InterfaceC40512b.c) interfaceC40512b).f396238a);
                return C40513c.a(c40513c, null, null, null, null, null, null, false, false, null, bVar, 511);
            }
            if (interfaceC40512b instanceof InterfaceC40512b.g) {
                d.a aVarC = c(b(c40513c));
                List<InterfaceC19665b> list = aVarC.f396257b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (com.avito.conveyor_item.a aVarA : list) {
                    if (aVarA instanceof com.avito.android.mortgage.root.list.items.legacy_status.d) {
                        com.avito.android.mortgage.root.list.items.legacy_status.d dVar = (com.avito.android.mortgage.root.list.items.legacy_status.d) aVarA;
                        com.avito.android.mortgage.root.list.items.legacy_status.c cVar = dVar.f202668c;
                        if (cVar instanceof c.a) {
                            c.a aVar = (c.a) cVar;
                            aVarA = com.avito.android.mortgage.root.list.items.legacy_status.d.a(dVar, new c.a(aVar.f202659a, aVar.f202660b, true), 5);
                        }
                    }
                    arrayList.add(aVarA);
                }
                dVarB = d.a.a(aVarC, arrayList, null, 5);
            } else if (interfaceC40512b instanceof InterfaceC40512b.e) {
                d.a aVarC2 = c(b(c40513c));
                ApplicationProcessType applicationProcessType = ((InterfaceC40512b.e) interfaceC40512b).f396240a;
                C40511a c40511a = aVarC2.f396258c;
                C40511a c40511aA = c40511a != null ? C40511a.a(c40511a, applicationProcessType, 27) : null;
                List<InterfaceC19665b> list2 = aVarC2.f396257b;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (com.avito.conveyor_item.a aVarA2 : list2) {
                    if (aVarA2 instanceof com.avito.android.mortgage.root.list.items.navigation.c) {
                        aVarA2 = com.avito.android.mortgage.root.list.items.navigation.c.a((com.avito.android.mortgage.root.list.items.navigation.c) aVarA2, applicationProcessType, 55);
                    }
                    arrayList2.add(aVarA2);
                }
                dVarB = d.a.a(aVarC2, arrayList2, c40511aA, 1);
            } else if (interfaceC40512b instanceof InterfaceC40512b.C11183b) {
                d.a aVarC3 = c(b(c40513c));
                List<InterfaceC19665b> list3 = aVarC3.f396257b;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                for (com.avito.conveyor_item.a aVarA3 : list3) {
                    if (aVarA3 instanceof com.avito.android.mortgage.root.list.items.borrower_add.c) {
                        aVarA3 = com.avito.android.mortgage.root.list.items.borrower_add.c.a((com.avito.android.mortgage.root.list.items.borrower_add.c) aVarA3, 23);
                    }
                    arrayList3.add(aVarA3);
                }
                dVarB = d.a.a(aVarC3, arrayList3, null, 5);
            } else if (interfaceC40512b instanceof InterfaceC40512b.f) {
                d.a aVarC4 = c(b(c40513c));
                String str = ((InterfaceC40512b.f) interfaceC40512b).f396241a;
                List<InterfaceC19665b> list4 = aVarC4.f396257b;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(list4, 10));
                for (com.avito.conveyor_item.a aVarA4 : list4) {
                    if ((aVarA4 instanceof com.avito.android.mortgage.root.list.items.bank.c) && L.f(((com.avito.android.mortgage.root.list.items.bank.c) aVarA4).f202303b, str)) {
                        com.avito.android.mortgage.root.list.items.bank.c cVar2 = (com.avito.android.mortgage.root.list.items.bank.c) aVarA4;
                        com.avito.android.mortgage.root.list.items.bank.d dVar2 = cVar2.f202311j;
                        aVarA4 = com.avito.android.mortgage.root.list.items.bank.c.a(cVar2, null, dVar2 != null ? new com.avito.android.mortgage.root.list.items.bank.d(dVar2.f202314a, true) : null, 1791);
                    }
                    arrayList4.add(aVarA4);
                }
                dVarB = d.a.a(aVarC4, arrayList4, null, 5);
            } else if (interfaceC40512b instanceof InterfaceC40512b.h) {
                d.a aVarC5 = c(b(c40513c));
                String str2 = ((InterfaceC40512b.h) interfaceC40512b).f396243a;
                List<InterfaceC19665b> list5 = aVarC5.f396257b;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list5, 10));
                for (com.avito.conveyor_item.a aVarA5 : list5) {
                    if ((aVarA5 instanceof com.avito.android.mortgage.root.list.items.bank.c) && L.f(((com.avito.android.mortgage.root.list.items.bank.c) aVarA5).f202303b, str2)) {
                        com.avito.android.mortgage.root.list.items.bank.c cVar3 = (com.avito.android.mortgage.root.list.items.bank.c) aVarA5;
                        f fVar = cVar3.f202309h;
                        aVarA5 = com.avito.android.mortgage.root.list.items.bank.c.a(cVar3, fVar != null ? new f(fVar.f202355a, fVar.f202356b, true) : null, null, 1983);
                    }
                    arrayList5.add(aVarA5);
                }
                dVarB = d.a.a(aVarC5, arrayList5, null, 5);
            } else {
                if (!(interfaceC40512b instanceof InterfaceC40512b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVarB = b(c40513c);
            }
        }
        bVar = dVarB;
        return C40513c.a(c40513c, null, null, null, null, null, null, false, false, null, bVar, 511);
    }

    public final d.a b(C40513c c40513c) {
        JZ.c cVar = c40513c.f396247c;
        if (cVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<C14285o> list = c40513c.f396248d;
        return new d.a(cVar, this.f394261a.a(c40513c.f396251g, list), c40513c.f396250f);
    }
}

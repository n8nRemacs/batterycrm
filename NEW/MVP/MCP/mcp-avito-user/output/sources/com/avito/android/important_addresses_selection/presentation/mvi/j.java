package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "LSM/c;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<ImportantAddressesSelectionInternalAction, SM.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f169894b;

    @Inject
    public j(@Y61.k n nVar) {
        this.f169894b = nVar;
    }

    public static ArrayList b(int i12, List list) {
        ArrayList arrayList;
        List<ImportantAddressesSelectionData.Address> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((ImportantAddressesSelectionData.Address) obj).f169779e) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() >= i12) {
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (ImportantAddressesSelectionData.Address address : list2) {
                arrayList.add(ImportantAddressesSelectionData.Address.a(address, false, address.f169779e, 15));
            }
        } else {
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ImportantAddressesSelectionData.Address.a((ImportantAddressesSelectionData.Address) it.next(), false, true, 15));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SM.c a(@Y61.k ImportantAddressesSelectionInternalAction importantAddressesSelectionInternalAction, @Y61.k SM.c cVar) {
        Object next;
        boolean z12 = importantAddressesSelectionInternalAction instanceof ImportantAddressesSelectionInternalAction.InitState;
        n nVar = this.f169894b;
        if (z12) {
            ImportantAddressesSelectionData importantAddressesSelectionData = ((ImportantAddressesSelectionInternalAction.InitState) importantAddressesSelectionInternalAction).f169884b;
            return nVar.a(SM.c.a(cVar, ImportantAddressesSelectionData.a(importantAddressesSelectionData, b(importantAddressesSelectionData.f169763e, importantAddressesSelectionData.f169762d)), null, 2));
        }
        if (!(importantAddressesSelectionInternalAction instanceof ImportantAddressesSelectionInternalAction.UpdateAddressCheckedMark)) {
            return cVar;
        }
        ImportantAddressesSelectionInternalAction.UpdateAddressCheckedMark updateAddressCheckedMark = (ImportantAddressesSelectionInternalAction.UpdateAddressCheckedMark) importantAddressesSelectionInternalAction;
        ImportantAddressesSelectionData importantAddressesSelectionData2 = cVar.f14930b;
        ?? r42 = importantAddressesSelectionData2.f169762d;
        Iterator it = ((Iterable) r42).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ImportantAddressesSelectionData.Address) next).f169776b == updateAddressCheckedMark.f169886b) {
                break;
            }
        }
        ImportantAddressesSelectionData.Address address = (ImportantAddressesSelectionData.Address) next;
        if (address != null) {
            int iIndexOf = r42.indexOf(address);
            ImportantAddressesSelectionData.Address addressA = ImportantAddressesSelectionData.Address.a(address, updateAddressCheckedMark.f169887c, false, 23);
            ArrayList arrayList = new ArrayList((Collection) r42);
            arrayList.set(iIndexOf, addressA);
            cVar = SM.c.a(cVar, ImportantAddressesSelectionData.a(cVar.f14930b, b(importantAddressesSelectionData2.f169763e, arrayList)), null, 2);
        }
        return nVar.a(cVar);
    }
}

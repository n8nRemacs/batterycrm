package com.avito.android.important_addresses_selection.presentation.mvi;

import SM.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImportantAddressesSelectionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LSM/a;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "LSM/c;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<SM.a, ImportantAddressesSelectionInternalAction, SM.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PM.a f169871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImportantAddressesSelectionData f169872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RM.d f169873c;

    @Inject
    public b(@Y61.k PM.a aVar, @Y61.k ImportantAddressesSelectionData importantAddressesSelectionData, @Y61.k RM.d dVar) {
        this.f169871a = aVar;
        this.f169872b = importantAddressesSelectionData;
        this.f169873c = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImportantAddressesSelectionInternalAction> b(SM.a aVar, SM.c cVar) {
        SM.a aVar2 = aVar;
        SM.c cVar2 = cVar;
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(this, cVar2, null));
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            return new C43210w(new ImportantAddressesSelectionInternalAction.UpdateAddressCheckedMark(bVar.f14919a, bVar.f14920b));
        }
        if (aVar2 instanceof a.C1007a) {
            return new C43210w(new ImportantAddressesSelectionInternalAction.FollowDeepLink(((a.C1007a) aVar2).f14918a));
        }
        throw new NoWhenBranchMatchedException();
    }
}

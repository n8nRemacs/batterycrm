package com.avito.android.auto_contacts.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ze.InterfaceC50551a;

/* compiled from: AutoContactsPackagesActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lze/a;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC50551a, AutoContactsPackagesInternalAction, AutoContactsPackagesUiState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_contacts.domain.b f94937a;

    @Inject
    public b(@Y61.k com.avito.android.auto_contacts.domain.b bVar) {
        this.f94937a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutoContactsPackagesInternalAction> b(InterfaceC50551a interfaceC50551a, AutoContactsPackagesUiState autoContactsPackagesUiState) {
        InterfaceC50551a interfaceC50551a2 = interfaceC50551a;
        if (interfaceC50551a2 instanceof InterfaceC50551a.b) {
            return new C43210w(new AutoContactsPackagesInternalAction.BuyMoreButtonClicked(((InterfaceC50551a.b) interfaceC50551a2).f444105a));
        }
        if (interfaceC50551a2.equals(InterfaceC50551a.C12959a.f444104a)) {
            return new C43210w(AutoContactsPackagesInternalAction.BackArrowClicked.f94949b);
        }
        if (interfaceC50551a2.equals(InterfaceC50551a.c.f444106a)) {
            return C43175k.G(new a(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

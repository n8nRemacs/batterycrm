package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import androidx.compose.runtime.internal.P;
import b10.InterfaceC25386a;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity.ImmutableInfoDescriptionInternalAction;
import d10.C39483c;
import d10.InterfaceC39481a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImmutableInfoDescriptionActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ld10/a;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "Ld10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39481a, ImmutableInfoDescriptionInternalAction, C39483c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25386a f202609a;

    @Inject
    public a(@Y61.k InterfaceC25386a interfaceC25386a) {
        this.f202609a = interfaceC25386a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImmutableInfoDescriptionInternalAction> b(InterfaceC39481a interfaceC39481a, C39483c c39483c) {
        InterfaceC39481a interfaceC39481a2 = interfaceC39481a;
        C39483c c39483c2 = c39483c;
        if (!(interfaceC39481a2 instanceof InterfaceC39481a.C11006a)) {
            if (interfaceC39481a2 instanceof InterfaceC39481a.b) {
                return new C43210w(new ImmutableInfoDescriptionInternalAction.SelectTab(((InterfaceC39481a.b) interfaceC39481a2).f393615a));
            }
            throw new NoWhenBranchMatchedException();
        }
        String applicantType = c39483c2.f393623g.getApplicantType();
        this.f202609a.a(c39483c2.f393620d, c39483c2.f393621e, applicantType);
        return new C43210w(ImmutableInfoDescriptionInternalAction.Close.f202620b);
    }
}

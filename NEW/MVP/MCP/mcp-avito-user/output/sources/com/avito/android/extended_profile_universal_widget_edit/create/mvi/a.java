package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity.UniversalWidgetCreateInternalAction;
import hB.C40800c;
import hB.InterfaceC40798a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalWidgetCreateActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LhB/a;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "LhB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40798a, UniversalWidgetCreateInternalAction, C40800c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.create.interactor.a f153752a;

    @Inject
    public a(@Y61.k com.avito.android.extended_profile_universal_widget_edit.create.interactor.a aVar) {
        this.f153752a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UniversalWidgetCreateInternalAction> b(InterfaceC40798a interfaceC40798a, C40800c c40800c) {
        InterfaceC40798a interfaceC40798a2 = interfaceC40798a;
        if (interfaceC40798a2 instanceof InterfaceC40798a.C11245a) {
            return new C43210w(UniversalWidgetCreateInternalAction.Close.f153759b);
        }
        if (interfaceC40798a2 instanceof InterfaceC40798a.b) {
            return this.f153752a.a(((InterfaceC40798a.b) interfaceC40798a2).f397093a);
        }
        throw new NoWhenBranchMatchedException();
    }
}

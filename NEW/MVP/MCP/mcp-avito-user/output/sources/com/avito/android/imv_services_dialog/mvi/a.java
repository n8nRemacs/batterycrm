package com.avito.android.imv_services_dialog.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.imv_services_dialog.mvi.entity.ImvServicesDialogInternalAction;
import com.avito.android.remote.model.imv_services.ImvServicesFeedback;
import jN.C42288c;
import jN.InterfaceC42286a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mN.InterfaceC43983a;

/* compiled from: ImvServicesDialogActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LjN/a;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "LjN/c;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42286a, ImvServicesDialogInternalAction, C42288c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43983a f170788a;

    @Inject
    public a(@Y61.k InterfaceC43983a interfaceC43983a) {
        this.f170788a = interfaceC43983a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImvServicesDialogInternalAction> b(InterfaceC42286a interfaceC42286a, C42288c c42288c) {
        InterfaceC42286a interfaceC42286a2 = interfaceC42286a;
        boolean z12 = interfaceC42286a2 instanceof InterfaceC42286a.b;
        InterfaceC43983a interfaceC43983a = this.f170788a;
        if (z12) {
            InterfaceC42286a.b bVar = (InterfaceC42286a.b) interfaceC42286a2;
            ImvServicesFeedback imvServicesFeedback = bVar.f405592d;
            interfaceC43983a.a(imvServicesFeedback, bVar.f405591c, bVar.f405589a, bVar.f405590b);
            return new C43207v(new ImvServicesDialogInternalAction[]{new ImvServicesDialogInternalAction.ChangeFeedbackContainerVisibility(), new ImvServicesDialogInternalAction.ShowToastMessage(imvServicesFeedback != null ? imvServicesFeedback.getToolTipText() : null)});
        }
        if (!(interfaceC42286a2 instanceof InterfaceC42286a.C11562a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC42286a.C11562a c11562a = (InterfaceC42286a.C11562a) interfaceC42286a2;
        interfaceC43983a.a(c11562a.f405588d, c11562a.f405587c, c11562a.f405585a, c11562a.f405586b);
        return new C43210w(new ImvServicesDialogInternalAction.ChangeFeedbackContainerVisibility());
    }
}

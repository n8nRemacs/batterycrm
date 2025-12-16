package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import jC.InterfaceC42231a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mC.InterfaceC43943a;
import mC.InterfaceC43944b;

/* compiled from: FakeDoorDialogActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fakedoor_dialog/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LmC/a;", "LmC/b;", "LmC/d;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC43943a, InterfaceC43944b, mC.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FakeDoorDialogParams f155127a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42231a f155128b;

    @Inject
    public b(@Y61.k FakeDoorDialogParams fakeDoorDialogParams, @Y61.k InterfaceC42231a interfaceC42231a) {
        this.f155127a = fakeDoorDialogParams;
        this.f155128b = interfaceC42231a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC43944b> b(InterfaceC43943a interfaceC43943a, mC.d dVar) {
        InterfaceC43943a interfaceC43943a2 = interfaceC43943a;
        mC.d dVar2 = dVar;
        boolean z12 = interfaceC43943a2 instanceof InterfaceC43943a.b;
        InterfaceC42231a interfaceC42231a = this.f155128b;
        FakeDoorDialogParams fakeDoorDialogParams = this.f155127a;
        if (z12) {
            if (dVar2.f414396b != C42745f0.J(fakeDoorDialogParams.f155102d)) {
                interfaceC42231a.b(fakeDoorDialogParams.f155100b, fakeDoorDialogParams.f155103e);
            }
            return C43175k.w();
        }
        if (!(interfaceC43943a2 instanceof InterfaceC43943a.C11817a)) {
            throw new NoWhenBranchMatchedException();
        }
        FakeDoorDialogLink.DialogButton dialogButton = dVar2.f414398d.c().get(((InterfaceC43943a.C11817a) interfaceC43943a2).f414390a);
        interfaceC42231a.a(fakeDoorDialogParams.f155100b, dialogButton.getText(), fakeDoorDialogParams.f155103e);
        return C43175k.G(new a(dVar2, this, dialogButton, null));
    }
}

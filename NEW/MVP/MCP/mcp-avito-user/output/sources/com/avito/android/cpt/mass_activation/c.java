package com.avito.android.cpt.mass_activation;

import Vr.InterfaceC15709a;
import android.view.View;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f126485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CptMassActivationDialogV2Fragment f126486c;

    public /* synthetic */ c(CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment, int i12) {
        this.f126485b = i12;
        this.f126486c = cptMassActivationDialogV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CptMassActivationDialogV2Fragment cptMassActivationDialogV2Fragment = this.f126486c;
        switch (this.f126485b) {
            case 0:
                CptMassActivationDialogV2Fragment.a aVar = CptMassActivationDialogV2Fragment.f126446A0;
                cptMassActivationDialogV2Fragment.g5().accept(InterfaceC15709a.c.f17427a);
                break;
            case 1:
                CptMassActivationDialogV2Fragment.a aVar2 = CptMassActivationDialogV2Fragment.f126446A0;
                com.avito.android.lib.design.bottom_sheet.d dVarF5 = cptMassActivationDialogV2Fragment.f5();
                if (dVarF5 != null) {
                    dVarF5.r();
                    break;
                }
                break;
            case 2:
                CptMassActivationDialogV2Fragment.a aVar3 = CptMassActivationDialogV2Fragment.f126446A0;
                cptMassActivationDialogV2Fragment.g5().accept(InterfaceC15709a.C1205a.f17425a);
                break;
            default:
                CptMassActivationDialogV2Fragment.a aVar4 = CptMassActivationDialogV2Fragment.f126446A0;
                com.avito.android.lib.design.bottom_sheet.d dVarF52 = cptMassActivationDialogV2Fragment.f5();
                if (dVarF52 != null) {
                    dVarF52.r();
                    break;
                }
                break;
        }
    }
}

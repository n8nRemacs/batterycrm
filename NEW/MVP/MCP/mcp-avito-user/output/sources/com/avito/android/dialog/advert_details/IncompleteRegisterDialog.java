package com.avito.android.dialog.advert_details;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.l;
import androidx.fragment.app.DialogFragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment;
import com.avito.android.contact_access.contact_access_service.view.b;
import com.avito.android.dialog.advert_details.IncompleteRegisterDialog;
import hw.InterfaceC41177b;
import iR.C41336a;
import kotlin.Metadata;
import l90.o;

/* compiled from: IncompleteRegisterDialog.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/dialog/advert_details/IncompleteRegisterDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IncompleteRegisterDialog extends DialogFragment implements InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @l
    public b f144752f0;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@k DialogInterface dialogInterface) {
        C41336a.C11375a.a();
        b bVar = this.f144752f0;
        if (bVar != null) {
            bVar.a();
        }
        this.f144752f0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        final int i12 = 0;
        l.a negativeButton = new l.a(requireContext()).setMessage(R.string.advert_incomplete_register_message).setNegativeButton(R.string.dismiss, new DialogInterface.OnClickListener(this) { // from class: yx.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IncompleteRegisterDialog f443619c;

            {
                this.f443619c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                switch (i12) {
                    case 0:
                        C41336a.C11375a.a();
                        IncompleteRegisterDialog incompleteRegisterDialog = this.f443619c;
                        com.avito.android.contact_access.contact_access_service.view.b bVar = incompleteRegisterDialog.f144752f0;
                        if (bVar != null) {
                            bVar.a();
                        }
                        incompleteRegisterDialog.f144752f0 = null;
                        break;
                    default:
                        C41336a.C11375a.a();
                        IncompleteRegisterDialog incompleteRegisterDialog2 = this.f443619c;
                        com.avito.android.contact_access.contact_access_service.view.b bVar2 = incompleteRegisterDialog2.f144752f0;
                        if (bVar2 != null) {
                            ContactAccessServiceFragment contactAccessServiceFragment = bVar2.f126041a;
                            o oVar = contactAccessServiceFragment.f126012n0;
                            if (oVar == null) {
                                oVar = null;
                            }
                            contactAccessServiceFragment.startActivityForResult(oVar.d(), 2, null);
                        }
                        incompleteRegisterDialog2.f144752f0 = null;
                        break;
                }
            }
        });
        final int i13 = 1;
        return negativeButton.setPositiveButton(R.string.continue_string, new DialogInterface.OnClickListener(this) { // from class: yx.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IncompleteRegisterDialog f443619c;

            {
                this.f443619c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i132) {
                switch (i13) {
                    case 0:
                        C41336a.C11375a.a();
                        IncompleteRegisterDialog incompleteRegisterDialog = this.f443619c;
                        com.avito.android.contact_access.contact_access_service.view.b bVar = incompleteRegisterDialog.f144752f0;
                        if (bVar != null) {
                            bVar.a();
                        }
                        incompleteRegisterDialog.f144752f0 = null;
                        break;
                    default:
                        C41336a.C11375a.a();
                        IncompleteRegisterDialog incompleteRegisterDialog2 = this.f443619c;
                        com.avito.android.contact_access.contact_access_service.view.b bVar2 = incompleteRegisterDialog2.f144752f0;
                        if (bVar2 != null) {
                            ContactAccessServiceFragment contactAccessServiceFragment = bVar2.f126041a;
                            o oVar = contactAccessServiceFragment.f126012n0;
                            if (oVar == null) {
                                oVar = null;
                            }
                            contactAccessServiceFragment.startActivityForResult(oVar.d(), 2, null);
                        }
                        incompleteRegisterDialog2.f144752f0 = null;
                        break;
                }
            }
        }).create();
    }
}

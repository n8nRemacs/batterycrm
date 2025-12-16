package com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.core.os.C22777e;
import androidx.fragment.app.FragmentManager;
import com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment.PhoneRequestConfirmationDialogFragment;
import com.avito.android.deep_linking.links.PhoneLink;
import iR.C41336a;
import kotlin.Q;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92158c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f92157b = i12;
        this.f92158c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        Object obj = this.f92158c;
        switch (this.f92157b) {
            case 0:
                PhoneRequestConfirmationDialogFragment.a aVar = PhoneRequestConfirmationDialogFragment.f92153j0;
                C41336a.C11375a.a();
                PhoneRequestConfirmationDialogFragment phoneRequestConfirmationDialogFragment = (PhoneRequestConfirmationDialogFragment) obj;
                FragmentManager parentFragmentManager = phoneRequestConfirmationDialogFragment.getParentFragmentManager();
                String tag = phoneRequestConfirmationDialogFragment.getTag();
                if (tag == null) {
                    tag = "";
                }
                parentFragmentManager.o0(C22777e.b(new Q("key_result_confirmation", (PhoneLink.Call) phoneRequestConfirmationDialogFragment.f92155i0.getValue())), tag);
                break;
            case 1:
                C41336a.C11375a.a();
                ((com.avito.android.ui.a) obj).startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
                break;
            default:
                CBRApplicantDataSelectionFieldView.m311showDialog$lambda3((CBRApplicantDataSelectionFieldView) obj, dialogInterface, i12);
                break;
        }
    }
}

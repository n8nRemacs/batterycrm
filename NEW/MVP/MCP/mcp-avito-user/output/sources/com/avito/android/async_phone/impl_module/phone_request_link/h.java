package com.avito.android.async_phone.impl_module.phone_request_link;

import androidx.core.os.C22777e;
import androidx.fragment.app.DialogFragment;
import com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment.PhoneRequestConfirmationDialogFragment;
import com.avito.android.deep_linking.links.PhoneLink;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: PhoneRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneLink.Call f92183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PhoneLink.Call call) {
        super(0);
        this.f92183l = call;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        PhoneRequestConfirmationDialogFragment.f92153j0.getClass();
        PhoneRequestConfirmationDialogFragment phoneRequestConfirmationDialogFragment = new PhoneRequestConfirmationDialogFragment();
        phoneRequestConfirmationDialogFragment.setArguments(C22777e.b(new Q("params_deeplink", this.f92183l)));
        return phoneRequestConfirmationDialogFragment;
    }
}

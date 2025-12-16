package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacCallMethodsDialogFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/b;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/a;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.a
    @k
    public final IacForceCallMethodsDialogFragment a(@k IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink, @k String str) {
        IacForceCallMethodsDialogFragment.f168467o0.getClass();
        IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment = new IacForceCallMethodsDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("call_methods_link", iacShowCallMethodsDialogSheetLink);
        bundle.putString("request_key", str);
        iacForceCallMethodsDialogFragment.setArguments(bundle);
        return iacForceCallMethodsDialogFragment;
    }
}

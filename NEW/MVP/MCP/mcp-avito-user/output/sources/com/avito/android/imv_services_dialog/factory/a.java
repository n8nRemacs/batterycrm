package com.avito.android.imv_services_dialog.factory;

import Y61.k;
import com.avito.android.imv_services_dialog.ImvServicesDialogFragment;
import com.avito.android.imv_services_dialog.ImvServicesDialogScreenParams;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import nN.InterfaceC44295a;

/* compiled from: ImvServicesDialogFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_services_dialog/factory/a;", "LnN/a;", "<init>", "()V", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements InterfaceC44295a {
    @Inject
    public a() {
    }

    @Override // nN.InterfaceC44295a
    @k
    public final ImvServicesDialogFragment a(@k String str, @k ImvServices imvServices) {
        ImvServicesDialogFragment.f170719n0.getClass();
        ImvServicesDialogFragment imvServicesDialogFragment = new ImvServicesDialogFragment();
        ImvServicesDialogScreenParams imvServicesDialogScreenParams = new ImvServicesDialogScreenParams(str, imvServices);
        imvServicesDialogFragment.f170721h0.setValue(imvServicesDialogFragment, ImvServicesDialogFragment.f170720o0[0], imvServicesDialogScreenParams);
        return imvServicesDialogFragment;
    }
}

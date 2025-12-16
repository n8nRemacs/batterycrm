package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.entity.TariffCpxInfoSfTermsInternalAction;
import com.avito.android.tariff.deeplink.TariffCpxInfoSfTermsLinkBody;
import javax.inject.Inject;
import kotlin.Metadata;
import wZ.m;

/* compiled from: TariffCpxInfoSfTermsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "LBB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TariffCpxInfoSfTermsInternalAction, BB0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final BB0.c a(TariffCpxInfoSfTermsInternalAction tariffCpxInfoSfTermsInternalAction, BB0.c cVar) {
        TariffCpxInfoSfTermsInternalAction tariffCpxInfoSfTermsInternalAction2 = tariffCpxInfoSfTermsInternalAction;
        BB0.c cVar2 = cVar;
        if (!(tariffCpxInfoSfTermsInternalAction2 instanceof TariffCpxInfoSfTermsInternalAction.OpenScreen)) {
            return cVar2;
        }
        TariffCpxInfoSfTermsLinkBody tariffCpxInfoSfTermsLinkBody = ((TariffCpxInfoSfTermsInternalAction.OpenScreen) tariffCpxInfoSfTermsInternalAction2).f296908b.f296858b;
        UniversalImage image = tariffCpxInfoSfTermsLinkBody.getImage();
        return new BB0.c(tariffCpxInfoSfTermsLinkBody.getDescription(), image != null ? m.a(image) : null, tariffCpxInfoSfTermsLinkBody.getSaveButtonTitle(), tariffCpxInfoSfTermsLinkBody.getSkipButtonTitle());
    }
}

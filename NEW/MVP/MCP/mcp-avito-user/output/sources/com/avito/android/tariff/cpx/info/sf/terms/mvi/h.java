package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import BB0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.entity.TariffCpxInfoSfTermsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoSfTermsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "LBB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TariffCpxInfoSfTermsInternalAction, BB0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final BB0.b b(TariffCpxInfoSfTermsInternalAction tariffCpxInfoSfTermsInternalAction) {
        BB0.b dVar;
        TariffCpxInfoSfTermsInternalAction tariffCpxInfoSfTermsInternalAction2 = tariffCpxInfoSfTermsInternalAction;
        if (tariffCpxInfoSfTermsInternalAction2 instanceof TariffCpxInfoSfTermsInternalAction.CloseDialog) {
            return b.a.f1231a;
        }
        if (tariffCpxInfoSfTermsInternalAction2 instanceof TariffCpxInfoSfTermsInternalAction.PostSaveLoading) {
            return b.c.f1233a;
        }
        if (tariffCpxInfoSfTermsInternalAction2 instanceof TariffCpxInfoSfTermsInternalAction.PostSaveError) {
            dVar = new b.C0046b(((TariffCpxInfoSfTermsInternalAction.PostSaveError) tariffCpxInfoSfTermsInternalAction2).f296910b);
        } else {
            if (!(tariffCpxInfoSfTermsInternalAction2 instanceof TariffCpxInfoSfTermsInternalAction.PostSaveContent)) {
                return null;
            }
            dVar = new b.d(((TariffCpxInfoSfTermsInternalAction.PostSaveContent) tariffCpxInfoSfTermsInternalAction2).f296909b);
        }
        return dVar;
    }
}

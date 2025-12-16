package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rX.AbstractC47609c;

/* compiled from: QualityServiceGrayReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayInternalAction;", "LrX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<QualityServiceGrayInternalAction, AbstractC47609c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC47609c a(QualityServiceGrayInternalAction qualityServiceGrayInternalAction, AbstractC47609c abstractC47609c) {
        QualityServiceGrayInternalAction qualityServiceGrayInternalAction2 = qualityServiceGrayInternalAction;
        AbstractC47609c abstractC47609c2 = abstractC47609c;
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Error) {
            return ((QualityServiceGrayInternalAction.Error) qualityServiceGrayInternalAction2).f184124b.f318522b instanceof ApiError.Forbidden ? AbstractC47609c.b.f429864b : AbstractC47609c.a.f429863b;
        }
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Loaded) {
            return new AbstractC47609c.C12380c(((QualityServiceGrayInternalAction.Loaded) qualityServiceGrayInternalAction2).f184126b);
        }
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Loading) {
            return AbstractC47609c.d.f429866b;
        }
        if (qualityServiceGrayInternalAction2.equals(QualityServiceGrayInternalAction.NavigateBack.f184127b) ? true : qualityServiceGrayInternalAction2.equals(QualityServiceGrayInternalAction.NavigateToMain.f184128b) ? true : qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.OpenDeeplink ? true : qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.OpenUrl) {
            return abstractC47609c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

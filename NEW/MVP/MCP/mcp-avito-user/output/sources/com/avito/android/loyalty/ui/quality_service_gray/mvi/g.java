package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rX.InterfaceC47608b;

/* compiled from: QualityServiceGrayEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayInternalAction;", "LrX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements t<QualityServiceGrayInternalAction, InterfaceC47608b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47608b b(QualityServiceGrayInternalAction qualityServiceGrayInternalAction) {
        InterfaceC47608b dVar;
        QualityServiceGrayInternalAction qualityServiceGrayInternalAction2 = qualityServiceGrayInternalAction;
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.NavigateBack) {
            return InterfaceC47608b.a.f429859a;
        }
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.NavigateToMain) {
            return InterfaceC47608b.C12379b.f429860a;
        }
        if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.OpenDeeplink) {
            dVar = new InterfaceC47608b.c(((QualityServiceGrayInternalAction.OpenDeeplink) qualityServiceGrayInternalAction2).f184129b);
        } else {
            if (!(qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.OpenUrl)) {
                if (qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Error ? true : qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Loaded ? true : qualityServiceGrayInternalAction2 instanceof QualityServiceGrayInternalAction.Loading) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            dVar = new InterfaceC47608b.d(((QualityServiceGrayInternalAction.OpenUrl) qualityServiceGrayInternalAction2).f184130b);
        }
        return dVar;
    }
}

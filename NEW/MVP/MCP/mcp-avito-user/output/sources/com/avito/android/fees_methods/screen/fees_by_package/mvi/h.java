package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import FE.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FeesByPackageOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "LFE/b;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<FeesByPackageInternalAction, FE.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final FE.b b(FeesByPackageInternalAction feesByPackageInternalAction) {
        FeesByPackageInternalAction feesByPackageInternalAction2 = feesByPackageInternalAction;
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.Back) {
            return b.a.f4649a;
        }
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.FinishFlow) {
            return b.C0285b.f4650a;
        }
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.HandleDeeplink) {
            return new b.c(((FeesByPackageInternalAction.HandleDeeplink) feesByPackageInternalAction2).f158023b);
        }
        return null;
    }
}

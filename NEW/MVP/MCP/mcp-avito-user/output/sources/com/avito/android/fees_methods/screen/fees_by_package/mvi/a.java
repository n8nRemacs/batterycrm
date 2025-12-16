package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import FE.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageInternalAction;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FeesByPackageActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LFE/a;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<FE.a, FeesByPackageInternalAction, FeesByPackageState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.fees_methods.screen.fees_by_package.domain.a f158008a;

    @Inject
    public a(@Y61.k com.avito.android.fees_methods.screen.fees_by_package.domain.a aVar) {
        this.f158008a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FeesByPackageInternalAction> b(FE.a aVar, FeesByPackageState feesByPackageState) {
        FE.a aVar2 = aVar;
        FeesByPackageState feesByPackageState2 = feesByPackageState;
        if (aVar2 instanceof a.e) {
            return this.f158008a.a();
        }
        if (aVar2 instanceof a.C0284a) {
            return new C43210w(feesByPackageState2.f158026b ? FeesByPackageInternalAction.FinishFlow.f158022b : FeesByPackageInternalAction.Back.f158017b);
        }
        if (aVar2 instanceof a.d) {
            FeesByPackageState.Button button = feesByPackageState2.f158034j;
            DeepLink deepLink = button != null ? button.f158037b : null;
            return (deepLink == null || feesByPackageState2.f158028d) ? C43175k.w() : new C43210w(new FeesByPackageInternalAction.HandleDeeplink(deepLink));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new FeesByPackageInternalAction.HandleDeeplink(((a.b) aVar2).f4645a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new FeesByPackageInternalAction.DeepLinkLoading(((a.c) aVar2).f4646a));
        }
        throw new NoWhenBranchMatchedException();
    }
}

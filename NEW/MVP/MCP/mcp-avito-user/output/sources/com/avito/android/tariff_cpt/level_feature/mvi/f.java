package com.avito.android.tariff_cpt.level_feature.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import com.avito.android.tariff_cpt.level_feature.mvi.entity.TariffCptLevelFeatureInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCptLevelFeaturesBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<TariffCptLevelFeatureInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TariffCptLevelFeatureContent f298490a;

    @Inject
    public f(@Y61.k TariffCptLevelFeatureContent tariffCptLevelFeatureContent) {
        this.f298490a = tariffCptLevelFeatureContent;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TariffCptLevelFeatureInternalAction> a() {
        return new C43210w(new TariffCptLevelFeatureInternalAction.OpenScreen(this.f298490a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

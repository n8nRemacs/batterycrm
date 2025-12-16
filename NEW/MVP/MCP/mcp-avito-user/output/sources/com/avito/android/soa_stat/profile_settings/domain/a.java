package com.avito.android.soa_stat.profile_settings.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SoaStatProfileSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/domain/a;", "", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @l
    Object a(boolean z12, @k Continuation<? super TypedResult<G0>> continuation);

    @l
    Object b(@k Continuation<? super TypedResult<IncomeProfileSettingsResponse>> continuation);
}

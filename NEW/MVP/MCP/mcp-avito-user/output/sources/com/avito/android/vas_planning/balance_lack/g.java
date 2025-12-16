package com.avito.android.vas_planning.balance_lack;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanBalanceLackIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/g;", "Lcom/avito/android/vas_planning/balance_lack/f;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f322220a;

    @Inject
    public g(@Y61.k Context context) {
        this.f322220a = context;
    }

    @Override // com.avito.android.vas_planning.balance_lack.f
    @Y61.k
    public final Intent a() {
        return new Intent(this.f322220a, (Class<?>) VasPlanBalanceLackActivity.class);
    }
}

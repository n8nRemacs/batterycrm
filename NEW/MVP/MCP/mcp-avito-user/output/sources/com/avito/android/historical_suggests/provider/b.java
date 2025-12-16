package com.avito.android.historical_suggests.provider;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HistoricalSuggestViewFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/historical_suggests/provider/b;", "Lcom/avito/android/historical_suggests/provider/a;", "<init>", "()V", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.historical_suggests.provider.a
    @k
    public final com.avito.android.historical_suggests.suggest.k a(@k Context context, boolean z12, @l Long l12) {
        com.avito.android.historical_suggests.suggest.k kVar = new com.avito.android.historical_suggests.suggest.k(context, null, 0, 0);
        kVar.e(l12, z12);
        return kVar;
    }
}

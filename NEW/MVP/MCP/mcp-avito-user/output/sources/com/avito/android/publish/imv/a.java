package com.avito.android.publish.imv;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.imv.MarketValueItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/imv/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<MarketValueItem> f236061a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends MarketValueItem> list) {
        this.f236061a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f236061a, ((a) obj).f236061a);
    }

    public final int hashCode() {
        return this.f236061a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("InstantMarketValueData(elements="), this.f236061a, ')');
    }
}

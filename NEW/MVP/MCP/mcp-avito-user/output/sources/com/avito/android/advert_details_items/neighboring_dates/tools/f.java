package com.avito.android.advert_details_items.neighboring_dates.tools;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NeighboringDatesLoadingStateCollector.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/tools/f;", "Lcom/avito/android/advert_details_items/neighboring_dates/tools/e;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicBoolean f84963a = new AtomicBoolean(false);

    @Inject
    public f() {
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.tools.e
    public final boolean isLoading() {
        return this.f84963a.get();
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.tools.e
    public final void setLoading(boolean z12) {
        this.f84963a.set(z12);
    }
}

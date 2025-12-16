package com.avito.android.safedeal.delivery.order_cancellation;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderCancellationResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/c;", "Lcom/avito/android/safedeal/delivery/order_cancellation/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f256093a;

    @Inject
    public c(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f256093a = resources.getString(R.string.has_error_occurred);
        resources.getString(R.string.order_cancellation_button_text);
    }
}

package com.avito.android.delivery_location_suggest;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.ui.fragments.BaseFragment;
import i.AbstractC41201a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryLocationSuggestContract.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_location_suggest/b;", "Li/a;", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams;", "Lcom/avito/android/delivery_location_suggest/Coordinates;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC41201a<DeliveryLocationSuggestParams, Coordinates> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BaseFragment f135044b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k k kVar) {
        this.f135044b = (BaseFragment) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.delivery_location_suggest.k, com.avito.android.ui.fragments.BaseFragment] */
    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, DeliveryLocationSuggestParams deliveryLocationSuggestParams) {
        return this.f135044b.e1().a(context, deliveryLocationSuggestParams);
    }

    @Override // i.AbstractC41201a
    public final Coordinates parseResult(int i12, Intent intent) {
        if (i12 != -1 || intent == null) {
            return null;
        }
        return (Coordinates) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_coordinates", Coordinates.class) : intent.getParcelableExtra("extra_coordinates"));
    }
}

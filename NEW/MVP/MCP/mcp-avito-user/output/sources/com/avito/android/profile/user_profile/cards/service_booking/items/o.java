package com.avito.android.profile.user_profile.cards.service_booking.items;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingItemResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/o;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/n;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f225453a;

    @Inject
    public o(@Y61.k Resources resources) {
        this.f225453a = resources;
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.n
    @Y61.l
    public final Drawable a(@Y61.k Context context) {
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f225453a.getDrawable(R.drawable.ic_booking_placeholder, theme);
    }
}

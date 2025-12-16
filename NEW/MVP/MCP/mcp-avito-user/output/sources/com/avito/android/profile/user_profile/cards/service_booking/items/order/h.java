package com.avito.android.profile.user_profile.cards.service_booking.items.order;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceBookingItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/h;", "LTV0/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface h extends TV0.e {

    /* compiled from: ServiceBookingItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@l Y41.a<G0> aVar);

    void f(@l String str);

    @k
    Context getContext();

    void kv(@l Image image, @l Drawable drawable);

    void nT(@l AttributedText attributedText);

    void setTitle(@l String str);
}

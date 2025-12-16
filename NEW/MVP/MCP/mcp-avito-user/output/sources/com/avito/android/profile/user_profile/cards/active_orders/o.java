package com.avito.android.profile.user_profile.cards.active_orders;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActiveOrdersResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/o;", "Lcom/avito/android/profile/user_profile/cards/active_orders/n;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f224672a;

    @Inject
    public o(@Y61.k Resources resources) {
        this.f224672a = resources.getString(R.string.active_orders_widget_action_button_text);
    }

    @Override // com.avito.android.profile.user_profile.cards.active_orders.n
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF224672a() {
        return this.f224672a;
    }
}

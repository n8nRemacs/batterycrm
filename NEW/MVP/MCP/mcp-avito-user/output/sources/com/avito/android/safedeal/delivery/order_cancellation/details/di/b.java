package com.avito.android.safedeal.delivery.order_cancellation.details.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.details.ReasonDetailsFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: ReasonDetailsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/di/b;", "", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ReasonDetailsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/di/b$a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ReasonDetailsFragment reasonDetailsFragment, @h31.b @k r rVar, @h31.b @k ReasonRds reasonRds, @h31.b @Kn0.c @k String str, @h31.b @k com.avito.android.safedeal.delivery.order_cancellation.details.b bVar, @k com.avito.android.safedeal.delivery.di.component.b bVar2, @h31.b @l @c Integer num, @h31.b @k Resources resources);
    }

    void a(@k ReasonDetailsFragment reasonDetailsFragment);
}

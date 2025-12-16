package com.avito.android.mortgage.landing.list.items.action_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionBannerVisibilityTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/action_banner/h;", "LWV0/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f199666e;

    @Inject
    public h(@k InterfaceC28373a interfaceC28373a) {
        super(true, false, 0.001f, 1L);
        this.f199666e = interfaceC28373a;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof ActionBannerItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        ParcelableClickStreamEvent parcelableClickStreamEvent;
        ActionBannerItem actionBannerItem = interfaceC10495b instanceof ActionBannerItem ? (ActionBannerItem) interfaceC10495b : null;
        if (actionBannerItem == null || (parcelableClickStreamEvent = actionBannerItem.f199649g) == null) {
            return;
        }
        this.f199666e.c(parcelableClickStreamEvent);
    }
}

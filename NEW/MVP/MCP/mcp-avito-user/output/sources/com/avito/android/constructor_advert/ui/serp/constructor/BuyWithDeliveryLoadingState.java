package com.avito.android.constructor_advert.ui.serp.constructor;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AsyncBuyWithDeliveryItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/BuyWithDeliveryLoadingState;", "", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BuyWithDeliveryLoadingState {

    /* renamed from: b, reason: collision with root package name */
    public static final BuyWithDeliveryLoadingState f125735b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BuyWithDeliveryLoadingState[] f125736c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f125737d;

    static {
        BuyWithDeliveryLoadingState buyWithDeliveryLoadingState = new BuyWithDeliveryLoadingState("IDLE", 0);
        f125735b = buyWithDeliveryLoadingState;
        BuyWithDeliveryLoadingState[] buyWithDeliveryLoadingStateArr = {buyWithDeliveryLoadingState, new BuyWithDeliveryLoadingState("LOADING", 1)};
        f125736c = buyWithDeliveryLoadingStateArr;
        f125737d = kotlin.enums.c.a(buyWithDeliveryLoadingStateArr);
    }

    public BuyWithDeliveryLoadingState() {
        throw null;
    }

    public static BuyWithDeliveryLoadingState valueOf(String str) {
        return (BuyWithDeliveryLoadingState) Enum.valueOf(BuyWithDeliveryLoadingState.class, str);
    }

    public static BuyWithDeliveryLoadingState[] values() {
        return (BuyWithDeliveryLoadingState[]) f125736c.clone();
    }
}

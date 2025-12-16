package com.avito.android.advert_details_items.sellerprofile.subscription;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerSubscriptionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/subscription/SellerSubscriptionState;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SellerSubscriptionState {

    /* renamed from: b, reason: collision with root package name */
    public static final SellerSubscriptionState f85639b;

    /* renamed from: c, reason: collision with root package name */
    public static final SellerSubscriptionState f85640c;

    /* renamed from: d, reason: collision with root package name */
    public static final SellerSubscriptionState f85641d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SellerSubscriptionState[] f85642e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f85643f;

    static {
        SellerSubscriptionState sellerSubscriptionState = new SellerSubscriptionState("SUBSCRIBED", 0);
        f85639b = sellerSubscriptionState;
        SellerSubscriptionState sellerSubscriptionState2 = new SellerSubscriptionState("UNSUBSCRIBED", 1);
        f85640c = sellerSubscriptionState2;
        SellerSubscriptionState sellerSubscriptionState3 = new SellerSubscriptionState("LOADING", 2);
        f85641d = sellerSubscriptionState3;
        SellerSubscriptionState[] sellerSubscriptionStateArr = {sellerSubscriptionState, sellerSubscriptionState2, sellerSubscriptionState3};
        f85642e = sellerSubscriptionStateArr;
        f85643f = c.a(sellerSubscriptionStateArr);
    }

    public SellerSubscriptionState() {
        throw null;
    }

    public static SellerSubscriptionState valueOf(String str) {
        return (SellerSubscriptionState) Enum.valueOf(SellerSubscriptionState.class, str);
    }

    public static SellerSubscriptionState[] values() {
        return (SellerSubscriptionState[]) f85642e.clone();
    }
}

package com.avito.android.advert_details_items.sellerprofile.subscription;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerNotificationsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/subscription/SellerNotificationsState;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SellerNotificationsState {

    /* renamed from: b, reason: collision with root package name */
    public static final SellerNotificationsState f85635b;

    /* renamed from: c, reason: collision with root package name */
    public static final SellerNotificationsState f85636c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SellerNotificationsState[] f85637d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f85638e;

    static {
        SellerNotificationsState sellerNotificationsState = new SellerNotificationsState("ACTIVATED", 0);
        f85635b = sellerNotificationsState;
        SellerNotificationsState sellerNotificationsState2 = new SellerNotificationsState("DEACTIVATED", 1);
        f85636c = sellerNotificationsState2;
        SellerNotificationsState[] sellerNotificationsStateArr = {sellerNotificationsState, sellerNotificationsState2, new SellerNotificationsState("LOADING", 2)};
        f85637d = sellerNotificationsStateArr;
        f85638e = c.a(sellerNotificationsStateArr);
    }

    public SellerNotificationsState() {
        throw null;
    }

    public static SellerNotificationsState valueOf(String str) {
        return (SellerNotificationsState) Enum.valueOf(SellerNotificationsState.class, str);
    }

    public static SellerNotificationsState[] values() {
        return (SellerNotificationsState[]) f85637d.clone();
    }
}

package com.avito.android.search_view;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToolbarSearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/SubscriptionButtonState;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionButtonState {

    /* renamed from: b, reason: collision with root package name */
    public static final SubscriptionButtonState f264430b;

    /* renamed from: c, reason: collision with root package name */
    public static final SubscriptionButtonState f264431c;

    /* renamed from: d, reason: collision with root package name */
    public static final SubscriptionButtonState f264432d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SubscriptionButtonState[] f264433e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f264434f;

    static {
        SubscriptionButtonState subscriptionButtonState = new SubscriptionButtonState("SUBSCRIBED_STATE", 0);
        f264430b = subscriptionButtonState;
        SubscriptionButtonState subscriptionButtonState2 = new SubscriptionButtonState("NOT_SUBSCRIBED_STATE", 1);
        f264431c = subscriptionButtonState2;
        SubscriptionButtonState subscriptionButtonState3 = new SubscriptionButtonState("LOADING_STATE", 2);
        f264432d = subscriptionButtonState3;
        SubscriptionButtonState[] subscriptionButtonStateArr = {subscriptionButtonState, subscriptionButtonState2, subscriptionButtonState3};
        f264433e = subscriptionButtonStateArr;
        f264434f = kotlin.enums.c.a(subscriptionButtonStateArr);
    }

    public SubscriptionButtonState() {
        throw null;
    }

    public static SubscriptionButtonState valueOf(String str) {
        return (SubscriptionButtonState) Enum.valueOf(SubscriptionButtonState.class, str);
    }

    public static SubscriptionButtonState[] values() {
        return (SubscriptionButtonState[]) f264433e.clone();
    }
}

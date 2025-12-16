package com.avito.android.service_order_widget.serp;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AsyncServiceOrderRequestItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/serp/ServiceOrderRequestLoadingState;", "", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceOrderRequestLoadingState {

    /* renamed from: b, reason: collision with root package name */
    public static final ServiceOrderRequestLoadingState f279048b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ServiceOrderRequestLoadingState[] f279049c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f279050d;

    static {
        ServiceOrderRequestLoadingState serviceOrderRequestLoadingState = new ServiceOrderRequestLoadingState("IDLE", 0);
        f279048b = serviceOrderRequestLoadingState;
        ServiceOrderRequestLoadingState[] serviceOrderRequestLoadingStateArr = {serviceOrderRequestLoadingState, new ServiceOrderRequestLoadingState("LOADING", 1)};
        f279049c = serviceOrderRequestLoadingStateArr;
        f279050d = c.a(serviceOrderRequestLoadingStateArr);
    }

    public ServiceOrderRequestLoadingState() {
        throw null;
    }

    public static ServiceOrderRequestLoadingState valueOf(String str) {
        return (ServiceOrderRequestLoadingState) Enum.valueOf(ServiceOrderRequestLoadingState.class, str);
    }

    public static ServiceOrderRequestLoadingState[] values() {
        return (ServiceOrderRequestLoadingState[]) f279049c.clone();
    }
}

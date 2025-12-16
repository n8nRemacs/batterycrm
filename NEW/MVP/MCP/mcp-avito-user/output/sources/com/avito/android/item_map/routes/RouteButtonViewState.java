package com.avito.android.item_map.routes;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RoutesPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/RouteButtonViewState;", "", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteButtonViewState {

    /* renamed from: b, reason: collision with root package name */
    public static final RouteButtonViewState f173367b;

    /* renamed from: c, reason: collision with root package name */
    public static final RouteButtonViewState f173368c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ RouteButtonViewState[] f173369d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f173370e;

    static {
        RouteButtonViewState routeButtonViewState = new RouteButtonViewState("UNPRESSED", 0);
        f173367b = routeButtonViewState;
        RouteButtonViewState routeButtonViewState2 = new RouteButtonViewState("PRESSED", 1);
        f173368c = routeButtonViewState2;
        RouteButtonViewState[] routeButtonViewStateArr = {routeButtonViewState, routeButtonViewState2};
        f173369d = routeButtonViewStateArr;
        f173370e = kotlin.enums.c.a(routeButtonViewStateArr);
    }

    public RouteButtonViewState() {
        throw null;
    }

    public static RouteButtonViewState valueOf(String str) {
        return (RouteButtonViewState) Enum.valueOf(RouteButtonViewState.class, str);
    }

    public static RouteButtonViewState[] values() {
        return (RouteButtonViewState[]) f173369d.clone();
    }
}

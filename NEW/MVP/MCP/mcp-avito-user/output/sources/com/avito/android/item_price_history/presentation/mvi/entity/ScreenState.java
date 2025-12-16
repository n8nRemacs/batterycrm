package com.avito.android.item_price_history.presentation.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemPriceHistoryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ScreenState;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenState {

    /* renamed from: b, reason: collision with root package name */
    public static final ScreenState f173810b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScreenState f173811c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScreenState f173812d;

    /* renamed from: e, reason: collision with root package name */
    public static final ScreenState f173813e;

    /* renamed from: f, reason: collision with root package name */
    public static final ScreenState f173814f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ScreenState[] f173815g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f173816h;

    static {
        ScreenState screenState = new ScreenState("INITIAL", 0);
        f173810b = screenState;
        ScreenState screenState2 = new ScreenState("FIRST_LOADING", 1);
        f173811c = screenState2;
        ScreenState screenState3 = new ScreenState("LOADING_WITH_OFFSET", 2);
        f173812d = screenState3;
        ScreenState screenState4 = new ScreenState("CONTENT", 3);
        f173813e = screenState4;
        ScreenState screenState5 = new ScreenState("ERROR", 4);
        f173814f = screenState5;
        ScreenState[] screenStateArr = {screenState, screenState2, screenState3, screenState4, screenState5};
        f173815g = screenStateArr;
        f173816h = c.a(screenStateArr);
    }

    public ScreenState() {
        throw null;
    }

    public static ScreenState valueOf(String str) {
        return (ScreenState) Enum.valueOf(ScreenState.class, str);
    }

    public static ScreenState[] values() {
        return (ScreenState[]) f173815g.clone();
    }
}

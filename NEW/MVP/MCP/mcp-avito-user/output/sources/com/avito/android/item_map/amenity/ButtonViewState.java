package com.avito.android.item_map.amenity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AmenityButtonsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/ButtonViewState;", "", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ButtonViewState {

    /* renamed from: b, reason: collision with root package name */
    public static final ButtonViewState f173277b;

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonViewState f173278c;

    /* renamed from: d, reason: collision with root package name */
    public static final ButtonViewState f173279d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ButtonViewState[] f173280e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f173281f;

    static {
        ButtonViewState buttonViewState = new ButtonViewState("UNPRESSED", 0);
        f173277b = buttonViewState;
        ButtonViewState buttonViewState2 = new ButtonViewState("PRESSED", 1);
        f173278c = buttonViewState2;
        ButtonViewState buttonViewState3 = new ButtonViewState("DISABLED", 2);
        f173279d = buttonViewState3;
        ButtonViewState[] buttonViewStateArr = {buttonViewState, buttonViewState2, buttonViewState3};
        f173280e = buttonViewStateArr;
        f173281f = kotlin.enums.c.a(buttonViewStateArr);
    }

    public ButtonViewState() {
        throw null;
    }

    public static ButtonViewState valueOf(String str) {
        return (ButtonViewState) Enum.valueOf(ButtonViewState.class, str);
    }

    public static ButtonViewState[] values() {
        return (ButtonViewState[]) f173280e.clone();
    }
}

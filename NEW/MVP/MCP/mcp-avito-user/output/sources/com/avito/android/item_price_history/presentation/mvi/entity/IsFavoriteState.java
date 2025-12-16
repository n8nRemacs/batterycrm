package com.avito.android.item_price_history.presentation.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemPriceHistoryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/IsFavoriteState;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IsFavoriteState {

    /* renamed from: b, reason: collision with root package name */
    public static final IsFavoriteState f173796b;

    /* renamed from: c, reason: collision with root package name */
    public static final IsFavoriteState f173797c;

    /* renamed from: d, reason: collision with root package name */
    public static final IsFavoriteState f173798d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ IsFavoriteState[] f173799e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f173800f;

    static {
        IsFavoriteState isFavoriteState = new IsFavoriteState("LOADING", 0);
        f173796b = isFavoriteState;
        IsFavoriteState isFavoriteState2 = new IsFavoriteState("FAVORITE", 1);
        f173797c = isFavoriteState2;
        IsFavoriteState isFavoriteState3 = new IsFavoriteState("NOT_FAVORITE", 2);
        f173798d = isFavoriteState3;
        IsFavoriteState[] isFavoriteStateArr = {isFavoriteState, isFavoriteState2, isFavoriteState3};
        f173799e = isFavoriteStateArr;
        f173800f = c.a(isFavoriteStateArr);
    }

    public IsFavoriteState() {
        throw null;
    }

    public static IsFavoriteState valueOf(String str) {
        return (IsFavoriteState) Enum.valueOf(IsFavoriteState.class, str);
    }

    public static IsFavoriteState[] values() {
        return (IsFavoriteState[]) f173799e.clone();
    }
}

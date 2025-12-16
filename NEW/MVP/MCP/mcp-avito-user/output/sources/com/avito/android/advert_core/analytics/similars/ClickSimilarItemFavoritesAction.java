package com.avito.android.advert_core.analytics.similars;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClickSimilarItemFavoritesTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/similars/ClickSimilarItemFavoritesAction;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClickSimilarItemFavoritesAction {

    /* renamed from: b, reason: collision with root package name */
    public static final ClickSimilarItemFavoritesAction f82878b;

    /* renamed from: c, reason: collision with root package name */
    public static final ClickSimilarItemFavoritesAction f82879c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ClickSimilarItemFavoritesAction[] f82880d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f82881e;

    static {
        ClickSimilarItemFavoritesAction clickSimilarItemFavoritesAction = new ClickSimilarItemFavoritesAction("ADD", 0);
        f82878b = clickSimilarItemFavoritesAction;
        ClickSimilarItemFavoritesAction clickSimilarItemFavoritesAction2 = new ClickSimilarItemFavoritesAction("REMOVE", 1);
        f82879c = clickSimilarItemFavoritesAction2;
        ClickSimilarItemFavoritesAction[] clickSimilarItemFavoritesActionArr = {clickSimilarItemFavoritesAction, clickSimilarItemFavoritesAction2};
        f82880d = clickSimilarItemFavoritesActionArr;
        f82881e = c.a(clickSimilarItemFavoritesActionArr);
    }

    public ClickSimilarItemFavoritesAction() {
        throw null;
    }

    public static ClickSimilarItemFavoritesAction valueOf(String str) {
        return (ClickSimilarItemFavoritesAction) Enum.valueOf(ClickSimilarItemFavoritesAction.class, str);
    }

    public static ClickSimilarItemFavoritesAction[] values() {
        return (ClickSimilarItemFavoritesAction[]) f82880d.clone();
    }
}

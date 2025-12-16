package com.avito.android.campaigns_sale_search.konveyor.search_item;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/search_item/SearchItemButton;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchItemButton {

    /* renamed from: b, reason: collision with root package name */
    public static final SearchItemButton f114594b;

    /* renamed from: c, reason: collision with root package name */
    public static final SearchItemButton f114595c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SearchItemButton[] f114596d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114597e;

    static {
        SearchItemButton searchItemButton = new SearchItemButton("DELETE_BUTTON", 0);
        f114594b = searchItemButton;
        SearchItemButton searchItemButton2 = new SearchItemButton("ADD_BUTTON", 1);
        f114595c = searchItemButton2;
        SearchItemButton[] searchItemButtonArr = {searchItemButton, searchItemButton2};
        f114596d = searchItemButtonArr;
        f114597e = kotlin.enums.c.a(searchItemButtonArr);
    }

    public SearchItemButton() {
        throw null;
    }

    public static SearchItemButton valueOf(String str) {
        return (SearchItemButton) Enum.valueOf(SearchItemButton.class, str);
    }

    public static SearchItemButton[] values() {
        return (SearchItemButton[]) f114596d.clone();
    }
}

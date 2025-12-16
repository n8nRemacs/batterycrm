package com.avito.android.advert_core.equipments.redesign;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquipmentsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/Page;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Page {

    /* renamed from: c, reason: collision with root package name */
    public static final Page f83476c;

    /* renamed from: d, reason: collision with root package name */
    public static final Page f83477d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Page[] f83478e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83479f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f83480b;

    static {
        Page page = new Page("ITEM", 0, "item");
        f83476c = page;
        Page page2 = new Page("ITEM_SX", 1, "item-sx");
        f83477d = page2;
        Page[] pageArr = {page, page2};
        f83478e = pageArr;
        f83479f = kotlin.enums.c.a(pageArr);
    }

    public Page(String str, int i12, String str2) {
        this.f83480b = str2;
    }

    public static Page valueOf(String str) {
        return (Page) Enum.valueOf(Page.class, str);
    }

    public static Page[] values() {
        return (Page[]) f83478e.clone();
    }
}

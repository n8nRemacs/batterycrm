package com.avito.android.advert_core.discount.item;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDiscountItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/discount/item/AdvertDiscountItem;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDiscountItem {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AdvertDiscountItem[] f83348b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f83349c;

    static {
        AdvertDiscountItem[] advertDiscountItemArr = {new AdvertDiscountItem("TITLE", 0), new AdvertDiscountItem("SUBTITLE", 1), new AdvertDiscountItem("DISCOUNT", 2), new AdvertDiscountItem("DIVIDER", 3), new AdvertDiscountItem("INFORMATION", 4), new AdvertDiscountItem("CONTACT", 5), new AdvertDiscountItem("GROUP_TITLE", 6)};
        f83348b = advertDiscountItemArr;
        f83349c = c.a(advertDiscountItemArr);
    }

    public AdvertDiscountItem() {
        throw null;
    }

    public static AdvertDiscountItem valueOf(String str) {
        return (AdvertDiscountItem) Enum.valueOf(AdvertDiscountItem.class, str);
    }

    public static AdvertDiscountItem[] values() {
        return (AdvertDiscountItem[]) f83348b.clone();
    }
}

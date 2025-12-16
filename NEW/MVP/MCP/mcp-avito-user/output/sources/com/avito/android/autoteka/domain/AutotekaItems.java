package com.avito.android.autoteka.domain;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaItems.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/domain/AutotekaItems;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaItems {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AutotekaItems[] f96627b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f96628c;

    static {
        AutotekaItems[] autotekaItemsArr = {new AutotekaItems("ITEM_BUY_AGAIN", 0), new AutotekaItems("ITEM_CHOOSING_TYPE_PURCHASE_SKELETON", 1), new AutotekaItems("ITEM_CHOOSING_TYPE_PURCHASE_ERROR", 2), new AutotekaItems("ITEM_PURCHASE_VIA_PACKAGE", 3), new AutotekaItems("ITEM_PURCHASE_VIA_STANDALONE", 4), new AutotekaItems("ITEM_CHOOSING_PRODUCT", 5), new AutotekaItems("ITEM_PAYMENT_SKELETON", 6), new AutotekaItems("ITEM_PAYMENT", 7), new AutotekaItems("ITEM_PAYMENT_ERROR", 8), new AutotekaItems("ITEM_WAITING_FOR_PAYMENT", 9), new AutotekaItems("ITEM_WAITING_FOR_PAYMENT_ERROR", 10), new AutotekaItems("ITEM_WAITING_FOR_PAYMENT_RESPONSE", 11), new AutotekaItems("ITEM_REPORT_GENERATION", 12), new AutotekaItems("ITEM_REPORT_GENERATION_ERROR", 13), new AutotekaItems("ITEM_REPORT_GENERATION_RESPONSE", 14), new AutotekaItems("ITEM_REPORT_ERROR", 15), new AutotekaItems("ITEM_REPORT_SKELETON", 16), new AutotekaItems("ITEM_REPORT", 17), new AutotekaItems("ITEM_LANDING_SKELETON", 18), new AutotekaItems("ITEM_LANDING_ERROR", 19), new AutotekaItems("ITEM_READY_TO_PREVIEW_SEARCH", 20), new AutotekaItems("ITEM_PREVIEW", 21), new AutotekaItems("ITEM_PREVIEW_GENERATION", 22), new AutotekaItems("ITEM_PREVIEW_SEARCH_FULL_SCREEN_ERROR", 23), new AutotekaItems("ITEM_DIRECT_PURCHASE", 24)};
        f96627b = autotekaItemsArr;
        f96628c = c.a(autotekaItemsArr);
    }

    public AutotekaItems() {
        throw null;
    }

    public static AutotekaItems valueOf(String str) {
        return (AutotekaItems) Enum.valueOf(AutotekaItems.class, str);
    }

    public static AutotekaItems[] values() {
        return (AutotekaItems[]) f96627b.clone();
    }
}

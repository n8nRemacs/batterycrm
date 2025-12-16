package com.avito.android.early_access.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyAccessModalResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/early_access/remote/model/PopupType;", "", "(Ljava/lang/String;I)V", "POPUP_PURCHASE", "POPUP_PURCHASE_NEW", "POPUP_PURCHASE_PACKAGES_SHORT", "POPUP_PURCHASE_PACKAGES_LONG", "POPUP_EA_BUNDLES", "POPUP_SECRET_ITEMS", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PopupType {

    @c("eaBundles")
    public static final PopupType POPUP_EA_BUNDLES;

    @c("popupPurchase")
    public static final PopupType POPUP_PURCHASE;

    @c("popupPurchaseNew")
    public static final PopupType POPUP_PURCHASE_NEW;

    @c("popupPurchasePackagesLong")
    public static final PopupType POPUP_PURCHASE_PACKAGES_LONG;

    @c("popupPurchasePackagesShort")
    public static final PopupType POPUP_PURCHASE_PACKAGES_SHORT;

    @c("secretItems")
    public static final PopupType POPUP_SECRET_ITEMS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PopupType[] f145574b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f145575c;

    static {
        PopupType popupType = new PopupType("POPUP_PURCHASE", 0);
        POPUP_PURCHASE = popupType;
        PopupType popupType2 = new PopupType("POPUP_PURCHASE_NEW", 1);
        POPUP_PURCHASE_NEW = popupType2;
        PopupType popupType3 = new PopupType("POPUP_PURCHASE_PACKAGES_SHORT", 2);
        POPUP_PURCHASE_PACKAGES_SHORT = popupType3;
        PopupType popupType4 = new PopupType("POPUP_PURCHASE_PACKAGES_LONG", 3);
        POPUP_PURCHASE_PACKAGES_LONG = popupType4;
        PopupType popupType5 = new PopupType("POPUP_EA_BUNDLES", 4);
        POPUP_EA_BUNDLES = popupType5;
        PopupType popupType6 = new PopupType("POPUP_SECRET_ITEMS", 5);
        POPUP_SECRET_ITEMS = popupType6;
        PopupType[] popupTypeArr = {popupType, popupType2, popupType3, popupType4, popupType5, popupType6};
        f145574b = popupTypeArr;
        f145575c = kotlin.enums.c.a(popupTypeArr);
    }

    private PopupType(String str, int i12) {
    }

    public static PopupType valueOf(String str) {
        return (PopupType) Enum.valueOf(PopupType.class, str);
    }

    public static PopupType[] values() {
        return (PopupType[]) f145574b.clone();
    }
}

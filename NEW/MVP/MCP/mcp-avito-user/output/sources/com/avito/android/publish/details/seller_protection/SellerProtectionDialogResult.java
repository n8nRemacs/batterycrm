package com.avito.android.publish.details.seller_protection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerProtectionBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/SellerProtectionDialogResult;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SellerProtectionDialogResult {

    /* renamed from: b, reason: collision with root package name */
    public static final SellerProtectionDialogResult f234927b;

    /* renamed from: c, reason: collision with root package name */
    public static final SellerProtectionDialogResult f234928c;

    /* renamed from: d, reason: collision with root package name */
    public static final SellerProtectionDialogResult f234929d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SellerProtectionDialogResult[] f234930e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f234931f;

    static {
        SellerProtectionDialogResult sellerProtectionDialogResult = new SellerProtectionDialogResult("CLOSED", 0);
        f234927b = sellerProtectionDialogResult;
        SellerProtectionDialogResult sellerProtectionDialogResult2 = new SellerProtectionDialogResult("ACCEPTED", 1);
        f234928c = sellerProtectionDialogResult2;
        SellerProtectionDialogResult sellerProtectionDialogResult3 = new SellerProtectionDialogResult("DECLINED", 2);
        f234929d = sellerProtectionDialogResult3;
        SellerProtectionDialogResult[] sellerProtectionDialogResultArr = {sellerProtectionDialogResult, sellerProtectionDialogResult2, sellerProtectionDialogResult3};
        f234930e = sellerProtectionDialogResultArr;
        f234931f = kotlin.enums.c.a(sellerProtectionDialogResultArr);
    }

    public SellerProtectionDialogResult() {
        throw null;
    }

    public static SellerProtectionDialogResult valueOf(String str) {
        return (SellerProtectionDialogResult) Enum.valueOf(SellerProtectionDialogResult.class, str);
    }

    public static SellerProtectionDialogResult[] values() {
        return (SellerProtectionDialogResult[]) f234930e.clone();
    }
}

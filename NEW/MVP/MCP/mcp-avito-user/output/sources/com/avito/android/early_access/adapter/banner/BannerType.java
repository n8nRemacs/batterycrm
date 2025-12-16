package com.avito.android.early_access.adapter.banner;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyAccessBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/banner/BannerType;", "", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerType {

    /* renamed from: b, reason: collision with root package name */
    public static final BannerType f145076b;

    /* renamed from: c, reason: collision with root package name */
    public static final BannerType f145077c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BannerType[] f145078d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145079e;

    static {
        BannerType bannerType = new BannerType("DEFAULT", 0);
        f145076b = bannerType;
        BannerType bannerType2 = new BannerType("SECRET_ITEMS", 1);
        f145077c = bannerType2;
        BannerType[] bannerTypeArr = {bannerType, bannerType2};
        f145078d = bannerTypeArr;
        f145079e = kotlin.enums.c.a(bannerTypeArr);
    }

    public BannerType() {
        throw null;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) f145078d.clone();
    }
}

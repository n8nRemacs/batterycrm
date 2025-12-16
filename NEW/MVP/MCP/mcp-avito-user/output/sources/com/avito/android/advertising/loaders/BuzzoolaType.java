package com.avito.android.advertising.loaders;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommercialBannersInteractorDebug.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/BuzzoolaType;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuzzoolaType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BuzzoolaType[] f87899b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87900c;

    static {
        BuzzoolaType[] buzzoolaTypeArr = {new BuzzoolaType("ThirdParty", 0), new BuzzoolaType("Premium", 1), new BuzzoolaType("PremiumV2", 2), new BuzzoolaType("ProfilePromo", 3)};
        f87899b = buzzoolaTypeArr;
        f87900c = kotlin.enums.c.a(buzzoolaTypeArr);
    }

    public BuzzoolaType() {
        throw null;
    }

    public static BuzzoolaType valueOf(String str) {
        return (BuzzoolaType) Enum.valueOf(BuzzoolaType.class, str);
    }

    public static BuzzoolaType[] values() {
        return (BuzzoolaType[]) f87899b.clone();
    }
}

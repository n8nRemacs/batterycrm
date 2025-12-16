package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfilePromoConstructorParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/ProfilePromoConstructorImagePosition;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfilePromoConstructorImagePosition {

    /* renamed from: b, reason: collision with root package name */
    public static final ProfilePromoConstructorImagePosition f87157b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProfilePromoConstructorImagePosition f87158c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProfilePromoConstructorImagePosition[] f87159d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87160e;

    static {
        ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition = new ProfilePromoConstructorImagePosition("TOP", 0);
        f87157b = profilePromoConstructorImagePosition;
        ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition2 = new ProfilePromoConstructorImagePosition("RIGHT", 1);
        f87158c = profilePromoConstructorImagePosition2;
        ProfilePromoConstructorImagePosition[] profilePromoConstructorImagePositionArr = {profilePromoConstructorImagePosition, profilePromoConstructorImagePosition2};
        f87159d = profilePromoConstructorImagePositionArr;
        f87160e = kotlin.enums.c.a(profilePromoConstructorImagePositionArr);
    }

    public ProfilePromoConstructorImagePosition() {
        throw null;
    }

    public static ProfilePromoConstructorImagePosition valueOf(String str) {
        return (ProfilePromoConstructorImagePosition) Enum.valueOf(ProfilePromoConstructorImagePosition.class, str);
    }

    public static ProfilePromoConstructorImagePosition[] values() {
        return (ProfilePromoConstructorImagePosition[]) f87159d.clone();
    }
}

package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfilePromoConstructorParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/ProfilePromoConstructorParamSet;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfilePromoConstructorParamSet {

    /* renamed from: c, reason: collision with root package name */
    public static final ProfilePromoConstructorParamSet f87170c;

    /* renamed from: d, reason: collision with root package name */
    public static final ProfilePromoConstructorParamSet f87171d;

    /* renamed from: e, reason: collision with root package name */
    public static final ProfilePromoConstructorParamSet f87172e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ProfilePromoConstructorParamSet[] f87173f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87174g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f87175b;

    static {
        ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition = ProfilePromoConstructorImagePosition.f87157b;
        boolean z12 = false;
        int i12 = 1;
        C42822w c42822w = null;
        ProfilePromoConstructorParamSet profilePromoConstructorParamSet = new ProfilePromoConstructorParamSet("ImageAtTop", 0, new c(z12, profilePromoConstructorImagePosition, R.dimen.ad_badges_margin, R.dimen.ad_profile_promo_grid_corner_radius, i12, c42822w));
        f87170c = profilePromoConstructorParamSet;
        ProfilePromoConstructorParamSet profilePromoConstructorParamSet2 = new ProfilePromoConstructorParamSet("ImageAtTopWithCornerRadius16", 1, new c(z12, profilePromoConstructorImagePosition, R.dimen.ad_badges_mid_margin, R.dimen.ad_borderless_grid_image_radius, i12, c42822w));
        f87171d = profilePromoConstructorParamSet2;
        ProfilePromoConstructorParamSet profilePromoConstructorParamSet3 = new ProfilePromoConstructorParamSet("Gallery", 2, new c(true, ProfilePromoConstructorImagePosition.f87158c, R.dimen.ad_badges_mid_margin, R.dimen.ad_profile_promo_gallery_item_corner_radius));
        f87172e = profilePromoConstructorParamSet3;
        ProfilePromoConstructorParamSet[] profilePromoConstructorParamSetArr = {profilePromoConstructorParamSet, profilePromoConstructorParamSet2, profilePromoConstructorParamSet3};
        f87173f = profilePromoConstructorParamSetArr;
        f87174g = kotlin.enums.c.a(profilePromoConstructorParamSetArr);
    }

    public ProfilePromoConstructorParamSet(String str, int i12, c cVar) {
        this.f87175b = cVar;
    }

    public static ProfilePromoConstructorParamSet valueOf(String str) {
        return (ProfilePromoConstructorParamSet) Enum.valueOf(ProfilePromoConstructorParamSet.class, str);
    }

    public static ProfilePromoConstructorParamSet[] values() {
        return (ProfilePromoConstructorParamSet[]) f87173f.clone();
    }
}

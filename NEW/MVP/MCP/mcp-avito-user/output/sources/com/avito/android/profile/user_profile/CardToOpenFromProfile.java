package com.avito.android.profile.user_profile;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserProfileFragmentData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/CardToOpenFromProfile;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CardToOpenFromProfile {

    /* renamed from: b, reason: collision with root package name */
    public static final CardToOpenFromProfile f224194b;

    /* renamed from: c, reason: collision with root package name */
    public static final CardToOpenFromProfile f224195c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CardToOpenFromProfile[] f224196d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f224197e;

    static {
        CardToOpenFromProfile cardToOpenFromProfile = new CardToOpenFromProfile("NONE", 0);
        f224194b = cardToOpenFromProfile;
        CardToOpenFromProfile cardToOpenFromProfile2 = new CardToOpenFromProfile("CALL_SETTINGS", 1);
        f224195c = cardToOpenFromProfile2;
        CardToOpenFromProfile[] cardToOpenFromProfileArr = {cardToOpenFromProfile, cardToOpenFromProfile2};
        f224196d = cardToOpenFromProfileArr;
        f224197e = kotlin.enums.c.a(cardToOpenFromProfileArr);
    }

    public CardToOpenFromProfile() {
        throw null;
    }

    public static CardToOpenFromProfile valueOf(String str) {
        return (CardToOpenFromProfile) Enum.valueOf(CardToOpenFromProfile.class, str);
    }

    public static CardToOpenFromProfile[] values() {
        return (CardToOpenFromProfile[]) f224196d.clone();
    }
}

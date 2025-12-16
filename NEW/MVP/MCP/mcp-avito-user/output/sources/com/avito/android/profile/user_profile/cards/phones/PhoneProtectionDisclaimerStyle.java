package com.avito.android.profile.user_profile.cards.phones;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhonesCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/phones/PhoneProtectionDisclaimerStyle;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneProtectionDisclaimerStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PhoneProtectionDisclaimerStyle[] f225152b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f225153c;

    static {
        PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr = {new PhoneProtectionDisclaimerStyle("SINGLE", 0), new PhoneProtectionDisclaimerStyle("MANY", 1), new PhoneProtectionDisclaimerStyle("CALL_SETTINGS", 2)};
        f225152b = phoneProtectionDisclaimerStyleArr;
        f225153c = kotlin.enums.c.a(phoneProtectionDisclaimerStyleArr);
    }

    public PhoneProtectionDisclaimerStyle() {
        throw null;
    }

    public static PhoneProtectionDisclaimerStyle valueOf(String str) {
        return (PhoneProtectionDisclaimerStyle) Enum.valueOf(PhoneProtectionDisclaimerStyle.class, str);
    }

    public static PhoneProtectionDisclaimerStyle[] values() {
        return (PhoneProtectionDisclaimerStyle[]) f225152b.clone();
    }
}

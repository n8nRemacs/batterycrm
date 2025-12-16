package com.avito.android.phone_reverification_info.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneReverificationButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/events/PhoneReverificationButtonName;", "", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneReverificationButtonName {

    /* renamed from: c, reason: collision with root package name */
    public static final PhoneReverificationButtonName f216100c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhoneReverificationButtonName f216101d;

    /* renamed from: e, reason: collision with root package name */
    public static final PhoneReverificationButtonName f216102e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PhoneReverificationButtonName[] f216103f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f216104g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f216105b;

    static {
        PhoneReverificationButtonName phoneReverificationButtonName = new PhoneReverificationButtonName("CONTINUE", 0, "continue");
        f216100c = phoneReverificationButtonName;
        PhoneReverificationButtonName phoneReverificationButtonName2 = new PhoneReverificationButtonName("CHANGE_PROFILE", 1, "change profile");
        f216101d = phoneReverificationButtonName2;
        PhoneReverificationButtonName phoneReverificationButtonName3 = new PhoneReverificationButtonName("BACK", 2, "back");
        f216102e = phoneReverificationButtonName3;
        PhoneReverificationButtonName[] phoneReverificationButtonNameArr = {phoneReverificationButtonName, phoneReverificationButtonName2, phoneReverificationButtonName3};
        f216103f = phoneReverificationButtonNameArr;
        f216104g = c.a(phoneReverificationButtonNameArr);
    }

    public PhoneReverificationButtonName(String str, int i12, String str2) {
        this.f216105b = str2;
    }

    public static PhoneReverificationButtonName valueOf(String str) {
        return (PhoneReverificationButtonName) Enum.valueOf(PhoneReverificationButtonName.class, str);
    }

    public static PhoneReverificationButtonName[] values() {
        return (PhoneReverificationButtonName[]) f216103f.clone();
    }
}

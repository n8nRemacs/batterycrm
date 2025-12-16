package com.avito.android.advert.item.cv_phone_actualization;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertCvPhoneActualizationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/cv_phone_actualization/AdvertCvPhoneActualizationActionType;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertCvPhoneActualizationActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final AdvertCvPhoneActualizationActionType f75029b;

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertCvPhoneActualizationActionType f75030c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AdvertCvPhoneActualizationActionType[] f75031d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75032e;

    static {
        AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType = new AdvertCvPhoneActualizationActionType("KEEP_PHONE", 0);
        f75029b = advertCvPhoneActualizationActionType;
        AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType2 = new AdvertCvPhoneActualizationActionType("CHANGE_PHONE", 1);
        f75030c = advertCvPhoneActualizationActionType2;
        AdvertCvPhoneActualizationActionType[] advertCvPhoneActualizationActionTypeArr = {advertCvPhoneActualizationActionType, advertCvPhoneActualizationActionType2};
        f75031d = advertCvPhoneActualizationActionTypeArr;
        f75032e = kotlin.enums.c.a(advertCvPhoneActualizationActionTypeArr);
    }

    public AdvertCvPhoneActualizationActionType() {
        throw null;
    }

    public static AdvertCvPhoneActualizationActionType valueOf(String str) {
        return (AdvertCvPhoneActualizationActionType) Enum.valueOf(AdvertCvPhoneActualizationActionType.class, str);
    }

    public static AdvertCvPhoneActualizationActionType[] values() {
        return (AdvertCvPhoneActualizationActionType[]) f75031d.clone();
    }
}

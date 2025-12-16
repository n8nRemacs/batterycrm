package com.avito.android.advert_core.advert;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsFlatView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsFlatViewType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsFlatViewType {

    /* renamed from: b, reason: collision with root package name */
    public static final AdvertDetailsFlatViewType f82420b;

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertDetailsFlatViewType f82421c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AdvertDetailsFlatViewType[] f82422d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f82423e;

    static {
        AdvertDetailsFlatViewType advertDetailsFlatViewType = new AdvertDetailsFlatViewType("DEFAULT", 0);
        f82420b = advertDetailsFlatViewType;
        AdvertDetailsFlatViewType advertDetailsFlatViewType2 = new AdvertDetailsFlatViewType("ABOUT_DEVELOPER", 1);
        f82421c = advertDetailsFlatViewType2;
        AdvertDetailsFlatViewType[] advertDetailsFlatViewTypeArr = {advertDetailsFlatViewType, advertDetailsFlatViewType2};
        f82422d = advertDetailsFlatViewTypeArr;
        f82423e = kotlin.enums.c.a(advertDetailsFlatViewTypeArr);
    }

    public AdvertDetailsFlatViewType() {
        throw null;
    }

    public static AdvertDetailsFlatViewType valueOf(String str) {
        return (AdvertDetailsFlatViewType) Enum.valueOf(AdvertDetailsFlatViewType.class, str);
    }

    public static AdvertDetailsFlatViewType[] values() {
        return (AdvertDetailsFlatViewType[]) f82422d.clone();
    }
}

package com.avito.android.extended_profile_widgets.adapter.search;

import Y61.k;
import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileSearchTabType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/ExtendedProfileSearchTabType;", "", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSearchTabType {

    /* renamed from: c, reason: collision with root package name */
    public static final ExtendedProfileSearchTabType f154620c;

    /* renamed from: d, reason: collision with root package name */
    public static final ExtendedProfileSearchTabType f154621d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ExtendedProfileSearchTabType[] f154622e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f154623f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154624b;

    static {
        ExtendedProfileSearchTabType extendedProfileSearchTabType = new ExtendedProfileSearchTabType("ACTIVE", 0, "active");
        f154620c = extendedProfileSearchTabType;
        ExtendedProfileSearchTabType extendedProfileSearchTabType2 = new ExtendedProfileSearchTabType("CLOSED", 1, AdvertStatus.CLOSED);
        f154621d = extendedProfileSearchTabType2;
        ExtendedProfileSearchTabType[] extendedProfileSearchTabTypeArr = {extendedProfileSearchTabType, extendedProfileSearchTabType2};
        f154622e = extendedProfileSearchTabTypeArr;
        f154623f = c.a(extendedProfileSearchTabTypeArr);
    }

    public ExtendedProfileSearchTabType(String str, int i12, String str2) {
        this.f154624b = str2;
    }

    public static ExtendedProfileSearchTabType valueOf(String str) {
        return (ExtendedProfileSearchTabType) Enum.valueOf(ExtendedProfileSearchTabType.class, str);
    }

    public static ExtendedProfileSearchTabType[] values() {
        return (ExtendedProfileSearchTabType[]) f154622e.clone();
    }
}

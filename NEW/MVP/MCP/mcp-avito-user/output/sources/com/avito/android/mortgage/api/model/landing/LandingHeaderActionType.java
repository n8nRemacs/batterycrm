package com.avito.android.mortgage.api.model.landing;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LandingHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/LandingHeaderActionType;", "", "(Ljava/lang/String;I)V", "COLLAPSE_HEADER", "NAVIGATION", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LandingHeaderActionType {

    @c("collapseHeader")
    public static final LandingHeaderActionType COLLAPSE_HEADER;

    @c("navigation")
    public static final LandingHeaderActionType NAVIGATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LandingHeaderActionType[] f198260b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198261c;

    static {
        LandingHeaderActionType landingHeaderActionType = new LandingHeaderActionType("COLLAPSE_HEADER", 0);
        COLLAPSE_HEADER = landingHeaderActionType;
        LandingHeaderActionType landingHeaderActionType2 = new LandingHeaderActionType("NAVIGATION", 1);
        NAVIGATION = landingHeaderActionType2;
        LandingHeaderActionType[] landingHeaderActionTypeArr = {landingHeaderActionType, landingHeaderActionType2};
        f198260b = landingHeaderActionTypeArr;
        f198261c = kotlin.enums.c.a(landingHeaderActionTypeArr);
    }

    private LandingHeaderActionType(String str, int i12) {
    }

    public static LandingHeaderActionType valueOf(String str) {
        return (LandingHeaderActionType) Enum.valueOf(LandingHeaderActionType.class, str);
    }

    public static LandingHeaderActionType[] values() {
        return (LandingHeaderActionType[]) f198260b.clone();
    }
}

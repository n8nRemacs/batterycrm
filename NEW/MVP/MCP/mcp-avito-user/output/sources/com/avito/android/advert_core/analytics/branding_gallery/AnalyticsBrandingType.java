package com.avito.android.advert_core.analytics.branding_gallery;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrandingShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/branding_gallery/AnalyticsBrandingType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnalyticsBrandingType {

    /* renamed from: c, reason: collision with root package name */
    public static final AnalyticsBrandingType f82805c;

    /* renamed from: d, reason: collision with root package name */
    public static final AnalyticsBrandingType f82806d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnalyticsBrandingType f82807e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AnalyticsBrandingType[] f82808f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f82809g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82810b;

    static {
        AnalyticsBrandingType analyticsBrandingType = new AnalyticsBrandingType("MEDIA", 0, "media");
        f82805c = analyticsBrandingType;
        AnalyticsBrandingType analyticsBrandingType2 = new AnalyticsBrandingType("BENEFITS", 1, "benefits");
        f82806d = analyticsBrandingType2;
        AnalyticsBrandingType analyticsBrandingType3 = new AnalyticsBrandingType("ABOUT_US", 2, "about_us");
        f82807e = analyticsBrandingType3;
        AnalyticsBrandingType[] analyticsBrandingTypeArr = {analyticsBrandingType, analyticsBrandingType2, analyticsBrandingType3};
        f82808f = analyticsBrandingTypeArr;
        f82809g = c.a(analyticsBrandingTypeArr);
    }

    public AnalyticsBrandingType(String str, int i12, String str2) {
        this.f82810b = str2;
    }

    public static AnalyticsBrandingType valueOf(String str) {
        return (AnalyticsBrandingType) Enum.valueOf(AnalyticsBrandingType.class, str);
    }

    public static AnalyticsBrandingType[] values() {
        return (AnalyticsBrandingType[]) f82808f.clone();
    }
}

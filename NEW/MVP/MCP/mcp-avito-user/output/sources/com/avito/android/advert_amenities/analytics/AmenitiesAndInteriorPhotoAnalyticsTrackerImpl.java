package com.avito.android.advert_amenities.analytics;

import B7.a;
import B7.d;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: AmenitiesAndInteriorPhotoAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_amenities/analytics/AmenitiesAndInteriorPhotoAnalyticsTrackerImpl;", "LB7/a;", "FromBlock", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmenitiesAndInteriorPhotoAnalyticsTrackerImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f81145a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AmenitiesAndInteriorPhotoAnalyticsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_amenities/analytics/AmenitiesAndInteriorPhotoAnalyticsTrackerImpl$FromBlock;", "", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromBlock {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FromBlock[] f81146b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f81147c;

        static {
            FromBlock[] fromBlockArr = {new FromBlock("AMENITIES_AND_INTERIOR_PHOTOS", 0), new FromBlock("AMENITIES", 1), new FromBlock("INTERIOR_PHOTOS", 2)};
            f81146b = fromBlockArr;
            f81147c = c.a(fromBlockArr);
        }

        public static FromBlock valueOf(String str) {
            return (FromBlock) Enum.valueOf(FromBlock.class, str);
        }

        public static FromBlock[] values() {
            return (FromBlock[]) f81146b.clone();
        }
    }

    @Inject
    public AmenitiesAndInteriorPhotoAnalyticsTrackerImpl(@k InterfaceC28373a interfaceC28373a) {
        this.f81145a = interfaceC28373a;
    }

    @Override // B7.a
    public final void a(@l String str, @k String str2, @l Map map) {
        this.f81145a.c(new B7.c(map, str, str2));
    }

    @Override // B7.a
    public final void b(@k String str, @l Map map) {
        this.f81145a.c(new d(map, str));
    }
}

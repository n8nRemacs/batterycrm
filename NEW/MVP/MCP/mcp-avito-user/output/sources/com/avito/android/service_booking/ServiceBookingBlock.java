package com.avito.android.service_booking;

import K51.d;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking/ServiceBookingBlock;", "Landroid/os/Parcelable;", "Type", "Lcom/avito/android/service_booking/SbCheckPriceListBlock;", "Lcom/avito/android/service_booking/SbCommentBlock;", "Lcom/avito/android/service_booking/SbContactBlock;", "Lcom/avito/android/service_booking/SbDateBlock;", "Lcom/avito/android/service_booking/SbDaysBlock;", "Lcom/avito/android/service_booking/SbGeoReferenceBlock;", "Lcom/avito/android/service_booking/SbInfoBannerBlock;", "Lcom/avito/android/service_booking/SbInputBlock;", "Lcom/avito/android/service_booking/SbOfferBlock;", "Lcom/avito/android/service_booking/SbPartnerLogoBlock;", "Lcom/avito/android/service_booking/SbPriceListBlock;", "Lcom/avito/android/service_booking/SbSpecialistsBlock;", "Lcom/avito/android/service_booking/SbTextBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingBlock extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/ServiceBookingBlock$Type;", "", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f274145b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f274146c;

        static {
            Type[] typeArr = {new Type("BLOCK_TYPE_TEXT", 0), new Type("BLOCK_TYPE_CONTACTS", 1), new Type("BLOCK_TYPE_CHECK_PRICE_LIST", 2), new Type("BLOCK_TYPE_DATE", 3), new Type("BLOCK_TYPE_DAYS", 4), new Type("BLOCK_TYPE_PRICE_LIST", 5), new Type("BLOCK_TYPE_OFFER", 6), new Type("BLOCK_TYPE_INPUT", 7), new Type("BLOCK_TYPE_COMMENT", 8), new Type("BLOCK_TYPE_SPECIALISTS", 9), new Type("BLOCK_TYPE_PARTNER_LOGO", 10), new Type("BLOCK_TYPE_GEO_REFERENCE", 11), new Type("BLOCK_TYPE_INFO_BANNER", 12)};
            f274145b = typeArr;
            f274146c = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f274145b.clone();
        }
    }
}

package com.avito.android.hotel_public.generated.api.api_2_hotel_by_item_id_get_offer_get;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart$HighlightType;", "highlightType", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart$HighlightType;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart$HighlightType;", "b", "()Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart$HighlightType;", "HighlightType", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentEntryPointPart {

    @c("attributedText")
    @k
    private final AttributedText attributedText;

    @c("highlightType")
    @l
    private final HighlightType highlightType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/hotel_public/generated/api/api_2_hotel_by_item_id_get_offer_get/InstallmentEntryPointPart$HighlightType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HighlightType {

        @c("flag")
        public static final HighlightType Flag;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HighlightType[] f164124b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f164125c;

        static {
            HighlightType highlightType = new HighlightType("Flag", 0, "flag");
            Flag = highlightType;
            HighlightType[] highlightTypeArr = {highlightType};
            f164124b = highlightTypeArr;
            f164125c = kotlin.enums.c.a(highlightTypeArr);
        }

        private HighlightType(String str, int i12, String str2) {
        }

        public static HighlightType valueOf(String str) {
            return (HighlightType) Enum.valueOf(HighlightType.class, str);
        }

        public static HighlightType[] values() {
            return (HighlightType[]) f164124b.clone();
        }
    }

    public InstallmentEntryPointPart(@k AttributedText attributedText, @l HighlightType highlightType) {
        this.attributedText = attributedText;
        this.highlightType = highlightType;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final HighlightType getHighlightType() {
        return this.highlightType;
    }
}

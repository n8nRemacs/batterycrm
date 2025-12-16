package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint;", "Landroid/os/Parcelable;", "", "textPartsSpacing", "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;", "leftPart", "rightPart", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;)V", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;", "c", "()Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;", "d", "HighlightType", "Part", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelOfferInstallmentsEntryPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferInstallmentsEntryPoint> CREATOR = new a();

    @c("leftPart")
    @l
    private final Part leftPart;

    @c("rightPart")
    @l
    private final Part rightPart;

    @c("textPartsSpacing")
    @l
    private final Integer textPartsSpacing;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$HighlightType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "FLAG", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HighlightType implements Parcelable {

        @k
        public static final Parcelable.Creator<HighlightType> CREATOR;

        @c("flag")
        public static final HighlightType FLAG;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HighlightType[] f162636b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f162637c;

        /* compiled from: AdvertHotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HighlightType> {
            @Override // android.os.Parcelable.Creator
            public final HighlightType createFromParcel(Parcel parcel) {
                return HighlightType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HighlightType[] newArray(int i12) {
                return new HighlightType[i12];
            }
        }

        static {
            HighlightType highlightType = new HighlightType("FLAG", 0);
            FLAG = highlightType;
            HighlightType[] highlightTypeArr = {highlightType};
            f162636b = highlightTypeArr;
            f162637c = kotlin.enums.c.a(highlightTypeArr);
            CREATOR = new a();
        }

        private HighlightType(String str, int i12) {
        }

        public static HighlightType valueOf(String str) {
            return (HighlightType) Enum.valueOf(HighlightType.class, str);
        }

        public static HighlightType[] values() {
            return (HighlightType[]) f162636b.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AdvertHotelRoom.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$Part;", "Landroid/os/Parcelable;", "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$HighlightType;", "highlightType", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "<init>", "(Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$HighlightType;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$HighlightType;", "d", "()Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint$HighlightType;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Part implements Parcelable {

        @k
        public static final Parcelable.Creator<Part> CREATOR = new a();

        @c("attributedText")
        @l
        private final AttributedText attributedText;

        @c("highlightType")
        @l
        private final HighlightType highlightType;

        /* compiled from: AdvertHotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Part> {
            @Override // android.os.Parcelable.Creator
            public final Part createFromParcel(Parcel parcel) {
                return new Part(parcel.readInt() == 0 ? null : HighlightType.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Part.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Part[] newArray(int i12) {
                return new Part[i12];
            }
        }

        public Part(@l HighlightType highlightType, @l AttributedText attributedText) {
            this.highlightType = highlightType;
            this.attributedText = attributedText;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final HighlightType getHighlightType() {
            return this.highlightType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            HighlightType highlightType = this.highlightType;
            if (highlightType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                highlightType.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.attributedText, i12);
        }
    }

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferInstallmentsEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferInstallmentsEntryPoint createFromParcel(Parcel parcel) {
            return new HotelOfferInstallmentsEntryPoint(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Part.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferInstallmentsEntryPoint[] newArray(int i12) {
            return new HotelOfferInstallmentsEntryPoint[i12];
        }
    }

    public HotelOfferInstallmentsEntryPoint(@l Integer num, @l Part part, @l Part part2) {
        this.textPartsSpacing = num;
        this.leftPart = part;
        this.rightPart = part2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Part getLeftPart() {
        return this.leftPart;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Part getRightPart() {
        return this.rightPart;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getTextPartsSpacing() {
        return this.textPartsSpacing;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.textPartsSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Part part = this.leftPart;
        if (part == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part.writeToParcel(parcel, i12);
        }
        Part part2 = this.rightPart;
        if (part2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part2.writeToParcel(parcel, i12);
        }
    }
}

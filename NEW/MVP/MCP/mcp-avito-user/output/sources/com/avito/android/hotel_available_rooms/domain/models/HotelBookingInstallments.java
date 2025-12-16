package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingInstallments;", "Landroid/os/Parcelable;", "HighlightType", "Part", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingInstallments implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingInstallments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f162776b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Part f162777c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Part f162778d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f162779e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HotelRoom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingInstallments$HighlightType;", "", "Landroid/os/Parcelable;", "a", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HighlightType implements Parcelable {

        @k
        public static final Parcelable.Creator<HighlightType> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f162780b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ HighlightType[] f162781c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f162782d;

        /* compiled from: HotelRoom.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingInstallments$HighlightType$a;", "", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @l
            public static HighlightType a(@l String str) {
                Object next;
                Iterator it = ((AbstractC42738c) HighlightType.f162782d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ((HighlightType) next).getClass();
                    if ("flag".equals(str)) {
                        break;
                    }
                }
                return (HighlightType) next;
            }

            public a() {
            }
        }

        /* compiled from: HotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<HighlightType> {
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
            HighlightType[] highlightTypeArr = {new HighlightType()};
            f162781c = highlightTypeArr;
            f162782d = c.a(highlightTypeArr);
            f162780b = new a(null);
            CREATOR = new b();
        }

        public static HighlightType valueOf(String str) {
            return (HighlightType) Enum.valueOf(HighlightType.class, str);
        }

        public static HighlightType[] values() {
            return (HighlightType[]) f162781c.clone();
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

    /* compiled from: HotelRoom.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingInstallments$Part;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Part implements Parcelable {

        @k
        public static final Parcelable.Creator<Part> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f162783b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final HighlightType f162784c;

        /* compiled from: HotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Part> {
            @Override // android.os.Parcelable.Creator
            public final Part createFromParcel(Parcel parcel) {
                return new Part((AttributedText) parcel.readParcelable(Part.class.getClassLoader()), parcel.readInt() == 0 ? null : HighlightType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Part[] newArray(int i12) {
                return new Part[i12];
            }
        }

        public Part(@k AttributedText attributedText, @l HighlightType highlightType) {
            this.f162783b = attributedText;
            this.f162784c = highlightType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Part)) {
                return false;
            }
            Part part = (Part) obj;
            return L.f(this.f162783b, part.f162783b) && this.f162784c == part.f162784c;
        }

        public final int hashCode() {
            int iHashCode = this.f162783b.hashCode() * 31;
            HighlightType highlightType = this.f162784c;
            return iHashCode + (highlightType == null ? 0 : highlightType.hashCode());
        }

        @k
        public final String toString() {
            return "Part(attributedText=" + this.f162783b + ", highlightType=" + this.f162784c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f162783b, i12);
            HighlightType highlightType = this.f162784c;
            if (highlightType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                highlightType.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: HotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingInstallments> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingInstallments createFromParcel(Parcel parcel) {
            return new HotelBookingInstallments((DeepLink) parcel.readParcelable(HotelBookingInstallments.class.getClassLoader()), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingInstallments[] newArray(int i12) {
            return new HotelBookingInstallments[i12];
        }
    }

    public HotelBookingInstallments(@l DeepLink deepLink, @l Part part, @l Part part2, @l Integer num) {
        this.f162776b = deepLink;
        this.f162777c = part;
        this.f162778d = part2;
        this.f162779e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingInstallments)) {
            return false;
        }
        HotelBookingInstallments hotelBookingInstallments = (HotelBookingInstallments) obj;
        return L.f(this.f162776b, hotelBookingInstallments.f162776b) && L.f(this.f162777c, hotelBookingInstallments.f162777c) && L.f(this.f162778d, hotelBookingInstallments.f162778d) && L.f(this.f162779e, hotelBookingInstallments.f162779e);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f162776b;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        Part part = this.f162777c;
        int iHashCode2 = (iHashCode + (part == null ? 0 : part.hashCode())) * 31;
        Part part2 = this.f162778d;
        int iHashCode3 = (iHashCode2 + (part2 == null ? 0 : part2.hashCode())) * 31;
        Integer num = this.f162779e;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingInstallments(deepLink=");
        sb2.append(this.f162776b);
        sb2.append(", leftPart=");
        sb2.append(this.f162777c);
        sb2.append(", rightPart=");
        sb2.append(this.f162778d);
        sb2.append(", textPartsSpacing=");
        return s.j(sb2, this.f162779e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f162776b, i12);
        Part part = this.f162777c;
        if (part == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part.writeToParcel(parcel, i12);
        }
        Part part2 = this.f162778d;
        if (part2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part2.writeToParcel(parcel, i12);
        }
        Integer num = this.f162779e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}

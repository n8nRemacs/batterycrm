package com.avito.android.hotel_available_rooms.konveyor.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomTextItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData;", "Landroid/os/Parcelable;", "AttributedTextData", "SimpleTextData", "Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData$AttributedTextData;", "Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData$SimpleTextData;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TextData extends Parcelable {

    /* compiled from: HotelRoomTextItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData$AttributedTextData;", "Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AttributedTextData implements TextData {

        @k
        public static final Parcelable.Creator<AttributedTextData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f163069b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f163070c;

        /* compiled from: HotelRoomTextItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedTextData> {
            @Override // android.os.Parcelable.Creator
            public final AttributedTextData createFromParcel(Parcel parcel) {
                return new AttributedTextData((AttributedText) parcel.readParcelable(AttributedTextData.class.getClassLoader()), (DeepLink) parcel.readParcelable(AttributedTextData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedTextData[] newArray(int i12) {
                return new AttributedTextData[i12];
            }
        }

        public AttributedTextData(@k AttributedText attributedText, @l DeepLink deepLink) {
            this.f163069b = attributedText;
            this.f163070c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttributedTextData)) {
                return false;
            }
            AttributedTextData attributedTextData = (AttributedTextData) obj;
            return L.f(this.f163069b, attributedTextData.f163069b) && L.f(this.f163070c, attributedTextData.f163070c);
        }

        @Override // com.avito.android.hotel_available_rooms.konveyor.text.TextData
        @l
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF163073d() {
            return this.f163070c;
        }

        public final int hashCode() {
            int iHashCode = this.f163069b.hashCode() * 31;
            DeepLink deepLink = this.f163070c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedTextData(text=");
            sb2.append(this.f163069b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f163070c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f163069b, i12);
            parcel.writeParcelable(this.f163070c, i12);
        }
    }

    /* compiled from: HotelRoomTextItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData$SimpleTextData;", "Lcom/avito/android/hotel_available_rooms/konveyor/text/TextData;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SimpleTextData implements TextData {

        @k
        public static final Parcelable.Creator<SimpleTextData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163071b;

        /* renamed from: c, reason: collision with root package name */
        public final int f163072c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f163073d;

        /* compiled from: HotelRoomTextItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SimpleTextData> {
            @Override // android.os.Parcelable.Creator
            public final SimpleTextData createFromParcel(Parcel parcel) {
                return new SimpleTextData((PrintableText) parcel.readParcelable(SimpleTextData.class.getClassLoader()), parcel.readInt(), (DeepLink) parcel.readParcelable(SimpleTextData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SimpleTextData[] newArray(int i12) {
                return new SimpleTextData[i12];
            }
        }

        public SimpleTextData(@k PrintableText printableText, int i12, @l DeepLink deepLink) {
            this.f163071b = printableText;
            this.f163072c = i12;
            this.f163073d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleTextData)) {
                return false;
            }
            SimpleTextData simpleTextData = (SimpleTextData) obj;
            return L.f(this.f163071b, simpleTextData.f163071b) && this.f163072c == simpleTextData.f163072c && L.f(this.f163073d, simpleTextData.f163073d);
        }

        @Override // com.avito.android.hotel_available_rooms.konveyor.text.TextData
        @l
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF163073d() {
            return this.f163073d;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f163072c, this.f163071b.hashCode() * 31, 31);
            DeepLink deepLink = this.f163073d;
            return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SimpleTextData(text=");
            sb2.append(this.f163071b);
            sb2.append(", styleRes=");
            sb2.append(this.f163072c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f163073d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f163071b, i12);
            parcel.writeInt(this.f163072c);
            parcel.writeParcelable(this.f163073d, i12);
        }
    }

    @l
    /* renamed from: getDeeplink */
    DeepLink getF163073d();
}

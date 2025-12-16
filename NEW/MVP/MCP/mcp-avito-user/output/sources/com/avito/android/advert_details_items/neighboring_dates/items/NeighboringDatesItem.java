package com.avito.android.advert_details_items.neighboring_dates.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: NeighboringDatesItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "NeighboringDatesChipItem", "NeighboringDatesShimmerItem", "PreloadContext", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesChipItem;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesShimmerItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NeighboringDatesItem extends ParcelableItem {

    /* compiled from: NeighboringDatesItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesChipItem;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "ChipType", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NeighboringDatesChipItem implements NeighboringDatesItem, ParcelableItem {

        @k
        public static final Parcelable.Creator<NeighboringDatesChipItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f84922b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PreloadContext f84923c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f84924d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f84925e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f84926f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f84927g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final ChipType f84928h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NeighboringDatesItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesChipItem$ChipType;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ChipType {

            /* renamed from: b, reason: collision with root package name */
            public static final ChipType f84929b;

            /* renamed from: c, reason: collision with root package name */
            public static final ChipType f84930c;

            /* renamed from: d, reason: collision with root package name */
            public static final ChipType f84931d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ChipType[] f84932e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f84933f;

            static {
                ChipType chipType = new ChipType("DEFAULT", 0);
                f84929b = chipType;
                ChipType chipType2 = new ChipType("SELECTED", 1);
                f84930c = chipType2;
                ChipType chipType3 = new ChipType("START_POSITION", 2);
                f84931d = chipType3;
                ChipType[] chipTypeArr = {chipType, chipType2, chipType3};
                f84932e = chipTypeArr;
                f84933f = c.a(chipTypeArr);
            }

            public ChipType() {
                throw null;
            }

            public static ChipType valueOf(String str) {
                return (ChipType) Enum.valueOf(ChipType.class, str);
            }

            public static ChipType[] values() {
                return (ChipType[]) f84932e.clone();
            }
        }

        /* compiled from: NeighboringDatesItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NeighboringDatesChipItem> {
            @Override // android.os.Parcelable.Creator
            public final NeighboringDatesChipItem createFromParcel(Parcel parcel) {
                return new NeighboringDatesChipItem(parcel.readString(), (PreloadContext) parcel.readParcelable(NeighboringDatesChipItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(NeighboringDatesChipItem.class.getClassLoader()), parcel.readString(), parcel.readString(), ChipType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final NeighboringDatesChipItem[] newArray(int i12) {
                return new NeighboringDatesChipItem[i12];
            }
        }

        public NeighboringDatesChipItem(@k String str, @l PreloadContext preloadContext, @k String str2, @k AttributedText attributedText, @k String str3, @k String str4, @k ChipType chipType) {
            this.f84922b = str;
            this.f84923c = preloadContext;
            this.f84924d = str2;
            this.f84925e = attributedText;
            this.f84926f = str3;
            this.f84927g = str4;
            this.f84928h = chipType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeighboringDatesChipItem)) {
                return false;
            }
            NeighboringDatesChipItem neighboringDatesChipItem = (NeighboringDatesChipItem) obj;
            return L.f(this.f84922b, neighboringDatesChipItem.f84922b) && L.f(this.f84923c, neighboringDatesChipItem.f84923c) && L.f(this.f84924d, neighboringDatesChipItem.f84924d) && L.f(this.f84925e, neighboringDatesChipItem.f84925e) && L.f(this.f84926f, neighboringDatesChipItem.f84926f) && L.f(this.f84927g, neighboringDatesChipItem.f84927g) && this.f84928h == neighboringDatesChipItem.f84928h;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF79541k() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF79540j() {
            return this.f84922b;
        }

        public final int hashCode() {
            int iHashCode = this.f84922b.hashCode() * 31;
            PreloadContext preloadContext = this.f84923c;
            return this.f84928h.hashCode() + H.d(H.d(com.avito.android.actions_sheet.a.b(H.d((iHashCode + (preloadContext == null ? 0 : preloadContext.hashCode())) * 31, 31, this.f84924d), 31, this.f84925e), 31, this.f84926f), 31, this.f84927g);
        }

        @k
        public final String toString() {
            return "NeighboringDatesChipItem(stringId=" + this.f84922b + ", preloadContext=" + this.f84923c + ", context=" + this.f84924d + ", text=" + this.f84925e + ", checkInDate=" + this.f84926f + ", checkOutDate=" + this.f84927g + ", chipType=" + this.f84928h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f84922b);
            parcel.writeParcelable(this.f84923c, i12);
            parcel.writeString(this.f84924d);
            parcel.writeParcelable(this.f84925e, i12);
            parcel.writeString(this.f84926f);
            parcel.writeString(this.f84927g);
            parcel.writeString(this.f84928h.name());
        }
    }

    /* compiled from: NeighboringDatesItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesShimmerItem;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NeighboringDatesShimmerItem implements NeighboringDatesItem, ParcelableItem {

        @k
        public static final Parcelable.Creator<NeighboringDatesShimmerItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f84934b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PreloadContext f84935c;

        /* compiled from: NeighboringDatesItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NeighboringDatesShimmerItem> {
            @Override // android.os.Parcelable.Creator
            public final NeighboringDatesShimmerItem createFromParcel(Parcel parcel) {
                return new NeighboringDatesShimmerItem(parcel.readString(), (PreloadContext) parcel.readParcelable(NeighboringDatesShimmerItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NeighboringDatesShimmerItem[] newArray(int i12) {
                return new NeighboringDatesShimmerItem[i12];
            }
        }

        public NeighboringDatesShimmerItem(@k String str, @l PreloadContext preloadContext) {
            this.f84934b = str;
            this.f84935c = preloadContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeighboringDatesShimmerItem)) {
                return false;
            }
            NeighboringDatesShimmerItem neighboringDatesShimmerItem = (NeighboringDatesShimmerItem) obj;
            return L.f(this.f84934b, neighboringDatesShimmerItem.f84934b) && L.f(this.f84935c, neighboringDatesShimmerItem.f84935c);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF79541k() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF79540j() {
            return this.f84934b;
        }

        public final int hashCode() {
            int iHashCode = this.f84934b.hashCode() * 31;
            PreloadContext preloadContext = this.f84935c;
            return iHashCode + (preloadContext == null ? 0 : preloadContext.hashCode());
        }

        @k
        public final String toString() {
            return "NeighboringDatesShimmerItem(stringId=" + this.f84934b + ", preloadContext=" + this.f84935c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f84934b);
            parcel.writeParcelable(this.f84935c, i12);
        }
    }

    /* compiled from: NeighboringDatesItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext;", "Landroid/os/Parcelable;", "Later", "Previous", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext$Later;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext$Previous;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface PreloadContext extends Parcelable {

        /* compiled from: NeighboringDatesItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext$Later;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Later implements PreloadContext {

            @k
            public static final Parcelable.Creator<Later> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f84936b;

            /* compiled from: NeighboringDatesItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Later> {
                @Override // android.os.Parcelable.Creator
                public final Later createFromParcel(Parcel parcel) {
                    return new Later(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Later[] newArray(int i12) {
                    return new Later[i12];
                }
            }

            public Later(@k String str) {
                this.f84936b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Later) && L.f(this.f84936b, ((Later) obj).f84936b);
            }

            @Override // com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem.PreloadContext
            @k
            /* renamed from: getContext, reason: from getter */
            public final String getF84937b() {
                return this.f84936b;
            }

            public final int hashCode() {
                return this.f84936b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Later(context="), this.f84936b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f84936b);
            }
        }

        /* compiled from: NeighboringDatesItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext$Previous;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$PreloadContext;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Previous implements PreloadContext {

            @k
            public static final Parcelable.Creator<Previous> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f84937b;

            /* compiled from: NeighboringDatesItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Previous> {
                @Override // android.os.Parcelable.Creator
                public final Previous createFromParcel(Parcel parcel) {
                    return new Previous(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Previous[] newArray(int i12) {
                    return new Previous[i12];
                }
            }

            public Previous(@k String str) {
                this.f84937b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Previous) && L.f(this.f84937b, ((Previous) obj).f84937b);
            }

            @Override // com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem.PreloadContext
            @k
            /* renamed from: getContext, reason: from getter */
            public final String getF84937b() {
                return this.f84937b;
            }

            public final int hashCode() {
                return this.f84937b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Previous(context="), this.f84937b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f84937b);
            }
        }

        @k
        /* renamed from: getContext */
        String getF84937b();
    }

    /* compiled from: NeighboringDatesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}

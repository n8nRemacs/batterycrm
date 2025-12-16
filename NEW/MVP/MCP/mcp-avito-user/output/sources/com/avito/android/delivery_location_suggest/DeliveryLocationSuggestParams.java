package com.avito.android.delivery_location_suggest;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSuggestParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams;", "Landroid/os/Parcelable;", "<init>", "()V", "Bounds", "ItemLocationId", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams$Bounds;", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams$ItemLocationId;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeliveryLocationSuggestParams implements Parcelable {

    /* compiled from: DeliveryLocationSuggestParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams$Bounds;", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Bounds extends DeliveryLocationSuggestParams {

        @Y61.k
        public static final Parcelable.Creator<Bounds> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MapBounds f135036b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f135037c;

        /* compiled from: DeliveryLocationSuggestParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Bounds> {
            @Override // android.os.Parcelable.Creator
            public final Bounds createFromParcel(Parcel parcel) {
                return new Bounds(MapBounds.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Bounds[] newArray(int i12) {
                return new Bounds[i12];
            }
        }

        public /* synthetic */ Bounds(MapBounds mapBounds, String str, int i12, C42822w c42822w) {
            this(mapBounds, (i12 & 2) != 0 ? null : str);
        }

        @Override // com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF135039c() {
            return this.f135037c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bounds)) {
                return false;
            }
            Bounds bounds = (Bounds) obj;
            return L.f(this.f135036b, bounds.f135036b) && L.f(this.f135037c, bounds.f135037c);
        }

        public final int hashCode() {
            int iHashCode = this.f135036b.hashCode() * 31;
            String str = this.f135037c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Bounds(visibleRegion=");
            sb2.append(this.f135036b);
            sb2.append(", initialQuery=");
            return C22026a.c(sb2, this.f135037c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f135036b.writeToParcel(parcel, i12);
            parcel.writeString(this.f135037c);
        }

        public Bounds(@Y61.k MapBounds mapBounds, @Y61.l String str) {
            super(null);
            this.f135036b = mapBounds;
            this.f135037c = str;
        }
    }

    /* compiled from: DeliveryLocationSuggestParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams$ItemLocationId;", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemLocationId extends DeliveryLocationSuggestParams {

        @Y61.k
        public static final Parcelable.Creator<ItemLocationId> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f135038b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f135039c;

        /* compiled from: DeliveryLocationSuggestParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemLocationId> {
            @Override // android.os.Parcelable.Creator
            public final ItemLocationId createFromParcel(Parcel parcel) {
                return new ItemLocationId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ItemLocationId[] newArray(int i12) {
                return new ItemLocationId[i12];
            }
        }

        public ItemLocationId(@Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f135038b = str;
            this.f135039c = str2;
        }

        @Override // com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF135039c() {
            return this.f135039c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemLocationId)) {
                return false;
            }
            ItemLocationId itemLocationId = (ItemLocationId) obj;
            return L.f(this.f135038b, itemLocationId.f135038b) && L.f(this.f135039c, itemLocationId.f135039c);
        }

        public final int hashCode() {
            String str = this.f135038b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f135039c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemLocationId(itemLocationId=");
            sb2.append(this.f135038b);
            sb2.append(", initialQuery=");
            return C22026a.c(sb2, this.f135039c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f135038b);
            parcel.writeString(this.f135039c);
        }
    }

    public /* synthetic */ DeliveryLocationSuggestParams(C42822w c42822w) {
        this();
    }

    @Y61.l
    /* renamed from: c */
    public abstract String getF135039c();

    public DeliveryLocationSuggestParams() {
    }
}

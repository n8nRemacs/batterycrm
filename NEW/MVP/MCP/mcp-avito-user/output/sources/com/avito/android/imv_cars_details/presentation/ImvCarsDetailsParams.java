package com.avito.android.imv_cars_details.presentation;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams;", "Lcom/avito/android/util/OpenParams;", "ImvIdParams", "ItemIdParams", "Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams$ImvIdParams;", "Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams$ItemIdParams;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ImvCarsDetailsParams implements OpenParams {

    /* compiled from: ImvCarsDetailsParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams$ImvIdParams;", "Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImvIdParams extends ImvCarsDetailsParams {

        @Y61.k
        public static final Parcelable.Creator<ImvIdParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f170033b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f170034c;

        /* compiled from: ImvCarsDetailsParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImvIdParams> {
            @Override // android.os.Parcelable.Creator
            public final ImvIdParams createFromParcel(Parcel parcel) {
                return new ImvIdParams(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImvIdParams[] newArray(int i12) {
                return new ImvIdParams[i12];
            }
        }

        public ImvIdParams(@Y61.k String str, @Y61.k String str2) {
            super(str, null);
            this.f170033b = str;
            this.f170034c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImvIdParams)) {
                return false;
            }
            ImvIdParams imvIdParams = (ImvIdParams) obj;
            return L.f(this.f170033b, imvIdParams.f170033b) && L.f(this.f170034c, imvIdParams.f170034c);
        }

        public final int hashCode() {
            return this.f170034c.hashCode() + (this.f170033b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImvIdParams(id=");
            sb2.append(this.f170033b);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f170034c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f170033b);
            parcel.writeString(this.f170034c);
        }
    }

    /* compiled from: ImvCarsDetailsParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams$ItemIdParams;", "Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemIdParams extends ImvCarsDetailsParams {

        @Y61.k
        public static final Parcelable.Creator<ItemIdParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f170035b;

        /* compiled from: ImvCarsDetailsParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemIdParams> {
            @Override // android.os.Parcelable.Creator
            public final ItemIdParams createFromParcel(Parcel parcel) {
                return new ItemIdParams(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ItemIdParams[] newArray(int i12) {
                return new ItemIdParams[i12];
            }
        }

        public ItemIdParams(@Y61.k String str) {
            super(str, null);
            this.f170035b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemIdParams) && L.f(this.f170035b, ((ItemIdParams) obj).f170035b);
        }

        public final int hashCode() {
            return this.f170035b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemIdParams(id="), this.f170035b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f170035b);
        }
    }

    public ImvCarsDetailsParams(String str, C42822w c42822w) {
    }
}

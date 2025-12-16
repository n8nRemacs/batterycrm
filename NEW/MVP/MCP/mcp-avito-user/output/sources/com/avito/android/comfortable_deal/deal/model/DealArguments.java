package com.avito.android.comfortable_deal.deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/model/DealArguments;", "Landroid/os/Parcelable;", "DealIdArguments", "DealProcessIdArguments", "Lcom/avito/android/comfortable_deal/deal/model/DealArguments$DealIdArguments;", "Lcom/avito/android/comfortable_deal/deal/model/DealArguments$DealProcessIdArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DealArguments extends Parcelable {

    /* compiled from: DealArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/model/DealArguments$DealIdArguments;", "Lcom/avito/android/comfortable_deal/deal/model/DealArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DealIdArguments implements DealArguments {

        @k
        public static final Parcelable.Creator<DealIdArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121560b;

        /* compiled from: DealArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DealIdArguments> {
            @Override // android.os.Parcelable.Creator
            public final DealIdArguments createFromParcel(Parcel parcel) {
                return new DealIdArguments(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DealIdArguments[] newArray(int i12) {
                return new DealIdArguments[i12];
            }
        }

        public DealIdArguments(@k String str) {
            this.f121560b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DealIdArguments) && L.f(this.f121560b, ((DealIdArguments) obj).f121560b);
        }

        public final int hashCode() {
            return this.f121560b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DealIdArguments(dealId="), this.f121560b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f121560b);
        }
    }

    /* compiled from: DealArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/model/DealArguments$DealProcessIdArguments;", "Lcom/avito/android/comfortable_deal/deal/model/DealArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DealProcessIdArguments implements DealArguments {

        @k
        public static final Parcelable.Creator<DealProcessIdArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121561b;

        /* compiled from: DealArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DealProcessIdArguments> {
            @Override // android.os.Parcelable.Creator
            public final DealProcessIdArguments createFromParcel(Parcel parcel) {
                return new DealProcessIdArguments(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DealProcessIdArguments[] newArray(int i12) {
                return new DealProcessIdArguments[i12];
            }
        }

        public DealProcessIdArguments(@k String str) {
            this.f121561b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DealProcessIdArguments) && L.f(this.f121561b, ((DealProcessIdArguments) obj).f121561b);
        }

        public final int hashCode() {
            return this.f121561b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DealProcessIdArguments(processId="), this.f121561b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f121561b);
        }
    }
}

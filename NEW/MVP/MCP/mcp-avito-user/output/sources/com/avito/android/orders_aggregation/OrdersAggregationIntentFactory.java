package com.avito.android.orders_aggregation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrdersAggregationIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationIntentFactory;", "", "GeneralOrdersData", "_avito_orders-aggregation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OrdersAggregationIntentFactory {

    /* compiled from: OrdersAggregationIntentFactory.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationIntentFactory$GeneralOrdersData;", "Landroid/os/Parcelable;", "_avito_orders-aggregation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeneralOrdersData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GeneralOrdersData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f210199b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f210200c;

        /* compiled from: OrdersAggregationIntentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GeneralOrdersData> {
            @Override // android.os.Parcelable.Creator
            public final GeneralOrdersData createFromParcel(Parcel parcel) {
                return new GeneralOrdersData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GeneralOrdersData[] newArray(int i12) {
                return new GeneralOrdersData[i12];
            }
        }

        public GeneralOrdersData(@Y61.l String str, @Y61.l String str2) {
            this.f210199b = str;
            this.f210200c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralOrdersData)) {
                return false;
            }
            GeneralOrdersData generalOrdersData = (GeneralOrdersData) obj;
            return L.f(this.f210199b, generalOrdersData.f210199b) && L.f(this.f210200c, generalOrdersData.f210200c);
        }

        public final int hashCode() {
            String str = this.f210199b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f210200c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeneralOrdersData(tabToOpen=");
            sb2.append(this.f210199b);
            sb2.append(", tabToPrefetch=");
            return C22026a.c(sb2, this.f210200c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f210199b);
            parcel.writeString(this.f210200c);
        }
    }

    @Y61.k
    Intent a(@Y61.l String str, @Y61.l GeneralOrdersData generalOrdersData, @Y61.l NavigationTabSetItem navigationTabSetItem);
}

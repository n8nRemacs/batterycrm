package com.avito.android.orders_aggregation_core.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OrdersAggregationLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings$GeneralSettings;", "general", "<init>", "(Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings$GeneralSettings;)V", "Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings$GeneralSettings;", "c", "()Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings$GeneralSettings;", "GeneralSettings", "_avito_orders-aggregation-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrdersAggregationSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<OrdersAggregationSettings> CREATOR = new a();

    @c("goods_orders")
    @l
    private final GeneralSettings general;

    /* compiled from: OrdersAggregationLink.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationSettings$GeneralSettings;", "Landroid/os/Parcelable;", "_avito_orders-aggregation-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeneralSettings implements Parcelable {

        @k
        public static final Parcelable.Creator<GeneralSettings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f210385b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f210386c;

        /* compiled from: OrdersAggregationLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GeneralSettings> {
            @Override // android.os.Parcelable.Creator
            public final GeneralSettings createFromParcel(Parcel parcel) {
                return new GeneralSettings(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GeneralSettings[] newArray(int i12) {
                return new GeneralSettings[i12];
            }
        }

        public GeneralSettings(@l String str, @l String str2) {
            this.f210385b = str;
            this.f210386c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralSettings)) {
                return false;
            }
            GeneralSettings generalSettings = (GeneralSettings) obj;
            return L.f(this.f210385b, generalSettings.f210385b) && L.f(this.f210386c, generalSettings.f210386c);
        }

        public final int hashCode() {
            String str = this.f210385b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f210386c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeneralSettings(tab=");
            sb2.append(this.f210385b);
            sb2.append(", ordersToPrefetch=");
            return C22026a.c(sb2, this.f210386c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f210385b);
            parcel.writeString(this.f210386c);
        }
    }

    /* compiled from: OrdersAggregationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrdersAggregationSettings> {
        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationSettings createFromParcel(Parcel parcel) {
            return new OrdersAggregationSettings(parcel.readInt() == 0 ? null : GeneralSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationSettings[] newArray(int i12) {
            return new OrdersAggregationSettings[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrdersAggregationSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final GeneralSettings getGeneral() {
        return this.general;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrdersAggregationSettings) && L.f(this.general, ((OrdersAggregationSettings) obj).general);
    }

    public final int hashCode() {
        GeneralSettings generalSettings = this.general;
        if (generalSettings == null) {
            return 0;
        }
        return generalSettings.hashCode();
    }

    @k
    public final String toString() {
        return "OrdersAggregationSettings(general=" + this.general + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        GeneralSettings generalSettings = this.general;
        if (generalSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            generalSettings.writeToParcel(parcel, i12);
        }
    }

    public OrdersAggregationSettings(@l GeneralSettings generalSettings) {
        this.general = generalSettings;
    }

    public /* synthetic */ OrdersAggregationSettings(GeneralSettings generalSettings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : generalSettings);
    }
}

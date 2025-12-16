package com.avito.android.service_orders.link;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ShowServiceOrdersLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/link/ShowServiceOrdersLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ShowServiceOrdersLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ShowServiceOrdersLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f279172b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f279173c;

    /* compiled from: ShowServiceOrdersLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShowServiceOrdersLink> {
        @Override // android.os.Parcelable.Creator
        public final ShowServiceOrdersLink createFromParcel(Parcel parcel) {
            return new ShowServiceOrdersLink(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShowServiceOrdersLink[] newArray(int i12) {
            return new ShowServiceOrdersLink[i12];
        }
    }

    /* compiled from: ShowServiceOrdersLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b$a;", "Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b$b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: ShowServiceOrdersLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b$a;", "Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f279174b = new a();
        }

        /* compiled from: ShowServiceOrdersLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b$b;", "Lcom/avito/android/service_orders/link/ShowServiceOrdersLink$b;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_orders.link.ShowServiceOrdersLink$b$b, reason: collision with other inner class name */
        public static final class C8302b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8302b f279175b = new C8302b();
        }
    }

    public ShowServiceOrdersLink(boolean z12, @l String str) {
        this.f279172b = z12;
        this.f279173c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowServiceOrdersLink)) {
            return false;
        }
        ShowServiceOrdersLink showServiceOrdersLink = (ShowServiceOrdersLink) obj;
        return this.f279172b == showServiceOrdersLink.f279172b && L.f(this.f279173c, showServiceOrdersLink.f279173c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f279172b) * 31;
        String str = this.f279173c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowServiceOrdersLink(shouldOpenScheduleSelection=");
        sb2.append(this.f279172b);
        sb2.append(", flow=");
        return C22026a.c(sb2, this.f279173c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f279172b ? 1 : 0);
        parcel.writeString(this.f279173c);
    }
}

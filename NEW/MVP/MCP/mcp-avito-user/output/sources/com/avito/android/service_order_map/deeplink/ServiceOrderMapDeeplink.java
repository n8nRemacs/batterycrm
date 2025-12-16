package com.avito.android.service_order_map.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import q50.InterfaceC47204b;

/* compiled from: ServiceOrderMapDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "c", "_avito_service-order-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrderMapDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceOrderMapDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f278585b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f278586c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Double f278587d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Double f278588e;

    /* compiled from: ServiceOrderMapDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceOrderMapDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapDeeplink createFromParcel(Parcel parcel) {
            return new ServiceOrderMapDeeplink(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapDeeplink[] newArray(int i12) {
            return new ServiceOrderMapDeeplink[i12];
        }
    }

    /* compiled from: ServiceOrderMapDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink$b;", "LKu/a;", "Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink;", "<init>", "()V", "_avito_service-order-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ServiceOrderMapDeeplink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            String queryParameter = uri.getQueryParameter("title");
            String queryParameter2 = uri.getQueryParameter("buttonTitle");
            String queryParameter3 = uri.getQueryParameter("lat");
            Double dW02 = queryParameter3 != null ? C43066x.w0(queryParameter3) : null;
            String queryParameter4 = uri.getQueryParameter(AddressParameter.Value.LNG);
            return new ServiceOrderMapDeeplink(dW02, queryParameter4 != null ? C43066x.w0(queryParameter4) : null, queryParameter, queryParameter2);
        }
    }

    /* compiled from: ServiceOrderMapDeeplink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink$c;", "", "<init>", "()V", "a", "b", "_avito_service-order-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: ServiceOrderMapDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink$c$a;", "LJu/c$b;", "<init>", "()V", "_avito_service-order-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f278589b = new a();
        }

        /* compiled from: ServiceOrderMapDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink$c$b;", "LJu/c$b;", "_avito_service-order-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f278590b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f278591c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f278592d;

            public b(@l String str, @l String str2, @l String str3) {
                this.f278590b = str;
                this.f278591c = str2;
                this.f278592d = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f278590b, bVar.f278590b) && L.f(this.f278591c, bVar.f278591c) && L.f(this.f278592d, bVar.f278592d);
            }

            public final int hashCode() {
                String str = this.f278590b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f278591c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f278592d;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(address=");
                sb2.append(this.f278590b);
                sb2.append(", lat=");
                sb2.append(this.f278591c);
                sb2.append(", lng=");
                return C22026a.c(sb2, this.f278592d, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public ServiceOrderMapDeeplink(@l Double d12, @l Double d13, @l String str, @l String str2) {
        this.f278585b = str;
        this.f278586c = str2;
        this.f278587d = d12;
        this.f278588e = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrderMapDeeplink)) {
            return false;
        }
        ServiceOrderMapDeeplink serviceOrderMapDeeplink = (ServiceOrderMapDeeplink) obj;
        return L.f(this.f278585b, serviceOrderMapDeeplink.f278585b) && L.f(this.f278586c, serviceOrderMapDeeplink.f278586c) && L.f(this.f278587d, serviceOrderMapDeeplink.f278587d) && L.f(this.f278588e, serviceOrderMapDeeplink.f278588e);
    }

    public final int hashCode() {
        String str = this.f278585b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f278586c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d12 = this.f278587d;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f278588e;
        return iHashCode3 + (d13 != null ? d13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrderMapDeeplink(title=");
        sb2.append(this.f278585b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f278586c);
        sb2.append(", lat=");
        sb2.append(this.f278587d);
        sb2.append(", lng=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f278588e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278585b);
        parcel.writeString(this.f278586c);
        Double d12 = this.f278587d;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f278588e;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}

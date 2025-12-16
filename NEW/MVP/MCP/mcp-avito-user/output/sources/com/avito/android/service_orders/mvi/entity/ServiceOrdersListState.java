package com.avito.android.service_orders.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_orders.mvi.entity.a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ServiceOrdersListToolbar", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrdersListState extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f279574h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final ServiceOrdersListState f279575i = new ServiceOrdersListState(null, true, null, null, null, true);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ServiceOrdersListToolbar f279576b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f279577c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a.c f279578d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a.C8311a f279579e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a.b f279580f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f279581g;

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState$ServiceOrdersListToolbar;", "", "ServiceOrdersButtonAction", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceOrdersListToolbar {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f279582a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<ServiceOrdersButtonAction> f279583b;

        /* compiled from: ServiceOrdersListState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState$ServiceOrdersListToolbar$ServiceOrdersButtonAction;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServiceOrdersButtonAction implements ParcelableItem {

            @k
            public static final Parcelable.Creator<ServiceOrdersButtonAction> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f279584b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f279585c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f279586d;

            /* compiled from: ServiceOrdersListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ServiceOrdersButtonAction> {
                @Override // android.os.Parcelable.Creator
                public final ServiceOrdersButtonAction createFromParcel(Parcel parcel) {
                    return new ServiceOrdersButtonAction(parcel.readInt(), (DeepLink) parcel.readParcelable(ServiceOrdersButtonAction.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ServiceOrdersButtonAction[] newArray(int i12) {
                    return new ServiceOrdersButtonAction[i12];
                }
            }

            public ServiceOrdersButtonAction(@InterfaceC42150f int i12, @l DeepLink deepLink, @k String str) {
                this.f279584b = i12;
                this.f279585c = deepLink;
                this.f279586d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServiceOrdersButtonAction)) {
                    return false;
                }
                ServiceOrdersButtonAction serviceOrdersButtonAction = (ServiceOrdersButtonAction) obj;
                return this.f279584b == serviceOrdersButtonAction.f279584b && L.f(this.f279585c, serviceOrdersButtonAction.f279585c) && L.f(this.f279586d, serviceOrdersButtonAction.f279586d);
            }

            @Override // TV0.a
            /* renamed from: getId */
            public final long getF76078b() {
                return a.C10492a.a(this);
            }

            @Override // com.avito.conveyor_item.a
            @k
            /* renamed from: getStringId, reason: from getter */
            public final String getF221027b() {
                return this.f279586d;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f279584b) * 31;
                DeepLink deepLink = this.f279585c;
                return this.f279586d.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ServiceOrdersButtonAction(iconType=");
                sb2.append(this.f279584b);
                sb2.append(", uri=");
                sb2.append(this.f279585c);
                sb2.append(", stringId=");
                return C22026a.c(sb2, this.f279586d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f279584b);
                parcel.writeParcelable(this.f279585c, i12);
                parcel.writeString(this.f279586d);
            }
        }

        public ServiceOrdersListToolbar(@k PrintableText printableText, @l List<ServiceOrdersButtonAction> list) {
            this.f279582a = printableText;
            this.f279583b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceOrdersListToolbar)) {
                return false;
            }
            ServiceOrdersListToolbar serviceOrdersListToolbar = (ServiceOrdersListToolbar) obj;
            return L.f(this.f279582a, serviceOrdersListToolbar.f279582a) && L.f(this.f279583b, serviceOrdersListToolbar.f279583b);
        }

        public final int hashCode() {
            int iHashCode = this.f279582a.hashCode() * 31;
            List<ServiceOrdersButtonAction> list = this.f279583b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceOrdersListToolbar(title=");
            sb2.append(this.f279582a);
            sb2.append(", barButtonActions=");
            return H.p(sb2, this.f279583b, ')');
        }
    }

    /* compiled from: ServiceOrdersListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState$a;", "", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ServiceOrdersListState(@l ServiceOrdersListToolbar serviceOrdersListToolbar, boolean z12, @l a.c cVar, @l a.C8311a c8311a, @l a.b bVar, boolean z13) {
        this.f279576b = serviceOrdersListToolbar;
        this.f279577c = z12;
        this.f279578d = cVar;
        this.f279579e = c8311a;
        this.f279580f = bVar;
        this.f279581g = z13;
    }

    public static ServiceOrdersListState a(ServiceOrdersListState serviceOrdersListState, ServiceOrdersListToolbar serviceOrdersListToolbar, a.c cVar, a.C8311a c8311a, a.b bVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            serviceOrdersListToolbar = serviceOrdersListState.f279576b;
        }
        ServiceOrdersListToolbar serviceOrdersListToolbar2 = serviceOrdersListToolbar;
        boolean z13 = (i12 & 2) != 0 ? serviceOrdersListState.f279577c : false;
        if ((i12 & 4) != 0) {
            cVar = serviceOrdersListState.f279578d;
        }
        a.c cVar2 = cVar;
        if ((i12 & 8) != 0) {
            c8311a = serviceOrdersListState.f279579e;
        }
        a.C8311a c8311a2 = c8311a;
        if ((i12 & 16) != 0) {
            bVar = serviceOrdersListState.f279580f;
        }
        a.b bVar2 = bVar;
        if ((i12 & 32) != 0) {
            z12 = serviceOrdersListState.f279581g;
        }
        serviceOrdersListState.getClass();
        return new ServiceOrdersListState(serviceOrdersListToolbar2, z13, cVar2, c8311a2, bVar2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrdersListState)) {
            return false;
        }
        ServiceOrdersListState serviceOrdersListState = (ServiceOrdersListState) obj;
        return L.f(this.f279576b, serviceOrdersListState.f279576b) && this.f279577c == serviceOrdersListState.f279577c && L.f(this.f279578d, serviceOrdersListState.f279578d) && L.f(this.f279579e, serviceOrdersListState.f279579e) && L.f(this.f279580f, serviceOrdersListState.f279580f) && this.f279581g == serviceOrdersListState.f279581g;
    }

    public final int hashCode() {
        ServiceOrdersListToolbar serviceOrdersListToolbar = this.f279576b;
        int i12 = r.i((serviceOrdersListToolbar == null ? 0 : serviceOrdersListToolbar.hashCode()) * 31, 31, this.f279577c);
        a.c cVar = this.f279578d;
        int iHashCode = (i12 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a.C8311a c8311a = this.f279579e;
        int iHashCode2 = (iHashCode + (c8311a == null ? 0 : c8311a.hashCode())) * 31;
        a.b bVar = this.f279580f;
        return Boolean.hashCode(this.f279581g) + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersListState(toolbar=");
        sb2.append(this.f279576b);
        sb2.append(", isFullScreenLoad=");
        sb2.append(this.f279577c);
        sb2.append(", content=");
        sb2.append(this.f279578d);
        sb2.append(", emptyStub=");
        sb2.append(this.f279579e);
        sb2.append(", error=");
        sb2.append(this.f279580f);
        sb2.append(", isLoadInProgress=");
        return r.x(sb2, this.f279581g, ')');
    }
}

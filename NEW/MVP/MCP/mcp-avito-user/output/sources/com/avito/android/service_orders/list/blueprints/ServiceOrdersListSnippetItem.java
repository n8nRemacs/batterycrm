package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListSnippetItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem;", "Lcom/avito/conveyor_item/a;", "a", "b", "Status", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrdersListSnippetItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f279229b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f279230c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f279231d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f279232e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f279233f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f279234g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Status f279235h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ArrayList f279236i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f279237j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f279238k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f279239l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f279240m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrdersListSnippetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem$Status;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f279241b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f279242c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f279243d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f279244e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Status[] f279245f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f279246g;

        static {
            Status status = new Status("NEED_CONFIRMATION", 0);
            f279241b = status;
            Status status2 = new Status("CONFIRMED", 1);
            f279242c = status2;
            Status status3 = new Status("CANCELED", 2);
            f279243d = status3;
            Status status4 = new Status("COMPLETED", 3);
            f279244e = status4;
            Status[] statusArr = {status, status2, status3, status4};
            f279245f = statusArr;
            f279246g = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f279245f.clone();
        }
    }

    /* compiled from: ServiceOrdersListSnippetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem$a;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f279247a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279248b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279249c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279250d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f279251e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f279252f;

        public a(@l String str, @l String str2, @l String str3, boolean z12, @l String str4, @l String str5) {
            this.f279247a = str;
            this.f279248b = str2;
            this.f279249c = str3;
            this.f279250d = str4;
            this.f279251e = str5;
            this.f279252f = z12;
        }

        public static a a(a aVar, String str, boolean z12, int i12) {
            if ((i12 & 4) != 0) {
                str = aVar.f279249c;
            }
            String str2 = str;
            String str3 = (i12 & 8) != 0 ? aVar.f279250d : null;
            if ((i12 & 32) != 0) {
                z12 = aVar.f279252f;
            }
            return new a(aVar.f279247a, aVar.f279248b, str2, z12, str3, aVar.f279251e);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f279247a, aVar.f279247a) && L.f(this.f279248b, aVar.f279248b) && L.f(this.f279249c, aVar.f279249c) && L.f(this.f279250d, aVar.f279250d) && L.f(this.f279251e, aVar.f279251e) && this.f279252f == aVar.f279252f;
        }

        public final int hashCode() {
            String str = this.f279247a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f279248b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f279249c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f279250d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f279251e;
            return Boolean.hashCode(this.f279252f) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Contact(name=");
            sb2.append(this.f279247a);
            sb2.append(", description=");
            sb2.append(this.f279248b);
            sb2.append(", phone=");
            sb2.append(this.f279249c);
            sb2.append(", showPhoneText=");
            sb2.append(this.f279250d);
            sb2.append(", toastMessage=");
            sb2.append(this.f279251e);
            sb2.append(", blockClickable=");
            return r.x(sb2, this.f279252f, ')');
        }
    }

    /* compiled from: ServiceOrdersListSnippetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem$b;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f279253a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f279254b;

        public b(@k String str, @k String str2) {
            this.f279253a = str;
            this.f279254b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f279253a, bVar.f279253a) && L.f(this.f279254b, bVar.f279254b);
        }

        public final int hashCode() {
            return this.f279254b.hashCode() + (this.f279253a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceListItem(serviceName=");
            sb2.append(this.f279253a);
            sb2.append(", price=");
            return C22026a.c(sb2, this.f279254b, ')');
        }
    }

    public ServiceOrdersListSnippetItem(@k String str, @l DeepLink deepLink, @l String str2, @l String str3, @l String str4, @l AttributedText attributedText, @l Status status, @l ArrayList arrayList, @l ArrayList arrayList2, @l DeepLink deepLink2, @l String str5, @l String str6) {
        this.f279229b = str;
        this.f279230c = deepLink;
        this.f279231d = str2;
        this.f279232e = str3;
        this.f279233f = str4;
        this.f279234g = attributedText;
        this.f279235h = status;
        this.f279236i = arrayList;
        this.f279237j = arrayList2;
        this.f279238k = deepLink2;
        this.f279239l = str5;
        this.f279240m = str6;
    }

    public static ServiceOrdersListSnippetItem a(ServiceOrdersListSnippetItem serviceOrdersListSnippetItem, ArrayList arrayList) {
        String str = serviceOrdersListSnippetItem.f279229b;
        DeepLink deepLink = serviceOrdersListSnippetItem.f279230c;
        String str2 = serviceOrdersListSnippetItem.f279231d;
        String str3 = serviceOrdersListSnippetItem.f279232e;
        String str4 = serviceOrdersListSnippetItem.f279233f;
        AttributedText attributedText = serviceOrdersListSnippetItem.f279234g;
        Status status = serviceOrdersListSnippetItem.f279235h;
        ArrayList arrayList2 = serviceOrdersListSnippetItem.f279236i;
        serviceOrdersListSnippetItem.getClass();
        DeepLink deepLink2 = serviceOrdersListSnippetItem.f279238k;
        String str5 = serviceOrdersListSnippetItem.f279239l;
        String str6 = serviceOrdersListSnippetItem.f279240m;
        serviceOrdersListSnippetItem.getClass();
        return new ServiceOrdersListSnippetItem(str, deepLink, str2, str3, str4, attributedText, status, arrayList2, arrayList, deepLink2, str5, str6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrdersListSnippetItem)) {
            return false;
        }
        ServiceOrdersListSnippetItem serviceOrdersListSnippetItem = (ServiceOrdersListSnippetItem) obj;
        return L.f(this.f279229b, serviceOrdersListSnippetItem.f279229b) && L.f(this.f279230c, serviceOrdersListSnippetItem.f279230c) && L.f(this.f279231d, serviceOrdersListSnippetItem.f279231d) && L.f(this.f279232e, serviceOrdersListSnippetItem.f279232e) && L.f(this.f279233f, serviceOrdersListSnippetItem.f279233f) && L.f(this.f279234g, serviceOrdersListSnippetItem.f279234g) && this.f279235h == serviceOrdersListSnippetItem.f279235h && this.f279236i.equals(serviceOrdersListSnippetItem.f279236i) && L.f(this.f279237j, serviceOrdersListSnippetItem.f279237j) && L.f(null, null) && L.f(this.f279238k, serviceOrdersListSnippetItem.f279238k) && L.f(this.f279239l, serviceOrdersListSnippetItem.f279239l) && L.f(this.f279240m, serviceOrdersListSnippetItem.f279240m);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return getF243637b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243637b() {
        return this.f279229b;
    }

    public final int hashCode() {
        int iHashCode = this.f279229b.hashCode() * 31;
        DeepLink deepLink = this.f279230c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f279231d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279232e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f279233f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.f279234g;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f279236i, (this.f279235h.hashCode() + ((iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31);
        ArrayList arrayList = this.f279237j;
        int iHashCode6 = (iG2 + (arrayList == null ? 0 : arrayList.hashCode())) * 961;
        DeepLink deepLink2 = this.f279238k;
        int iHashCode7 = (iHashCode6 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        String str4 = this.f279239l;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f279240m;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersListSnippetItem(stringId=");
        sb2.append(this.f279229b);
        sb2.append(", cardDeepLink=");
        sb2.append(this.f279230c);
        sb2.append(", orderId=");
        sb2.append(this.f279231d);
        sb2.append(", title=");
        sb2.append(this.f279232e);
        sb2.append(", statusText=");
        sb2.append(this.f279233f);
        sb2.append(", extendedStatus=");
        sb2.append(this.f279234g);
        sb2.append(", status=");
        sb2.append(this.f279235h);
        sb2.append(", priceList=");
        sb2.append(this.f279236i);
        sb2.append(", contacts=");
        sb2.append(this.f279237j);
        sb2.append(", moreBtnDeepLink=null, actionLink=");
        sb2.append(this.f279238k);
        sb2.append(", actionTitle=");
        sb2.append(this.f279239l);
        sb2.append(", commentText=");
        return C22026a.c(sb2, this.f279240m, ')');
    }
}

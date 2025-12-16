package com.avito.android.advert.item.service_order_request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.service_order.ServiceOrder;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderRequestItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/ServiceOrderRequestItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Action", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServiceOrderRequestItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<ServiceOrderRequestItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f79869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f79870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Action f79871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Action f79872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79873f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ServiceOrder.Tooltip f79874g;

    /* renamed from: h, reason: collision with root package name */
    public final long f79875h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f79876i;

    /* renamed from: j, reason: collision with root package name */
    public final int f79877j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79878k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79879l;

    /* compiled from: ServiceOrderRequestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceOrderRequestItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrderRequestItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ServiceOrderRequestItem.class.getClassLoader());
            Parcelable.Creator<Action> creator = Action.CREATOR;
            return new ServiceOrderRequestItem(string, attributedText, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0, (ServiceOrder.Tooltip) parcel.readParcelable(ServiceOrderRequestItem.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrderRequestItem[] newArray(int i12) {
            return new ServiceOrderRequestItem[i12];
        }
    }

    public ServiceOrderRequestItem(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.k Action action, @Y61.l Action action2, boolean z12, @Y61.l ServiceOrder.Tooltip tooltip, long j12, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f79869b = str;
        this.f79870c = attributedText;
        this.f79871d = action;
        this.f79872e = action2;
        this.f79873f = z12;
        this.f79874g = tooltip;
        this.f79875h = j12;
        this.f79876i = str2;
        this.f79877j = i12;
        this.f79878k = serpDisplayType;
        this.f79879l = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new ServiceOrderRequestItem(this.f79869b, this.f79870c, this.f79871d, this.f79872e, this.f79873f, this.f79874g, this.f79875h, this.f79876i, i12, this.f79878k, this.f79879l);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79878k = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrderRequestItem)) {
            return false;
        }
        ServiceOrderRequestItem serviceOrderRequestItem = (ServiceOrderRequestItem) obj;
        return L.f(this.f79869b, serviceOrderRequestItem.f79869b) && L.f(this.f79870c, serviceOrderRequestItem.f79870c) && L.f(this.f79871d, serviceOrderRequestItem.f79871d) && L.f(this.f79872e, serviceOrderRequestItem.f79872e) && this.f79873f == serviceOrderRequestItem.f79873f && L.f(this.f79874g, serviceOrderRequestItem.f79874g) && this.f79875h == serviceOrderRequestItem.f79875h && L.f(this.f79876i, serviceOrderRequestItem.f79876i) && this.f79877j == serviceOrderRequestItem.f79877j && this.f79878k == serviceOrderRequestItem.f79878k && this.f79879l == serviceOrderRequestItem.f79879l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78240b() {
        return this.f79875h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78243e() {
        return this.f79877j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78241c() {
        return this.f79876i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78245g() {
        return this.f79879l;
    }

    public final int hashCode() {
        String str = this.f79869b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f79870c;
        int iHashCode2 = (this.f79871d.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        Action action = this.f79872e;
        int i12 = r.i((iHashCode2 + (action == null ? 0 : action.hashCode())) * 31, 31, this.f79873f);
        ServiceOrder.Tooltip tooltip = this.f79874g;
        return this.f79879l.hashCode() + com.avito.android.actions_sheet.a.h(this.f79878k, r.e(this.f79877j, H.d(r.g((i12 + (tooltip != null ? tooltip.hashCode() : 0)) * 31, 31, this.f79875h), 31, this.f79876i), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrderRequestItem(description=");
        sb2.append(this.f79869b);
        sb2.append(", descriptionLink=");
        sb2.append(this.f79870c);
        sb2.append(", primaryAction=");
        sb2.append(this.f79871d);
        sb2.append(", secondaryAction=");
        sb2.append(this.f79872e);
        sb2.append(", isRedesign=");
        sb2.append(this.f79873f);
        sb2.append(", primaryTooltip=");
        sb2.append(this.f79874g);
        sb2.append(", id=");
        sb2.append(this.f79875h);
        sb2.append(", stringId=");
        sb2.append(this.f79876i);
        sb2.append(", spanCount=");
        sb2.append(this.f79877j);
        sb2.append(", displayType=");
        sb2.append(this.f79878k);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79879l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f79869b);
        parcel.writeParcelable(this.f79870c, i12);
        this.f79871d.writeToParcel(parcel, i12);
        Action action = this.f79872e;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f79873f ? 1 : 0);
        parcel.writeParcelable(this.f79874g, i12);
        parcel.writeLong(this.f79875h);
        parcel.writeString(this.f79876i);
        parcel.writeInt(this.f79877j);
        parcel.writeString(this.f79878k.name());
        parcel.writeString(this.f79879l.name());
    }

    /* compiled from: ServiceOrderRequestItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/ServiceOrderRequestItem$Action;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f79880b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f79881c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f79882d;

        /* compiled from: ServiceOrderRequestItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@Y61.k String str, @Y61.k DeepLink deepLink, boolean z12) {
            this.f79880b = deepLink;
            this.f79881c = str;
            this.f79882d = z12;
        }

        public static Action a(Action action, boolean z12) {
            DeepLink deepLink = action.f79880b;
            String str = action.f79881c;
            action.getClass();
            return new Action(str, deepLink, z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.f79880b, action.f79880b) && L.f(this.f79881c, action.f79881c) && this.f79882d == action.f79882d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79882d) + H.d(this.f79880b.hashCode() * 31, 31, this.f79881c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(uri=");
            sb2.append(this.f79880b);
            sb2.append(", title=");
            sb2.append(this.f79881c);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f79882d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f79880b, i12);
            parcel.writeString(this.f79881c);
            parcel.writeInt(this.f79882d ? 1 : 0);
        }

        public /* synthetic */ Action(DeepLink deepLink, String str, boolean z12, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? false : z12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServiceOrderRequestItem(String str, AttributedText attributedText, Action action, Action action2, boolean z12, ServiceOrder.Tooltip tooltip, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 64) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 62;
        } else {
            j13 = j12;
        }
        this(str, attributedText, action, action2, z12, tooltip, j13, (i13 & 128) != 0 ? String.valueOf(j13) : str2, i12, (i13 & 512) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 1024) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}

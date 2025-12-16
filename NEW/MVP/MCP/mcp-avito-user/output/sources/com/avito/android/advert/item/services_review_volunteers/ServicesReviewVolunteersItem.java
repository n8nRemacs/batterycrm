package com.avito.android.advert.item.services_review_volunteers;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServicesReviewVolunteersItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/services_review_volunteers/ServicesReviewVolunteersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Action", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServicesReviewVolunteersItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<ServicesReviewVolunteersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79989b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79991d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f79992e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f79993f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f79994g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f79995h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Action f79996i;

    /* compiled from: ServicesReviewVolunteersItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/services_review_volunteers/ServicesReviewVolunteersItem$Action;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f79997b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f79998c;

        /* compiled from: ServicesReviewVolunteersItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k DeepLink deepLink) {
            this.f79997b = str;
            this.f79998c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.f79997b, action.f79997b) && L.f(this.f79998c, action.f79998c);
        }

        public final int hashCode() {
            return this.f79998c.hashCode() + (this.f79997b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f79997b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f79998c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f79997b);
            parcel.writeParcelable(this.f79998c, i12);
        }
    }

    /* compiled from: ServicesReviewVolunteersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesReviewVolunteersItem> {
        @Override // android.os.Parcelable.Creator
        public final ServicesReviewVolunteersItem createFromParcel(Parcel parcel) {
            return new ServicesReviewVolunteersItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesReviewVolunteersItem[] newArray(int i12) {
            return new ServicesReviewVolunteersItem[i12];
        }
    }

    public ServicesReviewVolunteersItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str2, @k String str3, @k Action action) {
        this.f79989b = j12;
        this.f79990c = str;
        this.f79991d = i12;
        this.f79992e = serpDisplayType;
        this.f79993f = serpViewType;
        this.f79994g = str2;
        this.f79995h = str3;
        this.f79996i = action;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new ServicesReviewVolunteersItem(this.f79989b, this.f79990c, i12, this.f79992e, this.f79993f, this.f79994g, this.f79995h, this.f79996i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79992e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesReviewVolunteersItem)) {
            return false;
        }
        ServicesReviewVolunteersItem servicesReviewVolunteersItem = (ServicesReviewVolunteersItem) obj;
        return this.f79989b == servicesReviewVolunteersItem.f79989b && L.f(this.f79990c, servicesReviewVolunteersItem.f79990c) && this.f79991d == servicesReviewVolunteersItem.f79991d && this.f79992e == servicesReviewVolunteersItem.f79992e && this.f79993f == servicesReviewVolunteersItem.f79993f && L.f(this.f79994g, servicesReviewVolunteersItem.f79994g) && L.f(this.f79995h, servicesReviewVolunteersItem.f79995h) && L.f(this.f79996i, servicesReviewVolunteersItem.f79996i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74860b() {
        return this.f79989b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272774i() {
        return this.f79991d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429454b() {
        return this.f79990c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272773h() {
        return this.f79993f;
    }

    public final int hashCode() {
        return this.f79996i.hashCode() + H.d(H.d(com.avito.android.actions_sheet.a.j(this.f79993f, com.avito.android.actions_sheet.a.h(this.f79992e, r.e(this.f79991d, H.d(Long.hashCode(this.f79989b) * 31, 31, this.f79990c), 31), 31), 31), 31, this.f79994g), 31, this.f79995h);
    }

    @k
    public final String toString() {
        return "ServicesReviewVolunteersItem(id=" + this.f79989b + ", stringId=" + this.f79990c + ", spanCount=" + this.f79991d + ", displayType=" + this.f79992e + ", viewType=" + this.f79993f + ", title=" + this.f79994g + ", subtitle=" + this.f79995h + ", action=" + this.f79996i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79989b);
        parcel.writeString(this.f79990c);
        parcel.writeInt(this.f79991d);
        parcel.writeString(this.f79992e.name());
        parcel.writeString(this.f79993f.name());
        parcel.writeString(this.f79994g);
        parcel.writeString(this.f79995h);
        this.f79996i.writeToParcel(parcel, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServicesReviewVolunteersItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, String str3, Action action, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 157;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, str3, action);
    }
}

package com.avito.android.advert_core.body_condition;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.analytics.body_condition.FromPage;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsCarBodyConditionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/body_condition/AdvertDetailsCarBodyConditionItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsCarBodyConditionItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsCarBodyConditionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f83026c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final BodyCondition f83027d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f83028e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FromPage f83029f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83030g;

    /* renamed from: h, reason: collision with root package name */
    public final int f83031h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83032i;

    /* compiled from: AdvertDetailsCarBodyConditionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsCarBodyConditionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCarBodyConditionItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsCarBodyConditionItem(parcel.readLong(), parcel.readString(), (BodyCondition) parcel.readParcelable(AdvertDetailsCarBodyConditionItem.class.getClassLoader()), parcel.readString(), FromPage.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCarBodyConditionItem[] newArray(int i12) {
            return new AdvertDetailsCarBodyConditionItem[i12];
        }
    }

    public AdvertDetailsCarBodyConditionItem(long j12, @Y61.k String str, @Y61.l BodyCondition bodyCondition, @Y61.k String str2, @Y61.k FromPage fromPage, @Y61.k SerpDisplayType serpDisplayType, int i12, @Y61.k SerpViewType serpViewType) {
        this.f83025b = j12;
        this.f83026c = str;
        this.f83027d = bodyCondition;
        this.f83028e = str2;
        this.f83029f = fromPage;
        this.f83030g = serpDisplayType;
        this.f83031h = i12;
        this.f83032i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsCarBodyConditionItem(this.f83025b, this.f83026c, this.f83027d, this.f83028e, this.f83029f, this.f83030g, i12, this.f83032i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83030g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsCarBodyConditionItem)) {
            return false;
        }
        AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem = (AdvertDetailsCarBodyConditionItem) obj;
        return this.f83025b == advertDetailsCarBodyConditionItem.f83025b && L.f(this.f83026c, advertDetailsCarBodyConditionItem.f83026c) && L.f(this.f83027d, advertDetailsCarBodyConditionItem.f83027d) && L.f(this.f83028e, advertDetailsCarBodyConditionItem.f83028e) && this.f83029f == advertDetailsCarBodyConditionItem.f83029f && this.f83030g == advertDetailsCarBodyConditionItem.f83030g && this.f83031h == advertDetailsCarBodyConditionItem.f83031h && this.f83032i == advertDetailsCarBodyConditionItem.f83032i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f83025b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75243e() {
        return this.f83031h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f83026c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75242d() {
        return this.f83032i;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f83025b) * 31, 31, this.f83026c);
        BodyCondition bodyCondition = this.f83027d;
        return this.f83032i.hashCode() + r.e(this.f83031h, com.avito.android.actions_sheet.a.h(this.f83030g, (this.f83029f.hashCode() + H.d((iD2 + (bodyCondition == null ? 0 : bodyCondition.hashCode())) * 31, 31, this.f83028e)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsCarBodyConditionItem(id=");
        sb2.append(this.f83025b);
        sb2.append(", stringId=");
        sb2.append(this.f83026c);
        sb2.append(", bodyCondition=");
        sb2.append(this.f83027d);
        sb2.append(", advertId=");
        sb2.append(this.f83028e);
        sb2.append(", fromPage=");
        sb2.append(this.f83029f);
        sb2.append(", displayType=");
        sb2.append(this.f83030g);
        sb2.append(", spanCount=");
        sb2.append(this.f83031h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f83032i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f83025b);
        parcel.writeString(this.f83026c);
        parcel.writeParcelable(this.f83027d, i12);
        parcel.writeString(this.f83028e);
        parcel.writeString(this.f83029f.name());
        parcel.writeString(this.f83030g.name());
        parcel.writeInt(this.f83031h);
        parcel.writeString(this.f83032i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsCarBodyConditionItem(long j12, String str, BodyCondition bodyCondition, String str2, FromPage fromPage, SerpDisplayType serpDisplayType, int i12, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 8;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, bodyCondition, str2, fromPage, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}

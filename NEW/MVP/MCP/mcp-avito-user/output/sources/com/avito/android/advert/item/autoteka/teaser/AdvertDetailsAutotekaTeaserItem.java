package com.avito.android.advert.item.autoteka.teaser;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutotekaTeaserItem.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/AdvertDetailsAutotekaTeaserItem;", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutotekaTeaserItem implements AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserItemResponse>, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAutotekaTeaserItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final int f73003b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f73004c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AutotekaTeaserItemResponse f73005d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f73006e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73007f;

    /* compiled from: AdvertDetailsAutotekaTeaserItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/AdvertDetailsAutotekaTeaserItem$a;", "", "<init>", "()V", "", "AUTOTEKA_TEASER_ITEM_NAME", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsAutotekaTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertDetailsAutotekaTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutotekaTeaserItem(parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), (AutotekaTeaserItemResponse) parcel.readParcelable(AdvertDetailsAutotekaTeaserItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserItem[] newArray(int i12) {
            return new AdvertDetailsAutotekaTeaserItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AdvertDetailsAutotekaTeaserItem(int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.l AutotekaTeaserItemResponse autotekaTeaserItemResponse, @Y61.l String str) {
        this.f73003b = i12;
        this.f73004c = serpDisplayType;
        this.f73005d = autotekaTeaserItemResponse;
        this.f73006e = str;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        this.f73007f = 15;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutotekaTeaserItem(i12, this.f73004c, this.f73005d, this.f73006e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f73004c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutotekaTeaserItem)) {
            return false;
        }
        AdvertDetailsAutotekaTeaserItem advertDetailsAutotekaTeaserItem = (AdvertDetailsAutotekaTeaserItem) obj;
        return this.f73003b == advertDetailsAutotekaTeaserItem.f73003b && this.f73004c == advertDetailsAutotekaTeaserItem.f73004c && L.f(this.f73005d, advertDetailsAutotekaTeaserItem.f73005d) && L.f(this.f73006e, advertDetailsAutotekaTeaserItem.f73006e);
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    /* renamed from: getData, reason: from getter */
    public final AutotekaTeaserItemResponse getF73157d() {
        return this.f73005d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return 15;
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    @Y61.l
    /* renamed from: getSearchContext, reason: from getter */
    public final String getF73158e() {
        return this.f73006e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f73003b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF298989b() {
        return String.valueOf(getF268422b());
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77499h() {
        return this.f73007f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType */
    public final SerpViewType getF268374D() {
        return SerpViewType.f268585e;
    }

    public final int hashCode() {
        int iH2 = com.avito.android.actions_sheet.a.h(this.f73004c, Integer.hashCode(this.f73003b) * 31, 31);
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = this.f73005d;
        int iHashCode = (iH2 + (autotekaTeaserItemResponse == null ? 0 : autotekaTeaserItemResponse.hashCode())) * 31;
        String str = this.f73006e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutotekaTeaserItem(spanCount=");
        sb2.append(this.f73003b);
        sb2.append(", displayType=");
        sb2.append(this.f73004c);
        sb2.append(", data=");
        sb2.append(this.f73005d);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f73006e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f73003b);
        parcel.writeString(this.f73004c.name());
        parcel.writeParcelable(this.f73005d, i12);
        parcel.writeString(this.f73006e);
    }

    public /* synthetic */ AdvertDetailsAutotekaTeaserItem(int i12, SerpDisplayType serpDisplayType, AutotekaTeaserItemResponse autotekaTeaserItemResponse, String str, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4) != 0 ? null : autotekaTeaserItemResponse, str);
    }
}

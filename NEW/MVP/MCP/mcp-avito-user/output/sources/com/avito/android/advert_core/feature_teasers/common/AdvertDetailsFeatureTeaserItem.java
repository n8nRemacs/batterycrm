package com.avito.android.advert_core.feature_teasers.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.feature_teasers.common.dialog.AdvertDetailsFeatureTeaserDialogInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFeatureTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/AdvertDetailsFeatureTeaserItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Icon", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFeatureTeaserItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFeatureTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f83597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83598e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83599f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFeatureTeaserOption f83600g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFeatureTeaserDialogInfo f83601h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f83602i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final List<AdvertDetailsFeatureTeaserOption> f83603j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f83604k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f83605l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f83606m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsFeatureTeaserItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/AdvertDetailsFeatureTeaserItem$Icon;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        /* renamed from: b, reason: collision with root package name */
        public static final Icon f83607b;

        /* renamed from: c, reason: collision with root package name */
        public static final Icon f83608c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f83609d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f83610e;

        static {
            Icon icon = new Icon("Protected", 0);
            f83607b = icon;
            Icon icon2 = new Icon("Ok", 1);
            f83608c = icon2;
            Icon[] iconArr = {icon, icon2, new Icon("Locked", 2)};
            f83609d = iconArr;
            f83610e = kotlin.enums.c.a(iconArr);
        }

        public Icon() {
            throw null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f83609d.clone();
        }
    }

    /* compiled from: AdvertDetailsFeatureTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFeatureTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFeatureTeaserItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOptionCreateFromParcel = parcel.readInt() == 0 ? null : AdvertDetailsFeatureTeaserOption.CREATOR.createFromParcel(parcel);
            AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo = (AdvertDetailsFeatureTeaserDialogInfo) parcel.readParcelable(AdvertDetailsFeatureTeaserItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(AdvertDetailsFeatureTeaserOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDetailsFeatureTeaserItem(j12, i12, string, serpDisplayTypeValueOf, serpViewTypeValueOf, advertDetailsFeatureTeaserOptionCreateFromParcel, advertDetailsFeatureTeaserDialogInfo, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFeatureTeaserItem[] newArray(int i12) {
            return new AdvertDetailsFeatureTeaserItem[i12];
        }
    }

    public AdvertDetailsFeatureTeaserItem(long j12, int i12, @Y61.k String str, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption, @Y61.l AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo, @Y61.l String str2, @Y61.k List<AdvertDetailsFeatureTeaserOption> list, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f83595b = j12;
        this.f83596c = i12;
        this.f83597d = str;
        this.f83598e = serpDisplayType;
        this.f83599f = serpViewType;
        this.f83600g = advertDetailsFeatureTeaserOption;
        this.f83601h = advertDetailsFeatureTeaserDialogInfo;
        this.f83602i = str2;
        this.f83603j = list;
        this.f83604k = str3;
        this.f83605l = str4;
        this.f83606m = str5;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsFeatureTeaserItem(this.f83595b, i12, this.f83597d, this.f83598e, this.f83599f, this.f83600g, this.f83601h, this.f83602i, this.f83603j, this.f83604k, this.f83605l, this.f83606m);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83598e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFeatureTeaserItem)) {
            return false;
        }
        AdvertDetailsFeatureTeaserItem advertDetailsFeatureTeaserItem = (AdvertDetailsFeatureTeaserItem) obj;
        return this.f83595b == advertDetailsFeatureTeaserItem.f83595b && this.f83596c == advertDetailsFeatureTeaserItem.f83596c && L.f(this.f83597d, advertDetailsFeatureTeaserItem.f83597d) && this.f83598e == advertDetailsFeatureTeaserItem.f83598e && this.f83599f == advertDetailsFeatureTeaserItem.f83599f && L.f(this.f83600g, advertDetailsFeatureTeaserItem.f83600g) && L.f(this.f83601h, advertDetailsFeatureTeaserItem.f83601h) && L.f(this.f83602i, advertDetailsFeatureTeaserItem.f83602i) && L.f(this.f83603j, advertDetailsFeatureTeaserItem.f83603j) && L.f(this.f83604k, advertDetailsFeatureTeaserItem.f83604k) && L.f(this.f83605l, advertDetailsFeatureTeaserItem.f83605l) && L.f(this.f83606m, advertDetailsFeatureTeaserItem.f83606m);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79816g() {
        return this.f83595b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79818i() {
        return this.f83596c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79817h() {
        return this.f83597d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79820k() {
        return this.f83599f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f83599f, com.avito.android.actions_sheet.a.h(this.f83598e, H.d(r.e(this.f83596c, Long.hashCode(this.f83595b) * 31, 31), 31, this.f83597d), 31), 31);
        AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = this.f83600g;
        int iHashCode = (iJ2 + (advertDetailsFeatureTeaserOption == null ? 0 : advertDetailsFeatureTeaserOption.hashCode())) * 31;
        AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo = this.f83601h;
        int iHashCode2 = (iHashCode + (advertDetailsFeatureTeaserDialogInfo == null ? 0 : advertDetailsFeatureTeaserDialogInfo.hashCode())) * 31;
        String str = this.f83602i;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83603j);
        String str2 = this.f83604k;
        int iHashCode3 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83605l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f83606m;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFeatureTeaserItem(id=");
        sb2.append(this.f83595b);
        sb2.append(", spanCount=");
        sb2.append(this.f83596c);
        sb2.append(", stringId=");
        sb2.append(this.f83597d);
        sb2.append(", displayType=");
        sb2.append(this.f83598e);
        sb2.append(", viewType=");
        sb2.append(this.f83599f);
        sb2.append(", title=");
        sb2.append(this.f83600g);
        sb2.append(", dialogInfo=");
        sb2.append(this.f83601h);
        sb2.append(", subtitle=");
        sb2.append(this.f83602i);
        sb2.append(", features=");
        sb2.append(this.f83603j);
        sb2.append(", additionalInfoLink=");
        sb2.append(this.f83604k);
        sb2.append(", featureSlug=");
        sb2.append(this.f83605l);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f83606m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f83595b);
        parcel.writeInt(this.f83596c);
        parcel.writeString(this.f83597d);
        parcel.writeString(this.f83598e.name());
        parcel.writeString(this.f83599f.name());
        AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = this.f83600g;
        if (advertDetailsFeatureTeaserOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertDetailsFeatureTeaserOption.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f83601h, i12);
        parcel.writeString(this.f83602i);
        Iterator itJ = C0.j(this.f83603j, parcel);
        while (itJ.hasNext()) {
            ((AdvertDetailsFeatureTeaserOption) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f83604k);
        parcel.writeString(this.f83605l);
        parcel.writeString(this.f83606m);
    }

    public AdvertDetailsFeatureTeaserItem(long j12, int i12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption, AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo, String str2, List list, String str3, String str4, String str5, int i13, C42822w c42822w) {
        this(j12, i12, str, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, advertDetailsFeatureTeaserOption, (i13 & 64) != 0 ? null : advertDetailsFeatureTeaserDialogInfo, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? C42784z0.f406748b : list, (i13 & 512) != 0 ? null : str3, (i13 & 1024) != 0 ? null : str4, (i13 & 2048) != 0 ? null : str5);
    }
}

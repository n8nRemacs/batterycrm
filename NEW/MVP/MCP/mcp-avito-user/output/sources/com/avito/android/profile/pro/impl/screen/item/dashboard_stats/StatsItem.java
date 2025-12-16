package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProStatsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/StatsItem;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StatsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f223154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<StatsDay> f223155c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f223156d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f223157e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f223158f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f223159g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f223160h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f223161i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<UniversalColor> f223162j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f223163k;

    /* compiled from: ProfileProStatsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsItem> {
        @Override // android.os.Parcelable.Creator
        public final StatsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StatsDay.CREATOR, parcel, arrayList2, iC2, 1);
            }
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(StatsItem.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(StatsItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(StatsItem.class.getClassLoader());
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(StatsItem.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StatsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(StatsItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new StatsItem(j12, arrayList2, string, attributedText, universalImage, attributedText2, attributedText3, deepLink, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsItem[] newArray(int i12) {
            return new StatsItem[i12];
        }
    }

    public StatsItem(long j12, @k List<StatsDay> list, @l String str, @l AttributedText attributedText, @l UniversalImage universalImage, @l AttributedText attributedText2, @l AttributedText attributedText3, @k DeepLink deepLink, @l List<UniversalColor> list2, boolean z12) {
        this.f223154b = j12;
        this.f223155c = list;
        this.f223156d = str;
        this.f223157e = attributedText;
        this.f223158f = universalImage;
        this.f223159g = attributedText2;
        this.f223160h = attributedText3;
        this.f223161i = deepLink;
        this.f223162j = list2;
        this.f223163k = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsItem)) {
            return false;
        }
        StatsItem statsItem = (StatsItem) obj;
        return this.f223154b == statsItem.f223154b && L.f(this.f223155c, statsItem.f223155c) && L.f(this.f223156d, statsItem.f223156d) && L.f(this.f223157e, statsItem.f223157e) && L.f(this.f223158f, statsItem.f223158f) && L.f(this.f223159g, statsItem.f223159g) && L.f(this.f223160h, statsItem.f223160h) && L.f(this.f223161i, statsItem.f223161i) && L.f(this.f223162j, statsItem.f223162j) && this.f223163k == statsItem.f223163k;
    }

    public final int hashCode() {
        int iE2 = H.e(Long.hashCode(this.f223154b) * 31, 31, this.f223155c);
        String str = this.f223156d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f223157e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f223158f;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText2 = this.f223159g;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f223160h;
        int iE3 = com.avito.android.actions_sheet.a.e(this.f223161i, (iHashCode4 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31);
        List<UniversalColor> list = this.f223162j;
        return Boolean.hashCode(this.f223163k) + ((iE3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsItem(maxValue=");
        sb2.append(this.f223154b);
        sb2.append(", days=");
        sb2.append(this.f223155c);
        sb2.append(", slug=");
        sb2.append(this.f223156d);
        sb2.append(", title=");
        sb2.append(this.f223157e);
        sb2.append(", icon=");
        sb2.append(this.f223158f);
        sb2.append(", value=");
        sb2.append(this.f223159g);
        sb2.append(", relativeValue=");
        sb2.append(this.f223160h);
        sb2.append(", deeplink=");
        sb2.append(this.f223161i);
        sb2.append(", barColor=");
        sb2.append(this.f223162j);
        sb2.append(", isEmpty=");
        return r.x(sb2, this.f223163k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f223154b);
        Iterator itJ = C0.j(this.f223155c, parcel);
        while (itJ.hasNext()) {
            ((StatsDay) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f223156d);
        parcel.writeParcelable(this.f223157e, i12);
        parcel.writeParcelable(this.f223158f, i12);
        parcel.writeParcelable(this.f223159g, i12);
        parcel.writeParcelable(this.f223160h, i12);
        parcel.writeParcelable(this.f223161i, i12);
        List<UniversalColor> list = this.f223162j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f223163k ? 1 : 0);
    }

    public /* synthetic */ StatsItem(long j12, List list, String str, AttributedText attributedText, UniversalImage universalImage, AttributedText attributedText2, AttributedText attributedText3, DeepLink deepLink, List list2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? new ArrayList() : list, (i12 & 4) != 0 ? null : str, attributedText, universalImage, (i12 & 32) != 0 ? null : attributedText2, (i12 & 64) != 0 ? null : attributedText3, deepLink, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? false : z12);
    }
}

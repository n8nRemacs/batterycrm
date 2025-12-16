package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b(\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b)\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsServices;", "Landroid/os/Parcelable;", "", "slug", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "hint", "", "realAmount", "value", "bonusAmount", "count", "Lcom/avito/android/remote/model/UniversalColor;", "plotColor", "bulletColor", "bonusBadgeColor", "bonusPlotColor", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;JJLjava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/util/List;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "i", "()Lcom/avito/android/deep_linking/links/DeepLink;", "J", "k", "()J", "l", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "h", "Lcom/avito/android/remote/model/UniversalColor;", "j", "()Lcom/avito/android/remote/model/UniversalColor;", "f", "d", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsServices implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsServices> CREATOR = new a();

    @c("bonusAmount")
    @l
    private final Long bonusAmount;

    @c("bonusBadgeColor")
    @l
    private final UniversalColor bonusBadgeColor;

    @c("bonusPlotColor")
    @l
    private final UniversalColor bonusPlotColor;

    @c("bulletColor")
    @l
    private final UniversalColor bulletColor;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<StatsServices> children;

    @c("count")
    @l
    private final Long count;

    @c("hint")
    @l
    private final DeepLink hint;

    @c("plotColor")
    @l
    private final UniversalColor plotColor;

    @c("realAmount")
    private final long realAmount;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @l
    private final String title;

    @c("value")
    private final long value;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsServices> {
        @Override // android.os.Parcelable.Creator
        public final StatsServices createFromParcel(Parcel parcel) {
            UniversalColor universalColor;
            UniversalColor universalColor2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StatsServices.class.getClassLoader());
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            UniversalColor universalColor3 = (UniversalColor) parcel.readParcelable(StatsServices.class.getClassLoader());
            UniversalColor universalColor4 = (UniversalColor) parcel.readParcelable(StatsServices.class.getClassLoader());
            UniversalColor universalColor5 = (UniversalColor) parcel.readParcelable(StatsServices.class.getClassLoader());
            UniversalColor universalColor6 = (UniversalColor) parcel.readParcelable(StatsServices.class.getClassLoader());
            if (parcel.readInt() == 0) {
                universalColor2 = universalColor5;
                universalColor = universalColor6;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                universalColor = universalColor6;
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(StatsServices.CREATOR, parcel, arrayList, iC2, 1);
                    i12 = i12;
                    universalColor5 = universalColor5;
                }
                universalColor2 = universalColor5;
            }
            return new StatsServices(string, string2, deepLink, j12, j13, lValueOf, lValueOf2, universalColor3, universalColor4, universalColor2, universalColor, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsServices[] newArray(int i12) {
            return new StatsServices[i12];
        }
    }

    public StatsServices(@k String str, @l String str2, @l DeepLink deepLink, long j12, long j13, @l Long l12, @l Long l13, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l UniversalColor universalColor4, @l List<StatsServices> list) {
        this.slug = str;
        this.title = str2;
        this.hint = deepLink;
        this.realAmount = j12;
        this.value = j13;
        this.bonusAmount = l12;
        this.count = l13;
        this.plotColor = universalColor;
        this.bulletColor = universalColor2;
        this.bonusBadgeColor = universalColor3;
        this.bonusPlotColor = universalColor4;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StatsServices a(StatsServices statsServices, String str, long j12, Long l12, ArrayList arrayList, int i12) {
        return new StatsServices(statsServices.slug, (i12 & 2) != 0 ? statsServices.title : str, statsServices.hint, (i12 & 8) != 0 ? statsServices.realAmount : j12, statsServices.value, (i12 & 32) != 0 ? statsServices.bonusAmount : l12, (i12 & 64) != 0 ? statsServices.count : 0L, statsServices.plotColor, statsServices.bulletColor, statsServices.bonusBadgeColor, statsServices.bonusPlotColor, (i12 & 2048) != 0 ? statsServices.children : arrayList);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getBonusAmount() {
        return this.bonusAmount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalColor getBonusBadgeColor() {
        return this.bonusBadgeColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final UniversalColor getBonusPlotColor() {
        return this.bonusPlotColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsServices)) {
            return false;
        }
        StatsServices statsServices = (StatsServices) obj;
        return L.f(this.slug, statsServices.slug) && L.f(this.title, statsServices.title) && L.f(this.hint, statsServices.hint) && this.realAmount == statsServices.realAmount && this.value == statsServices.value && L.f(this.bonusAmount, statsServices.bonusAmount) && L.f(this.count, statsServices.count) && L.f(this.plotColor, statsServices.plotColor) && L.f(this.bulletColor, statsServices.bulletColor) && L.f(this.bonusBadgeColor, statsServices.bonusBadgeColor) && L.f(this.bonusPlotColor, statsServices.bonusPlotColor) && L.f(this.children, statsServices.children);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalColor getBulletColor() {
        return this.bulletColor;
    }

    @l
    public final List<StatsServices> g() {
        return this.children;
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Long getCount() {
        return this.count;
    }

    public final int hashCode() {
        int iHashCode = this.slug.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.hint;
        int iG2 = r.g(r.g((iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.realAmount), 31, this.value);
        Long l12 = this.bonusAmount;
        int iHashCode3 = (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.count;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        UniversalColor universalColor = this.plotColor;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.bulletColor;
        int iHashCode6 = (iHashCode5 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.bonusBadgeColor;
        int iHashCode7 = (iHashCode6 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        UniversalColor universalColor4 = this.bonusPlotColor;
        int iHashCode8 = (iHashCode7 + (universalColor4 == null ? 0 : universalColor4.hashCode())) * 31;
        List<StatsServices> list = this.children;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final DeepLink getHint() {
        return this.hint;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final UniversalColor getPlotColor() {
        return this.plotColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getRealAmount() {
        return this.realAmount;
    }

    /* renamed from: l, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsServices(slug=");
        sb2.append(this.slug);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", realAmount=");
        sb2.append(this.realAmount);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", bonusAmount=");
        sb2.append(this.bonusAmount);
        sb2.append(", count=");
        sb2.append(this.count);
        sb2.append(", plotColor=");
        sb2.append(this.plotColor);
        sb2.append(", bulletColor=");
        sb2.append(this.bulletColor);
        sb2.append(", bonusBadgeColor=");
        sb2.append(this.bonusBadgeColor);
        sb2.append(", bonusPlotColor=");
        sb2.append(this.bonusPlotColor);
        sb2.append(", children=");
        return H.p(sb2, this.children, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.hint, i12);
        parcel.writeLong(this.realAmount);
        parcel.writeLong(this.value);
        Long l12 = this.bonusAmount;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.count;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeParcelable(this.plotColor, i12);
        parcel.writeParcelable(this.bulletColor, i12);
        parcel.writeParcelable(this.bonusBadgeColor, i12);
        parcel.writeParcelable(this.bonusPlotColor, i12);
        List<StatsServices> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((StatsServices) itA.next()).writeToParcel(parcel, i12);
        }
    }
}

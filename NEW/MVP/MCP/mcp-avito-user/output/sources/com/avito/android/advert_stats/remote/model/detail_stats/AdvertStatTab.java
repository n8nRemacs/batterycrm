package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/AdvertStatTab;", "Landroid/os/Parcelable;", "", "id", "", "maxValue", "title", "", "isSelected", "", "firstDateWithStatistic", "Lcom/avito/android/remote/model/text/AttributedText;", "descriptionDialog", "Lcom/avito/android/remote/model/Action;", "factorDialog", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Favorite;", "favorite", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Period;", "periods", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZJLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Action;Lcom/avito/android/advert_stats/remote/model/detail_stats/Favorite;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "f", "()I", "getTitle", "Z", "()Z", "J", "getFirstDateWithStatistic", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Action;", "d", "()Lcom/avito/android/remote/model/Action;", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Favorite;", "e", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/Favorite;", "Ljava/util/List;", "g", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertStatTab implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertStatTab> CREATOR = new a();

    @c("descriptionDialog")
    @l
    private final AttributedText descriptionDialog;

    @c("factorDialog")
    @l
    private final Action factorDialog;

    @c("favorite")
    @l
    private final Favorite favorite;

    @c("firstDateWithStatistic")
    private final long firstDateWithStatistic;

    @c("id")
    @k
    private final String id;

    @c("isSelected")
    private final boolean isSelected;

    @c("maxValue")
    private final int maxValue;

    @c("periods")
    @l
    private final List<Period> periods;

    @c("title")
    @k
    private final String title;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertStatTab> {
        @Override // android.os.Parcelable.Creator
        public final AdvertStatTab createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            long j12 = parcel.readLong();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertStatTab.class.getClassLoader());
            Action action = (Action) parcel.readParcelable(AdvertStatTab.class.getClassLoader());
            ArrayList arrayList = null;
            Favorite favoriteCreateFromParcel = parcel.readInt() == 0 ? null : Favorite.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Period.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertStatTab(string, i12, string2, z12, j12, attributedText, action, favoriteCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertStatTab[] newArray(int i12) {
            return new AdvertStatTab[i12];
        }
    }

    public AdvertStatTab(@k String str, int i12, @k String str2, boolean z12, long j12, @l AttributedText attributedText, @l Action action, @l Favorite favorite, @l List<Period> list) {
        this.id = str;
        this.maxValue = i12;
        this.title = str2;
        this.isSelected = z12;
        this.firstDateWithStatistic = j12;
        this.descriptionDialog = attributedText;
        this.factorDialog = action;
        this.favorite = favorite;
        this.periods = list;
    }

    public static AdvertStatTab a(AdvertStatTab advertStatTab, ArrayList arrayList) {
        return new AdvertStatTab(advertStatTab.id, advertStatTab.maxValue, advertStatTab.title, advertStatTab.isSelected, advertStatTab.firstDateWithStatistic, advertStatTab.descriptionDialog, advertStatTab.factorDialog, advertStatTab.favorite, arrayList);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescriptionDialog() {
        return this.descriptionDialog;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Action getFactorDialog() {
        return this.factorDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Favorite getFavorite() {
        return this.favorite;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertStatTab)) {
            return false;
        }
        AdvertStatTab advertStatTab = (AdvertStatTab) obj;
        return L.f(this.id, advertStatTab.id) && this.maxValue == advertStatTab.maxValue && L.f(this.title, advertStatTab.title) && this.isSelected == advertStatTab.isSelected && this.firstDateWithStatistic == advertStatTab.firstDateWithStatistic && L.f(this.descriptionDialog, advertStatTab.descriptionDialog) && L.f(this.factorDialog, advertStatTab.factorDialog) && L.f(this.favorite, advertStatTab.favorite) && L.f(this.periods, advertStatTab.periods);
    }

    /* renamed from: f, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    @l
    public final List<Period> g() {
        return this.periods;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iG2 = r.g(r.i(H.d(r.e(this.maxValue, this.id.hashCode() * 31, 31), 31, this.title), 31, this.isSelected), 31, this.firstDateWithStatistic);
        AttributedText attributedText = this.descriptionDialog;
        int iHashCode = (iG2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Action action = this.factorDialog;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Favorite favorite = this.favorite;
        int iHashCode3 = (iHashCode2 + (favorite == null ? 0 : favorite.hashCode())) * 31;
        List<Period> list = this.periods;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertStatTab(id=");
        sb2.append(this.id);
        sb2.append(", maxValue=");
        sb2.append(this.maxValue);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", firstDateWithStatistic=");
        sb2.append(this.firstDateWithStatistic);
        sb2.append(", descriptionDialog=");
        sb2.append(this.descriptionDialog);
        sb2.append(", factorDialog=");
        sb2.append(this.factorDialog);
        sb2.append(", favorite=");
        sb2.append(this.favorite);
        sb2.append(", periods=");
        return H.p(sb2, this.periods, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeInt(this.maxValue);
        parcel.writeString(this.title);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeLong(this.firstDateWithStatistic);
        parcel.writeParcelable(this.descriptionDialog, i12);
        parcel.writeParcelable(this.factorDialog, i12);
        Favorite favorite = this.favorite;
        if (favorite == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favorite.writeToParcel(parcel, i12);
        }
        List<Period> list = this.periods;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Period) itA.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ AdvertStatTab(String str, int i12, String str2, boolean z12, long j12, AttributedText attributedText, Action action, Favorite favorite, List list, int i13, C42822w c42822w) {
        this(str, i12, str2, z12, j12, (i13 & 32) != 0 ? null : attributedText, (i13 & 64) != 0 ? null : action, (i13 & 128) != 0 ? null : favorite, (i13 & 256) != 0 ? null : list);
    }
}

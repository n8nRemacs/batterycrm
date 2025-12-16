package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/HintItemLegend;", "Landroid/os/Parcelable;", "", "Lcom/avito/user_stats/model/extended_user_stats/HintLegendDetailsItem;", "details", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HintItemLegend implements Parcelable {

    @k
    public static final Parcelable.Creator<HintItemLegend> CREATOR = new a();

    @c("details")
    @l
    private final List<HintLegendDetailsItem> details;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HintItemLegend> {
        @Override // android.os.Parcelable.Creator
        public final HintItemLegend createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(HintLegendDetailsItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new HintItemLegend(arrayList, (AttributedText) parcel.readParcelable(HintItemLegend.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HintItemLegend[] newArray(int i12) {
            return new HintItemLegend[i12];
        }
    }

    public HintItemLegend(@l List<HintLegendDetailsItem> list, @l AttributedText attributedText) {
        this.details = list;
        this.title = attributedText;
    }

    @l
    public final List<HintLegendDetailsItem> c() {
        return this.details;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HintItemLegend)) {
            return false;
        }
        HintItemLegend hintItemLegend = (HintItemLegend) obj;
        return L.f(this.details, hintItemLegend.details) && L.f(this.title, hintItemLegend.title);
    }

    public final int hashCode() {
        List<HintLegendDetailsItem> list = this.details;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AttributedText attributedText = this.title;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HintItemLegend(details=");
        sb2.append(this.details);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<HintLegendDetailsItem> list = this.details;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((HintLegendDetailsItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.title, i12);
    }
}

package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertExpensesStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingParent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "value", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingItem;", "items", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SpendingParent implements Parcelable {

    @k
    public static final Parcelable.Creator<SpendingParent> CREATOR = new a();

    @c("items")
    @l
    private final List<SpendingItem> items;

    @c("name")
    @l
    private final AttributedText name;

    @c("value")
    @l
    private final AttributedText value;

    /* compiled from: DetailAdvertExpensesStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpendingParent> {
        @Override // android.os.Parcelable.Creator
        public final SpendingParent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SpendingParent.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SpendingParent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SpendingItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new SpendingParent(attributedText, attributedText2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpendingParent[] newArray(int i12) {
            return new SpendingParent[i12];
        }
    }

    public SpendingParent(@l AttributedText attributedText, @l AttributedText attributedText2, @l List<SpendingItem> list) {
        this.name = attributedText;
        this.value = attributedText2;
        this.items = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingParent)) {
            return false;
        }
        SpendingParent spendingParent = (SpendingParent) obj;
        return L.f(this.name, spendingParent.name) && L.f(this.value, spendingParent.value) && L.f(this.items, spendingParent.items);
    }

    @l
    public final List<SpendingItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        AttributedText attributedText = this.name;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.value;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        List<SpendingItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpendingParent(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.name, i12);
        parcel.writeParcelable(this.value, i12);
        List<SpendingItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((SpendingItem) itA.next()).writeToParcel(parcel, i12);
        }
    }
}

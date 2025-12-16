package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicsSummary;", "Landroid/os/Parcelable;", "", "Lcom/avito/user_stats/model/extended_user_stats/DynamicsVas;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/user_stats/model/extended_user_stats/DynamicsHintItem;", "hint", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/user_stats/model/extended_user_stats/DynamicsTotal;", "total", "", "type", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/user_stats/model/extended_user_stats/DynamicsTotal;Ljava/lang/String;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/user_stats/model/extended_user_stats/DynamicsTotal;", "f", "()Lcom/avito/user_stats/model/extended_user_stats/DynamicsTotal;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicsSummary implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicsSummary> CREATOR = new a();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<DynamicsVas> children;

    @c("hint")
    @l
    private final List<DynamicsHintItem> hint;

    @c("title")
    @l
    private final AttributedText title;

    @c("total")
    @l
    private final DynamicsTotal total;

    @c("type")
    @l
    private final String type;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicsSummary> {
        @Override // android.os.Parcelable.Creator
        public final DynamicsSummary createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(DynamicsVas.CREATOR, parcel, arrayList3, iC3, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(DynamicsHintItem.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new DynamicsSummary(arrayList, arrayList2, (AttributedText) parcel.readParcelable(DynamicsSummary.class.getClassLoader()), parcel.readInt() != 0 ? DynamicsTotal.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicsSummary[] newArray(int i12) {
            return new DynamicsSummary[i12];
        }
    }

    public DynamicsSummary(@l List<DynamicsVas> list, @l List<DynamicsHintItem> list2, @l AttributedText attributedText, @l DynamicsTotal dynamicsTotal, @l String str) {
        this.children = list;
        this.hint = list2;
        this.title = attributedText;
        this.total = dynamicsTotal;
        this.type = str;
    }

    @l
    public final List<DynamicsVas> c() {
        return this.children;
    }

    @l
    public final List<DynamicsHintItem> d() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicsSummary)) {
            return false;
        }
        DynamicsSummary dynamicsSummary = (DynamicsSummary) obj;
        return L.f(this.children, dynamicsSummary.children) && L.f(this.hint, dynamicsSummary.hint) && L.f(this.title, dynamicsSummary.title) && L.f(this.total, dynamicsSummary.total) && L.f(this.type, dynamicsSummary.type);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final DynamicsTotal getTotal() {
        return this.total;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        List<DynamicsVas> list = this.children;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DynamicsHintItem> list2 = this.hint;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText = this.title;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DynamicsTotal dynamicsTotal = this.total;
        int iHashCode4 = (iHashCode3 + (dynamicsTotal == null ? 0 : dynamicsTotal.hashCode())) * 31;
        String str = this.type;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicsSummary(children=");
        sb2.append(this.children);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", total=");
        sb2.append(this.total);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<DynamicsVas> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DynamicsVas) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<DynamicsHintItem> list2 = this.hint;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((DynamicsHintItem) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.title, i12);
        DynamicsTotal dynamicsTotal = this.total;
        if (dynamicsTotal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicsTotal.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.type);
    }

    public /* synthetic */ DynamicsSummary(List list, List list2, AttributedText attributedText, DynamicsTotal dynamicsTotal, String str, int i12, C42822w c42822w) {
        this(list, list2, attributedText, dynamicsTotal, (i12 & 16) != 0 ? null : str);
    }
}

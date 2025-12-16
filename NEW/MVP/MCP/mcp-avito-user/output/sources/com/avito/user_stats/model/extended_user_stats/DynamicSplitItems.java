package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicSplitItems;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicSplitItems implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicSplitItems> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f338642b;

    /* renamed from: c, reason: collision with root package name */
    public final long f338643c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f338644d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f338645e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DynamicSplitTooltip f338646f;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicSplitItems> {
        @Override // android.os.Parcelable.Creator
        public final DynamicSplitItems createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(DynamicSplitItems.CREATOR, parcel, arrayList2, iC3, 1);
                }
                arrayList = arrayList2;
            }
            long j12 = parcel.readLong();
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(DynamicItemsMetrics.CREATOR, parcel, arrayList3, iC2, 1);
            }
            return new DynamicSplitItems(arrayList, j12, arrayList3, parcel.readString(), parcel.readInt() != 0 ? DynamicSplitTooltip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicSplitItems[] newArray(int i12) {
            return new DynamicSplitItems[i12];
        }
    }

    public DynamicSplitItems(@l ArrayList arrayList, long j12, @k ArrayList arrayList2, @k String str, @l DynamicSplitTooltip dynamicSplitTooltip) {
        this.f338642b = arrayList;
        this.f338643c = j12;
        this.f338644d = arrayList2;
        this.f338645e = str;
        this.f338646f = dynamicSplitTooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplitItems)) {
            return false;
        }
        DynamicSplitItems dynamicSplitItems = (DynamicSplitItems) obj;
        return L.f(this.f338642b, dynamicSplitItems.f338642b) && this.f338643c == dynamicSplitItems.f338643c && this.f338644d.equals(dynamicSplitItems.f338644d) && L.f(this.f338645e, dynamicSplitItems.f338645e) && L.f(this.f338646f, dynamicSplitItems.f338646f);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f338642b;
        int iD2 = H.d(e.g(this.f338644d, r.g((arrayList == null ? 0 : arrayList.hashCode()) * 31, 31, this.f338643c), 31), 31, this.f338645e);
        DynamicSplitTooltip dynamicSplitTooltip = this.f338646f;
        return iD2 + (dynamicSplitTooltip != null ? dynamicSplitTooltip.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DynamicSplitItems(children=" + this.f338642b + ", id=" + this.f338643c + ", metrics=" + this.f338644d + ", title=" + this.f338645e + ", tooltip=" + this.f338646f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ArrayList arrayList = this.f338642b;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((DynamicSplitItems) itY.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeLong(this.f338643c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f338644d, parcel);
        while (itZ.hasNext()) {
            ((DynamicItemsMetrics) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f338645e);
        DynamicSplitTooltip dynamicSplitTooltip = this.f338646f;
        if (dynamicSplitTooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicSplitTooltip.writeToParcel(parcel, i12);
        }
    }
}

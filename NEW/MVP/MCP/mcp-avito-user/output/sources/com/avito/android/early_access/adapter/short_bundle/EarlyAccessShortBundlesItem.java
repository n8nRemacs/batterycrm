package com.avito.android.early_access.adapter.short_bundle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessShortBundlesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/short_bundle/EarlyAccessShortBundlesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessShortBundlesItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<EarlyAccessShortBundlesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145186b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<EarlyAccessShortBundleItem> f145187c;

    /* compiled from: EarlyAccessShortBundlesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessShortBundlesItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortBundlesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(EarlyAccessShortBundleItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new EarlyAccessShortBundlesItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortBundlesItem[] newArray(int i12) {
            return new EarlyAccessShortBundlesItem[i12];
        }
    }

    public EarlyAccessShortBundlesItem(@Y61.k String str, @Y61.k List<EarlyAccessShortBundleItem> list) {
        this.f145186b = str;
        this.f145187c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessShortBundlesItem)) {
            return false;
        }
        EarlyAccessShortBundlesItem earlyAccessShortBundlesItem = (EarlyAccessShortBundlesItem) obj;
        return L.f(this.f145186b, earlyAccessShortBundlesItem.f145186b) && L.f(this.f145187c, earlyAccessShortBundlesItem.f145187c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145164b() {
        return this.f145186b;
    }

    public final int hashCode() {
        return this.f145187c.hashCode() + (this.f145186b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessShortBundlesItem(stringId=");
        sb2.append(this.f145186b);
        sb2.append(", prices=");
        return H.p(sb2, this.f145187c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f145186b);
        Iterator itJ = C0.j(this.f145187c, parcel);
        while (itJ.hasNext()) {
            ((EarlyAccessShortBundleItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ EarlyAccessShortBundlesItem(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessShortBundlesItem.class.getName() : str, list);
    }
}

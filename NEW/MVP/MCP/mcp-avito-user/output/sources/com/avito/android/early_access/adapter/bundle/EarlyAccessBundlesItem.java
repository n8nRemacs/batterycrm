package com.avito.android.early_access.adapter.bundle;

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

/* compiled from: EarlyAccessBundlesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundlesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessBundlesItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<EarlyAccessBundlesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145097b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<EarlyAccessBundleItem> f145098c;

    /* compiled from: EarlyAccessBundlesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessBundlesItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBundlesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(EarlyAccessBundlesItem.class, parcel, arrayList, iL2, 1);
            }
            return new EarlyAccessBundlesItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBundlesItem[] newArray(int i12) {
            return new EarlyAccessBundlesItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarlyAccessBundlesItem(@Y61.k String str, @Y61.k List<? extends EarlyAccessBundleItem> list) {
        this.f145097b = str;
        this.f145098c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessBundlesItem)) {
            return false;
        }
        EarlyAccessBundlesItem earlyAccessBundlesItem = (EarlyAccessBundlesItem) obj;
        return L.f(this.f145097b, earlyAccessBundlesItem.f145097b) && L.f(this.f145098c, earlyAccessBundlesItem.f145098c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84571b() {
        return this.f145097b;
    }

    public final int hashCode() {
        return this.f145098c.hashCode() + (this.f145097b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessBundlesItem(stringId=");
        sb2.append(this.f145097b);
        sb2.append(", prices=");
        return H.p(sb2, this.f145098c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f145097b);
        Iterator itJ = C0.j(this.f145098c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public /* synthetic */ EarlyAccessBundlesItem(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessBundlesItem.class.getName() : str, list);
    }
}

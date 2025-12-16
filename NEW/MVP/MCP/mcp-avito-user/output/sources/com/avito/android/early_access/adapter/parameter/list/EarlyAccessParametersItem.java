package com.avito.android.early_access.adapter.parameter.list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.early_access.adapter.parameter.element.EarlyAccessParameterItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessParametersItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/parameter/list/EarlyAccessParametersItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessParametersItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessParametersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145148b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<EarlyAccessParameterItem> f145149c;

    /* compiled from: EarlyAccessParametersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessParametersItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessParametersItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(EarlyAccessParameterItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new EarlyAccessParametersItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessParametersItem[] newArray(int i12) {
            return new EarlyAccessParametersItem[i12];
        }
    }

    public EarlyAccessParametersItem(@k String str, @k List<EarlyAccessParameterItem> list) {
        this.f145148b = str;
        this.f145149c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessParametersItem)) {
            return false;
        }
        EarlyAccessParametersItem earlyAccessParametersItem = (EarlyAccessParametersItem) obj;
        return L.f(this.f145148b, earlyAccessParametersItem.f145148b) && L.f(this.f145149c, earlyAccessParametersItem.f145149c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79990c() {
        return this.f145148b;
    }

    public final int hashCode() {
        return this.f145149c.hashCode() + (this.f145148b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessParametersItem(stringId=");
        sb2.append(this.f145148b);
        sb2.append(", parameters=");
        return H.p(sb2, this.f145149c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145148b);
        Iterator itJ = C0.j(this.f145149c, parcel);
        while (itJ.hasNext()) {
            ((EarlyAccessParameterItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ EarlyAccessParametersItem(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessParametersItem.class.getName() : str, list);
    }
}

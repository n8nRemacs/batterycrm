package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item/VasItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<VasItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318124b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f318125c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f318126d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Image> f318127e;

    /* compiled from: VasItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasItemData> {
        @Override // android.os.Parcelable.Creator
        public final VasItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VasItemData.class.getClassLoader());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(VasItemData.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new VasItemData(attributedText, string, arrayList, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final VasItemData[] newArray(int i12) {
            return new VasItemData[i12];
        }
    }

    public VasItemData(@l AttributedText attributedText, @k String str, @l List list, boolean z12) {
        this.f318124b = str;
        this.f318125c = attributedText;
        this.f318126d = z12;
        this.f318127e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasItemData)) {
            return false;
        }
        VasItemData vasItemData = (VasItemData) obj;
        return L.f(this.f318124b, vasItemData.f318124b) && L.f(this.f318125c, vasItemData.f318125c) && this.f318126d == vasItemData.f318126d && L.f(this.f318127e, vasItemData.f318127e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF293121b() {
        return this.f318124b;
    }

    public final int hashCode() {
        int iHashCode = this.f318124b.hashCode() * 31;
        AttributedText attributedText = this.f318125c;
        int i12 = r.i((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f318126d);
        List<Image> list = this.f318127e;
        return i12 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasItemData(stringId=");
        sb2.append(this.f318124b);
        sb2.append(", text=");
        sb2.append(this.f318125c);
        sb2.append(", isOpened=");
        sb2.append(this.f318126d);
        sb2.append(", icons=");
        return H.p(sb2, this.f318127e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318124b);
        parcel.writeParcelable(this.f318125c, i12);
        parcel.writeInt(this.f318126d ? 1 : 0);
        List<Image> list = this.f318127e;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }

    public /* synthetic */ VasItemData(String str, AttributedText attributedText, boolean z12, List list, int i12, C42822w c42822w) {
        this(attributedText, str, list, (i12 & 4) != 0 ? false : z12);
    }
}

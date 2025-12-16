package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasItemDetailData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item_detail/VasItemDetailData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasItemDetailData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<VasItemDetailData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318142b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f318143c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f318144d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f318145e;

    /* compiled from: VasItemDetailData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasItemDetailData> {
        @Override // android.os.Parcelable.Creator
        public final VasItemDetailData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new VasItemDetailData((Image) parcel.readParcelable(VasItemDetailData.class.getClassLoader()), (AttributedText) parcel.readParcelable(VasItemDetailData.class.getClassLoader()), (AttributedText) parcel.readParcelable(VasItemDetailData.class.getClassLoader()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final VasItemDetailData[] newArray(int i12) {
            return new VasItemDetailData[i12];
        }
    }

    public VasItemDetailData(@l Image image, @l AttributedText attributedText, @l AttributedText attributedText2, @k String str) {
        this.f318142b = str;
        this.f318143c = attributedText;
        this.f318144d = attributedText2;
        this.f318145e = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasItemDetailData)) {
            return false;
        }
        VasItemDetailData vasItemDetailData = (VasItemDetailData) obj;
        return L.f(this.f318142b, vasItemDetailData.f318142b) && L.f(this.f318143c, vasItemDetailData.f318143c) && L.f(this.f318144d, vasItemDetailData.f318144d) && L.f(this.f318145e, vasItemDetailData.f318145e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317788b() {
        return this.f318142b;
    }

    public final int hashCode() {
        int iHashCode = this.f318142b.hashCode() * 31;
        AttributedText attributedText = this.f318143c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f318144d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Image image = this.f318145e;
        return iHashCode3 + (image != null ? image.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasItemDetailData(stringId=");
        sb2.append(this.f318142b);
        sb2.append(", name=");
        sb2.append(this.f318143c);
        sb2.append(", period=");
        sb2.append(this.f318144d);
        sb2.append(", icon=");
        return AK.c.o(sb2, this.f318145e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318142b);
        parcel.writeParcelable(this.f318143c, i12);
        parcel.writeParcelable(this.f318144d, i12);
        parcel.writeParcelable(this.f318145e, i12);
    }
}

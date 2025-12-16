package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import com.avito.user_stats.model.extended_user_stats.DynamicsHintItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ValueItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/value_item/ValueItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ValueItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<ValueItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318108b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f318109c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f318110d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DynamicsHintItem f318111e;

    /* compiled from: ValueItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ValueItemData> {
        @Override // android.os.Parcelable.Creator
        public final ValueItemData createFromParcel(Parcel parcel) {
            return new ValueItemData(parcel.readString(), (AttributedText) parcel.readParcelable(ValueItemData.class.getClassLoader()), parcel.readString(), (DynamicsHintItem) parcel.readParcelable(ValueItemData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ValueItemData[] newArray(int i12) {
            return new ValueItemData[i12];
        }
    }

    public ValueItemData(@k String str, @l AttributedText attributedText, @l String str2, @l DynamicsHintItem dynamicsHintItem) {
        this.f318108b = str;
        this.f318109c = attributedText;
        this.f318110d = str2;
        this.f318111e = dynamicsHintItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueItemData)) {
            return false;
        }
        ValueItemData valueItemData = (ValueItemData) obj;
        return L.f(this.f318108b, valueItemData.f318108b) && L.f(this.f318109c, valueItemData.f318109c) && L.f(this.f318110d, valueItemData.f318110d) && L.f(this.f318111e, valueItemData.f318111e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269870b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298268b() {
        return this.f318108b;
    }

    public final int hashCode() {
        int iHashCode = this.f318108b.hashCode() * 31;
        AttributedText attributedText = this.f318109c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f318110d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DynamicsHintItem dynamicsHintItem = this.f318111e;
        return iHashCode3 + (dynamicsHintItem != null ? dynamicsHintItem.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ValueItemData(stringId=" + this.f318108b + ", text=" + this.f318109c + ", value=" + this.f318110d + ", hint=" + this.f318111e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318108b);
        parcel.writeParcelable(this.f318109c, i12);
        parcel.writeString(this.f318110d);
        parcel.writeParcelable(this.f318111e, i12);
    }

    public /* synthetic */ ValueItemData(String str, AttributedText attributedText, String str2, DynamicsHintItem dynamicsHintItem, int i12, C42822w c42822w) {
        this(str, attributedText, str2, (i12 & 8) != 0 ? null : dynamicsHintItem);
    }
}

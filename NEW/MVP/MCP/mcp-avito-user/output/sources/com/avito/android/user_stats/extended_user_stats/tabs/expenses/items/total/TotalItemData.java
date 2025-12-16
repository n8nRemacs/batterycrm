package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TotalItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total/TotalItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TotalItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<TotalItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317767b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317768c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f317769d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f317770e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f317771f;

    /* compiled from: TotalItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TotalItemData> {
        @Override // android.os.Parcelable.Creator
        public final TotalItemData createFromParcel(Parcel parcel) {
            return new TotalItemData(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(TotalItemData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TotalItemData[] newArray(int i12) {
            return new TotalItemData[i12];
        }
    }

    public TotalItemData(@k String str, @k String str2, @l AttributedText attributedText, @l String str3, @l String str4) {
        this.f317767b = str;
        this.f317768c = str2;
        this.f317769d = str3;
        this.f317770e = attributedText;
        this.f317771f = str4;
    }

    public static TotalItemData a(TotalItemData totalItemData, String str) {
        String str2 = totalItemData.f317767b;
        String str3 = totalItemData.f317769d;
        AttributedText attributedText = totalItemData.f317770e;
        String str4 = totalItemData.f317771f;
        totalItemData.getClass();
        return new TotalItemData(str2, str, attributedText, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalItemData)) {
            return false;
        }
        TotalItemData totalItemData = (TotalItemData) obj;
        return L.f(this.f317767b, totalItemData.f317767b) && L.f(this.f317768c, totalItemData.f317768c) && L.f(this.f317769d, totalItemData.f317769d) && L.f(this.f317770e, totalItemData.f317770e) && L.f(this.f317771f, totalItemData.f317771f);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302516b() {
        return this.f317767b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f317767b.hashCode() * 31, 31, this.f317768c);
        String str = this.f317769d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f317770e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f317771f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TotalItemData(stringId=");
        sb2.append(this.f317767b);
        sb2.append(", total=");
        sb2.append(this.f317768c);
        sb2.append(", bonuses=");
        sb2.append(this.f317769d);
        sb2.append(", title=");
        sb2.append(this.f317770e);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f317771f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317767b);
        parcel.writeString(this.f317768c);
        parcel.writeString(this.f317769d);
        parcel.writeParcelable(this.f317770e, i12);
        parcel.writeString(this.f317771f);
    }

    public /* synthetic */ TotalItemData(String str, String str2, String str3, AttributedText attributedText, String str4, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 8) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}

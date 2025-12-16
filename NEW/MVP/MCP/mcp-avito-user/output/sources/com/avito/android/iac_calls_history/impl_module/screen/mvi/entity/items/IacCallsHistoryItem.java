package com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.remote.model.UniversalColor;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallsHistoryItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/items/IacCallsHistoryItem;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState$Item;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IacCallsHistoryItem implements CallsHistoryScreenState.Item {

    @k
    public static final Parcelable.Creator<IacCallsHistoryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f164839b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f164840c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LocalDateTime f164841d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f164842e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f164843f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UniversalColor f164844g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f164845h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Long f164846i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f164847j;

    /* compiled from: IacCallsHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCallsHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final IacCallsHistoryItem createFromParcel(Parcel parcel) {
            return new IacCallsHistoryItem(parcel.readString(), (DeepLink) parcel.readParcelable(IacCallsHistoryItem.class.getClassLoader()), (LocalDateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UniversalColor) parcel.readParcelable(IacCallsHistoryItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallsHistoryItem[] newArray(int i12) {
            return new IacCallsHistoryItem[i12];
        }
    }

    public IacCallsHistoryItem(@k String str, @k DeepLink deepLink, @k LocalDateTime localDateTime, @l Integer num, @k String str2, @k UniversalColor universalColor, @k String str3, @l Long l12, @k String str4) {
        this.f164839b = str;
        this.f164840c = deepLink;
        this.f164841d = localDateTime;
        this.f164842e = num;
        this.f164843f = str2;
        this.f164844g = universalColor;
        this.f164845h = str3;
        this.f164846i = l12;
        this.f164847j = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallsHistoryItem)) {
            return false;
        }
        IacCallsHistoryItem iacCallsHistoryItem = (IacCallsHistoryItem) obj;
        return L.f(this.f164839b, iacCallsHistoryItem.f164839b) && L.f(this.f164840c, iacCallsHistoryItem.f164840c) && L.f(this.f164841d, iacCallsHistoryItem.f164841d) && L.f(this.f164842e, iacCallsHistoryItem.f164842e) && L.f(this.f164843f, iacCallsHistoryItem.f164843f) && L.f(this.f164844g, iacCallsHistoryItem.f164844g) && L.f(this.f164845h, iacCallsHistoryItem.f164845h) && L.f(this.f164846i, iacCallsHistoryItem.f164846i) && L.f(this.f164847j, iacCallsHistoryItem.f164847j);
    }

    public final int hashCode() {
        int iHashCode = (this.f164841d.hashCode() + com.avito.android.actions_sheet.a.e(this.f164840c, this.f164839b.hashCode() * 31, 31)) * 31;
        Integer num = this.f164842e;
        int iD2 = H.d(com.avito.android.actions_sheet.a.i(this.f164844g, H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f164843f), 31), 31, this.f164845h);
        Long l12 = this.f164846i;
        return this.f164847j.hashCode() + ((iD2 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallsHistoryItem(callId=");
        sb2.append(this.f164839b);
        sb2.append(", action=");
        sb2.append(this.f164840c);
        sb2.append(", dateTime=");
        sb2.append(this.f164841d);
        sb2.append(", duration=");
        sb2.append(this.f164842e);
        sb2.append(", status=");
        sb2.append(this.f164843f);
        sb2.append(", statusColor=");
        sb2.append(this.f164844g);
        sb2.append(", itemTitle=");
        sb2.append(this.f164845h);
        sb2.append(", itemPrice=");
        sb2.append(this.f164846i);
        sb2.append(", userTitle=");
        return C22026a.c(sb2, this.f164847j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f164839b);
        parcel.writeParcelable(this.f164840c, i12);
        parcel.writeSerializable(this.f164841d);
        Integer num = this.f164842e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f164843f);
        parcel.writeParcelable(this.f164844g, i12);
        parcel.writeString(this.f164845h);
        Long l12 = this.f164846i;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f164847j);
    }
}

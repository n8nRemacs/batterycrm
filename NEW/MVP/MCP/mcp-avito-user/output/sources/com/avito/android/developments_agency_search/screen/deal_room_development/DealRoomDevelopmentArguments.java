package com.avito.android.developments_agency_search.screen.deal_room_development;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomDevelopmentArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/DealRoomDevelopmentArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DealRoomDevelopmentArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<DealRoomDevelopmentArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GetDealRoomInfoResponse.Deal.SelectionHistory.Item f137822c;

    /* compiled from: DealRoomDevelopmentArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealRoomDevelopmentArguments> {
        @Override // android.os.Parcelable.Creator
        public final DealRoomDevelopmentArguments createFromParcel(Parcel parcel) {
            return new DealRoomDevelopmentArguments(parcel.readString(), GetDealRoomInfoResponse.Deal.SelectionHistory.Item.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DealRoomDevelopmentArguments[] newArray(int i12) {
            return new DealRoomDevelopmentArguments[i12];
        }
    }

    public DealRoomDevelopmentArguments(@k String str, @k GetDealRoomInfoResponse.Deal.SelectionHistory.Item item) {
        this.f137821b = str;
        this.f137822c = item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealRoomDevelopmentArguments)) {
            return false;
        }
        DealRoomDevelopmentArguments dealRoomDevelopmentArguments = (DealRoomDevelopmentArguments) obj;
        return L.f(this.f137821b, dealRoomDevelopmentArguments.f137821b) && L.f(this.f137822c, dealRoomDevelopmentArguments.f137822c);
    }

    public final int hashCode() {
        return this.f137822c.hashCode() + (this.f137821b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DealRoomDevelopmentArguments(clientId=" + this.f137821b + ", developmentItem=" + this.f137822c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f137821b);
        this.f137822c.writeToParcel(parcel, i12);
    }
}

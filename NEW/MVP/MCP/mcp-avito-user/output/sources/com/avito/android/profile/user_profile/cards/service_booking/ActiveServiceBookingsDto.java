package com.avito.android.profile.user_profile.cards.service_booking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveServiceBookingsInteractor.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/ActiveServiceBookingsDto;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ActiveServiceBookingsDto implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ActiveServiceBookingsDto> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableItem> f225395b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f225396c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f225397d;

    /* compiled from: ActiveServiceBookingsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActiveServiceBookingsDto> {
        @Override // android.os.Parcelable.Creator
        public final ActiveServiceBookingsDto createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ActiveServiceBookingsDto.class, parcel, arrayList, iL2, 1);
            }
            return new ActiveServiceBookingsDto(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActiveServiceBookingsDto[] newArray(int i12) {
            return new ActiveServiceBookingsDto[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActiveServiceBookingsDto(@Y61.k List<? extends ParcelableItem> list, @Y61.l String str, @Y61.l String str2) {
        this.f225395b = list;
        this.f225396c = str;
        this.f225397d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveServiceBookingsDto)) {
            return false;
        }
        ActiveServiceBookingsDto activeServiceBookingsDto = (ActiveServiceBookingsDto) obj;
        return L.f(this.f225395b, activeServiceBookingsDto.f225395b) && L.f(this.f225396c, activeServiceBookingsDto.f225396c) && L.f(this.f225397d, activeServiceBookingsDto.f225397d);
    }

    public final int hashCode() {
        int iHashCode = this.f225395b.hashCode() * 31;
        String str = this.f225396c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225397d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveServiceBookingsDto(items=");
        sb2.append(this.f225395b);
        sb2.append(", subtitle=");
        sb2.append(this.f225396c);
        sb2.append(", badgeTitle=");
        return C22026a.c(sb2, this.f225397d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f225395b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f225396c);
        parcel.writeString(this.f225397d);
    }
}

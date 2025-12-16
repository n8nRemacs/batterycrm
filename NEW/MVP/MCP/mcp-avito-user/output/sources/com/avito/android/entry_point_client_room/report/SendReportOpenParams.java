package com.avito.android.entry_point_client_room.report;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendReportActivity.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/SendReportOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SendReportOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<SendReportOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f147663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f147664c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f147665d;

    /* compiled from: SendReportActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendReportOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SendReportOpenParams createFromParcel(Parcel parcel) {
            return new SendReportOpenParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SendReportOpenParams[] newArray(int i12) {
            return new SendReportOpenParams[i12];
        }
    }

    public SendReportOpenParams(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num) {
        this.f147663b = str;
        this.f147664c = str2;
        this.f147665d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendReportOpenParams)) {
            return false;
        }
        SendReportOpenParams sendReportOpenParams = (SendReportOpenParams) obj;
        return L.f(this.f147663b, sendReportOpenParams.f147663b) && L.f(this.f147664c, sendReportOpenParams.f147664c) && L.f(this.f147665d, sendReportOpenParams.f147665d);
    }

    public final int hashCode() {
        String str = this.f147663b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f147664c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f147665d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendReportOpenParams(itemId=");
        sb2.append(this.f147663b);
        sb2.append(", source=");
        sb2.append(this.f147664c);
        sb2.append(", dealId=");
        return s.j(sb2, this.f147665d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f147663b);
        parcel.writeString(this.f147664c);
        Integer num = this.f147665d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}

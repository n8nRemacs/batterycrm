package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallFromGsmContext.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/remote/model/RecallFromGsmContext;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RecallFromGsmContext implements Parcelable {

    @k
    public static final Parcelable.Creator<RecallFromGsmContext> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f113774b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f113775c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f113776d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f113777e;

    /* compiled from: RecallFromGsmContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallFromGsmContext> {
        @Override // android.os.Parcelable.Creator
        public final RecallFromGsmContext createFromParcel(Parcel parcel) {
            return new RecallFromGsmContext(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallFromGsmContext[] newArray(int i12) {
            return new RecallFromGsmContext[i12];
        }
    }

    public RecallFromGsmContext(@l String str, @k String str2, @l String str3, @k String str4) {
        this.f113774b = str;
        this.f113775c = str2;
        this.f113776d = str3;
        this.f113777e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallFromGsmContext)) {
            return false;
        }
        RecallFromGsmContext recallFromGsmContext = (RecallFromGsmContext) obj;
        return L.f(this.f113774b, recallFromGsmContext.f113774b) && L.f(this.f113775c, recallFromGsmContext.f113775c) && L.f(this.f113776d, recallFromGsmContext.f113776d) && L.f(this.f113777e, recallFromGsmContext.f113777e);
    }

    public final int hashCode() {
        String str = this.f113774b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f113775c);
        String str2 = this.f113776d;
        return this.f113777e.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallFromGsmContext(itemId=");
        sb2.append(this.f113774b);
        sb2.append(", opponentUserId=");
        sb2.append(this.f113775c);
        sb2.append(", currentUserId=");
        sb2.append(this.f113776d);
        sb2.append(", channelId=");
        return C22026a.c(sb2, this.f113777e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f113774b);
        parcel.writeString(this.f113775c);
        parcel.writeString(this.f113776d);
        parcel.writeString(this.f113777e);
    }
}

package com.avito.android.user_advert.advert.delegate.imv_poll.close;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.my_advert.CloseReason;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvClosePollPresenterDelegate.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/imv_poll/close/CloseArguments;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CloseArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CloseArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CloseReason f308599b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f308600c;

    /* compiled from: ImvClosePollPresenterDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CloseArguments> {
        @Override // android.os.Parcelable.Creator
        public final CloseArguments createFromParcel(Parcel parcel) {
            return new CloseArguments((CloseReason) parcel.readParcelable(CloseArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CloseArguments[] newArray(int i12) {
            return new CloseArguments[i12];
        }
    }

    public CloseArguments(@k CloseReason closeReason, @l String str) {
        this.f308599b = closeReason;
        this.f308600c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseArguments)) {
            return false;
        }
        CloseArguments closeArguments = (CloseArguments) obj;
        return L.f(this.f308599b, closeArguments.f308599b) && L.f(this.f308600c, closeArguments.f308600c);
    }

    public final int hashCode() {
        int iHashCode = this.f308599b.hashCode() * 31;
        String str = this.f308600c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseArguments(reason=");
        sb2.append(this.f308599b);
        sb2.append(", newPrice=");
        return C22026a.c(sb2, this.f308600c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f308599b, i12);
        parcel.writeString(this.f308600c);
    }
}

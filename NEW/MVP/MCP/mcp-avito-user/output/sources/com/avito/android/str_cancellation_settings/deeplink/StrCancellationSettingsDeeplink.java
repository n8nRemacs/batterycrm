package com.avito.android.str_cancellation_settings.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: StrCancellationSettingsDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/deeplink/StrCancellationSettingsDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_str-cancellation-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class StrCancellationSettingsDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrCancellationSettingsDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f288291b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f288292c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f288293d;

    /* compiled from: StrCancellationSettingsDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrCancellationSettingsDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrCancellationSettingsDeeplink createFromParcel(Parcel parcel) {
            return new StrCancellationSettingsDeeplink(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrCancellationSettingsDeeplink[] newArray(int i12) {
            return new StrCancellationSettingsDeeplink[i12];
        }
    }

    public StrCancellationSettingsDeeplink(long j12, @l String str, @l String str2) {
        this.f288291b = j12;
        this.f288292c = str;
        this.f288293d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrCancellationSettingsDeeplink)) {
            return false;
        }
        StrCancellationSettingsDeeplink strCancellationSettingsDeeplink = (StrCancellationSettingsDeeplink) obj;
        return this.f288291b == strCancellationSettingsDeeplink.f288291b && L.f(this.f288292c, strCancellationSettingsDeeplink.f288292c) && L.f(this.f288293d, strCancellationSettingsDeeplink.f288293d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f288291b) * 31;
        String str = this.f288292c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f288293d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCancellationSettingsDeeplink(itemId=");
        sb2.append(this.f288291b);
        sb2.append(", startDate=");
        sb2.append(this.f288292c);
        sb2.append(", endDate=");
        return C22026a.c(sb2, this.f288293d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f288291b);
        parcel.writeString(this.f288292c);
        parcel.writeString(this.f288293d);
    }
}

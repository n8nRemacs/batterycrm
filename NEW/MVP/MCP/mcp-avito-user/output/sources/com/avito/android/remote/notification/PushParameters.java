package com.avito.android.remote.notification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: PushParameters.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/PushParameters;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PushParameters implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PushParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f253975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PushNotification f253976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f253977d;

    /* compiled from: PushParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PushParameters> {
        @Override // android.os.Parcelable.Creator
        public final PushParameters createFromParcel(Parcel parcel) {
            return new PushParameters((DeepLink) parcel.readParcelable(PushParameters.class.getClassLoader()), PushNotification.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PushParameters[] newArray(int i12) {
            return new PushParameters[i12];
        }
    }

    public PushParameters(@Y61.k DeepLink deepLink, @Y61.k PushNotification pushNotification, @Y61.k String str) {
        this.f253975b = deepLink;
        this.f253976c = pushNotification;
        this.f253977d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushParameters)) {
            return false;
        }
        PushParameters pushParameters = (PushParameters) obj;
        return kotlin.jvm.internal.L.f(this.f253975b, pushParameters.f253975b) && kotlin.jvm.internal.L.f(this.f253976c, pushParameters.f253976c) && kotlin.jvm.internal.L.f(this.f253977d, pushParameters.f253977d);
    }

    public final int hashCode() {
        return this.f253977d.hashCode() + ((this.f253976c.hashCode() + (this.f253975b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushParameters(link=");
        sb2.append(this.f253975b);
        sb2.append(", notification=");
        sb2.append(this.f253976c);
        sb2.append(", pushProvider=");
        return C22026a.c(sb2, this.f253977d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f253975b, i12);
        this.f253976c.writeToParcel(parcel, i12);
        parcel.writeString(this.f253977d);
    }
}

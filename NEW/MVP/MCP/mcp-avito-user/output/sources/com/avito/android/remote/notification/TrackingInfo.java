package com.avito.android.remote.notification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: TrackingInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/notification/TrackingInfo;", "Landroid/os/Parcelable;", "", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TrackingInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TrackingInfo> CREATOR = new a();

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final String url;

    /* compiled from: TrackingInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrackingInfo> {
        @Override // android.os.Parcelable.Creator
        public final TrackingInfo createFromParcel(Parcel parcel) {
            return new TrackingInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackingInfo[] newArray(int i12) {
            return new TrackingInfo[i12];
        }
    }

    public TrackingInfo(@Y61.k String str) {
        this.url = str;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingInfo) && kotlin.jvm.internal.L.f(this.url, ((TrackingInfo) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("TrackingInfo(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.url);
    }
}

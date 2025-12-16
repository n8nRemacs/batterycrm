package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdatedTimeSection.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/UpdatedTimeContent;", "Landroid/os/Parcelable;", "", "updatedTime", "Lcom/avito/android/str_booking/network/models/sections/UpdatedTimePolling;", "polling", "<init>", "(Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/UpdatedTimePolling;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/models/sections/UpdatedTimePolling;", "c", "()Lcom/avito/android/str_booking/network/models/sections/UpdatedTimePolling;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedTimeContent implements Parcelable {

    @k
    public static final Parcelable.Creator<UpdatedTimeContent> CREATOR = new a();

    @c("polling")
    @l
    private final UpdatedTimePolling polling;

    @c("updatedTime")
    @l
    private final String updatedTime;

    /* compiled from: UpdatedTimeSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UpdatedTimeContent> {
        @Override // android.os.Parcelable.Creator
        public final UpdatedTimeContent createFromParcel(Parcel parcel) {
            return new UpdatedTimeContent(parcel.readString(), parcel.readInt() == 0 ? null : UpdatedTimePolling.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UpdatedTimeContent[] newArray(int i12) {
            return new UpdatedTimeContent[i12];
        }
    }

    public UpdatedTimeContent(@l String str, @l UpdatedTimePolling updatedTimePolling) {
        this.updatedTime = str;
        this.polling = updatedTimePolling;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UpdatedTimePolling getPolling() {
        return this.polling;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedTimeContent)) {
            return false;
        }
        UpdatedTimeContent updatedTimeContent = (UpdatedTimeContent) obj;
        return L.f(this.updatedTime, updatedTimeContent.updatedTime) && L.f(this.polling, updatedTimeContent.polling);
    }

    public final int hashCode() {
        String str = this.updatedTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UpdatedTimePolling updatedTimePolling = this.polling;
        return iHashCode + (updatedTimePolling != null ? updatedTimePolling.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UpdatedTimeContent(updatedTime=" + this.updatedTime + ", polling=" + this.polling + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.updatedTime);
        UpdatedTimePolling updatedTimePolling = this.polling;
        if (updatedTimePolling == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            updatedTimePolling.writeToParcel(parcel, i12);
        }
    }
}

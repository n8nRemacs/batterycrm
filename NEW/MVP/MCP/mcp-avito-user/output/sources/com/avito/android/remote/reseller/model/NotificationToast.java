package com.avito.android.remote.reseller.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: NotificationToastResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/reseller/model/NotificationToast;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationToast implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationToast> CREATOR = new a();

    @c("text")
    @k
    private final String text;

    /* compiled from: NotificationToastResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationToast> {
        @Override // android.os.Parcelable.Creator
        public final NotificationToast createFromParcel(Parcel parcel) {
            return new NotificationToast(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationToast[] newArray(int i12) {
            return new NotificationToast[i12];
        }
    }

    public NotificationToast(@k String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
    }
}

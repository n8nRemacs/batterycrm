package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/autoteka/model/EmailForm;", "Landroid/os/Parcelable;", "", "alreadyRegisteredMessage", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EmailForm implements Parcelable {

    @k
    public static final Parcelable.Creator<EmailForm> CREATOR = new a();

    @c("alreadyRegisteredMessage")
    @k
    private final String alreadyRegisteredMessage;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmailForm> {
        @Override // android.os.Parcelable.Creator
        public final EmailForm createFromParcel(Parcel parcel) {
            return new EmailForm(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailForm[] newArray(int i12) {
            return new EmailForm[i12];
        }
    }

    public EmailForm(@k String str) {
        this.alreadyRegisteredMessage = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAlreadyRegisteredMessage() {
        return this.alreadyRegisteredMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.alreadyRegisteredMessage);
    }
}

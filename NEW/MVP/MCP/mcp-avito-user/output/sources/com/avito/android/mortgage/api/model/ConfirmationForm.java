package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckAccessModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage/api/model/ConfirmationForm;", "Landroid/os/Parcelable;", "", "title", "description", "", "retryTimeoutSeconds", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "I", "c", "()I", "getError", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmationForm implements Parcelable {

    @k
    public static final Parcelable.Creator<ConfirmationForm> CREATOR = new a();

    @c("description")
    @k
    private final String description;

    @c("error")
    @l
    private final String error;

    @c("retryTimeoutSeconds")
    private final int retryTimeoutSeconds;

    @c("title")
    @k
    private final String title;

    /* compiled from: CheckAccessModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmationForm> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmationForm createFromParcel(Parcel parcel) {
            return new ConfirmationForm(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmationForm[] newArray(int i12) {
            return new ConfirmationForm[i12];
        }
    }

    public ConfirmationForm(@k String str, @k String str2, int i12, @l String str3) {
        this.title = str;
        this.description = str2;
        this.retryTimeoutSeconds = i12;
        this.error = str3;
    }

    /* renamed from: c, reason: from getter */
    public final int getRetryTimeoutSeconds() {
        return this.retryTimeoutSeconds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationForm)) {
            return false;
        }
        ConfirmationForm confirmationForm = (ConfirmationForm) obj;
        return L.f(this.title, confirmationForm.title) && L.f(this.description, confirmationForm.description) && this.retryTimeoutSeconds == confirmationForm.retryTimeoutSeconds && L.f(this.error, confirmationForm.error);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getError() {
        return this.error;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = r.e(this.retryTimeoutSeconds, H.d(this.title.hashCode() * 31, 31, this.description), 31);
        String str = this.error;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmationForm(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", retryTimeoutSeconds=");
        sb2.append(this.retryTimeoutSeconds);
        sb2.append(", error=");
        return C22026a.c(sb2, this.error, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.retryTimeoutSeconds);
        parcel.writeString(this.error);
    }
}

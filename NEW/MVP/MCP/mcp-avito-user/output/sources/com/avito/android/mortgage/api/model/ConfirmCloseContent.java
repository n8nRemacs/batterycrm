package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmCloseContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/ConfirmCloseContent;", "Landroid/os/Parcelable;", "", "title", "description", "declineActionTitle", "confirmActionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "d", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmCloseContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ConfirmCloseContent> CREATOR = new a();

    @c("confirmActionTitle")
    @k
    private final String confirmActionTitle;

    @c("declineActionTitle")
    @k
    private final String declineActionTitle;

    @c("description")
    @k
    private final String description;

    @c("title")
    @k
    private final String title;

    /* compiled from: ConfirmCloseContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmCloseContent> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmCloseContent createFromParcel(Parcel parcel) {
            return new ConfirmCloseContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmCloseContent[] newArray(int i12) {
            return new ConfirmCloseContent[i12];
        }
    }

    public ConfirmCloseContent(@k String str, @k String str2, @k String str3, @k String str4) {
        this.title = str;
        this.description = str2;
        this.declineActionTitle = str3;
        this.confirmActionTitle = str4;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getConfirmActionTitle() {
        return this.confirmActionTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getDeclineActionTitle() {
        return this.declineActionTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmCloseContent)) {
            return false;
        }
        ConfirmCloseContent confirmCloseContent = (ConfirmCloseContent) obj;
        return L.f(this.title, confirmCloseContent.title) && L.f(this.description, confirmCloseContent.description) && L.f(this.declineActionTitle, confirmCloseContent.declineActionTitle) && L.f(this.confirmActionTitle, confirmCloseContent.confirmActionTitle);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.confirmActionTitle.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.declineActionTitle);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmCloseContent(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", declineActionTitle=");
        sb2.append(this.declineActionTitle);
        sb2.append(", confirmActionTitle=");
        return C22026a.c(sb2, this.confirmActionTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.declineActionTitle);
        parcel.writeString(this.confirmActionTitle);
    }
}

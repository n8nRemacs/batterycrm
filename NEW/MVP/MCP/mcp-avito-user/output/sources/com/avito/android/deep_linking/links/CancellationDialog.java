package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: InstallmentsFormShowLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/deep_linking/links/CancellationDialog;", "Landroid/os/Parcelable;", "", "title", "subtitle", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "c", "d", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CancellationDialog implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CancellationDialog> CREATOR = new a();

    @com.google.gson.annotations.c("primaryButtonTitle")
    @Y61.l
    private final String primaryButtonTitle;

    @com.google.gson.annotations.c("secondaryButtonTitle")
    @Y61.l
    private final String secondaryButtonTitle;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CancellationDialog> {
        @Override // android.os.Parcelable.Creator
        public final CancellationDialog createFromParcel(Parcel parcel) {
            return new CancellationDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CancellationDialog[] newArray(int i12) {
            return new CancellationDialog[i12];
        }
    }

    public CancellationDialog(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.title = str;
        this.subtitle = str2;
        this.primaryButtonTitle = str3;
        this.secondaryButtonTitle = str4;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellationDialog)) {
            return false;
        }
        CancellationDialog cancellationDialog = (CancellationDialog) obj;
        return kotlin.jvm.internal.L.f(this.title, cancellationDialog.title) && kotlin.jvm.internal.L.f(this.subtitle, cancellationDialog.subtitle) && kotlin.jvm.internal.L.f(this.primaryButtonTitle, cancellationDialog.primaryButtonTitle) && kotlin.jvm.internal.L.f(this.secondaryButtonTitle, cancellationDialog.secondaryButtonTitle);
    }

    @Y61.l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryButtonTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonTitle;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancellationDialog(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", primaryButtonTitle=");
        sb2.append(this.primaryButtonTitle);
        sb2.append(", secondaryButtonTitle=");
        return C22026a.c(sb2, this.secondaryButtonTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.primaryButtonTitle);
        parcel.writeString(this.secondaryButtonTitle);
    }
}

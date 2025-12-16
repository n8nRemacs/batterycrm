package com.avito.android.remote;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.teaser.ReportLink;
import kotlin.Metadata;

/* compiled from: DomotekaTeaserResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/DomotekaReportLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/teaser/ReportLink;", "", "title", "urlText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrlText", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DomotekaReportLink implements Parcelable, ReportLink {

    @Y61.k
    public static final Parcelable.Creator<DomotekaReportLink> CREATOR = new a();

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String urlText;

    /* compiled from: DomotekaTeaserResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DomotekaReportLink> {
        @Override // android.os.Parcelable.Creator
        public final DomotekaReportLink createFromParcel(Parcel parcel) {
            return new DomotekaReportLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DomotekaReportLink[] newArray(int i12) {
            return new DomotekaReportLink[i12];
        }
    }

    public DomotekaReportLink(@Y61.k String str, @Y61.l String str2) {
        this.title = str;
        this.urlText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomotekaReportLink)) {
            return false;
        }
        DomotekaReportLink domotekaReportLink = (DomotekaReportLink) obj;
        return kotlin.jvm.internal.L.f(this.title, domotekaReportLink.title) && kotlin.jvm.internal.L.f(this.urlText, domotekaReportLink.urlText);
    }

    @Override // com.avito.android.remote.model.teaser.ReportLink
    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.teaser.ReportLink
    @Y61.k
    public final Uri getUrl() {
        return Uri.parse("https://www.avito.ru" + this.urlText);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.urlText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DomotekaReportLink(title=");
        sb2.append(this.title);
        sb2.append(", urlText=");
        return C22026a.c(sb2, this.urlText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.urlText);
    }
}

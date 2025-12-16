package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.teaser.ReportLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/teaser/ReportLink;", "", "title", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Landroid/net/Uri;)Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Landroid/net/Uri;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaReportLink implements Parcelable, ReportLink {

    @k
    public static final Parcelable.Creator<AutotekaReportLink> CREATOR = new Creator();

    @c("text")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final Uri url;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaReportLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaReportLink createFromParcel(@k Parcel parcel) {
            return new AutotekaReportLink(parcel.readString(), (Uri) parcel.readParcelable(AutotekaReportLink.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaReportLink[] newArray(int i12) {
            return new AutotekaReportLink[i12];
        }
    }

    public AutotekaReportLink(@k String str, @k Uri uri) {
        this.title = str;
        this.url = uri;
    }

    public static /* synthetic */ AutotekaReportLink copy$default(AutotekaReportLink autotekaReportLink, String str, Uri uri, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autotekaReportLink.title;
        }
        if ((i12 & 2) != 0) {
            uri = autotekaReportLink.url;
        }
        return autotekaReportLink.copy(str, uri);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    @k
    public final AutotekaReportLink copy(@k String title, @k Uri url) {
        return new AutotekaReportLink(title, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaReportLink)) {
            return false;
        }
        AutotekaReportLink autotekaReportLink = (AutotekaReportLink) other;
        return L.f(this.title, autotekaReportLink.title) && L.f(this.url, autotekaReportLink.url);
    }

    @Override // com.avito.android.remote.model.teaser.ReportLink
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.teaser.ReportLink
    @k
    public Uri getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaReportLink(title=");
        sb2.append(this.title);
        sb2.append(", url=");
        return a.t(sb2, this.url, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.url, flags);
    }
}

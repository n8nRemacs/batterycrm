package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaLink;", "Landroid/os/Parcelable;", "", "title", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaLink implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaLink> CREATOR = new a();

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final Uri url;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaLink createFromParcel(Parcel parcel) {
            return new AutotekaLink(parcel.readString(), (Uri) parcel.readParcelable(AutotekaLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaLink[] newArray(int i12) {
            return new AutotekaLink[i12];
        }
    }

    public AutotekaLink(@k String str, @k Uri uri) {
        this.title = str;
        this.url = uri;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaLink)) {
            return false;
        }
        AutotekaLink autotekaLink = (AutotekaLink) obj;
        return L.f(this.title, autotekaLink.title) && L.f(this.url, autotekaLink.url);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaLink(title=");
        sb2.append(this.title);
        sb2.append(", url=");
        return com.avito.android.actions_sheet.a.t(sb2, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.url, i12);
    }
}

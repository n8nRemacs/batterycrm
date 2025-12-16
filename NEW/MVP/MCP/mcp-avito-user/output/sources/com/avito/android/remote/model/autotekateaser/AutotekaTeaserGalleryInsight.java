package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportLink", "fullscreenGalleryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Ljava/lang/String;)Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "getReportLink", "getFullscreenGalleryButtonText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserGalleryInsight implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaTeaserGalleryInsight> CREATOR = new Creator();

    @c("toFullscreenGalleryButtonText")
    @l
    private final String fullscreenGalleryButtonText;

    @c("reportLink")
    @k
    private final AutotekaReportLink reportLink;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserGalleryInsight> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserGalleryInsight createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserGalleryInsight(parcel.readString(), parcel.readString(), AutotekaReportLink.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserGalleryInsight[] newArray(int i12) {
            return new AutotekaTeaserGalleryInsight[i12];
        }
    }

    public AutotekaTeaserGalleryInsight(@k String str, @k String str2, @k AutotekaReportLink autotekaReportLink, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.reportLink = autotekaReportLink;
        this.fullscreenGalleryButtonText = str3;
    }

    public static /* synthetic */ AutotekaTeaserGalleryInsight copy$default(AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight, String str, String str2, AutotekaReportLink autotekaReportLink, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autotekaTeaserGalleryInsight.title;
        }
        if ((i12 & 2) != 0) {
            str2 = autotekaTeaserGalleryInsight.subtitle;
        }
        if ((i12 & 4) != 0) {
            autotekaReportLink = autotekaTeaserGalleryInsight.reportLink;
        }
        if ((i12 & 8) != 0) {
            str3 = autotekaTeaserGalleryInsight.fullscreenGalleryButtonText;
        }
        return autotekaTeaserGalleryInsight.copy(str, str2, autotekaReportLink, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getFullscreenGalleryButtonText() {
        return this.fullscreenGalleryButtonText;
    }

    @k
    public final AutotekaTeaserGalleryInsight copy(@k String title, @k String subtitle, @k AutotekaReportLink reportLink, @l String fullscreenGalleryButtonText) {
        return new AutotekaTeaserGalleryInsight(title, subtitle, reportLink, fullscreenGalleryButtonText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserGalleryInsight)) {
            return false;
        }
        AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight = (AutotekaTeaserGalleryInsight) other;
        return L.f(this.title, autotekaTeaserGalleryInsight.title) && L.f(this.subtitle, autotekaTeaserGalleryInsight.subtitle) && L.f(this.reportLink, autotekaTeaserGalleryInsight.reportLink) && L.f(this.fullscreenGalleryButtonText, autotekaTeaserGalleryInsight.fullscreenGalleryButtonText);
    }

    @l
    public final String getFullscreenGalleryButtonText() {
        return this.fullscreenGalleryButtonText;
    }

    @k
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.reportLink.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        String str = this.fullscreenGalleryButtonText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaTeaserGalleryInsight(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", reportLink=");
        sb2.append(this.reportLink);
        sb2.append(", fullscreenGalleryButtonText=");
        return C22026a.c(sb2, this.fullscreenGalleryButtonText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.reportLink.writeToParcel(parcel, flags);
        parcel.writeString(this.fullscreenGalleryButtonText);
    }
}

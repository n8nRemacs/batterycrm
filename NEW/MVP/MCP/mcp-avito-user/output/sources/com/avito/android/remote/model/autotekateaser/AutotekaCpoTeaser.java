package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaCpoTeaser.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jz\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b@\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "terms", "Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "logo", "reportTitle", "reportInfo", "reportIntro", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportLink", "programLinkText", "Lcom/avito/android/remote/model/autotekateaser/CpoDescription;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/CpoLogo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/CpoDescription;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "component5", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "component9", "component10", "()Lcom/avito/android/remote/model/autotekateaser/CpoDescription;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/CpoLogo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/CpoDescription;)Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getTerms", "Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "getLogo", "getReportTitle", "getReportInfo", "getReportIntro", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "getReportLink", "getProgramLinkText", "Lcom/avito/android/remote/model/autotekateaser/CpoDescription;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaCpoTeaser implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaCpoTeaser> CREATOR = new Creator();

    @c("description")
    @k
    private final CpoDescription description;

    @c("logo")
    @k
    private final CpoLogo logo;

    @c("programLinkText")
    @k
    private final String programLinkText;

    @c("reportInfo")
    @k
    private final String reportInfo;

    @c("reportIntro")
    @k
    private final String reportIntro;

    @c("reportLink")
    @k
    private final AutotekaReportLink reportLink;

    @c("reportTitle")
    @k
    private final String reportTitle;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("terms")
    @k
    private final List<String> terms;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaCpoTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaCpoTeaser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaCpoTeaser createFromParcel(@k Parcel parcel) {
            return new AutotekaCpoTeaser(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), CpoLogo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AutotekaReportLink.CREATOR.createFromParcel(parcel), parcel.readString(), CpoDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaCpoTeaser[] newArray(int i12) {
            return new AutotekaCpoTeaser[i12];
        }
    }

    public AutotekaCpoTeaser(@k String str, @k String str2, @k List<String> list, @k CpoLogo cpoLogo, @k String str3, @k String str4, @k String str5, @k AutotekaReportLink autotekaReportLink, @k String str6, @k CpoDescription cpoDescription) {
        this.title = str;
        this.subtitle = str2;
        this.terms = list;
        this.logo = cpoLogo;
        this.reportTitle = str3;
        this.reportInfo = str4;
        this.reportIntro = str5;
        this.reportLink = autotekaReportLink;
        this.programLinkText = str6;
        this.description = cpoDescription;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component10, reason: from getter */
    public final CpoDescription getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final List<String> component3() {
        return this.terms;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final CpoLogo getLogo() {
        return this.logo;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getReportTitle() {
        return this.reportTitle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getReportInfo() {
        return this.reportInfo;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getReportIntro() {
        return this.reportIntro;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final String getProgramLinkText() {
        return this.programLinkText;
    }

    @k
    public final AutotekaCpoTeaser copy(@k String title, @k String subtitle, @k List<String> terms, @k CpoLogo logo, @k String reportTitle, @k String reportInfo, @k String reportIntro, @k AutotekaReportLink reportLink, @k String programLinkText, @k CpoDescription description) {
        return new AutotekaCpoTeaser(title, subtitle, terms, logo, reportTitle, reportInfo, reportIntro, reportLink, programLinkText, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaCpoTeaser)) {
            return false;
        }
        AutotekaCpoTeaser autotekaCpoTeaser = (AutotekaCpoTeaser) other;
        return L.f(this.title, autotekaCpoTeaser.title) && L.f(this.subtitle, autotekaCpoTeaser.subtitle) && L.f(this.terms, autotekaCpoTeaser.terms) && L.f(this.logo, autotekaCpoTeaser.logo) && L.f(this.reportTitle, autotekaCpoTeaser.reportTitle) && L.f(this.reportInfo, autotekaCpoTeaser.reportInfo) && L.f(this.reportIntro, autotekaCpoTeaser.reportIntro) && L.f(this.reportLink, autotekaCpoTeaser.reportLink) && L.f(this.programLinkText, autotekaCpoTeaser.programLinkText) && L.f(this.description, autotekaCpoTeaser.description);
    }

    @k
    public final CpoDescription getDescription() {
        return this.description;
    }

    @k
    public final CpoLogo getLogo() {
        return this.logo;
    }

    @k
    public final String getProgramLinkText() {
        return this.programLinkText;
    }

    @k
    public final String getReportInfo() {
        return this.reportInfo;
    }

    @k
    public final String getReportIntro() {
        return this.reportIntro;
    }

    @k
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @k
    public final String getReportTitle() {
        return this.reportTitle;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final List<String> getTerms() {
        return this.terms;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + H.d((this.reportLink.hashCode() + H.d(H.d(H.d((this.logo.hashCode() + H.e(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.terms)) * 31, 31, this.reportTitle), 31, this.reportInfo), 31, this.reportIntro)) * 31, 31, this.programLinkText);
    }

    @k
    public String toString() {
        return "AutotekaCpoTeaser(title=" + this.title + ", subtitle=" + this.subtitle + ", terms=" + this.terms + ", logo=" + this.logo + ", reportTitle=" + this.reportTitle + ", reportInfo=" + this.reportInfo + ", reportIntro=" + this.reportIntro + ", reportLink=" + this.reportLink + ", programLinkText=" + this.programLinkText + ", description=" + this.description + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeStringList(this.terms);
        this.logo.writeToParcel(parcel, flags);
        parcel.writeString(this.reportTitle);
        parcel.writeString(this.reportInfo);
        parcel.writeString(this.reportIntro);
        this.reportLink.writeToParcel(parcel, flags);
        parcel.writeString(this.programLinkText);
        this.description.writeToParcel(parcel, flags);
    }
}

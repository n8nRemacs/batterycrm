package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.teaser.TeaserInsight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DomotekaTeaserResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/DomotekaTeaser;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/DomotekaTeaserType;", "type", "", "title", "subtitle", "", "Lcom/avito/android/remote/model/teaser/TeaserInsight;", "insights", "Lcom/avito/android/remote/DomotekaReportLink;", "reportLink", "<init>", "(Lcom/avito/android/remote/DomotekaTeaserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/DomotekaReportLink;)V", "Lcom/avito/android/remote/DomotekaTeaserType;", "getType", "()Lcom/avito/android/remote/DomotekaTeaserType;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/DomotekaReportLink;", "d", "()Lcom/avito/android/remote/DomotekaReportLink;", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DomotekaTeaser implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DomotekaTeaser> CREATOR = new a();

    @com.google.gson.annotations.c("insights")
    @Y61.l
    private final List<TeaserInsight> insights;

    @com.google.gson.annotations.c("reportLink")
    @Y61.l
    private final DomotekaReportLink reportLink;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final DomotekaTeaserType type;

    /* compiled from: DomotekaTeaserResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DomotekaTeaser> {
        @Override // android.os.Parcelable.Creator
        public final DomotekaTeaser createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            DomotekaTeaserType domotekaTeaserTypeValueOf = DomotekaTeaserType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(DomotekaTeaser.class, parcel, arrayList, iL2, 1);
                }
            }
            return new DomotekaTeaser(domotekaTeaserTypeValueOf, string, string2, arrayList, parcel.readInt() != 0 ? DomotekaReportLink.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DomotekaTeaser[] newArray(int i12) {
            return new DomotekaTeaser[i12];
        }
    }

    public DomotekaTeaser(@Y61.k DomotekaTeaserType domotekaTeaserType, @Y61.l String str, @Y61.l String str2, @Y61.l List<TeaserInsight> list, @Y61.l DomotekaReportLink domotekaReportLink) {
        this.type = domotekaTeaserType;
        this.title = str;
        this.subtitle = str2;
        this.insights = list;
        this.reportLink = domotekaReportLink;
    }

    @Y61.l
    public final List<TeaserInsight> c() {
        return this.insights;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DomotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomotekaTeaser)) {
            return false;
        }
        DomotekaTeaser domotekaTeaser = (DomotekaTeaser) obj;
        return this.type == domotekaTeaser.type && kotlin.jvm.internal.L.f(this.title, domotekaTeaser.title) && kotlin.jvm.internal.L.f(this.subtitle, domotekaTeaser.subtitle) && kotlin.jvm.internal.L.f(this.insights, domotekaTeaser.insights) && kotlin.jvm.internal.L.f(this.reportLink, domotekaTeaser.reportLink);
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
        int iHashCode = this.type.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TeaserInsight> list = this.insights;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DomotekaReportLink domotekaReportLink = this.reportLink;
        return iHashCode4 + (domotekaReportLink != null ? domotekaReportLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "DomotekaTeaser(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", insights=" + this.insights + ", reportLink=" + this.reportLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<TeaserInsight> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        DomotekaReportLink domotekaReportLink = this.reportLink;
        if (domotekaReportLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            domotekaReportLink.writeToParcel(parcel, i12);
        }
    }
}

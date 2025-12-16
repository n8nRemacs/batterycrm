package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsAutotekaTeaser;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/teaser/TeaserInsightIcon;", "insights", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportLink", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "d", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvCarsDetailsAutotekaTeaser implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsAutotekaTeaser> CREATOR = new a();

    @c("insights")
    @l
    private final List<TeaserInsightIcon> insights;

    @c("reportLink")
    @l
    private final AutotekaReportLink reportLink;

    @c("title")
    @k
    private final String title;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsAutotekaTeaser> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsAutotekaTeaser createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ImvCarsDetailsAutotekaTeaser.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ImvCarsDetailsAutotekaTeaser(string, arrayList, (AutotekaReportLink) parcel.readParcelable(ImvCarsDetailsAutotekaTeaser.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsAutotekaTeaser[] newArray(int i12) {
            return new ImvCarsDetailsAutotekaTeaser[i12];
        }
    }

    public ImvCarsDetailsAutotekaTeaser(@k String str, @l List<TeaserInsightIcon> list, @l AutotekaReportLink autotekaReportLink) {
        this.title = str;
        this.insights = list;
        this.reportLink = autotekaReportLink;
    }

    @l
    public final List<TeaserInsightIcon> c() {
        return this.insights;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsAutotekaTeaser)) {
            return false;
        }
        ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser = (ImvCarsDetailsAutotekaTeaser) obj;
        return L.f(this.title, imvCarsDetailsAutotekaTeaser.title) && L.f(this.insights, imvCarsDetailsAutotekaTeaser.insights) && L.f(this.reportLink, imvCarsDetailsAutotekaTeaser.reportLink);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<TeaserInsightIcon> list = this.insights;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AutotekaReportLink autotekaReportLink = this.reportLink;
        return iHashCode2 + (autotekaReportLink != null ? autotekaReportLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ImvCarsDetailsAutotekaTeaser(title=" + this.title + ", insights=" + this.insights + ", reportLink=" + this.reportLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        List<TeaserInsightIcon> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.reportLink, i12);
    }
}

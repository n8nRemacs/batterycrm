package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/JobCrmApplicationItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmApplicationItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JobCrmApplicationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f130005c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130006d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f130007e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f130008f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<Badge> f130009g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Note> f130010h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f130011i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f130012j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f130013k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f130014l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Vacancy f130015m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f130016n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f130017o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f130018p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Enrichment f130019q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Enrichment f130020r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final String f130021s;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmApplicationItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmApplicationItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(Badge.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Note.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new JobCrmApplicationItem(string, arrayListCreateStringArrayList, string2, string3, z12, arrayList, arrayList2, (DeepLink) parcel.readParcelable(JobCrmApplicationItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(JobCrmApplicationItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(JobCrmApplicationItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(JobCrmApplicationItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Vacancy.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Enrichment.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Enrichment.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmApplicationItem[] newArray(int i12) {
            return new JobCrmApplicationItem[i12];
        }
    }

    public JobCrmApplicationItem(@k String str, @k List<String> list, @k String str2, @k String str3, boolean z12, @k List<Badge> list2, @k List<Note> list3, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3, @l DeepLink deepLink4, @l Vacancy vacancy, @l String str4, @l String str5, @l String str6, @l Enrichment enrichment, @l Enrichment enrichment2, @k String str7) {
        this.f130004b = str;
        this.f130005c = list;
        this.f130006d = str2;
        this.f130007e = str3;
        this.f130008f = z12;
        this.f130009g = list2;
        this.f130010h = list3;
        this.f130011i = deepLink;
        this.f130012j = deepLink2;
        this.f130013k = deepLink3;
        this.f130014l = deepLink4;
        this.f130015m = vacancy;
        this.f130016n = str4;
        this.f130017o = str5;
        this.f130018p = str6;
        this.f130019q = enrichment;
        this.f130020r = enrichment2;
        this.f130021s = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmApplicationItem)) {
            return false;
        }
        JobCrmApplicationItem jobCrmApplicationItem = (JobCrmApplicationItem) obj;
        return L.f(this.f130004b, jobCrmApplicationItem.f130004b) && L.f(this.f130005c, jobCrmApplicationItem.f130005c) && L.f(this.f130006d, jobCrmApplicationItem.f130006d) && L.f(this.f130007e, jobCrmApplicationItem.f130007e) && this.f130008f == jobCrmApplicationItem.f130008f && L.f(this.f130009g, jobCrmApplicationItem.f130009g) && L.f(this.f130010h, jobCrmApplicationItem.f130010h) && L.f(this.f130011i, jobCrmApplicationItem.f130011i) && L.f(this.f130012j, jobCrmApplicationItem.f130012j) && L.f(this.f130013k, jobCrmApplicationItem.f130013k) && L.f(this.f130014l, jobCrmApplicationItem.f130014l) && L.f(this.f130015m, jobCrmApplicationItem.f130015m) && L.f(this.f130016n, jobCrmApplicationItem.f130016n) && L.f(this.f130017o, jobCrmApplicationItem.f130017o) && L.f(this.f130018p, jobCrmApplicationItem.f130018p) && L.f(this.f130019q, jobCrmApplicationItem.f130019q) && L.f(this.f130020r, jobCrmApplicationItem.f130020r) && L.f(this.f130021s, jobCrmApplicationItem.f130021s);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244992b() {
        return this.f130021s;
    }

    public final int hashCode() {
        int iE2 = H.e(H.e(r.i(H.d(H.d(H.e(this.f130004b.hashCode() * 31, 31, this.f130005c), 31, this.f130006d), 31, this.f130007e), 31, this.f130008f), 31, this.f130009g), 31, this.f130010h);
        DeepLink deepLink = this.f130011i;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f130012j;
        int iHashCode2 = (iHashCode + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.f130013k;
        int iHashCode3 = (iHashCode2 + (deepLink3 == null ? 0 : deepLink3.hashCode())) * 31;
        DeepLink deepLink4 = this.f130014l;
        int iHashCode4 = (iHashCode3 + (deepLink4 == null ? 0 : deepLink4.hashCode())) * 31;
        Vacancy vacancy = this.f130015m;
        int iHashCode5 = (iHashCode4 + (vacancy == null ? 0 : vacancy.hashCode())) * 31;
        String str = this.f130016n;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130017o;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f130018p;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Enrichment enrichment = this.f130019q;
        int iHashCode9 = (iHashCode8 + (enrichment == null ? 0 : enrichment.hashCode())) * 31;
        Enrichment enrichment2 = this.f130020r;
        return this.f130021s.hashCode() + ((iHashCode9 + (enrichment2 != null ? enrichment2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmApplicationItem(candidateName=");
        sb2.append(this.f130004b);
        sb2.append(", candidateBadges=");
        sb2.append(this.f130005c);
        sb2.append(", priceInfo=");
        sb2.append(this.f130006d);
        sb2.append(", dateInfo=");
        sb2.append(this.f130007e);
        sb2.append(", isViewed=");
        sb2.append(this.f130008f);
        sb2.append(", badges=");
        sb2.append(this.f130009g);
        sb2.append(", notes=");
        sb2.append(this.f130010h);
        sb2.append(", phoneDeeplink=");
        sb2.append(this.f130011i);
        sb2.append(", chatDeeplink=");
        sb2.append(this.f130012j);
        sb2.append(", cvDeeplink=");
        sb2.append(this.f130013k);
        sb2.append(", statusDeeplink=");
        sb2.append(this.f130014l);
        sb2.append(", vacancy=");
        sb2.append(this.f130015m);
        sb2.append(", errorMessage=");
        sb2.append(this.f130016n);
        sb2.append(", candidateCvId=");
        sb2.append(this.f130017o);
        sb2.append(", candidateId=");
        sb2.append(this.f130018p);
        sb2.append(", enrichment=");
        sb2.append(this.f130019q);
        sb2.append(", chatbotResult=");
        sb2.append(this.f130020r);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130021s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130004b);
        parcel.writeStringList(this.f130005c);
        parcel.writeString(this.f130006d);
        parcel.writeString(this.f130007e);
        parcel.writeInt(this.f130008f ? 1 : 0);
        Iterator itJ = C0.j(this.f130009g, parcel);
        while (itJ.hasNext()) {
            ((Badge) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f130010h, parcel);
        while (itJ2.hasNext()) {
            ((Note) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f130011i, i12);
        parcel.writeParcelable(this.f130012j, i12);
        parcel.writeParcelable(this.f130013k, i12);
        parcel.writeParcelable(this.f130014l, i12);
        Vacancy vacancy = this.f130015m;
        if (vacancy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vacancy.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f130016n);
        parcel.writeString(this.f130017o);
        parcel.writeString(this.f130018p);
        Enrichment enrichment = this.f130019q;
        if (enrichment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enrichment.writeToParcel(parcel, i12);
        }
        Enrichment enrichment2 = this.f130020r;
        if (enrichment2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enrichment2.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f130021s);
    }
}

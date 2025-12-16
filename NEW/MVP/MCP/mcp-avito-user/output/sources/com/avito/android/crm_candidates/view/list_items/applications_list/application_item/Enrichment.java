package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Enrichment;", "Landroid/os/Parcelable;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Enrichment implements Parcelable {

    @k
    public static final Parcelable.Creator<Enrichment> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129998b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f129999c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f130000d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DockingBadgeType.Predefined f130001e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f130002f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f130003g;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Enrichment> {
        @Override // android.os.Parcelable.Creator
        public final Enrichment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DockingBadgeType.Predefined predefined = (DockingBadgeType.Predefined) parcel.readParcelable(Enrichment.class.getClassLoader());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Property.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new Enrichment(string, string2, string3, predefined, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Enrichment[] newArray(int i12) {
            return new Enrichment[i12];
        }
    }

    public Enrichment(@k String str, @l String str2, @l String str3, @l DockingBadgeType.Predefined predefined, @l String str4, @l ArrayList arrayList) {
        this.f129998b = str;
        this.f129999c = str2;
        this.f130000d = str3;
        this.f130001e = predefined;
        this.f130002f = str4;
        this.f130003g = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Enrichment)) {
            return false;
        }
        Enrichment enrichment = (Enrichment) obj;
        return L.f(this.f129998b, enrichment.f129998b) && L.f(this.f129999c, enrichment.f129999c) && L.f(this.f130000d, enrichment.f130000d) && this.f130001e == enrichment.f130001e && L.f(this.f130002f, enrichment.f130002f) && L.f(this.f130003g, enrichment.f130003g);
    }

    public final int hashCode() {
        int iHashCode = this.f129998b.hashCode() * 31;
        String str = this.f129999c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130000d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DockingBadgeType.Predefined predefined = this.f130001e;
        int iHashCode4 = (iHashCode3 + (predefined == null ? 0 : predefined.hashCode())) * 31;
        String str3 = this.f130002f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList arrayList = this.f130003g;
        return iHashCode5 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Enrichment(title=");
        sb2.append(this.f129998b);
        sb2.append(", description=");
        sb2.append(this.f129999c);
        sb2.append(", overviewText=");
        sb2.append(this.f130000d);
        sb2.append(", overviewColor=");
        sb2.append(this.f130001e);
        sb2.append(", propertiesTitle=");
        sb2.append(this.f130002f);
        sb2.append(", properties=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f130003g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129998b);
        parcel.writeString(this.f129999c);
        parcel.writeString(this.f130000d);
        parcel.writeParcelable(this.f130001e, i12);
        parcel.writeString(this.f130002f);
        ArrayList arrayList = this.f130003g;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((Property) itY.next()).writeToParcel(parcel, i12);
        }
    }
}

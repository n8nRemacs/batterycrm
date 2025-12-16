package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Vacancy;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Vacancy implements ParcelableItem {

    @k
    public static final Parcelable.Creator<Vacancy> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130032d;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Vacancy> {
        @Override // android.os.Parcelable.Creator
        public final Vacancy createFromParcel(Parcel parcel) {
            return new Vacancy(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Vacancy[] newArray(int i12) {
            return new Vacancy[i12];
        }
    }

    public Vacancy(@k String str, @k String str2, @k String str3) {
        this.f130030b = str;
        this.f130031c = str2;
        this.f130032d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vacancy)) {
            return false;
        }
        Vacancy vacancy = (Vacancy) obj;
        return L.f(this.f130030b, vacancy.f130030b) && L.f(this.f130031c, vacancy.f130031c) && L.f(this.f130032d, vacancy.f130032d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86898b() {
        return this.f130032d;
    }

    public final int hashCode() {
        return this.f130032d.hashCode() + H.d(this.f130030b.hashCode() * 31, 31, this.f130031c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vacancy(title=");
        sb2.append(this.f130030b);
        sb2.append(", location=");
        sb2.append(this.f130031c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130032d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130030b);
        parcel.writeString(this.f130031c);
        parcel.writeString(this.f130032d);
    }
}

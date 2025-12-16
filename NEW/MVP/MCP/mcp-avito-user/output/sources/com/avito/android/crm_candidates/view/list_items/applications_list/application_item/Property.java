package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Property;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Property implements ParcelableItem {

    @k
    public static final Parcelable.Creator<Property> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130026b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130027c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DockingBadgeType.Predefined f130028d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f130029e;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Property> {
        @Override // android.os.Parcelable.Creator
        public final Property createFromParcel(Parcel parcel) {
            return new Property(parcel.readString(), parcel.readString(), (DockingBadgeType.Predefined) parcel.readParcelable(Property.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Property[] newArray(int i12) {
            return new Property[i12];
        }
    }

    public Property(@k String str, @k String str2, @k DockingBadgeType.Predefined predefined, @k String str3) {
        this.f130026b = str;
        this.f130027c = str2;
        this.f130028d = predefined;
        this.f130029e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Property)) {
            return false;
        }
        Property property = (Property) obj;
        return L.f(this.f130026b, property.f130026b) && L.f(this.f130027c, property.f130027c) && this.f130028d == property.f130028d && L.f(this.f130029e, property.f130029e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130049b() {
        return this.f130029e;
    }

    public final int hashCode() {
        return this.f130029e.hashCode() + ((this.f130028d.hashCode() + H.d(this.f130026b.hashCode() * 31, 31, this.f130027c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Property(label=");
        sb2.append(this.f130026b);
        sb2.append(", value=");
        sb2.append(this.f130027c);
        sb2.append(", valueColor=");
        sb2.append(this.f130028d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130029e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130026b);
        parcel.writeString(this.f130027c);
        parcel.writeParcelable(this.f130028d, i12);
        parcel.writeString(this.f130029e);
    }
}

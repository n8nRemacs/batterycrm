package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Badge;", "Landroid/os/Parcelable;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Badge implements Parcelable {

    @k
    public static final Parcelable.Creator<Badge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129995b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DockingBadgeType.Predefined f129996c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f129997d;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Badge> {
        @Override // android.os.Parcelable.Creator
        public final Badge createFromParcel(Parcel parcel) {
            return new Badge(parcel.readString(), (DockingBadgeType.Predefined) parcel.readParcelable(Badge.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Badge[] newArray(int i12) {
            return new Badge[i12];
        }
    }

    public Badge(@k String str, @k DockingBadgeType.Predefined predefined, @InterfaceC42150f @l Integer num) {
        this.f129995b = str;
        this.f129996c = predefined;
        this.f129997d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return L.f(this.f129995b, badge.f129995b) && this.f129996c == badge.f129996c && L.f(this.f129997d, badge.f129997d);
    }

    public final int hashCode() {
        int iHashCode = (this.f129996c.hashCode() + (this.f129995b.hashCode() * 31)) * 31;
        Integer num = this.f129997d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Badge(text=");
        sb2.append(this.f129995b);
        sb2.append(", color=");
        sb2.append(this.f129996c);
        sb2.append(", icon=");
        return s.j(sb2, this.f129997d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129995b);
        parcel.writeParcelable(this.f129996c, i12);
        Integer num = this.f129997d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}

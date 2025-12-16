package com.avito.android.work_profile.profile.applies.ui.items.empty_applies;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kQ0.InterfaceC42620a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancyEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/empty_applies/AppliesToVacancyEmptyItem;", "LkQ0/a;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesToVacancyEmptyItem implements InterfaceC42620a, ParcelableItem {

    @k
    public static final Parcelable.Creator<AppliesToVacancyEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f330995b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f330996c;

    /* compiled from: AppliesToVacancyEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppliesToVacancyEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final AppliesToVacancyEmptyItem createFromParcel(Parcel parcel) {
            return new AppliesToVacancyEmptyItem(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppliesToVacancyEmptyItem[] newArray(int i12) {
            return new AppliesToVacancyEmptyItem[i12];
        }
    }

    public AppliesToVacancyEmptyItem(@k String str, boolean z12) {
        this.f330995b = str;
        this.f330996c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliesToVacancyEmptyItem)) {
            return false;
        }
        AppliesToVacancyEmptyItem appliesToVacancyEmptyItem = (AppliesToVacancyEmptyItem) obj;
        return L.f(this.f330995b, appliesToVacancyEmptyItem.f330995b) && this.f330996c == appliesToVacancyEmptyItem.f330996c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300304b() {
        return this.f330995b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f330996c) + (this.f330995b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliesToVacancyEmptyItem(stringId=");
        sb2.append(this.f330995b);
        sb2.append(", fillMaxHeight=");
        return r.x(sb2, this.f330996c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f330995b);
        parcel.writeInt(this.f330996c ? 1 : 0);
    }

    public /* synthetic */ AppliesToVacancyEmptyItem(String str, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "APPLIES_EMPTY_ID" : str, z12);
    }
}

package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.work_profile.domain.entity.ApplyAction;
import com.avito.android.work_profile.domain.entity.Employer;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kQ0.InterfaceC42620a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplyToVacancyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/ApplyToVacancyItem;", "LkQ0/a;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ApplyToVacancyItem implements InterfaceC42620a, ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ApplyToVacancyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f330953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f330954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final VacancyInfo f330955d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Employer f330956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ApplyAction f330957f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ApplyAction f330958g;

    /* compiled from: ApplyToVacancyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplyToVacancyItem> {
        @Override // android.os.Parcelable.Creator
        public final ApplyToVacancyItem createFromParcel(Parcel parcel) {
            return new ApplyToVacancyItem(parcel.readString(), parcel.readString(), VacancyInfo.CREATOR.createFromParcel(parcel), Employer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApplyAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApplyAction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplyToVacancyItem[] newArray(int i12) {
            return new ApplyToVacancyItem[i12];
        }
    }

    public ApplyToVacancyItem(@Y61.k String str, @Y61.k String str2, @Y61.k VacancyInfo vacancyInfo, @Y61.k Employer employer, @Y61.l ApplyAction applyAction, @Y61.l ApplyAction applyAction2) {
        this.f330953b = str;
        this.f330954c = str2;
        this.f330955d = vacancyInfo;
        this.f330956e = employer;
        this.f330957f = applyAction;
        this.f330958g = applyAction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyToVacancyItem)) {
            return false;
        }
        ApplyToVacancyItem applyToVacancyItem = (ApplyToVacancyItem) obj;
        return L.f(this.f330953b, applyToVacancyItem.f330953b) && L.f(this.f330954c, applyToVacancyItem.f330954c) && L.f(this.f330955d, applyToVacancyItem.f330955d) && L.f(this.f330956e, applyToVacancyItem.f330956e) && L.f(this.f330957f, applyToVacancyItem.f330957f) && L.f(this.f330958g, applyToVacancyItem.f330958g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF330953b() {
        return this.f330953b;
    }

    public final int hashCode() {
        int iHashCode = (this.f330956e.hashCode() + ((this.f330955d.hashCode() + H.d(this.f330953b.hashCode() * 31, 31, this.f330954c)) * 31)) * 31;
        ApplyAction applyAction = this.f330957f;
        int iHashCode2 = (iHashCode + (applyAction == null ? 0 : applyAction.hashCode())) * 31;
        ApplyAction applyAction2 = this.f330958g;
        return iHashCode2 + (applyAction2 != null ? applyAction2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ApplyToVacancyItem(stringId=" + this.f330953b + ", date=" + this.f330954c + ", vacancyInfo=" + this.f330955d + ", employer=" + this.f330956e + ", callButtonInfo=" + this.f330957f + ", writeButtonInfo=" + this.f330958g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f330953b);
        parcel.writeString(this.f330954c);
        this.f330955d.writeToParcel(parcel, i12);
        this.f330956e.writeToParcel(parcel, i12);
        ApplyAction applyAction = this.f330957f;
        if (applyAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applyAction.writeToParcel(parcel, i12);
        }
        ApplyAction applyAction2 = this.f330958g;
        if (applyAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applyAction2.writeToParcel(parcel, i12);
        }
    }
}

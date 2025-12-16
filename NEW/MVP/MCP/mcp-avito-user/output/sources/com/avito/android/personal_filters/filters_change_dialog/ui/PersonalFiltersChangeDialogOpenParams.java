package com.avito.android.personal_filters.filters_change_dialog.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/ui/PersonalFiltersChangeDialogOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonalFiltersChangeDialogOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<PersonalFiltersChangeDialogOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PersonalFiltersChangeDialogData f215770b;

    /* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PersonalFiltersChangeDialogOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final PersonalFiltersChangeDialogOpenParams createFromParcel(Parcel parcel) {
            return new PersonalFiltersChangeDialogOpenParams(PersonalFiltersChangeDialogData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalFiltersChangeDialogOpenParams[] newArray(int i12) {
            return new PersonalFiltersChangeDialogOpenParams[i12];
        }
    }

    public PersonalFiltersChangeDialogOpenParams(@k PersonalFiltersChangeDialogData personalFiltersChangeDialogData) {
        this.f215770b = personalFiltersChangeDialogData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalFiltersChangeDialogOpenParams) && L.f(this.f215770b, ((PersonalFiltersChangeDialogOpenParams) obj).f215770b);
    }

    public final int hashCode() {
        return this.f215770b.hashCode();
    }

    @k
    public final String toString() {
        return "PersonalFiltersChangeDialogOpenParams(data=" + this.f215770b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f215770b.writeToParcel(parcel, i12);
    }
}

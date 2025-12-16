package com.avito.android.suggest_institutes_bottom_sheet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedSuggestInstitute.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/SelectedSuggestInstitute;", "Landroid/os/Parcelable;", "_avito_job_suggest-institutes-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectedSuggestInstitute implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedSuggestInstitute> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f291979b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f291980c;

    /* compiled from: SelectedSuggestInstitute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedSuggestInstitute> {
        @Override // android.os.Parcelable.Creator
        public final SelectedSuggestInstitute createFromParcel(Parcel parcel) {
            return new SelectedSuggestInstitute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedSuggestInstitute[] newArray(int i12) {
            return new SelectedSuggestInstitute[i12];
        }
    }

    public SelectedSuggestInstitute(@k String str, @l String str2) {
        this.f291979b = str;
        this.f291980c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedSuggestInstitute)) {
            return false;
        }
        SelectedSuggestInstitute selectedSuggestInstitute = (SelectedSuggestInstitute) obj;
        return L.f(this.f291979b, selectedSuggestInstitute.f291979b) && L.f(this.f291980c, selectedSuggestInstitute.f291980c);
    }

    public final int hashCode() {
        int iHashCode = this.f291979b.hashCode() * 31;
        String str = this.f291980c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedSuggestInstitute(selectId=");
        sb2.append(this.f291979b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f291980c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f291979b);
        parcel.writeString(this.f291980c);
    }
}

package com.avito.android.suggest_institutes_bottom_sheet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestInstituteArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/SuggestInstituteArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_job_suggest-institutes-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestInstituteArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<SuggestInstituteArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f291981b;

    /* renamed from: c, reason: collision with root package name */
    public final long f291982c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SelectedSuggestInstitute f291983d;

    /* compiled from: SuggestInstituteArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestInstituteArguments> {
        @Override // android.os.Parcelable.Creator
        public final SuggestInstituteArguments createFromParcel(Parcel parcel) {
            return new SuggestInstituteArguments(parcel.readString(), parcel.readLong(), SelectedSuggestInstitute.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestInstituteArguments[] newArray(int i12) {
            return new SuggestInstituteArguments[i12];
        }
    }

    public SuggestInstituteArguments(@k String str, long j12, @k SelectedSuggestInstitute selectedSuggestInstitute) {
        this.f291981b = str;
        this.f291982c = j12;
        this.f291983d = selectedSuggestInstitute;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestInstituteArguments)) {
            return false;
        }
        SuggestInstituteArguments suggestInstituteArguments = (SuggestInstituteArguments) obj;
        return L.f(this.f291981b, suggestInstituteArguments.f291981b) && this.f291982c == suggestInstituteArguments.f291982c && L.f(this.f291983d, suggestInstituteArguments.f291983d);
    }

    public final int hashCode() {
        return this.f291983d.hashCode() + r.g(this.f291981b.hashCode() * 31, 31, this.f291982c);
    }

    @k
    public final String toString() {
        return "SuggestInstituteArguments(title=" + this.f291981b + ", limit=" + this.f291982c + ", selectedSuggestInstitute=" + this.f291983d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f291981b);
        parcel.writeLong(this.f291982c);
        this.f291983d.writeToParcel(parcel, i12);
    }
}

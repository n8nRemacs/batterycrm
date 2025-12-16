package com.avito.android.rating_form.select_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormSelectItemArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/RatingFormSelectItemArguments;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormSelectItemArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormSelectItemArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RatingFormArguments f248865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f248866c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final StepIdentifier f248867d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f248868e;

    /* compiled from: RatingFormSelectItemArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormSelectItemArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormSelectItemArguments createFromParcel(Parcel parcel) {
            return new RatingFormSelectItemArguments((RatingFormArguments) parcel.readParcelable(RatingFormSelectItemArguments.class.getClassLoader()), parcel.readInt(), StepIdentifier.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormSelectItemArguments[] newArray(int i12) {
            return new RatingFormSelectItemArguments[i12];
        }
    }

    public RatingFormSelectItemArguments(@k RatingFormArguments ratingFormArguments, int i12, @k StepIdentifier stepIdentifier, boolean z12) {
        this.f248865b = ratingFormArguments;
        this.f248866c = i12;
        this.f248867d = stepIdentifier;
        this.f248868e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormSelectItemArguments)) {
            return false;
        }
        RatingFormSelectItemArguments ratingFormSelectItemArguments = (RatingFormSelectItemArguments) obj;
        return L.f(this.f248865b, ratingFormSelectItemArguments.f248865b) && this.f248866c == ratingFormSelectItemArguments.f248866c && L.f(this.f248867d, ratingFormSelectItemArguments.f248867d) && this.f248868e == ratingFormSelectItemArguments.f248868e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248868e) + ((this.f248867d.hashCode() + r.e(this.f248866c, this.f248865b.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormSelectItemArguments(formArguments=");
        sb2.append(this.f248865b);
        sb2.append(", draftId=");
        sb2.append(this.f248866c);
        sb2.append(", stepIdentifier=");
        sb2.append(this.f248867d);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f248868e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f248865b, i12);
        parcel.writeInt(this.f248866c);
        this.f248867d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f248868e ? 1 : 0);
    }
}

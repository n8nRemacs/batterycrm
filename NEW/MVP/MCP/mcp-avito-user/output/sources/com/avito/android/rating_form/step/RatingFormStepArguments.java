package com.avito.android.rating_form.step;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormStepArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/RatingFormStepArguments;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormStepArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RatingFormStepArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RatingFormArguments f249114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f249115c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final StepIdentifier f249116d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f249117e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f249118f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f249119g;

    /* compiled from: RatingFormStepArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormStepArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormStepArguments createFromParcel(Parcel parcel) {
            return new RatingFormStepArguments((RatingFormArguments) parcel.readParcelable(RatingFormStepArguments.class.getClassLoader()), parcel.readInt(), StepIdentifier.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormStepArguments[] newArray(int i12) {
            return new RatingFormStepArguments[i12];
        }
    }

    public RatingFormStepArguments(@Y61.k RatingFormArguments ratingFormArguments, int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k String str, boolean z12, boolean z13) {
        this.f249114b = ratingFormArguments;
        this.f249115c = i12;
        this.f249116d = stepIdentifier;
        this.f249117e = str;
        this.f249118f = z12;
        this.f249119g = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormStepArguments)) {
            return false;
        }
        RatingFormStepArguments ratingFormStepArguments = (RatingFormStepArguments) obj;
        return L.f(this.f249114b, ratingFormStepArguments.f249114b) && this.f249115c == ratingFormStepArguments.f249115c && L.f(this.f249116d, ratingFormStepArguments.f249116d) && L.f(this.f249117e, ratingFormStepArguments.f249117e) && this.f249118f == ratingFormStepArguments.f249118f && this.f249119g == ratingFormStepArguments.f249119g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249119g) + androidx.appcompat.app.r.i(H.d((this.f249116d.hashCode() + androidx.appcompat.app.r.e(this.f249115c, this.f249114b.hashCode() * 31, 31)) * 31, 31, this.f249117e), 31, this.f249118f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormStepArguments(formArguments=");
        sb2.append(this.f249114b);
        sb2.append(", draftId=");
        sb2.append(this.f249115c);
        sb2.append(", stepIdentifier=");
        sb2.append(this.f249116d);
        sb2.append(", suffix=");
        sb2.append(this.f249117e);
        sb2.append(", isRedesign=");
        sb2.append(this.f249118f);
        sb2.append(", isModal=");
        return androidx.appcompat.app.r.x(sb2, this.f249119g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f249114b, i12);
        parcel.writeInt(this.f249115c);
        this.f249116d.writeToParcel(parcel, i12);
        parcel.writeString(this.f249117e);
        parcel.writeInt(this.f249118f ? 1 : 0);
        parcel.writeInt(this.f249119g ? 1 : 0);
    }
}

package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserInfoSection.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/Rating;", "Landroid/os/Parcelable;", "", "hasFeedback", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Rating implements Parcelable {

    @k
    public static final Parcelable.Creator<Rating> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("hasFeedback")
    @l
    private final Boolean hasFeedback;

    /* compiled from: UserInfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Rating> {
        @Override // android.os.Parcelable.Creator
        public final Rating createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Rating(boolValueOf, (AttributedText) parcel.readParcelable(Rating.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Rating[] newArray(int i12) {
            return new Rating[i12];
        }
    }

    public Rating(@l Boolean bool, @l AttributedText attributedText) {
        this.hasFeedback = bool;
        this.description = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getHasFeedback() {
        return this.hasFeedback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) obj;
        return L.f(this.hasFeedback, rating.hasFeedback) && L.f(this.description, rating.description);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        Boolean bool = this.hasFeedback;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        AttributedText attributedText = this.description;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating(hasFeedback=");
        sb2.append(this.hasFeedback);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Boolean bool = this.hasFeedback;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.description, i12);
    }
}

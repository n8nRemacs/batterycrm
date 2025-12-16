package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRating.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0016¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/ProfileRating;", "Landroid/os/Parcelable;", "", "score", "scoreFloat", "Lcom/avito/android/remote/model/ProfileRatingAction;", "action", "", "hideStars", "", "analytics", "<init>", "(FLjava/lang/Float;Lcom/avito/android/remote/model/ProfileRatingAction;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()F", "component2", "()Ljava/lang/Float;", "component3", "()Lcom/avito/android/remote/model/ProfileRatingAction;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/String;", "copy", "(FLjava/lang/Float;Lcom/avito/android/remote/model/ProfileRatingAction;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/ProfileRating;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getScore", "Ljava/lang/Float;", "getScoreFloat", "Lcom/avito/android/remote/model/ProfileRatingAction;", "getAction", "Ljava/lang/Boolean;", "getHideStars", "Ljava/lang/String;", "getAnalytics", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileRating implements Parcelable {

    @k
    public static final Parcelable.Creator<ProfileRating> CREATOR = new Creator();

    @c("action")
    @l
    private final ProfileRatingAction action;

    @c("analytics")
    @l
    private final String analytics;

    @c("hideStars")
    @l
    private final Boolean hideStars;

    @c("score")
    private final float score;

    @c("scoreFloat")
    @l
    private final Float scoreFloat;

    /* compiled from: ProfileRating.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfileRating> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfileRating createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            float f12 = parcel.readFloat();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            ProfileRatingAction profileRatingActionCreateFromParcel = parcel.readInt() == 0 ? null : ProfileRatingAction.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProfileRating(f12, fValueOf, profileRatingActionCreateFromParcel, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfileRating[] newArray(int i12) {
            return new ProfileRating[i12];
        }
    }

    public ProfileRating(float f12, @l Float f13, @l ProfileRatingAction profileRatingAction, @l Boolean bool, @l String str) {
        this.score = f12;
        this.scoreFloat = f13;
        this.action = profileRatingAction;
        this.hideStars = bool;
        this.analytics = str;
    }

    public static /* synthetic */ ProfileRating copy$default(ProfileRating profileRating, float f12, Float f13, ProfileRatingAction profileRatingAction, Boolean bool, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = profileRating.score;
        }
        if ((i12 & 2) != 0) {
            f13 = profileRating.scoreFloat;
        }
        Float f14 = f13;
        if ((i12 & 4) != 0) {
            profileRatingAction = profileRating.action;
        }
        ProfileRatingAction profileRatingAction2 = profileRatingAction;
        if ((i12 & 8) != 0) {
            bool = profileRating.hideStars;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            str = profileRating.analytics;
        }
        return profileRating.copy(f12, f14, profileRatingAction2, bool2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getScoreFloat() {
        return this.scoreFloat;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ProfileRatingAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getHideStars() {
        return this.hideStars;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getAnalytics() {
        return this.analytics;
    }

    @k
    public final ProfileRating copy(float score, @l Float scoreFloat, @l ProfileRatingAction action, @l Boolean hideStars, @l String analytics) {
        return new ProfileRating(score, scoreFloat, action, hideStars, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileRating)) {
            return false;
        }
        ProfileRating profileRating = (ProfileRating) other;
        return Float.compare(this.score, profileRating.score) == 0 && L.f(this.scoreFloat, profileRating.scoreFloat) && L.f(this.action, profileRating.action) && L.f(this.hideStars, profileRating.hideStars) && L.f(this.analytics, profileRating.analytics);
    }

    @l
    public final ProfileRatingAction getAction() {
        return this.action;
    }

    @l
    public final String getAnalytics() {
        return this.analytics;
    }

    @l
    public final Boolean getHideStars() {
        return this.hideStars;
    }

    public final float getScore() {
        return this.score;
    }

    @l
    public final Float getScoreFloat() {
        return this.scoreFloat;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.score) * 31;
        Float f12 = this.scoreFloat;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        ProfileRatingAction profileRatingAction = this.action;
        int iHashCode3 = (iHashCode2 + (profileRatingAction == null ? 0 : profileRatingAction.hashCode())) * 31;
        Boolean bool = this.hideStars;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.analytics;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileRating(score=");
        sb2.append(this.score);
        sb2.append(", scoreFloat=");
        sb2.append(this.scoreFloat);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", hideStars=");
        sb2.append(this.hideStars);
        sb2.append(", analytics=");
        return C22026a.c(sb2, this.analytics, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeFloat(this.score);
        Float f12 = this.scoreFloat;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        ProfileRatingAction profileRatingAction = this.action;
        if (profileRatingAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileRatingAction.writeToParcel(parcel, flags);
        }
        Boolean bool = this.hideStars;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.analytics);
    }
}

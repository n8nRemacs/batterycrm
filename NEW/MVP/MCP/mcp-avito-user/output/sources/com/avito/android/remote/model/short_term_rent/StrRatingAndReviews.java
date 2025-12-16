package com.avito.android.remote.model.short_term_rent;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrRatingAndReviews.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;", "Landroid/os/Parcelable;", "", "scoreValue", "", "scoreText", "caption", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getScoreValue", "Ljava/lang/String;", "getScoreText", "getCaption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrRatingAndReviews implements Parcelable {

    @k
    public static final Parcelable.Creator<StrRatingAndReviews> CREATOR = new Creator();

    @c("caption")
    @l
    private final String caption;

    @c("scoreText")
    @l
    private final String scoreText;

    @c("scoreValue")
    @l
    private final Float scoreValue;

    /* compiled from: StrRatingAndReviews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrRatingAndReviews> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrRatingAndReviews createFromParcel(@k Parcel parcel) {
            return new StrRatingAndReviews(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrRatingAndReviews[] newArray(int i12) {
            return new StrRatingAndReviews[i12];
        }
    }

    public StrRatingAndReviews(@l Float f12, @l String str, @l String str2) {
        this.scoreValue = f12;
        this.scoreText = str;
        this.caption = str2;
    }

    public static /* synthetic */ StrRatingAndReviews copy$default(StrRatingAndReviews strRatingAndReviews, Float f12, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = strRatingAndReviews.scoreValue;
        }
        if ((i12 & 2) != 0) {
            str = strRatingAndReviews.scoreText;
        }
        if ((i12 & 4) != 0) {
            str2 = strRatingAndReviews.caption;
        }
        return strRatingAndReviews.copy(f12, str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Float getScoreValue() {
        return this.scoreValue;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getScoreText() {
        return this.scoreText;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    @k
    public final StrRatingAndReviews copy(@l Float scoreValue, @l String scoreText, @l String caption) {
        return new StrRatingAndReviews(scoreValue, scoreText, caption);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrRatingAndReviews)) {
            return false;
        }
        StrRatingAndReviews strRatingAndReviews = (StrRatingAndReviews) other;
        return L.f(this.scoreValue, strRatingAndReviews.scoreValue) && L.f(this.scoreText, strRatingAndReviews.scoreText) && L.f(this.caption, strRatingAndReviews.caption);
    }

    @l
    public final String getCaption() {
        return this.caption;
    }

    @l
    public final String getScoreText() {
        return this.scoreText;
    }

    @l
    public final Float getScoreValue() {
        return this.scoreValue;
    }

    public int hashCode() {
        Float f12 = this.scoreValue;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        String str = this.scoreText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.caption;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrRatingAndReviews(scoreValue=");
        sb2.append(this.scoreValue);
        sb2.append(", scoreText=");
        sb2.append(this.scoreText);
        sb2.append(", caption=");
        return C22026a.c(sb2, this.caption, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.scoreValue;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.scoreText);
        parcel.writeString(this.caption);
    }
}

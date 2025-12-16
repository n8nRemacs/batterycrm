package com.avito.android.remote.model.user_profile;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ReputationAndRating.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001)BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b(\u0010#¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/user_profile/ReputationAndRating;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "reputationWidgetText", "reputationTag", "", "reputationScore", "Lcom/avito/android/remote/model/user_profile/ReputationAndRating$ReputationColor;", "reputationColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "reputationUri", "ratingWidgetText", "", "ratingScore", "ratingUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/user_profile/ReputationAndRating$ReputationColor;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/Float;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReputationWidgetText", "()Ljava/lang/String;", "getReputationTag", "Ljava/lang/Integer;", "getReputationScore", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/user_profile/ReputationAndRating$ReputationColor;", "getReputationColor", "()Lcom/avito/android/remote/model/user_profile/ReputationAndRating$ReputationColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getReputationUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getRatingWidgetText", "Ljava/lang/Float;", "getRatingScore", "()Ljava/lang/Float;", "getRatingUri", "ReputationColor", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReputationAndRating extends UserProfileItem {

    @k
    public static final Parcelable.Creator<ReputationAndRating> CREATOR = new Creator();

    @c("ratingScore")
    @l
    private final Float ratingScore;

    @c("ratingUri")
    @k
    private final DeepLink ratingUri;

    @c("ratingWidgetText")
    @k
    private final String ratingWidgetText;

    @c("reputationColor")
    @l
    private final ReputationColor reputationColor;

    @c("reputationScore")
    @l
    private final Integer reputationScore;

    @c("reputationTag")
    @l
    private final String reputationTag;

    @c("reputationUri")
    @k
    private final DeepLink reputationUri;

    @c("reputationWidgetText")
    @k
    private final String reputationWidgetText;

    /* compiled from: ReputationAndRating.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReputationAndRating> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReputationAndRating createFromParcel(@k Parcel parcel) {
            return new ReputationAndRating(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ReputationColor.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(ReputationAndRating.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (DeepLink) parcel.readParcelable(ReputationAndRating.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReputationAndRating[] newArray(int i12) {
            return new ReputationAndRating[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReputationAndRating.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/user_profile/ReputationAndRating$ReputationColor;", "", "(Ljava/lang/String;I)V", "RED", "YELLOW", "GREEN", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReputationColor {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ReputationColor[] $VALUES;

        @c("red")
        public static final ReputationColor RED = new ReputationColor("RED", 0);

        @c("yellow")
        public static final ReputationColor YELLOW = new ReputationColor("YELLOW", 1);

        @c("green")
        public static final ReputationColor GREEN = new ReputationColor("GREEN", 2);

        private static final /* synthetic */ ReputationColor[] $values() {
            return new ReputationColor[]{RED, YELLOW, GREEN};
        }

        static {
            ReputationColor[] reputationColorArr$values = $values();
            $VALUES = reputationColorArr$values;
            $ENTRIES = kotlin.enums.c.a(reputationColorArr$values);
        }

        private ReputationColor(String str, int i12) {
        }

        @k
        public static a<ReputationColor> getEntries() {
            return $ENTRIES;
        }

        public static ReputationColor valueOf(String str) {
            return (ReputationColor) Enum.valueOf(ReputationColor.class, str);
        }

        public static ReputationColor[] values() {
            return (ReputationColor[]) $VALUES.clone();
        }
    }

    public ReputationAndRating(@k String str, @l String str2, @l Integer num, @l ReputationColor reputationColor, @k DeepLink deepLink, @k String str3, @l Float f12, @k DeepLink deepLink2) {
        this.reputationWidgetText = str;
        this.reputationTag = str2;
        this.reputationScore = num;
        this.reputationColor = reputationColor;
        this.reputationUri = deepLink;
        this.ratingWidgetText = str3;
        this.ratingScore = f12;
        this.ratingUri = deepLink2;
    }

    @l
    public final Float getRatingScore() {
        return this.ratingScore;
    }

    @k
    public final DeepLink getRatingUri() {
        return this.ratingUri;
    }

    @k
    public final String getRatingWidgetText() {
        return this.ratingWidgetText;
    }

    @l
    public final ReputationColor getReputationColor() {
        return this.reputationColor;
    }

    @l
    public final Integer getReputationScore() {
        return this.reputationScore;
    }

    @l
    public final String getReputationTag() {
        return this.reputationTag;
    }

    @k
    public final DeepLink getReputationUri() {
        return this.reputationUri;
    }

    @k
    public final String getReputationWidgetText() {
        return this.reputationWidgetText;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.reputationWidgetText);
        parcel.writeString(this.reputationTag);
        Integer num = this.reputationScore;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ReputationColor reputationColor = this.reputationColor;
        if (reputationColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reputationColor.name());
        }
        parcel.writeParcelable(this.reputationUri, flags);
        parcel.writeString(this.ratingWidgetText);
        Float f12 = this.ratingScore;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.ratingUri, flags);
    }
}

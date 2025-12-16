package com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b6\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b7\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b8\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b9\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b:\u0010\u0012¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/Recommendation;", "Landroid/os/Parcelable;", "", "count", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "groupId", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/GroupTitle;", "groupTitle", "longPostfixFormat", "shortPostfixFormat", "longSuggestPostfixFormat", "shortSuggestPostfixFormat", "imageOffset", "<init>", "(ILcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/GroupTitle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/GroupTitle;", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/GroupTitle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/Recommendation;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getCount", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/lang/String;", "getGroupId", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/GroupTitle;", "getGroupTitle", "getLongPostfixFormat", "getShortPostfixFormat", "getLongSuggestPostfixFormat", "getShortSuggestPostfixFormat", "getImageOffset", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Recommendation implements Parcelable {

    @k
    public static final Parcelable.Creator<Recommendation> CREATOR = new Creator();

    @c("count")
    private final int count;

    @c("groupId")
    @k
    private final String groupId;

    @c("groupTitle")
    @k
    private final GroupTitle groupTitle;

    @c("image")
    @k
    private final UniversalImage image;

    @c("imageOffset")
    private final int imageOffset;

    @c("longPostfixFormat")
    @k
    private final String longPostfixFormat;

    @c("longSuggestPostfixFormat")
    @k
    private final String longSuggestPostfixFormat;

    @c("shortPostfixFormat")
    @k
    private final String shortPostfixFormat;

    @c("shortSuggestPostfixFormat")
    @k
    private final String shortSuggestPostfixFormat;

    /* compiled from: ImagesGroupsRecommendationsSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Recommendation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Recommendation createFromParcel(@k Parcel parcel) {
            return new Recommendation(parcel.readInt(), (UniversalImage) parcel.readParcelable(Recommendation.class.getClassLoader()), parcel.readString(), GroupTitle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Recommendation[] newArray(int i12) {
            return new Recommendation[i12];
        }
    }

    public Recommendation(int i12, @k UniversalImage universalImage, @k String str, @k GroupTitle groupTitle, @k String str2, @k String str3, @k String str4, @k String str5, int i13) {
        this.count = i12;
        this.image = universalImage;
        this.groupId = str;
        this.groupTitle = groupTitle;
        this.longPostfixFormat = str2;
        this.shortPostfixFormat = str3;
        this.longSuggestPostfixFormat = str4;
        this.shortSuggestPostfixFormat = str5;
        this.imageOffset = i13;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final GroupTitle getGroupTitle() {
        return this.groupTitle;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getLongPostfixFormat() {
        return this.longPostfixFormat;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getShortPostfixFormat() {
        return this.shortPostfixFormat;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getLongSuggestPostfixFormat() {
        return this.longSuggestPostfixFormat;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getShortSuggestPostfixFormat() {
        return this.shortSuggestPostfixFormat;
    }

    /* renamed from: component9, reason: from getter */
    public final int getImageOffset() {
        return this.imageOffset;
    }

    @k
    public final Recommendation copy(int count, @k UniversalImage image, @k String groupId, @k GroupTitle groupTitle, @k String longPostfixFormat, @k String shortPostfixFormat, @k String longSuggestPostfixFormat, @k String shortSuggestPostfixFormat, int imageOffset) {
        return new Recommendation(count, image, groupId, groupTitle, longPostfixFormat, shortPostfixFormat, longSuggestPostfixFormat, shortSuggestPostfixFormat, imageOffset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recommendation)) {
            return false;
        }
        Recommendation recommendation = (Recommendation) other;
        return this.count == recommendation.count && L.f(this.image, recommendation.image) && L.f(this.groupId, recommendation.groupId) && L.f(this.groupTitle, recommendation.groupTitle) && L.f(this.longPostfixFormat, recommendation.longPostfixFormat) && L.f(this.shortPostfixFormat, recommendation.shortPostfixFormat) && L.f(this.longSuggestPostfixFormat, recommendation.longSuggestPostfixFormat) && L.f(this.shortSuggestPostfixFormat, recommendation.shortSuggestPostfixFormat) && this.imageOffset == recommendation.imageOffset;
    }

    public final int getCount() {
        return this.count;
    }

    @k
    public final String getGroupId() {
        return this.groupId;
    }

    @k
    public final GroupTitle getGroupTitle() {
        return this.groupTitle;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    public final int getImageOffset() {
        return this.imageOffset;
    }

    @k
    public final String getLongPostfixFormat() {
        return this.longPostfixFormat;
    }

    @k
    public final String getLongSuggestPostfixFormat() {
        return this.longSuggestPostfixFormat;
    }

    @k
    public final String getShortPostfixFormat() {
        return this.shortPostfixFormat;
    }

    @k
    public final String getShortSuggestPostfixFormat() {
        return this.shortSuggestPostfixFormat;
    }

    public int hashCode() {
        return Integer.hashCode(this.imageOffset) + H.d(H.d(H.d(H.d((this.groupTitle.hashCode() + H.d(a.a(Integer.hashCode(this.count) * 31, 31, this.image), 31, this.groupId)) * 31, 31, this.longPostfixFormat), 31, this.shortPostfixFormat), 31, this.longSuggestPostfixFormat), 31, this.shortSuggestPostfixFormat);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Recommendation(count=");
        sb2.append(this.count);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", groupId=");
        sb2.append(this.groupId);
        sb2.append(", groupTitle=");
        sb2.append(this.groupTitle);
        sb2.append(", longPostfixFormat=");
        sb2.append(this.longPostfixFormat);
        sb2.append(", shortPostfixFormat=");
        sb2.append(this.shortPostfixFormat);
        sb2.append(", longSuggestPostfixFormat=");
        sb2.append(this.longSuggestPostfixFormat);
        sb2.append(", shortSuggestPostfixFormat=");
        sb2.append(this.shortSuggestPostfixFormat);
        sb2.append(", imageOffset=");
        return r.t(sb2, this.imageOffset, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.groupId);
        this.groupTitle.writeToParcel(parcel, flags);
        parcel.writeString(this.longPostfixFormat);
        parcel.writeString(this.shortPostfixFormat);
        parcel.writeString(this.longSuggestPostfixFormat);
        parcel.writeString(this.shortSuggestPostfixFormat);
        parcel.writeInt(this.imageOffset);
    }
}

package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0092\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020'HÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b@\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bA\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bB\u0010\u0018R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bD\u0010\u0018¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryReview;", "Landroid/os/Parcelable;", "", "id", "", "title", "", "score", "Lcom/avito/android/remote/model/Image;", "avatar", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "stageTitle", "rated", "status", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection;", "textSections", "itemTitle", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Float;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryReview;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "Ljava/lang/String;", "getTitle", "Ljava/lang/Float;", "getScore", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Ljava/util/List;", "getImages", "getStageTitle", "getRated", "getStatus", "getTextSections", "getItemTitle", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhotoGalleryReview implements Parcelable {

    @k
    public static final Parcelable.Creator<PhotoGalleryReview> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("id")
    @l
    private final Long id;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("rated")
    @l
    private final String rated;

    @c("score")
    @l
    private final Float score;

    @c("stageTitle")
    @l
    private final String stageTitle;

    @c("status")
    @l
    private final String status;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoGalleryReview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoGalleryReview createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Image image = (Image) parcel.readParcelable(PhotoGalleryReview.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(PhotoGalleryReview.class, parcel, arrayList, iL2, 1);
                }
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(TextSection.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new PhotoGalleryReview(lValueOf, string, fValueOf, image, arrayList, string2, string3, string4, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoGalleryReview[] newArray(int i12) {
            return new PhotoGalleryReview[i12];
        }
    }

    public PhotoGalleryReview(@l Long l12, @k String str, @l Float f12, @l Image image, @l List<TnsGalleryImage> list, @l String str2, @l String str3, @l String str4, @l List<TextSection> list2, @l String str5) {
        this.id = l12;
        this.title = str;
        this.score = f12;
        this.avatar = image;
        this.images = list;
        this.stageTitle = str2;
        this.rated = str3;
        this.status = str4;
        this.textSections = list2;
        this.itemTitle = str5;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final List<TnsGalleryImage> component5() {
        return this.images;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getRated() {
        return this.rated;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    public final List<TextSection> component9() {
        return this.textSections;
    }

    @k
    public final PhotoGalleryReview copy(@l Long id2, @k String title, @l Float score, @l Image avatar, @l List<TnsGalleryImage> images, @l String stageTitle, @l String rated, @l String status, @l List<TextSection> textSections, @l String itemTitle) {
        return new PhotoGalleryReview(id2, title, score, avatar, images, stageTitle, rated, status, textSections, itemTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoGalleryReview)) {
            return false;
        }
        PhotoGalleryReview photoGalleryReview = (PhotoGalleryReview) other;
        return L.f(this.id, photoGalleryReview.id) && L.f(this.title, photoGalleryReview.title) && L.f(this.score, photoGalleryReview.score) && L.f(this.avatar, photoGalleryReview.avatar) && L.f(this.images, photoGalleryReview.images) && L.f(this.stageTitle, photoGalleryReview.stageTitle) && L.f(this.rated, photoGalleryReview.rated) && L.f(this.status, photoGalleryReview.status) && L.f(this.textSections, photoGalleryReview.textSections) && L.f(this.itemTitle, photoGalleryReview.itemTitle);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final Long getId() {
        return this.id;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final String getRated() {
        return this.rated;
    }

    @l
    public final Float getScore() {
        return this.score;
    }

    @l
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final List<TextSection> getTextSections() {
        return this.textSections;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l12 = this.id;
        int iD2 = H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.title);
        Float f12 = this.score;
        int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        List<TnsGalleryImage> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.stageTitle;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rated;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<TextSection> list2 = this.textSections;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.itemTitle;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryReview(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", stageTitle=");
        sb2.append(this.stageTitle);
        sb2.append(", rated=");
        sb2.append(this.rated);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", textSections=");
        sb2.append(this.textSections);
        sb2.append(", itemTitle=");
        return C22026a.c(sb2, this.itemTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.title);
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.avatar, flags);
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.stageTitle);
        parcel.writeString(this.rated);
        parcel.writeString(this.status);
        List<TextSection> list2 = this.textSections;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((TextSection) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.itemTitle);
    }
}

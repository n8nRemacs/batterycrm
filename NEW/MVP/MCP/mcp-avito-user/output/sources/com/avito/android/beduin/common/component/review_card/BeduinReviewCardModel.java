package com.avito.android.beduin.common.component.review_card;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinReviewCardModel.kt */
@K51.d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/component/review_card/BeduinReviewCardModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "title", "subtitle", "", "rating", "details", "", "detailsMaxLinesCount", "footerDescription", "expandText", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getTitle", "getSubtitle", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "getDetails", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "e", "d", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinReviewCardModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinReviewCardModel> CREATOR = new a();

    @com.google.gson.annotations.c("onExpandTapActions")
    @l
    private final List<BeduinAction> actions;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DisplayingPredicate f102360b;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final BeduinContainerBackground background;

    @com.google.gson.annotations.c("details")
    @l
    private final String details;

    @com.google.gson.annotations.c("detailsMaxLinesCount")
    @l
    private final Integer detailsMaxLinesCount;

    @com.google.gson.annotations.c("expandText")
    @l
    private final String expandText;

    @com.google.gson.annotations.c("footerDescription")
    @l
    private final String footerDescription;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final BeduinContainerIndent padding;

    @com.google.gson.annotations.c("rating")
    @l
    private final Float rating;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: BeduinReviewCardModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinReviewCardModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinReviewCardModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinReviewCardModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinReviewCardModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinReviewCardModel(string, displayingPredicate, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinReviewCardModel[] newArray(int i12) {
            return new BeduinReviewCardModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinReviewCardModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l String str2, @l String str3, @l Float f12, @l String str4, @l Integer num, @l String str5, @l String str6, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent) {
        this.id = str;
        this.f102360b = displayingPredicate;
        this.actions = list;
        this.title = str2;
        this.subtitle = str3;
        this.rating = f12;
        this.details = str4;
        this.detailsMaxLinesCount = num;
        this.footerDescription = str5;
        this.expandText = str6;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getDetailsMaxLinesCount() {
        return this.detailsMaxLinesCount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getExpandText() {
        return this.expandText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getFooterDescription() {
        return this.footerDescription;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinReviewCardModel)) {
            return false;
        }
        BeduinReviewCardModel beduinReviewCardModel = (BeduinReviewCardModel) obj;
        return L.f(this.id, beduinReviewCardModel.id) && L.f(this.f102360b, beduinReviewCardModel.f102360b) && L.f(this.actions, beduinReviewCardModel.actions) && L.f(this.title, beduinReviewCardModel.title) && L.f(this.subtitle, beduinReviewCardModel.subtitle) && L.f(this.rating, beduinReviewCardModel.rating) && L.f(this.details, beduinReviewCardModel.details) && L.f(this.detailsMaxLinesCount, beduinReviewCardModel.detailsMaxLinesCount) && L.f(this.footerDescription, beduinReviewCardModel.footerDescription) && L.f(this.expandText, beduinReviewCardModel.expandText) && L.f(this.background, beduinReviewCardModel.background) && L.f(this.padding, beduinReviewCardModel.padding);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Float getRating() {
        return this.rating;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @l
    public final String getDetails() {
        return this.details;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.f102360b;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.f102360b;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f12 = this.rating;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.details;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.detailsMaxLinesCount;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.footerDescription;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expandText;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode11 = (iHashCode10 + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        return iHashCode11 + (beduinContainerIndent != null ? beduinContainerIndent.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinReviewCardModel(id=" + this.id + ", displayingPredicate=" + this.f102360b + ", actions=" + this.actions + ", title=" + this.title + ", subtitle=" + this.subtitle + ", rating=" + this.rating + ", details=" + this.details + ", detailsMaxLinesCount=" + this.detailsMaxLinesCount + ", footerDescription=" + this.footerDescription + ", expandText=" + this.expandText + ", background=" + this.background + ", padding=" + this.padding + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.f102360b, i12);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Float f12 = this.rating;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.details);
        Integer num = this.detailsMaxLinesCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.footerDescription);
        parcel.writeString(this.expandText);
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, i12);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, i12);
        }
    }
}

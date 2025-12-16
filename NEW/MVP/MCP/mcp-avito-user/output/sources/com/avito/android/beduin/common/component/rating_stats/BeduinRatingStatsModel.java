package com.avito.android.beduin.common.component.rating_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRatingStatsModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0019¨\u00063"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stats/BeduinRatingStatsModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "reviewCount", "", "Lcom/avito/android/beduin/common/component/rating_stats/BeduinRating;", "ratings", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/beduin/common/component/rating_stats/BeduinRatingStatsModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Integer;", "getReviewCount", "Ljava/util/List;", "getRatings", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRatingStatsModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinRatingStatsModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final List<BeduinRating> ratings;

    @l
    private final Integer reviewCount;

    /* compiled from: BeduinRatingStatsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRatingStatsModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStatsModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinRatingStatsModel.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinRating.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BeduinRatingStatsModel(string, displayingPredicate, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStatsModel[] newArray(int i12) {
            return new BeduinRatingStatsModel[i12];
        }
    }

    public BeduinRatingStatsModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Integer num, @k List<BeduinRating> list) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.reviewCount = num;
        this.ratings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinRatingStatsModel copy$default(BeduinRatingStatsModel beduinRatingStatsModel, String str, DisplayingPredicate displayingPredicate, Integer num, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinRatingStatsModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinRatingStatsModel.displayingPredicate;
        }
        if ((i12 & 4) != 0) {
            num = beduinRatingStatsModel.reviewCount;
        }
        if ((i12 & 8) != 0) {
            list = beduinRatingStatsModel.ratings;
        }
        return beduinRatingStatsModel.copy(str, displayingPredicate, num, list);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, 13, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getReviewCount() {
        return this.reviewCount;
    }

    @k
    public final List<BeduinRating> component4() {
        return this.ratings;
    }

    @k
    public final BeduinRatingStatsModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Integer reviewCount, @k List<BeduinRating> ratings) {
        return new BeduinRatingStatsModel(id2, displayingPredicate, reviewCount, ratings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRatingStatsModel)) {
            return false;
        }
        BeduinRatingStatsModel beduinRatingStatsModel = (BeduinRatingStatsModel) other;
        return L.f(this.id, beduinRatingStatsModel.id) && L.f(this.displayingPredicate, beduinRatingStatsModel.displayingPredicate) && L.f(this.reviewCount, beduinRatingStatsModel.reviewCount) && L.f(this.ratings, beduinRatingStatsModel.ratings);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100948c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100947b() {
        return this.id;
    }

    @k
    public final List<BeduinRating> getRatings() {
        return this.ratings;
    }

    @l
    public final Integer getReviewCount() {
        return this.reviewCount;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Integer num = this.reviewCount;
        return this.ratings.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRatingStatsModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", reviewCount=");
        sb2.append(this.reviewCount);
        sb2.append(", ratings=");
        return H.p(sb2, this.ratings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Integer num = this.reviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Iterator itJ = C0.j(this.ratings, parcel);
        while (itJ.hasNext()) {
            ((BeduinRating) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}

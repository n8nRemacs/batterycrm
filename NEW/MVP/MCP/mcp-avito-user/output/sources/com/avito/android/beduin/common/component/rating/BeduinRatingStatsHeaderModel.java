package com.avito.android.beduin.common.component.rating;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRatingStatsHeaderModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0011¨\u00060"}, d2 = {"Lcom/avito/android/beduin/common/component/rating/BeduinRatingStatsHeaderModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "score", "subtitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;FLjava/lang/String;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()F", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;FLjava/lang/String;)Lcom/avito/android/beduin/common/component/rating/BeduinRatingStatsHeaderModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "F", "getScore", "getSubtitle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRatingStatsHeaderModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinRatingStatsHeaderModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;
    private final float score;

    @k
    private final String subtitle;

    /* compiled from: BeduinRatingStatsHeaderModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRatingStatsHeaderModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStatsHeaderModel createFromParcel(Parcel parcel) {
            return new BeduinRatingStatsHeaderModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinRatingStatsHeaderModel.class.getClassLoader()), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStatsHeaderModel[] newArray(int i12) {
            return new BeduinRatingStatsHeaderModel[i12];
        }
    }

    public BeduinRatingStatsHeaderModel(@k String str, @l DisplayingPredicate displayingPredicate, float f12, @k String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.score = f12;
        this.subtitle = str2;
    }

    public static /* synthetic */ BeduinRatingStatsHeaderModel copy$default(BeduinRatingStatsHeaderModel beduinRatingStatsHeaderModel, String str, DisplayingPredicate displayingPredicate, float f12, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinRatingStatsHeaderModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinRatingStatsHeaderModel.displayingPredicate;
        }
        if ((i12 & 4) != 0) {
            f12 = beduinRatingStatsHeaderModel.score;
        }
        if ((i12 & 8) != 0) {
            str2 = beduinRatingStatsHeaderModel.subtitle;
        }
        return beduinRatingStatsHeaderModel.copy(str, displayingPredicate, f12, str2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 0.0f, null, 13, null) : this;
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

    /* renamed from: component3, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final BeduinRatingStatsHeaderModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, float score, @k String subtitle) {
        return new BeduinRatingStatsHeaderModel(id2, displayingPredicate, score, subtitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRatingStatsHeaderModel)) {
            return false;
        }
        BeduinRatingStatsHeaderModel beduinRatingStatsHeaderModel = (BeduinRatingStatsHeaderModel) other;
        return L.f(this.id, beduinRatingStatsHeaderModel.id) && L.f(this.displayingPredicate, beduinRatingStatsHeaderModel.displayingPredicate) && Float.compare(this.score, beduinRatingStatsHeaderModel.score) == 0 && L.f(this.subtitle, beduinRatingStatsHeaderModel.subtitle);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    public final float getScore() {
        return this.score;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return this.subtitle.hashCode() + r.d(this.score, (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRatingStatsHeaderModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeFloat(this.score);
        parcel.writeString(this.subtitle);
    }
}

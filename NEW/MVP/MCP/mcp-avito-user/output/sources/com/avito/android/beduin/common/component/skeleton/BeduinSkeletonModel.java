package com.avito.android.beduin.common.component.skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSkeletonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010 ¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;", "heightStrategy", "", "heightValue", "widthStrategy", "widthValue", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;DLcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;DLcom/avito/android/beduin/common/container/Corners;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;", "component4", "()D", "component5", "component6", "component7", "()Lcom/avito/android/beduin/common/container/Corners;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;DLcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;DLcom/avito/android/beduin/common/container/Corners;)Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;", "getHeightStrategy", "D", "getHeightValue", "getWidthStrategy", "getWidthValue", "Lcom/avito/android/beduin/common/container/Corners;", "getCorners", "Strategy", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSkeletonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSkeletonModel> CREATOR = new a();

    @l
    private final Corners corners;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final Strategy heightStrategy;
    private final double heightValue;

    @k
    private final String id;

    @k
    private final Strategy widthStrategy;
    private final double widthValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSkeletonModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel$Strategy;", "", "(Ljava/lang/String;I)V", "FIXED", "RATIO", "PERCENT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Strategy {

        @com.google.gson.annotations.c("fixed")
        public static final Strategy FIXED;

        @com.google.gson.annotations.c("percent")
        public static final Strategy PERCENT;

        @com.google.gson.annotations.c("ratio")
        public static final Strategy RATIO;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f102640b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102641c;

        static {
            Strategy strategy = new Strategy("FIXED", 0);
            FIXED = strategy;
            Strategy strategy2 = new Strategy("RATIO", 1);
            RATIO = strategy2;
            Strategy strategy3 = new Strategy("PERCENT", 2);
            PERCENT = strategy3;
            Strategy[] strategyArr = {strategy, strategy2, strategy3};
            f102640b = strategyArr;
            f102641c = kotlin.enums.c.a(strategyArr);
        }

        private Strategy(String str, int i12) {
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f102640b.clone();
        }
    }

    /* compiled from: BeduinSkeletonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSkeletonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSkeletonModel createFromParcel(Parcel parcel) {
            return new BeduinSkeletonModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinSkeletonModel.class.getClassLoader()), Strategy.valueOf(parcel.readString()), parcel.readDouble(), Strategy.valueOf(parcel.readString()), parcel.readDouble(), parcel.readInt() == 0 ? null : Corners.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSkeletonModel[] newArray(int i12) {
            return new BeduinSkeletonModel[i12];
        }
    }

    public BeduinSkeletonModel(@k String str, @l DisplayingPredicate displayingPredicate, @k Strategy strategy, double d12, @k Strategy strategy2, double d13, @l Corners corners) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.heightStrategy = strategy;
        this.heightValue = d12;
        this.widthStrategy = strategy2;
        this.widthValue = d13;
        this.corners = corners;
    }

    public static /* synthetic */ BeduinSkeletonModel copy$default(BeduinSkeletonModel beduinSkeletonModel, String str, DisplayingPredicate displayingPredicate, Strategy strategy, double d12, Strategy strategy2, double d13, Corners corners, int i12, Object obj) {
        return beduinSkeletonModel.copy((i12 & 1) != 0 ? beduinSkeletonModel.id : str, (i12 & 2) != 0 ? beduinSkeletonModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinSkeletonModel.heightStrategy : strategy, (i12 & 8) != 0 ? beduinSkeletonModel.heightValue : d12, (i12 & 16) != 0 ? beduinSkeletonModel.widthStrategy : strategy2, (i12 & 32) != 0 ? beduinSkeletonModel.widthValue : d13, (i12 & 64) != 0 ? beduinSkeletonModel.corners : corners);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, 0.0d, null, 0.0d, null, 125, null) : this;
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

    @k
    /* renamed from: component3, reason: from getter */
    public final Strategy getHeightStrategy() {
        return this.heightStrategy;
    }

    /* renamed from: component4, reason: from getter */
    public final double getHeightValue() {
        return this.heightValue;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Strategy getWidthStrategy() {
        return this.widthStrategy;
    }

    /* renamed from: component6, reason: from getter */
    public final double getWidthValue() {
        return this.widthValue;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Corners getCorners() {
        return this.corners;
    }

    @k
    public final BeduinSkeletonModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k Strategy heightStrategy, double heightValue, @k Strategy widthStrategy, double widthValue, @l Corners corners) {
        return new BeduinSkeletonModel(id2, displayingPredicate, heightStrategy, heightValue, widthStrategy, widthValue, corners);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSkeletonModel)) {
            return false;
        }
        BeduinSkeletonModel beduinSkeletonModel = (BeduinSkeletonModel) other;
        return L.f(this.id, beduinSkeletonModel.id) && L.f(this.displayingPredicate, beduinSkeletonModel.displayingPredicate) && this.heightStrategy == beduinSkeletonModel.heightStrategy && Double.compare(this.heightValue, beduinSkeletonModel.heightValue) == 0 && this.widthStrategy == beduinSkeletonModel.widthStrategy && Double.compare(this.widthValue, beduinSkeletonModel.widthValue) == 0 && L.f(this.corners, beduinSkeletonModel.corners);
    }

    @l
    public final Corners getCorners() {
        return this.corners;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @k
    public final Strategy getHeightStrategy() {
        return this.heightStrategy;
    }

    public final double getHeightValue() {
        return this.heightValue;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @k
    public final Strategy getWidthStrategy() {
        return this.widthStrategy;
    }

    public final double getWidthValue() {
        return this.widthValue;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iD2 = e.d((this.widthStrategy.hashCode() + e.d((this.heightStrategy.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31, 31, this.heightValue)) * 31, 31, this.widthValue);
        Corners corners = this.corners;
        return iD2 + (corners != null ? corners.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinSkeletonModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", heightStrategy=" + this.heightStrategy + ", heightValue=" + this.heightValue + ", widthStrategy=" + this.widthStrategy + ", widthValue=" + this.widthValue + ", corners=" + this.corners + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.heightStrategy.name());
        parcel.writeDouble(this.heightValue);
        parcel.writeString(this.widthStrategy.name());
        parcel.writeDouble(this.widthValue);
        Corners corners = this.corners;
        if (corners == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            corners.writeToParcel(parcel, flags);
        }
    }
}

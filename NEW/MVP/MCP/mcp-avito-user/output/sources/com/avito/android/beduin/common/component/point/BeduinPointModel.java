package com.avito.android.beduin.common.component.point;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPointModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001;BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJV\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/beduin/common/component/point/BeduinPointModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "size", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;", "stroke", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin/common/component/point/BeduinPointModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/avito/android/remote/model/UniversalColor;", "component6", "()Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;)Lcom/avito/android/beduin/common/component/point/BeduinPointModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getStyle", "Ljava/lang/Integer;", "getSize", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;", "getStroke", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPointModel extends LeafBeduinModel {

    @l
    private final UniversalColor color;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Integer size;

    @l
    private final BeduinPointStroke stroke;

    @l
    private final String style;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinPointModel> CREATOR = new b();

    /* compiled from: BeduinPointModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/point/BeduinPointModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.point.BeduinPointModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinPointModel.class;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("point");
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinPointModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinPointModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPointModel createFromParcel(Parcel parcel) {
            return new BeduinPointModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinPointModel.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(BeduinPointModel.class.getClassLoader()), parcel.readInt() != 0 ? BeduinPointStroke.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPointModel[] newArray(int i12) {
            return new BeduinPointModel[i12];
        }
    }

    public BeduinPointModel(@k String str, @l DisplayingPredicate displayingPredicate, @l String str2, @l Integer num, @l UniversalColor universalColor, @l BeduinPointStroke beduinPointStroke) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.style = str2;
        this.size = num;
        this.color = universalColor;
        this.stroke = beduinPointStroke;
    }

    public static /* synthetic */ BeduinPointModel copy$default(BeduinPointModel beduinPointModel, String str, DisplayingPredicate displayingPredicate, String str2, Integer num, UniversalColor universalColor, BeduinPointStroke beduinPointStroke, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinPointModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinPointModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            str2 = beduinPointModel.style;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            num = beduinPointModel.size;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            universalColor = beduinPointModel.color;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 32) != 0) {
            beduinPointStroke = beduinPointModel.stroke;
        }
        return beduinPointModel.copy(str, displayingPredicate2, str3, num2, universalColor2, beduinPointStroke);
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
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinPointStroke getStroke() {
        return this.stroke;
    }

    @k
    public final BeduinPointModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l String style, @l Integer size, @l UniversalColor color, @l BeduinPointStroke stroke) {
        return new BeduinPointModel(id2, displayingPredicate, style, size, color, stroke);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPointModel)) {
            return false;
        }
        BeduinPointModel beduinPointModel = (BeduinPointModel) other;
        return L.f(this.id, beduinPointModel.id) && L.f(this.displayingPredicate, beduinPointModel.displayingPredicate) && L.f(this.style, beduinPointModel.style) && L.f(this.size, beduinPointModel.size) && L.f(this.color, beduinPointModel.color) && L.f(this.stroke, beduinPointModel.stroke);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final Integer getSize() {
        return this.size;
    }

    @l
    public final BeduinPointStroke getStroke() {
        return this.stroke;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.size;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        BeduinPointStroke beduinPointStroke = this.stroke;
        return iHashCode5 + (beduinPointStroke != null ? beduinPointStroke.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinPointModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", style=" + this.style + ", size=" + this.size + ", color=" + this.color + ", stroke=" + this.stroke + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.style);
        Integer num = this.size;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.color, flags);
        BeduinPointStroke beduinPointStroke = this.stroke;
        if (beduinPointStroke == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinPointStroke.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinPointModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, 61, null) : this;
    }
}

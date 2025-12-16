package com.avito.android.beduin.common.component.circular_progress_bar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCircularProgressBarModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JJ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b4\u0010\u0015R\u0011\u00106\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b5\u0010\u000e¨\u00069"}, d2 = {"Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarStyle;", "_style", "", "progress", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarStyle;Ljava/lang/Float;Ljava/lang/String;)V", "component3", "()Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarStyle;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component4", "()Ljava/lang/Float;", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarStyle;Ljava/lang/Float;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarStyle;", "Ljava/lang/Float;", "getProgress", "getText", "getStyle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCircularProgressBarModel extends LeafBeduinModel {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final BeduinCircularProgressBarStyle _style;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("progress")
    @l
    private final Float progress;

    @com.google.gson.annotations.c("text")
    @l
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinCircularProgressBarModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("circularProgressBar");

    @k
    private static final Class<BeduinCircularProgressBarModel> model = BeduinCircularProgressBarModel.class;

    /* compiled from: BeduinCircularProgressBarModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.circular_progress_bar.BeduinCircularProgressBarModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinCircularProgressBarModel> S() {
            return BeduinCircularProgressBarModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinCircularProgressBarModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinCircularProgressBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinCircularProgressBarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCircularProgressBarModel createFromParcel(Parcel parcel) {
            return new BeduinCircularProgressBarModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinCircularProgressBarModel.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinCircularProgressBarStyle.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCircularProgressBarModel[] newArray(int i12) {
            return new BeduinCircularProgressBarModel[i12];
        }
    }

    public /* synthetic */ BeduinCircularProgressBarModel(String str, DisplayingPredicate displayingPredicate, BeduinCircularProgressBarStyle beduinCircularProgressBarStyle, Float f12, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : displayingPredicate, beduinCircularProgressBarStyle, f12, str2);
    }

    /* renamed from: component3, reason: from getter */
    private final BeduinCircularProgressBarStyle get_style() {
        return this._style;
    }

    public static /* synthetic */ BeduinCircularProgressBarModel copy$default(BeduinCircularProgressBarModel beduinCircularProgressBarModel, String str, DisplayingPredicate displayingPredicate, BeduinCircularProgressBarStyle beduinCircularProgressBarStyle, Float f12, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinCircularProgressBarModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinCircularProgressBarModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            beduinCircularProgressBarStyle = beduinCircularProgressBarModel._style;
        }
        BeduinCircularProgressBarStyle beduinCircularProgressBarStyle2 = beduinCircularProgressBarStyle;
        if ((i12 & 8) != 0) {
            f12 = beduinCircularProgressBarModel.progress;
        }
        Float f13 = f12;
        if ((i12 & 16) != 0) {
            str2 = beduinCircularProgressBarModel.text;
        }
        return beduinCircularProgressBarModel.copy(str, displayingPredicate2, beduinCircularProgressBarStyle2, f13, str2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, 29, null) : this;
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
    /* renamed from: component4, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    public final BeduinCircularProgressBarModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l BeduinCircularProgressBarStyle _style, @l Float progress, @l String text) {
        return new BeduinCircularProgressBarModel(id2, displayingPredicate, _style, progress, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCircularProgressBarModel)) {
            return false;
        }
        BeduinCircularProgressBarModel beduinCircularProgressBarModel = (BeduinCircularProgressBarModel) other;
        return L.f(this.id, beduinCircularProgressBarModel.id) && L.f(this.displayingPredicate, beduinCircularProgressBarModel.displayingPredicate) && this._style == beduinCircularProgressBarModel._style && L.f(this.progress, beduinCircularProgressBarModel.progress) && L.f(this.text, beduinCircularProgressBarModel.text);
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
    public final Float getProgress() {
        return this.progress;
    }

    @k
    public final BeduinCircularProgressBarStyle getStyle() {
        BeduinCircularProgressBarStyle beduinCircularProgressBarStyle = this._style;
        return beduinCircularProgressBarStyle == null ? BeduinCircularProgressBarStyle.BLACK_S : beduinCircularProgressBarStyle;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinCircularProgressBarStyle beduinCircularProgressBarStyle = this._style;
        int iHashCode3 = (iHashCode2 + (beduinCircularProgressBarStyle == null ? 0 : beduinCircularProgressBarStyle.hashCode())) * 31;
        Float f12 = this.progress;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str = this.text;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCircularProgressBarModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", _style=");
        sb2.append(this._style);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinCircularProgressBarStyle beduinCircularProgressBarStyle = this._style;
        if (beduinCircularProgressBarStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinCircularProgressBarStyle.name());
        }
        Float f12 = this.progress;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.text);
    }

    public BeduinCircularProgressBarModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinCircularProgressBarStyle beduinCircularProgressBarStyle, @l Float f12, @l String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this._style = beduinCircularProgressBarStyle;
        this.progress = f12;
        this.text = str2;
    }
}

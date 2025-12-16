package com.avito.android.beduin.common.component.video;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.VideoStateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinVideoModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0012HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0082\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b6\u00101J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bA\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010,R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010IR\u0011\u0010J\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bO\u00101R\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0011\u0010S\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bR\u0010\u001e¨\u0006T"}, d2 = {"Lcom/avito/android/beduin/common/component/video/BeduinVideoModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, ContextActionHandler.Link.URL, "Lcom/avito/android/beduin/common/component/video/BeduinVideoState;", VoiceInfo.STATE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "", "_isMuted", "", "_ratio", "", "_cornerRadius", "_isInfinite", "Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;", "_scale", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/video/BeduinVideoState;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;)V", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/lang/Float;", "component8", "()Ljava/lang/Integer;", "component9", "component10", "()Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/video/BeduinVideoState;", "component5", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/video/BeduinVideoState;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;)Lcom/avito/android/beduin/common/component/video/BeduinVideoModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getUrl", "Lcom/avito/android/beduin/common/component/video/BeduinVideoState;", "getState", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Ljava/lang/Boolean;", "Ljava/lang/Float;", "Ljava/lang/Integer;", "Lcom/avito/android/beduin/common/component/video/BeduinVideoScaleType;", "isMuted", "()Z", "getRatio", "()F", "ratio", "getCornerRadius", "cornerRadius", "isInfinite", "getScale", "scale", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinVideoModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinVideoModel> CREATOR = new a();

    @com.google.gson.annotations.c("cornerRadius")
    @l
    private final Integer _cornerRadius;

    @com.google.gson.annotations.c("isInfinite")
    @l
    private final Boolean _isInfinite;

    @com.google.gson.annotations.c("isMuted")
    @l
    private final Boolean _isMuted;

    @com.google.gson.annotations.c("ratio")
    @l
    private final Float _ratio;

    @com.google.gson.annotations.c("scale")
    @l
    private final BeduinVideoScaleType _scale;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @l
    private final BeduinContainerIndent margin;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @k
    private final BeduinVideoState state;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* compiled from: BeduinVideoModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinVideoModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinVideoModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinVideoModel.class.getClassLoader());
            String string2 = parcel.readString();
            BeduinVideoState beduinVideoStateValueOf = BeduinVideoState.valueOf(parcel.readString());
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinVideoModel(string, displayingPredicate, string2, beduinVideoStateValueOf, beduinContainerIndentCreateFromParcel, boolValueOf, fValueOf, numValueOf, boolValueOf2, parcel.readInt() == 0 ? null : BeduinVideoScaleType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinVideoModel[] newArray(int i12) {
            return new BeduinVideoModel[i12];
        }
    }

    public BeduinVideoModel(@k String str, @l DisplayingPredicate displayingPredicate, @k String str2, @k BeduinVideoState beduinVideoState, @l BeduinContainerIndent beduinContainerIndent, @l Boolean bool, @l Float f12, @l Integer num, @l Boolean bool2, @l BeduinVideoScaleType beduinVideoScaleType) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.url = str2;
        this.state = beduinVideoState;
        this.margin = beduinContainerIndent;
        this._isMuted = bool;
        this._ratio = f12;
        this._cornerRadius = num;
        this._isInfinite = bool2;
        this._scale = beduinVideoScaleType;
    }

    /* renamed from: component10, reason: from getter */
    private final BeduinVideoScaleType get_scale() {
        return this._scale;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean get_isMuted() {
        return this._isMuted;
    }

    /* renamed from: component7, reason: from getter */
    private final Float get_ratio() {
        return this._ratio;
    }

    /* renamed from: component8, reason: from getter */
    private final Integer get_cornerRadius() {
        return this._cornerRadius;
    }

    /* renamed from: component9, reason: from getter */
    private final Boolean get_isInfinite() {
        return this._isInfinite;
    }

    public static /* synthetic */ BeduinVideoModel copy$default(BeduinVideoModel beduinVideoModel, String str, DisplayingPredicate displayingPredicate, String str2, BeduinVideoState beduinVideoState, BeduinContainerIndent beduinContainerIndent, Boolean bool, Float f12, Integer num, Boolean bool2, BeduinVideoScaleType beduinVideoScaleType, int i12, Object obj) {
        return beduinVideoModel.copy((i12 & 1) != 0 ? beduinVideoModel.id : str, (i12 & 2) != 0 ? beduinVideoModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinVideoModel.url : str2, (i12 & 8) != 0 ? beduinVideoModel.state : beduinVideoState, (i12 & 16) != 0 ? beduinVideoModel.margin : beduinContainerIndent, (i12 & 32) != 0 ? beduinVideoModel._isMuted : bool, (i12 & 64) != 0 ? beduinVideoModel._ratio : f12, (i12 & 128) != 0 ? beduinVideoModel._cornerRadius : num, (i12 & 256) != 0 ? beduinVideoModel._isInfinite : bool2, (i12 & 512) != 0 ? beduinVideoModel._scale : beduinVideoScaleType);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, 1021, null) : transform instanceof VideoStateTransform ? copy$default(this, null, null, null, ((VideoStateTransform) transform).getState(), null, null, null, null, null, null, 1015, null) : this;
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
    public final String getUrl() {
        return this.url;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final BeduinVideoState getState() {
        return this.state;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @k
    public final BeduinVideoModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k String url, @k BeduinVideoState state, @l BeduinContainerIndent margin, @l Boolean _isMuted, @l Float _ratio, @l Integer _cornerRadius, @l Boolean _isInfinite, @l BeduinVideoScaleType _scale) {
        return new BeduinVideoModel(id2, displayingPredicate, url, state, margin, _isMuted, _ratio, _cornerRadius, _isInfinite, _scale);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinVideoModel)) {
            return false;
        }
        BeduinVideoModel beduinVideoModel = (BeduinVideoModel) other;
        return L.f(this.id, beduinVideoModel.id) && L.f(this.displayingPredicate, beduinVideoModel.displayingPredicate) && L.f(this.url, beduinVideoModel.url) && this.state == beduinVideoModel.state && L.f(this.margin, beduinVideoModel.margin) && L.f(this._isMuted, beduinVideoModel._isMuted) && L.f(this._ratio, beduinVideoModel._ratio) && L.f(this._cornerRadius, beduinVideoModel._cornerRadius) && L.f(this._isInfinite, beduinVideoModel._isInfinite) && this._scale == beduinVideoModel._scale;
    }

    public final int getCornerRadius() {
        Integer num = this._cornerRadius;
        if (num != null) {
            return num.intValue();
        }
        return 0;
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
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    public final float getRatio() {
        Float f12 = this._ratio;
        if (f12 != null) {
            return f12.floatValue();
        }
        return 1.0f;
    }

    @k
    public final BeduinVideoScaleType getScale() {
        BeduinVideoScaleType beduinVideoScaleType = this._scale;
        return beduinVideoScaleType == null ? BeduinVideoScaleType.FILL : beduinVideoScaleType;
    }

    @k
    public final BeduinVideoState getState() {
        return this.state;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (this.state.hashCode() + H.d((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.url)) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        int iHashCode3 = (iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        Boolean bool = this._isMuted;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f12 = this._ratio;
        int iHashCode5 = (iHashCode4 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this._cornerRadius;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this._isInfinite;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BeduinVideoScaleType beduinVideoScaleType = this._scale;
        return iHashCode7 + (beduinVideoScaleType != null ? beduinVideoScaleType.hashCode() : 0);
    }

    public final boolean isInfinite() {
        Boolean bool = this._isInfinite;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean isMuted() {
        Boolean bool = this._isMuted;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @k
    public String toString() {
        return "BeduinVideoModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", url=" + this.url + ", state=" + this.state + ", margin=" + this.margin + ", _isMuted=" + this._isMuted + ", _ratio=" + this._ratio + ", _cornerRadius=" + this._cornerRadius + ", _isInfinite=" + this._isInfinite + ", _scale=" + this._scale + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.url);
        parcel.writeString(this.state.name());
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        Boolean bool = this._isMuted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Float f12 = this._ratio;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Integer num = this._cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Boolean bool2 = this._isInfinite;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        BeduinVideoScaleType beduinVideoScaleType = this._scale;
        if (beduinVideoScaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinVideoScaleType.name());
        }
    }
}

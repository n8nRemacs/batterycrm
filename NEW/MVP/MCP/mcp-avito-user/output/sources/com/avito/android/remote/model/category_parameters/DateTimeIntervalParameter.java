package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: DateTimeIntervalParameter.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001]Bi\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0080\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,HÖ\u0001¢\u0006\u0004\b3\u0010.J \u00107\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020,HÖ\u0001¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u0002*\u00020\rH\u0002¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u0017R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bE\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bH\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010(R*\u0010K\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bQ\u0010\u0019\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR \u0010R\u001a\u00020\b8\u0016X\u0096D¢\u0006\u0012\n\u0004\bR\u0010>\u0012\u0004\bT\u0010\u0019\u001a\u0004\bS\u0010%R\u0014\u0010V\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u001bR\u0014\u0010X\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0017R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\r0Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeIntervalParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "parameterRequired", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;", "start", "end", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)V", "hasValue", "()Z", "initialize", "()V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)Lcom/avito/android/remote/model/category_parameters/DateTimeIntervalParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "initDateTimeIntervalValue", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getParameterRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;", "getStart", "getEnd", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "_value", "Lkotlin/G0;", "get_value", "()Lkotlin/G0;", "set_value", "(Lkotlin/G0;)V", "get_value$annotations", "updatesForm", "getUpdatesForm", "getUpdatesForm$annotations", "getType", "type", "getRequired", "required", "Lkotlin/sequences/m;", "getParameters", "()Lkotlin/sequences/m;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateTimeIntervalParameter extends EditableParameter<G0> implements Visibility, Phantom {

    @k
    public static final String TYPE = "datetime-interval";

    @l
    private G0 _value;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("end")
    @l
    private final DateTimeParameter end;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("required")
    private final boolean parameterRequired;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("start")
    @l
    private final DateTimeParameter start;

    @c("title")
    @k
    private final String title;
    private final boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<DateTimeIntervalParameter> CREATOR = new Creator();

    /* compiled from: DateTimeIntervalParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateTimeIntervalParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeIntervalParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DateTimeIntervalParameter.class.getClassLoader());
            DateTimeParameter dateTimeParameterCreateFromParcel = parcel.readInt() == 0 ? null : DateTimeParameter.CREATOR.createFromParcel(parcel);
            DateTimeParameter dateTimeParameterCreateFromParcel2 = parcel.readInt() == 0 ? null : DateTimeParameter.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DateTimeIntervalParameter(string, string2, z12, z13, attributedText, dateTimeParameterCreateFromParcel, dateTimeParameterCreateFromParcel2, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeIntervalParameter[] newArray(int i12) {
            return new DateTimeIntervalParameter[i12];
        }
    }

    public /* synthetic */ DateTimeIntervalParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, DateTimeParameter dateTimeParameter, DateTimeParameter dateTimeParameter2, Boolean bool, Boolean bool2, DisplayingOptions displayingOptions, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, dateTimeParameter, dateTimeParameter2, (i12 & 128) != 0 ? Boolean.FALSE : bool, (i12 & 256) != 0 ? Boolean.FALSE : bool2, (i12 & 512) != 0 ? null : displayingOptions);
    }

    private final void initDateTimeIntervalValue(DateTimeParameter dateTimeParameter) {
        if (dateTimeParameter.hasValue() || !dateTimeParameter.getRequired()) {
            return;
        }
        dateTimeParameter.setValue(new DateTimeParameter.Value.Timestamp(System.currentTimeMillis()));
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getParameterRequired() {
        return this.parameterRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DateTimeParameter getStart() {
        return this.start;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DateTimeParameter getEnd() {
        return this.end;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final DateTimeIntervalParameter copy(@k String id2, @k String title, boolean parameterRequired, boolean immutable, @l AttributedText motivation, @l DateTimeParameter start, @l DateTimeParameter end, @l Boolean visible, @l Boolean phantom, @l DisplayingOptions displayingOptions) {
        return new DateTimeIntervalParameter(id2, title, parameterRequired, immutable, motivation, start, end, visible, phantom, displayingOptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateTimeIntervalParameter)) {
            return false;
        }
        DateTimeIntervalParameter dateTimeIntervalParameter = (DateTimeIntervalParameter) other;
        return L.f(this.id, dateTimeIntervalParameter.id) && L.f(this.title, dateTimeIntervalParameter.title) && this.parameterRequired == dateTimeIntervalParameter.parameterRequired && this.immutable == dateTimeIntervalParameter.immutable && L.f(this.motivation, dateTimeIntervalParameter.motivation) && L.f(this.start, dateTimeIntervalParameter.start) && L.f(this.end, dateTimeIntervalParameter.end) && L.f(this.visible, dateTimeIntervalParameter.visible) && L.f(this.phantom, dateTimeIntervalParameter.phantom) && L.f(this.displayingOptions, dateTimeIntervalParameter.displayingOptions);
    }

    @l
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    public final DateTimeParameter getEnd() {
        return this.end;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    public final boolean getParameterRequired() {
        return this.parameterRequired;
    }

    @k
    public final InterfaceC43030m<DateTimeParameter> getParameters() {
        return C43033p.m(C42756l.f(new DateTimeParameter[]{this.start, this.end}));
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        if (this.parameterRequired) {
            return true;
        }
        DateTimeParameter dateTimeParameter = this.start;
        if (dateTimeParameter != null && dateTimeParameter.getRequired()) {
            return true;
        }
        DateTimeParameter dateTimeParameter2 = this.end;
        return dateTimeParameter2 != null && dateTimeParameter2.getRequired();
    }

    @l
    public final DateTimeParameter getStart() {
        return this.start;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @k
    public Boolean getUpdatesForm() {
        return Boolean.valueOf(this.updatesForm);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        DateTimeParameter dateTimeParameter = this.start;
        boolean zHasValue = dateTimeParameter != null ? dateTimeParameter.hasValue(this.parameterRequired) : false;
        DateTimeParameter dateTimeParameter2 = this.end;
        return zHasValue && (dateTimeParameter2 != null ? dateTimeParameter2.hasValue(this.parameterRequired) : false);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.parameterRequired), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DateTimeParameter dateTimeParameter = this.start;
        int iHashCode2 = (iHashCode + (dateTimeParameter == null ? 0 : dateTimeParameter.hashCode())) * 31;
        DateTimeParameter dateTimeParameter2 = this.end;
        int iHashCode3 = (iHashCode2 + (dateTimeParameter2 == null ? 0 : dateTimeParameter2.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        return iHashCode5 + (displayingOptions != null ? displayingOptions.hashCode() : 0);
    }

    public final void initialize() {
        DateTimeParameter dateTimeParameter = this.start;
        if (dateTimeParameter != null) {
            initDateTimeIntervalValue(dateTimeParameter);
        }
        DateTimeParameter dateTimeParameter2 = this.end;
        if (dateTimeParameter2 != null) {
            initDateTimeIntervalValue(dateTimeParameter2);
        }
    }

    @k
    public String toString() {
        return "DateTimeIntervalParameter(id=" + this.id + ", title=" + this.title + ", parameterRequired=" + this.parameterRequired + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", start=" + this.start + ", end=" + this.end + ", visible=" + this.visible + ", phantom=" + this.phantom + ", displayingOptions=" + this.displayingOptions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.parameterRequired ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        DateTimeParameter dateTimeParameter = this.start;
        if (dateTimeParameter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateTimeParameter.writeToParcel(parcel, flags);
        }
        DateTimeParameter dateTimeParameter2 = this.end;
        if (dateTimeParameter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateTimeParameter2.writeToParcel(parcel, flags);
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.phantom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public G0 get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l G0 g02) {
        this._value = g02;
    }

    public DateTimeIntervalParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l DateTimeParameter dateTimeParameter, @l DateTimeParameter dateTimeParameter2, @l Boolean bool, @l Boolean bool2, @l DisplayingOptions displayingOptions) {
        this.id = str;
        this.title = str2;
        this.parameterRequired = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.start = dateTimeParameter;
        this.end = dateTimeParameter2;
        this.visible = bool;
        this.phantom = bool2;
        this.displayingOptions = displayingOptions;
        this._value = G0.f406611a;
    }

    public static /* synthetic */ void getUpdatesForm$annotations() {
    }

    public static /* synthetic */ void get_value$annotations() {
    }
}

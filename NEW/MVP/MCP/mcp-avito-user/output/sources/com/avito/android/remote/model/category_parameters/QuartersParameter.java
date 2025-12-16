package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.Quarter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: QuartersParameter.kt */
@s0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\\]B\u0081\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0092\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010#R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010%\"\u0004\bI\u0010JR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bM\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bN\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010+R\u001a\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\bR\u0010-R \u0010S\u001a\u00020\f8\u0016X\u0096D¢\u0006\u0012\n\u0004\bS\u0010Q\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010-R \u0010W\u001a\u00020\f8\u0016X\u0096D¢\u0006\u0012\n\u0004\bW\u0010Q\u0012\u0004\bY\u0010V\u001a\u0004\bX\u0010-R\u0014\u0010[\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u001c¨\u0006^"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/QuartersParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "", "attributeId", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "_value", "", "Lcom/avito/android/remote/model/Quarter;", "values", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", Navigation.DISPLAYING, "resetAreaOnChange", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)V", "getSelectedValue", "()Lcom/avito/android/remote/model/Quarter;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component11", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)Lcom/avito/android/remote/model/category_parameters/QuartersParameter;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getAttributeId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;)V", "Ljava/util/List;", "getValues", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplaying", "Z", "getResetAreaOnChange", "required", "getRequired", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "getType", "type", "Companion", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class QuartersParameter extends EditableParameter<Value> implements Visibility, Phantom {

    @k
    public static final String TYPE = "quarters";

    @c("value")
    @l
    private Value _value;

    @c("attrId")
    @l
    private final Integer attributeId;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displaying;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @k
    private final List<Quarter> values;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<QuartersParameter> CREATOR = new Creator();

    /* compiled from: QuartersParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuartersParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuartersParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(QuartersParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Value valueCreateFromParcel = parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Quarter.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuartersParameter(string, numValueOf, string2, attributedText, boolValueOf, valueCreateFromParcel, arrayList, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuartersParameter[] newArray(int i12) {
            return new QuartersParameter[i12];
        }
    }

    /* compiled from: QuartersParameter.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getTo", "()Ljava/lang/Integer;", "getFrom", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @l
        private final Integer from;

        @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        @l
        private final Integer to;

        /* compiled from: QuartersParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@l Integer num, @l Integer num2) {
            this.to = num;
            this.from = num2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Integer getFrom() {
            return this.from;
        }

        @l
        public final Integer getTo() {
            return this.to;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.to;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.from;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
        }
    }

    public QuartersParameter(String str, Integer num, String str2, AttributedText attributedText, Boolean bool, Value value, List list, Boolean bool2, Boolean bool3, DisplayingOptions displayingOptions, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? -1 : num, str2, attributedText, bool, (i12 & 32) != 0 ? null : value, (i12 & 64) != 0 ? C42784z0.f406748b : list, (i12 & 128) != 0 ? Boolean.FALSE : bool2, (i12 & 256) != 0 ? Boolean.FALSE : bool3, (i12 & 512) != 0 ? null : displayingOptions, (i12 & 1024) != 0 ? false : z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DisplayingOptions getDisplaying() {
        return this.displaying;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Value get_value() {
        return this._value;
    }

    @k
    public final List<Quarter> component7() {
        return this.values;
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
    public final QuartersParameter copy(@k String id2, @l Integer attributeId, @k String title, @l AttributedText motivation, @l Boolean updatesForm, @l Value _value, @k List<Quarter> values, @l Boolean visible, @l Boolean phantom, @l DisplayingOptions displaying, boolean resetAreaOnChange) {
        return new QuartersParameter(id2, attributeId, title, motivation, updatesForm, _value, values, visible, phantom, displaying, resetAreaOnChange);
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
        if (!(other instanceof QuartersParameter)) {
            return false;
        }
        QuartersParameter quartersParameter = (QuartersParameter) other;
        return L.f(this.id, quartersParameter.id) && L.f(this.attributeId, quartersParameter.attributeId) && L.f(this.title, quartersParameter.title) && L.f(this.motivation, quartersParameter.motivation) && L.f(this.updatesForm, quartersParameter.updatesForm) && L.f(this._value, quartersParameter._value) && L.f(this.values, quartersParameter.values) && L.f(this.visible, quartersParameter.visible) && L.f(this.phantom, quartersParameter.phantom) && L.f(this.displaying, quartersParameter.displaying) && this.resetAreaOnChange == quartersParameter.resetAreaOnChange;
    }

    @l
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    @l
    public final DisplayingOptions getDisplaying() {
        return this.displaying;
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

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    public final Quarter getSelectedValue() {
        Value value = getValue();
        Object obj = null;
        if ((value != null ? value.getTo() : null) != null) {
            Iterator<T> it = this.values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer toInt = ((Quarter) next).getToInt();
                Value value2 = getValue();
                if (L.f(toInt, value2 != null ? value2.getTo() : null)) {
                    obj = next;
                    break;
                }
            }
            return (Quarter) obj;
        }
        Value value3 = getValue();
        if ((value3 != null ? value3.getFrom() : null) == null) {
            return null;
        }
        Iterator<T> it2 = this.values.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Integer fromInt = ((Quarter) next2).getFromInt();
            Value value4 = getValue();
            if (L.f(fromInt, value4 != null ? value4.getFrom() : null)) {
                obj = next2;
                break;
            }
        }
        return (Quarter) obj;
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
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @k
    public final List<Quarter> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.attributeId;
        int iD2 = H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.title);
        AttributedText attributedText = this.motivation;
        int iHashCode2 = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Value value = this._value;
        int iE2 = H.e((iHashCode3 + (value == null ? 0 : value.hashCode())) * 31, 31, this.values);
        Boolean bool2 = this.visible;
        int iHashCode4 = (iE2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displaying;
        return Boolean.hashCode(this.resetAreaOnChange) + ((iHashCode5 + (displayingOptions != null ? displayingOptions.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuartersParameter(id=");
        sb2.append(this.id);
        sb2.append(", attributeId=");
        sb2.append(this.attributeId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", resetAreaOnChange=");
        return r.x(sb2, this.resetAreaOnChange, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Integer num = this.attributeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Value value = this._value;
        if (value == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            value.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((Quarter) itJ.next()).writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.phantom;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        DisplayingOptions displayingOptions = this.displaying;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Value get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Value value) {
        this._value = value;
    }

    public QuartersParameter(@k String str, @l Integer num, @k String str2, @l AttributedText attributedText, @l Boolean bool, @l Value value, @k List<Quarter> list, @l Boolean bool2, @l Boolean bool3, @l DisplayingOptions displayingOptions, boolean z12) {
        this.id = str;
        this.attributeId = num;
        this.title = str2;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = value;
        this.values = list;
        this.visible = bool2;
        this.phantom = bool3;
        this.displaying = displayingOptions;
        this.resetAreaOnChange = z12;
        this.required = true;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

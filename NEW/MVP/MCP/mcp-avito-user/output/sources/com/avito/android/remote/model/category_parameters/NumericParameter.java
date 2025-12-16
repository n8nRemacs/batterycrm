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
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasAdditionalAction;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NumericParameter.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001aB\u0097\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u0010'J¶\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000207HÖ\u0001¢\u0006\u0004\b>\u00109J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000207HÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bG\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010\"R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bJ\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010E\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010\u001fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010*\"\u0004\bT\u0010UR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bY\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\b[\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\b\\\u0010\u001fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\b]\u0010'R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\b^\u0010'R\u0014\u0010`\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u001f¨\u0006b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/NumericParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "hint", "_value", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", ChannelContext.Item.PLACEHOLDER, "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ParamButton;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/lang/Double;", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component11", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ParamButton;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/NumericParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getHint", "getHint$annotations", "()V", "Ljava/lang/Double;", "get_value", "set_value", "(Ljava/lang/Double;)V", "Ljava/util/List;", "getConstraints", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getPlaceholder", "getVisible", "getPhantom", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NumericParameter extends EditableParameter<Double> implements HasAdditionalAction, TextParameter, Visibility, Phantom {

    @k
    public static final String TYPE = "numeric";

    @c("value")
    @l
    private Double _value;

    @c("button")
    @l
    private final ParamButton button;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("hint")
    @l
    private final String hint;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<NumericParameter> CREATOR = new Creator();

    /* compiled from: NumericParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NumericParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NumericParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(NumericParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(NumericParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            ParamButton paramButtonCreateFromParcel = parcel.readInt() == 0 ? null : ParamButton.CREATOR.createFromParcel(parcel);
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
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
            return new NumericParameter(string, string2, z12, z13, attributedText, boolValueOf, string3, dValueOf, arrayList, paramButtonCreateFromParcel, displayingOptionsCreateFromParcel, string4, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NumericParameter[] newArray(int i12) {
            return new NumericParameter[i12];
        }
    }

    public /* synthetic */ NumericParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, String str3, Double d12, List list, ParamButton paramButton, DisplayingOptions displayingOptions, String str4, Boolean bool2, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, bool, str3, d12, list, (i12 & 512) != 0 ? null : paramButton, displayingOptions, str4, (i12 & 4096) != 0 ? Boolean.FALSE : bool2, (i12 & 8192) != 0 ? Boolean.FALSE : bool3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ParamButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
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
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Double get_value() {
        return this._value;
    }

    @l
    public final List<Constraint> component9() {
        return this.constraints;
    }

    @k
    public final NumericParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l String hint, @l Double _value, @l List<? extends Constraint> constraints, @l ParamButton button, @l DisplayingOptions displayingOptions, @l String placeholder, @l Boolean visible, @l Boolean phantom) {
        return new NumericParameter(id2, title, required, immutable, motivation, updatesForm, hint, _value, constraints, button, displayingOptions, placeholder, visible, phantom);
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
        if (!(other instanceof NumericParameter)) {
            return false;
        }
        NumericParameter numericParameter = (NumericParameter) other;
        return L.f(this.id, numericParameter.id) && L.f(this.title, numericParameter.title) && this.required == numericParameter.required && this.immutable == numericParameter.immutable && L.f(this.motivation, numericParameter.motivation) && L.f(this.updatesForm, numericParameter.updatesForm) && L.f(this.hint, numericParameter.hint) && L.f(this._value, numericParameter._value) && L.f(this.constraints, numericParameter.constraints) && L.f(this.button, numericParameter.button) && L.f(this.displayingOptions, numericParameter.displayingOptions) && L.f(this.placeholder, numericParameter.placeholder) && L.f(this.visible, numericParameter.visible) && L.f(this.phantom, numericParameter.phantom);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasAdditionalAction
    @l
    public ParamButton getButton() {
        return this.button;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public String getHint() {
        return this.hint;
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

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
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

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d12 = this._value;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ParamButton paramButton = this.button;
        int iHashCode6 = (iHashCode5 + (paramButton == null ? 0 : paramButton.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode7 = (iHashCode6 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NumericParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.hint);
        Double d12 = this._value;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ParamButton paramButton = this.button;
        if (paramButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramButton.writeToParcel(parcel, flags);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.placeholder);
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
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Double get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Double d12) {
        this._value = d12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NumericParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l String str3, @l Double d12, @l List<? extends Constraint> list, @l ParamButton paramButton, @l DisplayingOptions displayingOptions, @l String str4, @l Boolean bool2, @l Boolean bool3) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.hint = str3;
        this._value = d12;
        this.constraints = list;
        this.button = paramButton;
        this.displayingOptions = displayingOptions;
        this.placeholder = str4;
        this.visible = bool2;
        this.phantom = bool3;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }
}

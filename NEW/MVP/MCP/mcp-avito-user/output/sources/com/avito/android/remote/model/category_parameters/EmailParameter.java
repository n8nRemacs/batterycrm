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
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
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

/* compiled from: EmailParameter.kt */
@d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001XB\u008d\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010\"J\u009e\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u0019R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010JR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\bM\u0010\u001bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bN\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bO\u0010\"R\"\u0010Q\u001a\u0004\u0018\u00010P8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010G\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u001b¨\u0006Y"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/EmailParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "hint", "_value", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", ChannelContext.Item.PLACEHOLDER, "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/EmailParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getHint", "getHint$annotations", "()V", "get_value", "set_value", "(Ljava/lang/String;)V", "Ljava/util/List;", "getConstraints", "getPlaceholder", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions$annotations", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EmailParameter extends EditableParameter<String> implements TextParameter, Visibility, Phantom {

    @k
    public static final String TYPE = "email";

    @c("value")
    @l
    private String _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

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
    public static final Parcelable.Creator<EmailParameter> CREATOR = new Creator();

    /* compiled from: EmailParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmailParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmailParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(EmailParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(EmailParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            String string5 = parcel.readString();
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
            return new EmailParameter(string, string2, z12, z13, attributedText, boolValueOf, string3, string4, arrayList, string5, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmailParameter[] newArray(int i12) {
            return new EmailParameter[i12];
        }
    }

    public /* synthetic */ EmailParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, String str3, String str4, List list, String str5, Boolean bool2, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? Boolean.FALSE : bool2, (i12 & 2048) != 0 ? Boolean.FALSE : bool3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component12, reason: from getter */
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
    public final String get_value() {
        return this._value;
    }

    @l
    public final List<Constraint> component9() {
        return this.constraints;
    }

    @k
    public final EmailParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l String hint, @l String _value, @l List<? extends Constraint> constraints, @l String placeholder, @l Boolean visible, @l Boolean phantom) {
        return new EmailParameter(id2, title, required, immutable, motivation, updatesForm, hint, _value, constraints, placeholder, visible, phantom);
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
        if (!(other instanceof EmailParameter)) {
            return false;
        }
        EmailParameter emailParameter = (EmailParameter) other;
        return L.f(this.id, emailParameter.id) && L.f(this.title, emailParameter.title) && this.required == emailParameter.required && this.immutable == emailParameter.immutable && L.f(this.motivation, emailParameter.motivation) && L.f(this.updatesForm, emailParameter.updatesForm) && L.f(this.hint, emailParameter.hint) && L.f(this._value, emailParameter._value) && L.f(this.constraints, emailParameter.constraints) && L.f(this.placeholder, emailParameter.placeholder) && L.f(this.visible, emailParameter.visible) && L.f(this.phantom, emailParameter.phantom);
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
        return "email";
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

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        String value = getValue();
        return !(value == null || value.length() == 0);
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
        String str2 = this._value;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmailParameter(id=");
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
        parcel.writeString(this._value);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
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

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public String get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l String str) {
        this._value = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l String str3, @l String str4, @l List<? extends Constraint> list, @l String str5, @l Boolean bool2, @l Boolean bool3) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.hint = str3;
        this._value = str4;
        this.constraints = list;
        this.placeholder = str5;
        this.visible = bool2;
        this.phantom = bool3;
    }

    public static /* synthetic */ void getDisplayingOptions$annotations() {
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }
}

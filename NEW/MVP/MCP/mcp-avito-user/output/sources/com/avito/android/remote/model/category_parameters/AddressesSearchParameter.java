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
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressesSearchParameter.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 R2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001RB\u0089\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010$J\u009c\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020.HÖ\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b>\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b?\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010 R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bJ\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bK\u0010 R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bL\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bN\u0010)R\u001a\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bO\u0010$R\u0014\u0010Q\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u001a¨\u0006S"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressesSearchParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/SuggestAddress;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "_value", "required", "visible", "phantom", "immutable", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "resetAreaOnChange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "component9", "component10", "component11", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)Lcom/avito/android/remote/model/category_parameters/AddressesSearchParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getPlaceholder", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Z", "getRequired", "getVisible", "getPhantom", "getImmutable", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getResetAreaOnChange", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddressesSearchParameter extends EditableParameter<List<? extends SuggestAddress>> implements Visibility, HasPlaceholder, Phantom {

    @k
    public static final String TYPE = "addressesSearch";

    @c("value")
    @l
    private List<SuggestAddress> _value;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

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

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

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
    public static final Parcelable.Creator<AddressesSearchParameter> CREATOR = new Creator();

    /* compiled from: AddressesSearchParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressesSearchParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressesSearchParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AddressesSearchParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(SuggestAddress.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
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
            return new AddressesSearchParameter(string, string2, string3, attributedText, boolValueOf, arrayList, z12, boolValueOf2, boolValueOf3, parcel.readInt() != 0, parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressesSearchParameter[] newArray(int i12) {
            return new AddressesSearchParameter[i12];
        }
    }

    public /* synthetic */ AddressesSearchParameter(String str, String str2, String str3, AttributedText attributedText, Boolean bool, List list, boolean z12, Boolean bool2, Boolean bool3, boolean z13, DisplayingOptions displayingOptions, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, bool, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? true : z12, (i12 & 128) != 0 ? Boolean.FALSE : bool2, (i12 & 256) != 0 ? Boolean.FALSE : bool3, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? null : displayingOptions, (i12 & 2048) != 0 ? false : z14);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
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
    public final List<SuggestAddress> component6() {
        return this._value;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getRequired() {
        return this.required;
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
    public final AddressesSearchParameter copy(@k String id2, @k String title, @l String placeholder, @l AttributedText motivation, @l Boolean updatesForm, @l List<SuggestAddress> _value, boolean required, @l Boolean visible, @l Boolean phantom, boolean immutable, @l DisplayingOptions displayingOptions, boolean resetAreaOnChange) {
        return new AddressesSearchParameter(id2, title, placeholder, motivation, updatesForm, _value, required, visible, phantom, immutable, displayingOptions, resetAreaOnChange);
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
        if (!(other instanceof AddressesSearchParameter)) {
            return false;
        }
        AddressesSearchParameter addressesSearchParameter = (AddressesSearchParameter) other;
        return L.f(this.id, addressesSearchParameter.id) && L.f(this.title, addressesSearchParameter.title) && L.f(this.placeholder, addressesSearchParameter.placeholder) && L.f(this.motivation, addressesSearchParameter.motivation) && L.f(this.updatesForm, addressesSearchParameter.updatesForm) && L.f(this._value, addressesSearchParameter._value) && this.required == addressesSearchParameter.required && L.f(this.visible, addressesSearchParameter.visible) && L.f(this.phantom, addressesSearchParameter.phantom) && this.immutable == addressesSearchParameter.immutable && L.f(this.displayingOptions, addressesSearchParameter.displayingOptions) && this.resetAreaOnChange == addressesSearchParameter.resetAreaOnChange;
    }

    @l
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
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

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
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
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.placeholder;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.motivation;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SuggestAddress> list = this._value;
        int i12 = r.i((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.required);
        Boolean bool2 = this.visible;
        int iHashCode4 = (i12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int i13 = r.i((iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.immutable);
        DisplayingOptions displayingOptions = this.displayingOptions;
        return Boolean.hashCode(this.resetAreaOnChange) + ((i13 + (displayingOptions != null ? displayingOptions.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends SuggestAddress> list) {
        set_value2((List<SuggestAddress>) list);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddressesSearchParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", resetAreaOnChange=");
        return r.x(sb2, this.resetAreaOnChange, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.placeholder);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<SuggestAddress> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SuggestAddress) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.required ? 1 : 0);
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
        parcel.writeInt(this.immutable ? 1 : 0);
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends SuggestAddress> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<SuggestAddress> list) {
        this._value = list;
    }

    public AddressesSearchParameter(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @l Boolean bool, @l List<SuggestAddress> list, boolean z12, @l Boolean bool2, @l Boolean bool3, boolean z13, @l DisplayingOptions displayingOptions, boolean z14) {
        this.id = str;
        this.title = str2;
        this.placeholder = str3;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = list;
        this.required = z12;
        this.visible = bool2;
        this.phantom = bool3;
        this.immutable = z13;
        this.displayingOptions = displayingOptions;
        this.resetAreaOnChange = z14;
    }
}

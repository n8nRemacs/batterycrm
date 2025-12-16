package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenAgesGroup.kt */
@d
@s0
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VBo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\"\u0010#J~\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b5\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b\u000b\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b<\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010#R \u0010C\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR \u0010I\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\bI\u0010D\u0012\u0004\bK\u0010H\u001a\u0004\bJ\u0010FR\"\u0010L\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bL\u0010=\u0012\u0004\bN\u0010H\u001a\u0004\bM\u0010\u001fR\u0014\u0010P\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0014\u0010R\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020S0\u00078F¢\u0006\u0006\u001a\u0004\bT\u0010\u0019¨\u0006W"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ChildrenAgesGroup;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "optionalTitle", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "isNew", "visible", "phantom", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/category_parameters/StrPayload;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/remote/model/category_parameters/StrPayload;)V", "component1", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "component8", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component9", "()Lcom/avito/android/remote/model/category_parameters/StrPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/remote/model/category_parameters/StrPayload;)Lcom/avito/android/remote/model/category_parameters/ChildrenAgesGroup;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component2", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getParameters", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplaying", "Lcom/avito/android/remote/model/category_parameters/StrPayload;", "getPayload", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "motivation", "getMotivation", "getMotivation$annotations", "getType", "type", "getTitle", "title", "Lcom/avito/android/remote/model/category_parameters/ChildrenAgesParameter;", "getChildrenAgesParameters", "childrenAgesParameters", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChildrenAgesGroup extends CategoryParameter implements Visibility, Phantom {

    @k
    public static final String TYPE = "childrenAgesGroup";

    @c("description")
    @l
    private final AttributedText description;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displaying;

    @c("id")
    @k
    private final String id;
    private final transient boolean immutable;

    @c("isNew")
    @l
    private final Boolean isNew;

    @l
    private final transient AttributedText motivation;

    @c("title")
    @l
    private final String optionalTitle;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<ParameterSlot> parameters;

    @c("payload")
    @l
    private final StrPayload payload;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final transient boolean required;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<ChildrenAgesGroup> CREATOR = new Creator();

    /* compiled from: ChildrenAgesGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChildrenAgesGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChildrenAgesGroup createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(ChildrenAgesGroup.class, parcel, arrayList, iL2, 1);
            }
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChildrenAgesGroup(string, string2, arrayList, boolValueOf, boolValueOf2, boolValueOf3, (AttributedText) parcel.readParcelable(ChildrenAgesGroup.class.getClassLoader()), parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StrPayload.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChildrenAgesGroup[] newArray(int i12) {
            return new ChildrenAgesGroup[i12];
        }
    }

    public /* synthetic */ ChildrenAgesGroup(String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, AttributedText attributedText, DisplayingOptions displayingOptions, StrPayload strPayload, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? Boolean.FALSE : bool, (i12 & 16) != 0 ? Boolean.FALSE : bool2, (i12 & 32) != 0 ? Boolean.FALSE : bool3, (i12 & 64) != 0 ? null : attributedText, (i12 & 128) != 0 ? null : displayingOptions, (i12 & 256) != 0 ? null : strPayload);
    }

    /* renamed from: component2, reason: from getter */
    private final String getOptionalTitle() {
        return this.optionalTitle;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<ParameterSlot> component3() {
        return this.parameters;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingOptions getDisplaying() {
        return this.displaying;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final StrPayload getPayload() {
        return this.payload;
    }

    @k
    public final ChildrenAgesGroup copy(@k String id2, @l String optionalTitle, @k List<? extends ParameterSlot> parameters, @l Boolean isNew, @l Boolean visible, @l Boolean phantom, @l AttributedText description, @l DisplayingOptions displaying, @l StrPayload payload) {
        return new ChildrenAgesGroup(id2, optionalTitle, parameters, isNew, visible, phantom, description, displaying, payload);
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
        if (!(other instanceof ChildrenAgesGroup)) {
            return false;
        }
        ChildrenAgesGroup childrenAgesGroup = (ChildrenAgesGroup) other;
        return L.f(this.id, childrenAgesGroup.id) && L.f(this.optionalTitle, childrenAgesGroup.optionalTitle) && L.f(this.parameters, childrenAgesGroup.parameters) && L.f(this.isNew, childrenAgesGroup.isNew) && L.f(this.visible, childrenAgesGroup.visible) && L.f(this.phantom, childrenAgesGroup.phantom) && L.f(this.description, childrenAgesGroup.description) && L.f(this.displaying, childrenAgesGroup.displaying) && L.f(this.payload, childrenAgesGroup.payload);
    }

    @k
    public final List<ChildrenAgesParameter> getChildrenAgesParameters() {
        List<ParameterSlot> list = this.parameters;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChildrenAgesParameter) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
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

    @k
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @l
    public final StrPayload getPayload() {
        return this.payload;
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        String str = this.optionalTitle;
        return str == null ? "" : str;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.optionalTitle;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.parameters);
        Boolean bool = this.isNew;
        int iHashCode2 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displaying;
        int iHashCode6 = (iHashCode5 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        StrPayload strPayload = this.payload;
        return iHashCode6 + (strPayload != null ? strPayload.hashCode() : 0);
    }

    @l
    public final Boolean isNew() {
        return this.isNew;
    }

    @k
    public String toString() {
        return "ChildrenAgesGroup(id=" + this.id + ", optionalTitle=" + this.optionalTitle + ", parameters=" + this.parameters + ", isNew=" + this.isNew + ", visible=" + this.visible + ", phantom=" + this.phantom + ", description=" + this.description + ", displaying=" + this.displaying + ", payload=" + this.payload + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.optionalTitle);
        Iterator itJ = C0.j(this.parameters, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
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
        parcel.writeParcelable(this.description, flags);
        DisplayingOptions displayingOptions = this.displaying;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        StrPayload strPayload = this.payload;
        if (strPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strPayload.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChildrenAgesGroup(@k String str, @l String str2, @k List<? extends ParameterSlot> list, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l AttributedText attributedText, @l DisplayingOptions displayingOptions, @l StrPayload strPayload) {
        this.id = str;
        this.optionalTitle = str2;
        this.parameters = list;
        this.isNew = bool;
        this.visible = bool2;
        this.phantom = bool3;
        this.description = attributedText;
        this.displaying = displayingOptions;
        this.payload = strPayload;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

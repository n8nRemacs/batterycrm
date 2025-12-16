package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LastSearchParameter.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002ABB9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R \u00102\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b2\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0016R \u00106\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u0016R\"\u0010:\u001a\u0004\u0018\u0001098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00105\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u000f¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/LastSearchParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "", "id", "title", "Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;", "value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "", "visible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;", "component4", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Z)Lcom/avito/android/remote/model/category_parameters/LastSearchParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;", "getValue", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Z", "getVisible", "()Ljava/lang/Boolean;", "required", "getRequired", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "getType", "type", "Companion", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LastSearchParameter extends CategoryParameter implements Visibility {

    @k
    public static final String TYPE = "last_search_filters";

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("value")
    @l
    private final Value value;

    @c("visible")
    private final boolean visible;

    @k
    public static final Parcelable.Creator<LastSearchParameter> CREATOR = new Creator();

    /* compiled from: LastSearchParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LastSearchParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastSearchParameter createFromParcel(@k Parcel parcel) {
            return new LastSearchParameter(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastSearchParameter[] newArray(int i12) {
            return new LastSearchParameter[i12];
        }
    }

    /* compiled from: LastSearchParameter.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/Action;", "action", "", "", "placeholders", "<init>", "(Lcom/avito/android/remote/model/category_parameters/Action;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/Action;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/category_parameters/Action;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/LastSearchParameter$Value;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/Action;", "getAction", "Ljava/util/List;", "getPlaceholders", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        @c("placeholders")
        @k
        private final List<String> placeholders;

        /* compiled from: LastSearchParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(Action.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k Action action, @k List<String> list) {
            this.action = action;
            this.placeholders = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Value copy$default(Value value, Action action, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                action = value.action;
            }
            if ((i12 & 2) != 0) {
                list = value.placeholders;
            }
            return value.copy(action, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @k
        public final List<String> component2() {
            return this.placeholders;
        }

        @k
        public final Value copy(@k Action action, @k List<String> placeholders) {
            return new Value(action, placeholders);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.action, value.action) && L.f(this.placeholders, value.placeholders);
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @k
        public final List<String> getPlaceholders() {
            return this.placeholders;
        }

        public int hashCode() {
            return this.placeholders.hashCode() + (this.action.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(action=");
            sb2.append(this.action);
            sb2.append(", placeholders=");
            return H.p(sb2, this.placeholders, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.action.writeToParcel(parcel, flags);
            parcel.writeStringList(this.placeholders);
        }
    }

    public /* synthetic */ LastSearchParameter(String str, String str2, Value value, DisplayingOptions displayingOptions, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : value, (i12 & 8) != 0 ? null : displayingOptions, (i12 & 16) != 0 ? false : z12);
    }

    public static /* synthetic */ LastSearchParameter copy$default(LastSearchParameter lastSearchParameter, String str, String str2, Value value, DisplayingOptions displayingOptions, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lastSearchParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = lastSearchParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            value = lastSearchParameter.value;
        }
        Value value2 = value;
        if ((i12 & 8) != 0) {
            displayingOptions = lastSearchParameter.displayingOptions;
        }
        DisplayingOptions displayingOptions2 = displayingOptions;
        if ((i12 & 16) != 0) {
            z12 = lastSearchParameter.visible;
        }
        return lastSearchParameter.copy(str, str3, value2, displayingOptions2, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @k
    public final LastSearchParameter copy(@k String id2, @k String title, @l Value value, @l DisplayingOptions displayingOptions, boolean visible) {
        return new LastSearchParameter(id2, title, value, displayingOptions, visible);
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
        if (!(other instanceof LastSearchParameter)) {
            return false;
        }
        LastSearchParameter lastSearchParameter = (LastSearchParameter) other;
        return L.f(this.id, lastSearchParameter.id) && L.f(this.title, lastSearchParameter.title) && L.f(this.value, lastSearchParameter.value) && L.f(this.displayingOptions, lastSearchParameter.displayingOptions) && this.visible == lastSearchParameter.visible;
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

    @l
    public final Value getValue() {
        return this.value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @k
    public Boolean getVisible() {
        return Boolean.valueOf(this.visible);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        Value value = this.value;
        int iHashCode = (iD2 + (value == null ? 0 : value.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        return Boolean.hashCode(this.visible) + ((iHashCode + (displayingOptions != null ? displayingOptions.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastSearchParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", visible=");
        return r.x(sb2, this.visible, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Value value = this.value;
        if (value == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            value.writeToParcel(parcel, flags);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.visible ? 1 : 0);
    }

    public LastSearchParameter(@k String str, @k String str2, @l Value value, @l DisplayingOptions displayingOptions, boolean z12) {
        this.id = str;
        this.title = str2;
        this.value = value;
        this.displayingOptions = displayingOptions;
        this.visible = z12;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

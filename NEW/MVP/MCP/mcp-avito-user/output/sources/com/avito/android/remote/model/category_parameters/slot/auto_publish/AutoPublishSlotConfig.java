package com.avito.android.remote.model.category_parameters.slot.auto_publish;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoPublishSlotConfig.kt */
@d
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "field", "", "", "relatedFields", "", "readyToDisplay", "<init>", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishSlotConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getField", "Ljava/util/List;", "getRelatedFields", "Ljava/lang/Boolean;", "getReadyToDisplay", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoPublishSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<AutoPublishSlotConfig> CREATOR = new Creator();

    @c("field")
    @k
    private final BooleanParameter field;

    @c("readyToDisplay")
    @l
    private final Boolean readyToDisplay;

    @c("relatedFields")
    @l
    private final List<String> relatedFields;

    /* compiled from: AutoPublishSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoPublishSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoPublishSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            BooleanParameter booleanParameter = (BooleanParameter) parcel.readParcelable(AutoPublishSlotConfig.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoPublishSlotConfig(booleanParameter, arrayListCreateStringArrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoPublishSlotConfig[] newArray(int i12) {
            return new AutoPublishSlotConfig[i12];
        }
    }

    public AutoPublishSlotConfig(@k BooleanParameter booleanParameter, @l List<String> list, @l Boolean bool) {
        this.field = booleanParameter;
        this.relatedFields = list;
        this.readyToDisplay = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoPublishSlotConfig copy$default(AutoPublishSlotConfig autoPublishSlotConfig, BooleanParameter booleanParameter, List list, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            booleanParameter = autoPublishSlotConfig.field;
        }
        if ((i12 & 2) != 0) {
            list = autoPublishSlotConfig.relatedFields;
        }
        if ((i12 & 4) != 0) {
            bool = autoPublishSlotConfig.readyToDisplay;
        }
        return autoPublishSlotConfig.copy(booleanParameter, list, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BooleanParameter getField() {
        return this.field;
    }

    @l
    public final List<String> component2() {
        return this.relatedFields;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getReadyToDisplay() {
        return this.readyToDisplay;
    }

    @k
    public final AutoPublishSlotConfig copy(@k BooleanParameter field, @l List<String> relatedFields, @l Boolean readyToDisplay) {
        return new AutoPublishSlotConfig(field, relatedFields, readyToDisplay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPublishSlotConfig)) {
            return false;
        }
        AutoPublishSlotConfig autoPublishSlotConfig = (AutoPublishSlotConfig) other;
        return L.f(this.field, autoPublishSlotConfig.field) && L.f(this.relatedFields, autoPublishSlotConfig.relatedFields) && L.f(this.readyToDisplay, autoPublishSlotConfig.readyToDisplay);
    }

    @k
    public final BooleanParameter getField() {
        return this.field;
    }

    @l
    public final Boolean getReadyToDisplay() {
        return this.readyToDisplay;
    }

    @l
    public final List<String> getRelatedFields() {
        return this.relatedFields;
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode() * 31;
        List<String> list = this.relatedFields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.readyToDisplay;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoPublishSlotConfig(field=");
        sb2.append(this.field);
        sb2.append(", relatedFields=");
        sb2.append(this.relatedFields);
        sb2.append(", readyToDisplay=");
        return C0.g(sb2, this.readyToDisplay, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.field, flags);
        parcel.writeStringList(this.relatedFields);
        Boolean bool = this.readyToDisplay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}

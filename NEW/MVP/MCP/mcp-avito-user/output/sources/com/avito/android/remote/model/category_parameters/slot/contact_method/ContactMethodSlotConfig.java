package com.avito.android.remote.model.category_parameters.slot.contact_method;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactMethodSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "field", "Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotType;", "type", "", "isPhoneDisabled", "<init>", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotType;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotType;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "getField", "Lcom/avito/android/remote/model/category_parameters/slot/contact_method/ContactMethodSlotType;", "getType", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactMethodSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ContactMethodSlotConfig> CREATOR = new Creator();

    @c("field")
    @k
    private final SelectParameter.Flat field;

    @c("isPhoneDisabled")
    @l
    private final Boolean isPhoneDisabled;

    @c("type")
    @l
    private final ContactMethodSlotType type;

    /* compiled from: ContactMethodSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactMethodSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactMethodSlotConfig createFromParcel(@k Parcel parcel) {
            SelectParameter.Flat flat = (SelectParameter.Flat) parcel.readParcelable(ContactMethodSlotConfig.class.getClassLoader());
            Boolean boolValueOf = null;
            ContactMethodSlotType contactMethodSlotTypeValueOf = parcel.readInt() == 0 ? null : ContactMethodSlotType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContactMethodSlotConfig(flat, contactMethodSlotTypeValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactMethodSlotConfig[] newArray(int i12) {
            return new ContactMethodSlotConfig[i12];
        }
    }

    public ContactMethodSlotConfig(@k SelectParameter.Flat flat, @l ContactMethodSlotType contactMethodSlotType, @l Boolean bool) {
        this.field = flat;
        this.type = contactMethodSlotType;
        this.isPhoneDisabled = bool;
    }

    public static /* synthetic */ ContactMethodSlotConfig copy$default(ContactMethodSlotConfig contactMethodSlotConfig, SelectParameter.Flat flat, ContactMethodSlotType contactMethodSlotType, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            flat = contactMethodSlotConfig.field;
        }
        if ((i12 & 2) != 0) {
            contactMethodSlotType = contactMethodSlotConfig.type;
        }
        if ((i12 & 4) != 0) {
            bool = contactMethodSlotConfig.isPhoneDisabled;
        }
        return contactMethodSlotConfig.copy(flat, contactMethodSlotType, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final SelectParameter.Flat getField() {
        return this.field;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ContactMethodSlotType getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsPhoneDisabled() {
        return this.isPhoneDisabled;
    }

    @k
    public final ContactMethodSlotConfig copy(@k SelectParameter.Flat field, @l ContactMethodSlotType type, @l Boolean isPhoneDisabled) {
        return new ContactMethodSlotConfig(field, type, isPhoneDisabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactMethodSlotConfig)) {
            return false;
        }
        ContactMethodSlotConfig contactMethodSlotConfig = (ContactMethodSlotConfig) other;
        return L.f(this.field, contactMethodSlotConfig.field) && this.type == contactMethodSlotConfig.type && L.f(this.isPhoneDisabled, contactMethodSlotConfig.isPhoneDisabled);
    }

    @k
    public final SelectParameter.Flat getField() {
        return this.field;
    }

    @l
    public final ContactMethodSlotType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode() * 31;
        ContactMethodSlotType contactMethodSlotType = this.type;
        int iHashCode2 = (iHashCode + (contactMethodSlotType == null ? 0 : contactMethodSlotType.hashCode())) * 31;
        Boolean bool = this.isPhoneDisabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isPhoneDisabled() {
        return this.isPhoneDisabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContactMethodSlotConfig(field=");
        sb2.append(this.field);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", isPhoneDisabled=");
        return C0.g(sb2, this.isPhoneDisabled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.field, flags);
        ContactMethodSlotType contactMethodSlotType = this.type;
        if (contactMethodSlotType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contactMethodSlotType.name());
        }
        Boolean bool = this.isPhoneDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ ContactMethodSlotConfig(SelectParameter.Flat flat, ContactMethodSlotType contactMethodSlotType, Boolean bool, int i12, C42822w c42822w) {
        this(flat, contactMethodSlotType, (i12 & 4) != 0 ? null : bool);
    }
}

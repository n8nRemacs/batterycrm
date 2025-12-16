package com.avito.android.remote.model.category_parameters.slot.contact_info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactInfoSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ<\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\f¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "nameField", "Lcom/avito/android/remote/model/category_parameters/EmailParameter;", "emailField", "Lcom/avito/android/remote/model/category_parameters/PhoneParameter;", "phoneField", "managerField", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/EmailParameter;Lcom/avito/android/remote/model/category_parameters/PhoneParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CharParameter;", "component2", "()Lcom/avito/android/remote/model/category_parameters/EmailParameter;", "component3", "()Lcom/avito/android/remote/model/category_parameters/PhoneParameter;", "component4", "copy", "(Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/EmailParameter;Lcom/avito/android/remote/model/category_parameters/PhoneParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;)Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getNameField", "Lcom/avito/android/remote/model/category_parameters/EmailParameter;", "getEmailField", "Lcom/avito/android/remote/model/category_parameters/PhoneParameter;", "getPhoneField", "getManagerField", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactInfoSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ContactInfoSlotConfig> CREATOR = new Creator();

    @c("emailField")
    @l
    private final EmailParameter emailField;

    @c("managerField")
    @k
    private final CharParameter managerField;

    @c("nameField")
    @l
    private final CharParameter nameField;

    @c("phoneField")
    @k
    private final PhoneParameter phoneField;

    /* compiled from: ContactInfoSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactInfoSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactInfoSlotConfig createFromParcel(@k Parcel parcel) {
            return new ContactInfoSlotConfig((CharParameter) parcel.readParcelable(ContactInfoSlotConfig.class.getClassLoader()), (EmailParameter) parcel.readParcelable(ContactInfoSlotConfig.class.getClassLoader()), (PhoneParameter) parcel.readParcelable(ContactInfoSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(ContactInfoSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactInfoSlotConfig[] newArray(int i12) {
            return new ContactInfoSlotConfig[i12];
        }
    }

    public ContactInfoSlotConfig(@l CharParameter charParameter, @l EmailParameter emailParameter, @k PhoneParameter phoneParameter, @k CharParameter charParameter2) {
        this.nameField = charParameter;
        this.emailField = emailParameter;
        this.phoneField = phoneParameter;
        this.managerField = charParameter2;
    }

    public static /* synthetic */ ContactInfoSlotConfig copy$default(ContactInfoSlotConfig contactInfoSlotConfig, CharParameter charParameter, EmailParameter emailParameter, PhoneParameter phoneParameter, CharParameter charParameter2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charParameter = contactInfoSlotConfig.nameField;
        }
        if ((i12 & 2) != 0) {
            emailParameter = contactInfoSlotConfig.emailField;
        }
        if ((i12 & 4) != 0) {
            phoneParameter = contactInfoSlotConfig.phoneField;
        }
        if ((i12 & 8) != 0) {
            charParameter2 = contactInfoSlotConfig.managerField;
        }
        return contactInfoSlotConfig.copy(charParameter, emailParameter, phoneParameter, charParameter2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final CharParameter getNameField() {
        return this.nameField;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final EmailParameter getEmailField() {
        return this.emailField;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final PhoneParameter getPhoneField() {
        return this.phoneField;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final CharParameter getManagerField() {
        return this.managerField;
    }

    @k
    public final ContactInfoSlotConfig copy(@l CharParameter nameField, @l EmailParameter emailField, @k PhoneParameter phoneField, @k CharParameter managerField) {
        return new ContactInfoSlotConfig(nameField, emailField, phoneField, managerField);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfoSlotConfig)) {
            return false;
        }
        ContactInfoSlotConfig contactInfoSlotConfig = (ContactInfoSlotConfig) other;
        return L.f(this.nameField, contactInfoSlotConfig.nameField) && L.f(this.emailField, contactInfoSlotConfig.emailField) && L.f(this.phoneField, contactInfoSlotConfig.phoneField) && L.f(this.managerField, contactInfoSlotConfig.managerField);
    }

    @l
    public final EmailParameter getEmailField() {
        return this.emailField;
    }

    @k
    public final CharParameter getManagerField() {
        return this.managerField;
    }

    @l
    public final CharParameter getNameField() {
        return this.nameField;
    }

    @k
    public final PhoneParameter getPhoneField() {
        return this.phoneField;
    }

    public int hashCode() {
        CharParameter charParameter = this.nameField;
        int iHashCode = (charParameter == null ? 0 : charParameter.hashCode()) * 31;
        EmailParameter emailParameter = this.emailField;
        return this.managerField.hashCode() + ((this.phoneField.hashCode() + ((iHashCode + (emailParameter != null ? emailParameter.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "ContactInfoSlotConfig(nameField=" + this.nameField + ", emailField=" + this.emailField + ", phoneField=" + this.phoneField + ", managerField=" + this.managerField + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.nameField, flags);
        parcel.writeParcelable(this.emailField, flags);
        parcel.writeParcelable(this.phoneField, flags);
        parcel.writeParcelable(this.managerField, flags);
    }
}

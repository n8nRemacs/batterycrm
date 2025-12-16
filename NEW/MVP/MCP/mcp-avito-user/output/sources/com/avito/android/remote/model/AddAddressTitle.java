package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddAddressSuggest.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AddAddressTitle;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/AddAddressAddress;", AddressParameter.TYPE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/AddAddressAddress;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/AddAddressAddress;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/AddAddressAddress;)Lcom/avito/android/remote/model/AddAddressTitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/AddAddressAddress;", "getAddress", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddAddressTitle implements Parcelable {

    @k
    public static final Parcelable.Creator<AddAddressTitle> CREATOR = new Creator();

    @l
    private final AddAddressAddress address;

    @l
    private final String text;

    /* compiled from: AddAddressSuggest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddAddressTitle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddAddressTitle createFromParcel(@k Parcel parcel) {
            return new AddAddressTitle(parcel.readString(), parcel.readInt() == 0 ? null : AddAddressAddress.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddAddressTitle[] newArray(int i12) {
            return new AddAddressTitle[i12];
        }
    }

    public AddAddressTitle(@l String str, @l AddAddressAddress addAddressAddress) {
        this.text = str;
        this.address = addAddressAddress;
    }

    public static /* synthetic */ AddAddressTitle copy$default(AddAddressTitle addAddressTitle, String str, AddAddressAddress addAddressAddress, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addAddressTitle.text;
        }
        if ((i12 & 2) != 0) {
            addAddressAddress = addAddressTitle.address;
        }
        return addAddressTitle.copy(str, addAddressAddress);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AddAddressAddress getAddress() {
        return this.address;
    }

    @k
    public final AddAddressTitle copy(@l String text, @l AddAddressAddress address) {
        return new AddAddressTitle(text, address);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddAddressTitle)) {
            return false;
        }
        AddAddressTitle addAddressTitle = (AddAddressTitle) other;
        return L.f(this.text, addAddressTitle.text) && L.f(this.address, addAddressTitle.address);
    }

    @l
    public final AddAddressAddress getAddress() {
        return this.address;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AddAddressAddress addAddressAddress = this.address;
        return iHashCode + (addAddressAddress != null ? addAddressAddress.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AddAddressTitle(text=" + this.text + ", address=" + this.address + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        AddAddressAddress addAddressAddress = this.address;
        if (addAddressAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addAddressAddress.writeToParcel(parcel, flags);
        }
    }
}

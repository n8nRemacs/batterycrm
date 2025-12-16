package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyAddressItem.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "", "suggestedAddressId", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "button", "<init>", "(Ljava/lang/String;ILcom/avito/android/remote/model/user_profile/items/AddressAction;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "copy", "(Ljava/lang/String;ILcom/avito/android/remote/model/user_profile/items/AddressAction;)Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddress", "I", "getSuggestedAddressId", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "getButton", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuggestedAddress implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestedAddress> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("button")
    @k
    private final AddressAction button;

    @c("suggestAddressId")
    private final int suggestedAddressId;

    /* compiled from: EmptyAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuggestedAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestedAddress createFromParcel(@k Parcel parcel) {
            return new SuggestedAddress(parcel.readString(), parcel.readInt(), AddressAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestedAddress[] newArray(int i12) {
            return new SuggestedAddress[i12];
        }
    }

    public SuggestedAddress(@k String str, int i12, @k AddressAction addressAction) {
        this.address = str;
        this.suggestedAddressId = i12;
        this.button = addressAction;
    }

    public static /* synthetic */ SuggestedAddress copy$default(SuggestedAddress suggestedAddress, String str, int i12, AddressAction addressAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = suggestedAddress.address;
        }
        if ((i13 & 2) != 0) {
            i12 = suggestedAddress.suggestedAddressId;
        }
        if ((i13 & 4) != 0) {
            addressAction = suggestedAddress.button;
        }
        return suggestedAddress.copy(str, i12, addressAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSuggestedAddressId() {
        return this.suggestedAddressId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AddressAction getButton() {
        return this.button;
    }

    @k
    public final SuggestedAddress copy(@k String address, int suggestedAddressId, @k AddressAction button) {
        return new SuggestedAddress(address, suggestedAddressId, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedAddress)) {
            return false;
        }
        SuggestedAddress suggestedAddress = (SuggestedAddress) other;
        return L.f(this.address, suggestedAddress.address) && this.suggestedAddressId == suggestedAddress.suggestedAddressId && L.f(this.button, suggestedAddress.button);
    }

    @k
    public final String getAddress() {
        return this.address;
    }

    @k
    public final AddressAction getButton() {
        return this.button;
    }

    public final int getSuggestedAddressId() {
        return this.suggestedAddressId;
    }

    public int hashCode() {
        return this.button.hashCode() + r.e(this.suggestedAddressId, this.address.hashCode() * 31, 31);
    }

    @k
    public String toString() {
        return "SuggestedAddress(address=" + this.address + ", suggestedAddressId=" + this.suggestedAddressId + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.address);
        parcel.writeInt(this.suggestedAddressId);
        this.button.writeToParcel(parcel, flags);
    }
}

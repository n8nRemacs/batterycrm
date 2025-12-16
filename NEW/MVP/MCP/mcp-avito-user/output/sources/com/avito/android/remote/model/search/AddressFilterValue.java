package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressFilterValue.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/AddressFilterValue;", "Landroid/os/Parcelable;", "", "id", AddressParameter.TYPE, "locality", "paramId", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", MessageBody.Location.KIND, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SuggestAddress$Kind;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/SuggestAddress$Kind;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SuggestAddress$Kind;)Lcom/avito/android/remote/model/search/AddressFilterValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getAddress", "getLocality", "getParamId", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", "getKind", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddressFilterValue implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressFilterValue> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("id")
    @k
    private final String id;

    @c(MessageBody.Location.KIND)
    @l
    private final SuggestAddress.Kind kind;

    @c("location")
    @l
    private final String locality;

    @c("paramId")
    @l
    private final String paramId;

    /* compiled from: AddressFilterValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressFilterValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressFilterValue createFromParcel(@k Parcel parcel) {
            return new AddressFilterValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuggestAddress.Kind.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressFilterValue[] newArray(int i12) {
            return new AddressFilterValue[i12];
        }
    }

    public AddressFilterValue(@k String str, @l String str2, @l String str3, @l String str4, @l SuggestAddress.Kind kind) {
        this.id = str;
        this.address = str2;
        this.locality = str3;
        this.paramId = str4;
        this.kind = kind;
    }

    public static /* synthetic */ AddressFilterValue copy$default(AddressFilterValue addressFilterValue, String str, String str2, String str3, String str4, SuggestAddress.Kind kind, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addressFilterValue.id;
        }
        if ((i12 & 2) != 0) {
            str2 = addressFilterValue.address;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = addressFilterValue.locality;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = addressFilterValue.paramId;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            kind = addressFilterValue.kind;
        }
        return addressFilterValue.copy(str, str5, str6, str7, kind);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getParamId() {
        return this.paramId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final SuggestAddress.Kind getKind() {
        return this.kind;
    }

    @k
    public final AddressFilterValue copy(@k String id2, @l String address, @l String locality, @l String paramId, @l SuggestAddress.Kind kind) {
        return new AddressFilterValue(id2, address, locality, paramId, kind);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFilterValue)) {
            return false;
        }
        AddressFilterValue addressFilterValue = (AddressFilterValue) other;
        return L.f(this.id, addressFilterValue.id) && L.f(this.address, addressFilterValue.address) && L.f(this.locality, addressFilterValue.locality) && L.f(this.paramId, addressFilterValue.paramId) && this.kind == addressFilterValue.kind;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final SuggestAddress.Kind getKind() {
        return this.kind;
    }

    @l
    public final String getLocality() {
        return this.locality;
    }

    @l
    public final String getParamId() {
        return this.paramId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locality;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SuggestAddress.Kind kind = this.kind;
        return iHashCode4 + (kind != null ? kind.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AddressFilterValue(id=" + this.id + ", address=" + this.address + ", locality=" + this.locality + ", paramId=" + this.paramId + ", kind=" + this.kind + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.address);
        parcel.writeString(this.locality);
        parcel.writeString(this.paramId);
        SuggestAddress.Kind kind = this.kind;
        if (kind == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kind.name());
        }
    }
}

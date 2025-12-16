package com.avito.android.suggest_addresses.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResolvedAddressResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/suggest_addresses/model/ResolvedAddressResult;", "Landroid/os/Parcelable;", "", "addressId", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", MessageBody.Location.KIND, "paramId", AddressParameter.TYPE, "locality", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/SuggestAddress$Kind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", "e", "()Lcom/avito/android/remote/model/SuggestAddress$Kind;", "g", "c", "f", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResolvedAddressResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ResolvedAddressResult> CREATOR = new a();

    @c("stringAddress")
    @k
    private final String address;

    @c("addressId")
    @k
    private final String addressId;

    @c(MessageBody.Location.KIND)
    @l
    private final SuggestAddress.Kind kind;

    @c("region")
    @l
    private final String locality;

    @c("paramId")
    @l
    private final String paramId;

    /* compiled from: ResolvedAddressResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResolvedAddressResult> {
        @Override // android.os.Parcelable.Creator
        public final ResolvedAddressResult createFromParcel(Parcel parcel) {
            return new ResolvedAddressResult(parcel.readString(), parcel.readInt() == 0 ? null : SuggestAddress.Kind.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ResolvedAddressResult[] newArray(int i12) {
            return new ResolvedAddressResult[i12];
        }
    }

    public ResolvedAddressResult(@k String str, @l SuggestAddress.Kind kind, @l String str2, @k String str3, @l String str4) {
        this.addressId = str;
        this.kind = kind;
        this.paramId = str2;
        this.address = str3;
        this.locality = str4;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final SuggestAddress.Kind getKind() {
        return this.kind;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedAddressResult)) {
            return false;
        }
        ResolvedAddressResult resolvedAddressResult = (ResolvedAddressResult) obj;
        return L.f(this.addressId, resolvedAddressResult.addressId) && this.kind == resolvedAddressResult.kind && L.f(this.paramId, resolvedAddressResult.paramId) && L.f(this.address, resolvedAddressResult.address) && L.f(this.locality, resolvedAddressResult.locality);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getParamId() {
        return this.paramId;
    }

    public final int hashCode() {
        int iHashCode = this.addressId.hashCode() * 31;
        SuggestAddress.Kind kind = this.kind;
        int iHashCode2 = (iHashCode + (kind == null ? 0 : kind.hashCode())) * 31;
        String str = this.paramId;
        int iD2 = H.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.address);
        String str2 = this.locality;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResolvedAddressResult(addressId=");
        sb2.append(this.addressId);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", paramId=");
        sb2.append(this.paramId);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", locality=");
        return C22026a.c(sb2, this.locality, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.addressId);
        SuggestAddress.Kind kind = this.kind;
        if (kind == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kind.name());
        }
        parcel.writeString(this.paramId);
        parcel.writeString(this.address);
        parcel.writeString(this.locality);
    }

    public /* synthetic */ ResolvedAddressResult(String str, SuggestAddress.Kind kind, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : kind, (i12 & 4) != 0 ? null : str2, str3, str4);
    }
}

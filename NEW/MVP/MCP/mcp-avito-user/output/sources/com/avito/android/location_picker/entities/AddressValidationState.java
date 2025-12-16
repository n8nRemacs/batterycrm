package com.avito.android.location_picker.entities;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AddressValidationState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location_picker/entities/AddressValidationState;", "Landroid/os/Parcelable;", "CREATOR", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AddressValidationState implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AddressParameter.ValidationRules f182341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f182342c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f182343d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f182344e;

    /* compiled from: AddressValidationState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/AddressValidationState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/location_picker/entities/AddressValidationState;", "<init>", "()V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.entities.AddressValidationState$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AddressValidationState> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final AddressValidationState createFromParcel(Parcel parcel) {
            AddressParameter.ValidationRules validationRules = (AddressParameter.ValidationRules) parcel.readParcelable(AddressParameter.ValidationRules.class.getClassLoader());
            boolean z12 = parcel.readByte() != 0;
            boolean z13 = parcel.readByte() != 0;
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            return new AddressValidationState(validationRules, z12, z13, string);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressValidationState[] newArray(int i12) {
            return new AddressValidationState[i12];
        }

        public Companion() {
        }
    }

    public AddressValidationState() {
        this(null, false, false, null, 15, null);
    }

    public static AddressValidationState a(AddressValidationState addressValidationState, boolean z12, boolean z13, String str, int i12) {
        AddressParameter.ValidationRules validationRules = addressValidationState.f182341b;
        if ((i12 & 2) != 0) {
            z12 = addressValidationState.f182342c;
        }
        if ((i12 & 4) != 0) {
            z13 = addressValidationState.f182343d;
        }
        addressValidationState.getClass();
        return new AddressValidationState(validationRules, z12, z13, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressValidationState)) {
            return false;
        }
        AddressValidationState addressValidationState = (AddressValidationState) obj;
        return L.f(this.f182341b, addressValidationState.f182341b) && this.f182342c == addressValidationState.f182342c && this.f182343d == addressValidationState.f182343d && L.f(this.f182344e, addressValidationState.f182344e);
    }

    public final int hashCode() {
        AddressParameter.ValidationRules validationRules = this.f182341b;
        return this.f182344e.hashCode() + r.i(r.i((validationRules == null ? 0 : validationRules.hashCode()) * 31, 31, this.f182342c), 31, this.f182343d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressValidationState(validationRules=");
        sb2.append(this.f182341b);
        sb2.append(", currentAddressIsValid=");
        sb2.append(this.f182342c);
        sb2.append(", triggerValidateRadius=");
        sb2.append(this.f182343d);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f182344e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f182341b, i12);
        parcel.writeByte(this.f182342c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f182343d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f182344e);
    }

    public AddressValidationState(@l AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, @k String str) {
        this.f182341b = validationRules;
        this.f182342c = z12;
        this.f182343d = z13;
        this.f182344e = str;
    }

    public /* synthetic */ AddressValidationState(AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : validationRules, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? "" : str);
    }
}

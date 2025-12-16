package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacPii.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "Lcom/avito/android/iac_dialer_models/abstract_module/b;", "Landroid/os/Parcelable;", "LdL/d;", "", "value", "<init>", "(Ljava/lang/String;)V", "toStringUnmasked", "()Ljava/lang/String;", "unwrap", "component1", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPiiString extends b implements Parcelable, dL.d {

    @k
    public static final Parcelable.Creator<IacPiiString> CREATOR = new a();

    @k
    private final String value;

    /* compiled from: IacPii.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPiiString> {
        @Override // android.os.Parcelable.Creator
        public final IacPiiString createFromParcel(Parcel parcel) {
            return new IacPiiString(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacPiiString[] newArray(int i12) {
            return new IacPiiString[i12];
        }
    }

    public IacPiiString(@k String str) {
        this.value = str;
    }

    public static /* synthetic */ IacPiiString copy$default(IacPiiString iacPiiString, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iacPiiString.value;
        }
        return iacPiiString.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final IacPiiString copy(@k String value) {
        return new IacPiiString(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacPiiString) && L.f(this.value, ((IacPiiString) other).value);
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.avito.android.iac_dialer_models.abstract_module.b
    @k
    public String toStringUnmasked() {
        return this.value;
    }

    @k
    public final String unwrap() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.value);
    }
}
